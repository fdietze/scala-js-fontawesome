import org.scalajs.dom.{HTMLCollection, HTMLElement}

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://fontawesome.com/how-to-use/font-awesome-api

package object fontAwesome {
  type IconName   = String
  type IconPrefix = String
  type Attributes = js.Dictionary[Double | String]
  type Styles     = js.Dictionary[String]
  type FaSymbol   = String | Boolean
  implicit class FontAwesomeOpts(val fa: fontawesome.type) extends AnyVal {
    def layered(layers: (Icon | Text)*): Layer = fa.layer(push => layers.foreach(push(_)))
  }
}

package fontAwesome {
  // https://github.com/FortAwesome/Font-Awesome/blob/master/advanced-options/use-with-node-js/fontawesome-common-types/index.d.ts
  @js.native
  trait IconLookup extends js.Object {
    val prefix: IconPrefix = js.native
    val iconName: IconName = js.native
  }

  @js.native
  trait IconDefinition extends IconLookup {
    val icon: String = js.native
  }

  // https://github.com/FortAwesome/Font-Awesome/blob/master/advanced-options/use-with-node-js/fontawesome-svg-core/index.d.ts
  @js.native
  @JSImport("@fortawesome/fontawesome-svg-core", JSImport.Default)
  object fontawesome extends js.Object {
    def noAuto(): Unit                                                                                      = js.native
    def findIconDefinition(iconLookup: IconLookup): IconDefinition                                          = js.native
    def text(content: String): Text                                                                         = js.native
    def text(content: String, params: Params): Text                                                         = js.native
    def icon(icon: IconName | IconLookup): Icon                                                             = js.native
    def icon(icon: IconName | IconLookup, params: Params): Icon                                             = js.native
    def layer(assember: js.Function1[js.Function1[Icon | Text | js.Array[Icon | Text], Unit], Unit]): Layer = js.native
  }

  @js.native
  trait AbstractElement extends js.Object {
    val tag: String                                     = js.native
    val attributes: Attributes                          = js.native
    val children: js.UndefOr[js.Array[AbstractElement]] = js.native
  }

  @js.native
  trait FontawesomeObject extends js.Object {
    def `abstract`: js.Array[AbstractElement] = js.native
    def html: js.Array[String]                = js.native
    def node: HTMLCollection[HTMLElement]     = js.native
    val `type`: String                        = js.native
  }

  @js.native
  trait Icon extends FontawesomeObject with IconDefinition

  @js.native
  trait Text extends FontawesomeObject

  @js.native
  trait Layer extends FontawesomeObject

  trait Transform extends js.Object {
    var size: js.UndefOr[Double]   = js.undefined
    var x: js.UndefOr[Double]      = js.undefined
    var y: js.UndefOr[Double]      = js.undefined
    var rotate: js.UndefOr[Double] = js.undefined
    var flipX: js.UndefOr[Boolean] = js.undefined
    var flipY: js.UndefOr[Boolean] = js.undefined
  }

  trait Params extends js.Object {
    var transform: js.UndefOr[Transform]               = js.undefined
    var title: js.UndefOr[String]                      = js.undefined
    var classes: js.UndefOr[String | js.Array[String]] = js.undefined
    var attributes: js.UndefOr[Attributes]             = js.undefined
    var styles: js.UndefOr[Styles]                     = js.undefined
  }

  trait IconParams extends Params {
    var symbol: js.UndefOr[FaSymbol] = js.undefined
    var mask: js.UndefOr[IconLookup] = js.undefined
  }
}
