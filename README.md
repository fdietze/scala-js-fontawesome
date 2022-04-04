# ScalaJS - FontAwesome
Facade for the JS/SVG version of the FontAwesome icons.

## Usage
* Set up [Scalajs-Bundler](https://scalacenter.github.io/scalajs-bundler/) for your project.

* In your `build.sbt`:
  ```scala
  resolvers += "jitpack" at "https://jitpack.io"
  libraryDependencies += "com.github.fdietze.scala-js-fontawesome" %%% "scala-js-fontawesome" % "a412650e7f"
  ```

* Use it like described in the api documentation (https://fontawesome.com/how-to-use/font-awesome-api):
  ```scala
  import fontAwesome._

  fontawesome.icon(freeSolid.faTrash).node
      
  fontawesome.icon(freeSolid.faTrash).html
      
  fontawesome.icon(freeSolid.faTrash).`abstract`

  fontawesome.layer(push => {
    push(fontawesome.icon(freeSolid.faCircle, new Params{
      styles = scalajs.js.Dictionary[String]( "color" -> "#4EBA4C" )}))
    push(fontawesome.icon(freeSolid.faSync, new Params{
      transform = new Transform{size = 10.0}
      classes = scalajs.js.Array("fa-spin")
      styles = scalajs.js.Dictionary[String]( "color" -> "white" )
    }))
  })
  ```

  Also Check out the Facade Code: [FontAwesome.scala](src/main/scala/FontAwesome.scala).

* Feel free to open issues.

## Usage with Outwatch

```scala
import fontAwesome._
import outwatch._
import scala.scalajs.js

def abstractElementToVNode(tree: AbstractElement): VNode = {
    import outwatch.dsl.{attr, svgTag}
    svgTag(tree.tag)(
        tree.attributes.map { case (name, value) => attr(name) := value }.toSeq,
        tree.children.fold(new js.Array[VNode])(_.map(abstractElementToVNode)),
    )
}

implicit def renderFontAwesomeIcon(icon: IconLookup): VNode =
    abstractElementToVNode(fontawesome.icon(icon).`abstract`(0))

implicit def renderFontAwesomeObject(icon: FontawesomeObject): VNode =
    abstractElementToVNode(icon.`abstract`(0))
```

```scala
span(freeSolid.faBolt)
```
