package com.markoid.dojocomposenavigation.home.data.service

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.markoid.dojocomposenavigation.home.data.entities.HomeCategories
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody.Companion.toResponseBody
import retrofit2.Response
import java.lang.reflect.Type
import java.nio.charset.Charset
import javax.inject.Inject

class HomeServiceImpl
@Inject constructor(
  @ApplicationContext private val context: Context
) : HomeService {

  override suspend fun getHomeCategories(): Response<List<HomeCategories>> = try {
    val inputStream = context.assets.open("home_categories.json")
    val size = inputStream.available()
    val buffer = ByteArray(size)
    inputStream.read(buffer)
    inputStream.close()
    val jsonString = String(buffer, Charset.forName("UTF-8"))
    val homeCategoriesType: Type = object : TypeToken<List<HomeCategories?>?>() {}.type
    val categories = Gson().fromJson<List<HomeCategories>>(jsonString, homeCategoriesType)
    Response.success(200, categories)
  } catch (error: Throwable) {
    Response.error(400, "".toResponseBody())
  }
}