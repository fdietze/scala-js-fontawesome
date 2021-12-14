import fontAwesome._
import minitest._

object MySimpleSuite extends SimpleTestSuite {
  test("resolve freeSolid") {
    assertEquals(fontawesome.icon(freeSolid.faTrash).`type`, "icon")
  }
  test("resolve freeRegular") {
    assertEquals(fontawesome.icon(freeRegular.faComments).`type`, "icon")
  }
  test("resolve freeBrands") {
    assertEquals(fontawesome.icon(freeBrands.faCloudsmith).`type`, "icon")
  }

  test("compile usage") {
    fontawesome.icon(freeSolid.faTrash).node
    fontawesome.icon(freeSolid.faTrash).html
    fontawesome.icon(freeSolid.faTrash).`abstract`

    fontawesome.layer(push => {
      push(
        fontawesome.icon(
          freeSolid.faCircle,
          new Params {
            styles = scalajs.js.Dictionary[String]("color" -> "#4EBA4C")
          },
        ),
      )
      push(
        fontawesome.icon(
          freeSolid.faSync,
          new Params {
            transform = new Transform { size = 10.0 }
            classes = scalajs.js.Array("fa-spin")
            styles = scalajs.js.Dictionary[String]("color" -> "white")
          },
        ),
      )
    })

    ()
  }

}
