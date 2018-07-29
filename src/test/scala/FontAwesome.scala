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
}
