package com.markoid.dojocomposenavigation.prehome.enums

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.markoid.dojocomposenavigation.R
import com.markoid.dojocomposenavigation.commons.theme.EaPreHomeDescription
import com.markoid.dojocomposenavigation.commons.theme.EaPreHomeTitle
import com.markoid.dojocomposenavigation.commons.theme.OdPreHomeDescription
import com.markoid.dojocomposenavigation.commons.theme.OdPreHomeTitle
import com.markoid.dojocomposenavigation.commons.theme.XpPreHomeDescription
import com.markoid.dojocomposenavigation.commons.theme.XpPreHomeTitle

enum class BrandConfiguration(
  val title: String,
  val description: String,
  val titleColor: Color,
  val descriptionColor: Color,
  @DrawableRes val image: Int
) {
  OD(
    title = "Walmart",
    description = "Todos los productos de la tienda a precios bajos todos los días.",
    titleColor = OdPreHomeTitle,
    descriptionColor = OdPreHomeDescription,
    image = R.drawable.ic_od_pre_home
  ),

  EXPRESS(
    title = "Walmart Express",
    description = "Fresco y despensa de gran calidad a precios bajos todos los días.",
    titleColor = XpPreHomeTitle,
    descriptionColor = XpPreHomeDescription,
    image = R.drawable.ic_express_pre_home
  ),

  EA(
    title = "Exclusivos online",
    description = "Envío a todo México",
    titleColor = EaPreHomeTitle,
    descriptionColor = EaPreHomeDescription,
    image = R.drawable.ic_ea_pre_home
  )
}