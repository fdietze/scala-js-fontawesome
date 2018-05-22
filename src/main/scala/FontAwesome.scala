import org.scalajs.dom.raw.HTMLCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://fontawesome.com/how-to-use/font-awesome-api

package object fontAwesome {
  type IconName = String
  type IconPrefix = String
  type Attributes = js.Dictionary[Double | String]
  type Styles = js.Dictionary[String]
  type FaSymbol = String | Boolean
}

package fontAwesome {
  // https://github.com/FortAwesome/Font-Awesome/blob/master/advanced-options/use-with-node-js/fontawesome-common-types/index.d.ts
  @js.native
  trait IconLookup extends js.Object {
    val prefix:IconPrefix = js.native
    val iconName:IconName = js.native
  }

  @js.native
  trait IconDefinition extends IconLookup {
    val icon:String = js.native
  }

  // https://github.com/FortAwesome/Font-Awesome/blob/master/advanced-options/use-with-node-js/fontawesome/index.d.ts
  @js.native
  @JSImport("@fortawesome/fontawesome", JSImport.Default)
  object fontawesome extends js.Object {
    def noAuto():Unit = js.native
    def findIconDefinition(iconLookup: IconLookup): IconDefinition = js.native
    def text(content: String): Text = js.native
    def text(content: String, params: Params): Text = js.native
    def icon(icon:IconName | IconLookup):Icon = js.native
    def icon(icon:IconName | IconLookup, params: Params):Icon = js.native
    def layer(assember:js.Function1[js.Function1[Icon | js.Array[Icon],Unit],Unit]):Layer = js.native
  }

  @js.native
  trait AbstractElement extends js.Object {
    val tag:String = js.native
    val attributes:Attributes = js.native
    val children:js.UndefOr[js.Array[AbstractElement]] = js.native
  }

  @js.native
  trait FontawesomeObject extends js.Object {
    def `abstract`: js.Array[AbstractElement] = js.native
    def html:js.Array[String] = js.native
    def node:HTMLCollection = js.native
  }

  @js.native
  trait Icon extends FontawesomeObject with IconDefinition {
    val `type`:String = js.native
  }

  @js.native
  trait Text extends FontawesomeObject {
    val `type`:String = js.native
  }

  @js.native
  trait Layer extends FontawesomeObject {
    val `type`:String = js.native
  }

  trait Transform extends js.Object {
    val size: js.UndefOr[Double] = js.undefined
    val x: js.UndefOr[Double] = js.undefined
    val y: js.UndefOr[Double] = js.undefined
    val rotate: js.UndefOr[Double] = js.undefined
    val flipX: js.UndefOr[Boolean] = js.undefined
    val flipY: js.UndefOr[Boolean] = js.undefined
  }

  // TODO: This helper does not work, since FontAwesome interprets unset fields and fields set to undefined differently
  // object Transform {
  //   def apply(
  //     size: js.UndefOr[Double] = js.undefined,
  //     x: js.UndefOr[Double] = js.undefined,
  //     y: js.UndefOr[Double] = js.undefined,
  //     rotate: js.UndefOr[Double] = js.undefined,
  //     flipX: js.UndefOr[Boolean] = js.undefined,
  //     flipY: js.UndefOr[Boolean] = js.undefined,
  //   ):Transform = {
  //     val arg_size = size
  //     val arg_x = x
  //     val arg_y = y
  //     val arg_rotate = rotate
  //     val arg_flipX = flipX
  //     val arg_flipY = flipY
  //     new Transform {
  //       override val size = arg_size
  //       override val x = arg_x
  //       override val y = arg_y
  //       override val rotate = arg_rotate
  //       override val flipX = arg_flipX
  //       override val flipY = arg_flipY
  //     }
  //   }
  // }

  trait Params extends js.Object {
    val transform: js.UndefOr[Transform] = js.undefined
    val title: js.UndefOr[String] = js.undefined
    val classes: js.UndefOr[String | js.Array[String]] = js.undefined
    val attributes: js.UndefOr[Attributes] = js.undefined
    val styles: js.UndefOr[Styles] = js.undefined
  }

  object Params {
    def apply(
      transform: js.UndefOr[Transform] = js.undefined,
      title: js.UndefOr[String] = js.undefined,
      classes: js.UndefOr[String | js.Array[String]] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      styles: js.UndefOr[Styles] = js.undefined,
      ):Params = {
        val arg_transform = transform
        val arg_title = title
        val arg_classes = classes
        val arg_attributes = attributes
        val arg_styles = styles
        new Params {
          override val transform = arg_transform
          override val title = arg_title
          override val classes = arg_classes
          override val attributes = arg_attributes
          override val styles = arg_styles
        }
    }
  }

  trait IconParams extends Params {
    val symbol: js.UndefOr[FaSymbol] = js.undefined
    val mask: js.UndefOr[IconLookup] = js.undefined
  }

  object IconParams {
    def apply(
      symbol: js.UndefOr[FaSymbol] = js.undefined,
      mask: js.UndefOr[IconLookup] = js.undefined,
      ):IconParams = {
        val arg_symbol = symbol
        val arg_mask = mask
        new IconParams {
          override val symbol = arg_symbol
          override val mask = arg_mask
        }
    }
  }
}
