package fontAwesome

import org.scalajs.dom.raw.HTMLCollection

import scala.scalajs.js
import scala.scalajs.js.annotation._

// https://fontawesome.com/how-to-use/font-awesome-api

@js.native
@JSImport("@fortawesome/fontawesome", JSImport.Default)
object fontawesome extends js.Object {
  def icon(iconDefinition:IconDefinition):Icon = js.native
}

@js.native
trait IconDefinition extends js.Object {
  val prefix:String = js.native
  val iconName:String = js.native
  val icon:String = js.native
}

@js.native
trait Icon extends IconDefinition {
  val `type`:String = js.native
  def html:js.Array[String] = js.native
  def node:HTMLCollection = js.native
  def `abstract`:js.Array[AbstractTree] = js.native
}

@js.native
trait AbstractTree extends js.Object {
  val tag:String = js.native
  val attributes:js.Dictionary[String] = js.native
  val children:js.UndefOr[js.Array[AbstractTree]] = js.native
}
