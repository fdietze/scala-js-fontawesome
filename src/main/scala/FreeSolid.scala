package fontAwesome

import scala.scalajs.js
import scala.scalajs.js.annotation._

object freeSolid {
  // https://github.com/FortAwesome/Font-Awesome/blob/master/advanced-options/use-with-node-js/free-solid-svg-icons/index.d.ts
  // https://fontawesome.com/how-to-use/with-the-api/other/tree-shaking
  // generate directives using vim:
  // :read !export FAVERSION=5.6.3 PACK=free-solid; curl --silent https://raw.githubusercontent.com/FortAwesome/Font-Awesome/$FAVERSION/js-packages/@fortawesome/$PACK-svg-icons/index.d.ts | grep "export const fa[A-Z]" | sed -E "s/export const (.+): IconDefinition;/  @js.native @JSImport(\"@fortawesome\/$PACK-svg-icons\/\1\", \"\1\") object \1 extends IconDefinition/"

  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAd", "faAd") object faAd             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAddressBook", "faAddressBook") object faAddressBook
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAddressCard", "faAddressCard") object faAddressCard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAdjust", "faAdjust") object faAdjust extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAirFreshener", "faAirFreshener") object faAirFreshener
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAlignCenter", "faAlignCenter") object faAlignCenter
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAlignJustify", "faAlignJustify") object faAlignJustify
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAlignLeft", "faAlignLeft") object faAlignLeft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAlignRight", "faAlignRight") object faAlignRight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAllergies", "faAllergies") object faAllergies
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAmbulance", "faAmbulance") object faAmbulance
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faAmericanSignLanguageInterpreting",
    "faAmericanSignLanguageInterpreting",
  ) object faAmericanSignLanguageInterpreting                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAnchor", "faAnchor") object faAnchor extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faAngleDoubleDown",
    "faAngleDoubleDown",
  ) object faAngleDoubleDown                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faAngleDoubleLeft",
    "faAngleDoubleLeft",
  ) object faAngleDoubleLeft                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faAngleDoubleRight",
    "faAngleDoubleRight",
  ) object faAngleDoubleRight                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAngleDoubleUp", "faAngleDoubleUp") object faAngleDoubleUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAngleDown", "faAngleDown") object faAngleDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAngleLeft", "faAngleLeft") object faAngleLeft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAngleRight", "faAngleRight") object faAngleRight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAngleUp", "faAngleUp") object faAngleUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAngry", "faAngry") object faAngry    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAnkh", "faAnkh") object faAnkh       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAppleAlt", "faAppleAlt") object faAppleAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArchive", "faArchive") object faArchive
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArchway", "faArchway") object faArchway
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faArrowAltCircleDown",
    "faArrowAltCircleDown",
  ) object faArrowAltCircleDown                                                                  extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faArrowAltCircleLeft",
    "faArrowAltCircleLeft",
  ) object faArrowAltCircleLeft                                                                  extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faArrowAltCircleRight",
    "faArrowAltCircleRight",
  ) object faArrowAltCircleRight                                                                 extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faArrowAltCircleUp",
    "faArrowAltCircleUp",
  ) object faArrowAltCircleUp                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faArrowCircleDown",
    "faArrowCircleDown",
  ) object faArrowCircleDown                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faArrowCircleLeft",
    "faArrowCircleLeft",
  ) object faArrowCircleLeft                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faArrowCircleRight",
    "faArrowCircleRight",
  ) object faArrowCircleRight                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArrowCircleUp", "faArrowCircleUp") object faArrowCircleUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArrowDown", "faArrowDown") object faArrowDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArrowLeft", "faArrowLeft") object faArrowLeft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArrowRight", "faArrowRight") object faArrowRight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArrowUp", "faArrowUp") object faArrowUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArrowsAlt", "faArrowsAlt") object faArrowsAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArrowsAltH", "faArrowsAltH") object faArrowsAltH
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faArrowsAltV", "faArrowsAltV") object faArrowsAltV
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faAssistiveListeningSystems",
    "faAssistiveListeningSystems",
  ) object faAssistiveListeningSystems                                                           extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAsterisk", "faAsterisk") object faAsterisk
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAt", "faAt") object faAt             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAtlas", "faAtlas") object faAtlas    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAtom", "faAtom") object faAtom       extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faAudioDescription",
    "faAudioDescription",
  ) object faAudioDescription                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faAward", "faAward") object faAward    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBaby", "faBaby") object faBaby       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBabyCarriage", "faBabyCarriage") object faBabyCarriage
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBackspace", "faBackspace") object faBackspace
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBackward", "faBackward") object faBackward
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBalanceScale", "faBalanceScale") object faBalanceScale
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBan", "faBan") object faBan          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBandAid", "faBandAid") object faBandAid
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBarcode", "faBarcode") object faBarcode
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBars", "faBars") object faBars       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBaseballBall", "faBaseballBall") object faBaseballBall
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBasketballBall", "faBasketballBall") object faBasketballBall
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBath", "faBath") object faBath       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBatteryEmpty", "faBatteryEmpty") object faBatteryEmpty
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBatteryFull", "faBatteryFull") object faBatteryFull
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBatteryHalf", "faBatteryHalf") object faBatteryHalf
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBatteryQuarter", "faBatteryQuarter") object faBatteryQuarter
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faBatteryThreeQuarters",
    "faBatteryThreeQuarters",
  ) object faBatteryThreeQuarters                                                                extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBed", "faBed") object faBed          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBeer", "faBeer") object faBeer       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBell", "faBell") object faBell       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBellSlash", "faBellSlash") object faBellSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBezierCurve", "faBezierCurve") object faBezierCurve
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBible", "faBible") object faBible    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBicycle", "faBicycle") object faBicycle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBinoculars", "faBinoculars") object faBinoculars
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBiohazard", "faBiohazard") object faBiohazard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBirthdayCake", "faBirthdayCake") object faBirthdayCake
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBlender", "faBlender") object faBlender
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBlenderPhone", "faBlenderPhone") object faBlenderPhone
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBlind", "faBlind") object faBlind    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBlog", "faBlog") object faBlog       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBold", "faBold") object faBold       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBolt", "faBolt") object faBolt       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBomb", "faBomb") object faBomb       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBone", "faBone") object faBone       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBong", "faBong") object faBong       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBook", "faBook") object faBook       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBookDead", "faBookDead") object faBookDead
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBookOpen", "faBookOpen") object faBookOpen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBookReader", "faBookReader") object faBookReader
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBookmark", "faBookmark") object faBookmark
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBowlingBall", "faBowlingBall") object faBowlingBall
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBox", "faBox") object faBox          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBoxOpen", "faBoxOpen") object faBoxOpen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBoxes", "faBoxes") object faBoxes    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBraille", "faBraille") object faBraille
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBrain", "faBrain") object faBrain    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBriefcase", "faBriefcase") object faBriefcase
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faBriefcaseMedical",
    "faBriefcaseMedical",
  ) object faBriefcaseMedical                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBroadcastTower", "faBroadcastTower") object faBroadcastTower
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBroom", "faBroom") object faBroom    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBrush", "faBrush") object faBrush    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBug", "faBug") object faBug          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBuilding", "faBuilding") object faBuilding
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBullhorn", "faBullhorn") object faBullhorn
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBullseye", "faBullseye") object faBullseye
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBurn", "faBurn") object faBurn       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBus", "faBus") object faBus          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBusAlt", "faBusAlt") object faBusAlt extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faBusinessTime", "faBusinessTime") object faBusinessTime
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalculator", "faCalculator") object faCalculator
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalendar", "faCalendar") object faCalendar
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalendarAlt", "faCalendarAlt") object faCalendarAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalendarCheck", "faCalendarCheck") object faCalendarCheck
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalendarDay", "faCalendarDay") object faCalendarDay
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalendarMinus", "faCalendarMinus") object faCalendarMinus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalendarPlus", "faCalendarPlus") object faCalendarPlus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalendarTimes", "faCalendarTimes") object faCalendarTimes
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCalendarWeek", "faCalendarWeek") object faCalendarWeek
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCamera", "faCamera") object faCamera extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCameraRetro", "faCameraRetro") object faCameraRetro
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCampground", "faCampground") object faCampground
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCandyCane", "faCandyCane") object faCandyCane
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCannabis", "faCannabis") object faCannabis
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCapsules", "faCapsules") object faCapsules
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCar", "faCar") object faCar          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCarAlt", "faCarAlt") object faCarAlt extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCarBattery", "faCarBattery") object faCarBattery
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCarCrash", "faCarCrash") object faCarCrash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCarSide", "faCarSide") object faCarSide
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCaretDown", "faCaretDown") object faCaretDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCaretLeft", "faCaretLeft") object faCaretLeft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCaretRight", "faCaretRight") object faCaretRight
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faCaretSquareDown",
    "faCaretSquareDown",
  ) object faCaretSquareDown                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faCaretSquareLeft",
    "faCaretSquareLeft",
  ) object faCaretSquareLeft                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faCaretSquareRight",
    "faCaretSquareRight",
  ) object faCaretSquareRight                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCaretSquareUp", "faCaretSquareUp") object faCaretSquareUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCaretUp", "faCaretUp") object faCaretUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCarrot", "faCarrot") object faCarrot extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCartArrowDown", "faCartArrowDown") object faCartArrowDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCartPlus", "faCartPlus") object faCartPlus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCashRegister", "faCashRegister") object faCashRegister
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCat", "faCat") object faCat          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCertificate", "faCertificate") object faCertificate
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChair", "faChair") object faChair    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChalkboard", "faChalkboard") object faChalkboard
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faChalkboardTeacher",
    "faChalkboardTeacher",
  ) object faChalkboardTeacher                                                                   extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faChargingStation",
    "faChargingStation",
  ) object faChargingStation                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChartArea", "faChartArea") object faChartArea
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChartBar", "faChartBar") object faChartBar
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChartLine", "faChartLine") object faChartLine
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChartPie", "faChartPie") object faChartPie
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCheck", "faCheck") object faCheck    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCheckCircle", "faCheckCircle") object faCheckCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCheckDouble", "faCheckDouble") object faCheckDouble
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCheckSquare", "faCheckSquare") object faCheckSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChess", "faChess") object faChess    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChessBishop", "faChessBishop") object faChessBishop
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChessBoard", "faChessBoard") object faChessBoard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChessKing", "faChessKing") object faChessKing
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChessKnight", "faChessKnight") object faChessKnight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChessPawn", "faChessPawn") object faChessPawn
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChessQueen", "faChessQueen") object faChessQueen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChessRook", "faChessRook") object faChessRook
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faChevronCircleDown",
    "faChevronCircleDown",
  ) object faChevronCircleDown                                                                   extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faChevronCircleLeft",
    "faChevronCircleLeft",
  ) object faChevronCircleLeft                                                                   extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faChevronCircleRight",
    "faChevronCircleRight",
  ) object faChevronCircleRight                                                                  extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faChevronCircleUp",
    "faChevronCircleUp",
  ) object faChevronCircleUp                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChevronDown", "faChevronDown") object faChevronDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChevronLeft", "faChevronLeft") object faChevronLeft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChevronRight", "faChevronRight") object faChevronRight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChevronUp", "faChevronUp") object faChevronUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChild", "faChild") object faChild    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faChurch", "faChurch") object faChurch extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCircle", "faCircle") object faCircle extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCircleNotch", "faCircleNotch") object faCircleNotch
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCity", "faCity") object faCity       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faClipboard", "faClipboard") object faClipboard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faClipboardCheck", "faClipboardCheck") object faClipboardCheck
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faClipboardList", "faClipboardList") object faClipboardList
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faClock", "faClock") object faClock    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faClone", "faClone") object faClone    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faClosedCaptioning",
    "faClosedCaptioning",
  ) object faClosedCaptioning                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCloud", "faCloud") object faCloud    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faCloudDownloadAlt",
    "faCloudDownloadAlt",
  ) object faCloudDownloadAlt                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCloudMeatball", "faCloudMeatball") object faCloudMeatball
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCloudMoon", "faCloudMoon") object faCloudMoon
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCloudMoonRain", "faCloudMoonRain") object faCloudMoonRain
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCloudRain", "faCloudRain") object faCloudRain
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faCloudShowersHeavy",
    "faCloudShowersHeavy",
  ) object faCloudShowersHeavy                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCloudSun", "faCloudSun") object faCloudSun
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCloudSunRain", "faCloudSunRain") object faCloudSunRain
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCloudUploadAlt", "faCloudUploadAlt") object faCloudUploadAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCocktail", "faCocktail") object faCocktail
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCode", "faCode") object faCode       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCodeBranch", "faCodeBranch") object faCodeBranch
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCoffee", "faCoffee") object faCoffee extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCog", "faCog") object faCog          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCogs", "faCogs") object faCogs       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCoins", "faCoins") object faCoins    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faColumns", "faColumns") object faColumns
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faComment", "faComment") object faComment
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCommentAlt", "faCommentAlt") object faCommentAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCommentDollar", "faCommentDollar") object faCommentDollar
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCommentDots", "faCommentDots") object faCommentDots
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCommentSlash", "faCommentSlash") object faCommentSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faComments", "faComments") object faComments
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCommentsDollar", "faCommentsDollar") object faCommentsDollar
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCompactDisc", "faCompactDisc") object faCompactDisc
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCompass", "faCompass") object faCompass
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCompress", "faCompress") object faCompress
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faCompressArrowsAlt",
    "faCompressArrowsAlt",
  ) object faCompressArrowsAlt                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faConciergeBell", "faConciergeBell") object faConciergeBell
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCookie", "faCookie") object faCookie extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCookieBite", "faCookieBite") object faCookieBite
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCopy", "faCopy") object faCopy       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCopyright", "faCopyright") object faCopyright
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCouch", "faCouch") object faCouch    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCreditCard", "faCreditCard") object faCreditCard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCrop", "faCrop") object faCrop       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCropAlt", "faCropAlt") object faCropAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCross", "faCross") object faCross    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCrosshairs", "faCrosshairs") object faCrosshairs
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCrow", "faCrow") object faCrow       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCrown", "faCrown") object faCrown    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCube", "faCube") object faCube       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCubes", "faCubes") object faCubes    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faCut", "faCut") object faCut          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDatabase", "faDatabase") object faDatabase
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDeaf", "faDeaf") object faDeaf       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDemocrat", "faDemocrat") object faDemocrat
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDesktop", "faDesktop") object faDesktop
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDharmachakra", "faDharmachakra") object faDharmachakra
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiagnoses", "faDiagnoses") object faDiagnoses
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDice", "faDice") object faDice       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiceD20", "faDiceD20") object faDiceD20
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiceD6", "faDiceD6") object faDiceD6 extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiceFive", "faDiceFive") object faDiceFive
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiceFour", "faDiceFour") object faDiceFour
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiceOne", "faDiceOne") object faDiceOne
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiceSix", "faDiceSix") object faDiceSix
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiceThree", "faDiceThree") object faDiceThree
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDiceTwo", "faDiceTwo") object faDiceTwo
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faDigitalTachograph",
    "faDigitalTachograph",
  ) object faDigitalTachograph                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDirections", "faDirections") object faDirections
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDivide", "faDivide") object faDivide extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDizzy", "faDizzy") object faDizzy    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDna", "faDna") object faDna          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDog", "faDog") object faDog          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDollarSign", "faDollarSign") object faDollarSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDolly", "faDolly") object faDolly    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDollyFlatbed", "faDollyFlatbed") object faDollyFlatbed
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDonate", "faDonate") object faDonate extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDoorClosed", "faDoorClosed") object faDoorClosed
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDoorOpen", "faDoorOpen") object faDoorOpen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDotCircle", "faDotCircle") object faDotCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDove", "faDove") object faDove       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDownload", "faDownload") object faDownload
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faDraftingCompass",
    "faDraftingCompass",
  ) object faDraftingCompass                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDragon", "faDragon") object faDragon extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDrawPolygon", "faDrawPolygon") object faDrawPolygon
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDrum", "faDrum") object faDrum       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDrumSteelpan", "faDrumSteelpan") object faDrumSteelpan
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDrumstickBite", "faDrumstickBite") object faDrumstickBite
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDumbbell", "faDumbbell") object faDumbbell
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDumpster", "faDumpster") object faDumpster
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDumpsterFire", "faDumpsterFire") object faDumpsterFire
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faDungeon", "faDungeon") object faDungeon
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEdit", "faEdit") object faEdit       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEject", "faEject") object faEject    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEllipsisH", "faEllipsisH") object faEllipsisH
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEllipsisV", "faEllipsisV") object faEllipsisV
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEnvelope", "faEnvelope") object faEnvelope
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEnvelopeOpen", "faEnvelopeOpen") object faEnvelopeOpen
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faEnvelopeOpenText",
    "faEnvelopeOpenText",
  ) object faEnvelopeOpenText                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEnvelopeSquare", "faEnvelopeSquare") object faEnvelopeSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEquals", "faEquals") object faEquals extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEraser", "faEraser") object faEraser extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEthernet", "faEthernet") object faEthernet
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEuroSign", "faEuroSign") object faEuroSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faExchangeAlt", "faExchangeAlt") object faExchangeAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faExclamation", "faExclamation") object faExclamation
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faExclamationCircle",
    "faExclamationCircle",
  ) object faExclamationCircle                                                                   extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faExclamationTriangle",
    "faExclamationTriangle",
  ) object faExclamationTriangle                                                                 extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faExpand", "faExpand") object faExpand extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faExpandArrowsAlt",
    "faExpandArrowsAlt",
  ) object faExpandArrowsAlt                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faExternalLinkAlt",
    "faExternalLinkAlt",
  ) object faExternalLinkAlt                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faExternalLinkSquareAlt",
    "faExternalLinkSquareAlt",
  ) object faExternalLinkSquareAlt                                                               extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEye", "faEye") object faEye          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEyeDropper", "faEyeDropper") object faEyeDropper
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faEyeSlash", "faEyeSlash") object faEyeSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFastBackward", "faFastBackward") object faFastBackward
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFastForward", "faFastForward") object faFastForward
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFax", "faFax") object faFax          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFeather", "faFeather") object faFeather
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFeatherAlt", "faFeatherAlt") object faFeatherAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFemale", "faFemale") object faFemale extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFighterJet", "faFighterJet") object faFighterJet
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFile", "faFile") object faFile       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileAlt", "faFileAlt") object faFileAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileArchive", "faFileArchive") object faFileArchive
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileAudio", "faFileAudio") object faFileAudio
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileCode", "faFileCode") object faFileCode
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileContract", "faFileContract") object faFileContract
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileCsv", "faFileCsv") object faFileCsv
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileDownload", "faFileDownload") object faFileDownload
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileExcel", "faFileExcel") object faFileExcel
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileExport", "faFileExport") object faFileExport
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileImage", "faFileImage") object faFileImage
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileImport", "faFileImport") object faFileImport
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileInvoice", "faFileInvoice") object faFileInvoice
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faFileInvoiceDollar",
    "faFileInvoiceDollar",
  ) object faFileInvoiceDollar                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileMedical", "faFileMedical") object faFileMedical
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileMedicalAlt", "faFileMedicalAlt") object faFileMedicalAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFilePdf", "faFilePdf") object faFilePdf
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFilePowerpoint", "faFilePowerpoint") object faFilePowerpoint
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faFilePrescription",
    "faFilePrescription",
  ) object faFilePrescription                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileSignature", "faFileSignature") object faFileSignature
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileUpload", "faFileUpload") object faFileUpload
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileVideo", "faFileVideo") object faFileVideo
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFileWord", "faFileWord") object faFileWord
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFill", "faFill") object faFill       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFillDrip", "faFillDrip") object faFillDrip
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFilm", "faFilm") object faFilm       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFilter", "faFilter") object faFilter extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFingerprint", "faFingerprint") object faFingerprint
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFire", "faFire") object faFire       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFireAlt", "faFireAlt") object faFireAlt
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faFireExtinguisher",
    "faFireExtinguisher",
  ) object faFireExtinguisher                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFirstAid", "faFirstAid") object faFirstAid
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFish", "faFish") object faFish       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFistRaised", "faFistRaised") object faFistRaised
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFlag", "faFlag") object faFlag       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFlagCheckered", "faFlagCheckered") object faFlagCheckered
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFlagUsa", "faFlagUsa") object faFlagUsa
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFlask", "faFlask") object faFlask    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFlushed", "faFlushed") object faFlushed
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFolder", "faFolder") object faFolder extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFolderMinus", "faFolderMinus") object faFolderMinus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFolderOpen", "faFolderOpen") object faFolderOpen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFolderPlus", "faFolderPlus") object faFolderPlus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFont", "faFont") object faFont       extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faFontAwesomeLogoFull",
    "faFontAwesomeLogoFull",
  ) object faFontAwesomeLogoFull                                                                 extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFootballBall", "faFootballBall") object faFootballBall
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faForward", "faForward") object faForward
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFrog", "faFrog") object faFrog       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFrown", "faFrown") object faFrown    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFrownOpen", "faFrownOpen") object faFrownOpen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFunnelDollar", "faFunnelDollar") object faFunnelDollar
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faFutbol", "faFutbol") object faFutbol extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGamepad", "faGamepad") object faGamepad
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGasPump", "faGasPump") object faGasPump
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGavel", "faGavel") object faGavel    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGem", "faGem") object faGem          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGenderless", "faGenderless") object faGenderless
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGhost", "faGhost") object faGhost    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGift", "faGift") object faGift       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGifts", "faGifts") object faGifts    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlassCheers", "faGlassCheers") object faGlassCheers
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlassMartini", "faGlassMartini") object faGlassMartini
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faGlassMartiniAlt",
    "faGlassMartiniAlt",
  ) object faGlassMartiniAlt                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlassWhiskey", "faGlassWhiskey") object faGlassWhiskey
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlasses", "faGlasses") object faGlasses
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlobe", "faGlobe") object faGlobe    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlobeAfrica", "faGlobeAfrica") object faGlobeAfrica
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlobeAmericas", "faGlobeAmericas") object faGlobeAmericas
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlobeAsia", "faGlobeAsia") object faGlobeAsia
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGlobeEurope", "faGlobeEurope") object faGlobeEurope
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGolfBall", "faGolfBall") object faGolfBall
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGopuram", "faGopuram") object faGopuram
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGraduationCap", "faGraduationCap") object faGraduationCap
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGreaterThan", "faGreaterThan") object faGreaterThan
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faGreaterThanEqual",
    "faGreaterThanEqual",
  ) object faGreaterThanEqual                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrimace", "faGrimace") object faGrimace
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrin", "faGrin") object faGrin       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinAlt", "faGrinAlt") object faGrinAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinBeam", "faGrinBeam") object faGrinBeam
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinBeamSweat", "faGrinBeamSweat") object faGrinBeamSweat
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinHearts", "faGrinHearts") object faGrinHearts
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinSquint", "faGrinSquint") object faGrinSquint
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faGrinSquintTears",
    "faGrinSquintTears",
  ) object faGrinSquintTears                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinStars", "faGrinStars") object faGrinStars
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinTears", "faGrinTears") object faGrinTears
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinTongue", "faGrinTongue") object faGrinTongue
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faGrinTongueSquint",
    "faGrinTongueSquint",
  ) object faGrinTongueSquint                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinTongueWink", "faGrinTongueWink") object faGrinTongueWink
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGrinWink", "faGrinWink") object faGrinWink
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGripHorizontal", "faGripHorizontal") object faGripHorizontal
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGripLines", "faGripLines") object faGripLines
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faGripLinesVertical",
    "faGripLinesVertical",
  ) object faGripLinesVertical                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGripVertical", "faGripVertical") object faGripVertical
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faGuitar", "faGuitar") object faGuitar extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHSquare", "faHSquare") object faHSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHammer", "faHammer") object faHammer extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHamsa", "faHamsa") object faHamsa    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandHolding", "faHandHolding") object faHandHolding
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faHandHoldingHeart",
    "faHandHoldingHeart",
  ) object faHandHoldingHeart                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandHoldingUsd", "faHandHoldingUsd") object faHandHoldingUsd
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandLizard", "faHandLizard") object faHandLizard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandPaper", "faHandPaper") object faHandPaper
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandPeace", "faHandPeace") object faHandPeace
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandPointDown", "faHandPointDown") object faHandPointDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandPointLeft", "faHandPointLeft") object faHandPointLeft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandPointRight", "faHandPointRight") object faHandPointRight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandPointUp", "faHandPointUp") object faHandPointUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandPointer", "faHandPointer") object faHandPointer
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandRock", "faHandRock") object faHandRock
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandScissors", "faHandScissors") object faHandScissors
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandSpock", "faHandSpock") object faHandSpock
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHands", "faHands") object faHands    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandsHelping", "faHandsHelping") object faHandsHelping
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHandshake", "faHandshake") object faHandshake
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHanukiah", "faHanukiah") object faHanukiah
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHashtag", "faHashtag") object faHashtag
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHatWizard", "faHatWizard") object faHatWizard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHaykal", "faHaykal") object faHaykal extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHdd", "faHdd") object faHdd          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHeading", "faHeading") object faHeading
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHeadphones", "faHeadphones") object faHeadphones
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHeadphonesAlt", "faHeadphonesAlt") object faHeadphonesAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHeadset", "faHeadset") object faHeadset
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHeart", "faHeart") object faHeart    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHeartBroken", "faHeartBroken") object faHeartBroken
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHeartbeat", "faHeartbeat") object faHeartbeat
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHelicopter", "faHelicopter") object faHelicopter
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHighlighter", "faHighlighter") object faHighlighter
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHiking", "faHiking") object faHiking extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHippo", "faHippo") object faHippo    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHistory", "faHistory") object faHistory
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHockeyPuck", "faHockeyPuck") object faHockeyPuck
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHollyBerry", "faHollyBerry") object faHollyBerry
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHome", "faHome") object faHome       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHorse", "faHorse") object faHorse    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHorseHead", "faHorseHead") object faHorseHead
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHospital", "faHospital") object faHospital
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHospitalAlt", "faHospitalAlt") object faHospitalAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHospitalSymbol", "faHospitalSymbol") object faHospitalSymbol
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHotTub", "faHotTub") object faHotTub extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHotel", "faHotel") object faHotel    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHourglass", "faHourglass") object faHourglass
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHourglassEnd", "faHourglassEnd") object faHourglassEnd
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHourglassHalf", "faHourglassHalf") object faHourglassHalf
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHourglassStart", "faHourglassStart") object faHourglassStart
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHouseDamage", "faHouseDamage") object faHouseDamage
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faHryvnia", "faHryvnia") object faHryvnia
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faICursor", "faICursor") object faICursor
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faIcicles", "faIcicles") object faIcicles
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faIdBadge", "faIdBadge") object faIdBadge
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faIdCard", "faIdCard") object faIdCard extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faIdCardAlt", "faIdCardAlt") object faIdCardAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faIgloo", "faIgloo") object faIgloo    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faImage", "faImage") object faImage    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faImages", "faImages") object faImages extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faInbox", "faInbox") object faInbox    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faIndent", "faIndent") object faIndent extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faIndustry", "faIndustry") object faIndustry
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faInfinity", "faInfinity") object faInfinity
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faInfo", "faInfo") object faInfo       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faInfoCircle", "faInfoCircle") object faInfoCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faItalic", "faItalic") object faItalic extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faJedi", "faJedi") object faJedi       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faJoint", "faJoint") object faJoint    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faJournalWhills", "faJournalWhills") object faJournalWhills
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faKaaba", "faKaaba") object faKaaba    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faKey", "faKey") object faKey          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faKeyboard", "faKeyboard") object faKeyboard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faKhanda", "faKhanda") object faKhanda extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faKiss", "faKiss") object faKiss       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faKissBeam", "faKissBeam") object faKissBeam
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faKissWinkHeart", "faKissWinkHeart") object faKissWinkHeart
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faKiwiBird", "faKiwiBird") object faKiwiBird
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLandmark", "faLandmark") object faLandmark
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLanguage", "faLanguage") object faLanguage
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLaptop", "faLaptop") object faLaptop extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLaptopCode", "faLaptopCode") object faLaptopCode
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLaugh", "faLaugh") object faLaugh    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLaughBeam", "faLaughBeam") object faLaughBeam
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLaughSquint", "faLaughSquint") object faLaughSquint
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLaughWink", "faLaughWink") object faLaughWink
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLayerGroup", "faLayerGroup") object faLayerGroup
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLeaf", "faLeaf") object faLeaf       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLemon", "faLemon") object faLemon    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLessThan", "faLessThan") object faLessThan
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLessThanEqual", "faLessThanEqual") object faLessThanEqual
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLevelDownAlt", "faLevelDownAlt") object faLevelDownAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLevelUpAlt", "faLevelUpAlt") object faLevelUpAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLifeRing", "faLifeRing") object faLifeRing
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLightbulb", "faLightbulb") object faLightbulb
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLink", "faLink") object faLink       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLiraSign", "faLiraSign") object faLiraSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faList", "faList") object faList       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faListAlt", "faListAlt") object faListAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faListOl", "faListOl") object faListOl extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faListUl", "faListUl") object faListUl extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLocationArrow", "faLocationArrow") object faLocationArrow
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLock", "faLock") object faLock       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLockOpen", "faLockOpen") object faLockOpen
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faLongArrowAltDown",
    "faLongArrowAltDown",
  ) object faLongArrowAltDown                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faLongArrowAltLeft",
    "faLongArrowAltLeft",
  ) object faLongArrowAltLeft                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faLongArrowAltRight",
    "faLongArrowAltRight",
  ) object faLongArrowAltRight                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLongArrowAltUp", "faLongArrowAltUp") object faLongArrowAltUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLowVision", "faLowVision") object faLowVision
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faLuggageCart", "faLuggageCart") object faLuggageCart
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMagic", "faMagic") object faMagic    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMagnet", "faMagnet") object faMagnet extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMailBulk", "faMailBulk") object faMailBulk
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMale", "faMale") object faMale       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMap", "faMap") object faMap          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMapMarked", "faMapMarked") object faMapMarked
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMapMarkedAlt", "faMapMarkedAlt") object faMapMarkedAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMapMarker", "faMapMarker") object faMapMarker
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMapMarkerAlt", "faMapMarkerAlt") object faMapMarkerAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMapPin", "faMapPin") object faMapPin extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMapSigns", "faMapSigns") object faMapSigns
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMarker", "faMarker") object faMarker extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMars", "faMars") object faMars       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMarsDouble", "faMarsDouble") object faMarsDouble
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMarsStroke", "faMarsStroke") object faMarsStroke
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMarsStrokeH", "faMarsStrokeH") object faMarsStrokeH
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMarsStrokeV", "faMarsStrokeV") object faMarsStrokeV
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMask", "faMask") object faMask       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMedal", "faMedal") object faMedal    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMedkit", "faMedkit") object faMedkit extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMeh", "faMeh") object faMeh          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMehBlank", "faMehBlank") object faMehBlank
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMehRollingEyes", "faMehRollingEyes") object faMehRollingEyes
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMemory", "faMemory") object faMemory extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMenorah", "faMenorah") object faMenorah
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMercury", "faMercury") object faMercury
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMeteor", "faMeteor") object faMeteor extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMicrochip", "faMicrochip") object faMicrochip
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMicrophone", "faMicrophone") object faMicrophone
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMicrophoneAlt", "faMicrophoneAlt") object faMicrophoneAlt
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faMicrophoneAltSlash",
    "faMicrophoneAltSlash",
  ) object faMicrophoneAltSlash                                                                  extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faMicrophoneSlash",
    "faMicrophoneSlash",
  ) object faMicrophoneSlash                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMicroscope", "faMicroscope") object faMicroscope
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMinus", "faMinus") object faMinus    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMinusCircle", "faMinusCircle") object faMinusCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMinusSquare", "faMinusSquare") object faMinusSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMitten", "faMitten") object faMitten extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMobile", "faMobile") object faMobile extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMobileAlt", "faMobileAlt") object faMobileAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMoneyBill", "faMoneyBill") object faMoneyBill
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMoneyBillAlt", "faMoneyBillAlt") object faMoneyBillAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMoneyBillWave", "faMoneyBillWave") object faMoneyBillWave
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faMoneyBillWaveAlt",
    "faMoneyBillWaveAlt",
  ) object faMoneyBillWaveAlt                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMoneyCheck", "faMoneyCheck") object faMoneyCheck
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMoneyCheckAlt", "faMoneyCheckAlt") object faMoneyCheckAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMonument", "faMonument") object faMonument
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMoon", "faMoon") object faMoon       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMortarPestle", "faMortarPestle") object faMortarPestle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMosque", "faMosque") object faMosque extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMotorcycle", "faMotorcycle") object faMotorcycle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMountain", "faMountain") object faMountain
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMousePointer", "faMousePointer") object faMousePointer
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMugHot", "faMugHot") object faMugHot extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faMusic", "faMusic") object faMusic    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faNetworkWired", "faNetworkWired") object faNetworkWired
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faNeuter", "faNeuter") object faNeuter extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faNewspaper", "faNewspaper") object faNewspaper
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faNotEqual", "faNotEqual") object faNotEqual
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faNotesMedical", "faNotesMedical") object faNotesMedical
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faObjectGroup", "faObjectGroup") object faObjectGroup
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faObjectUngroup", "faObjectUngroup") object faObjectUngroup
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faOilCan", "faOilCan") object faOilCan extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faOm", "faOm") object faOm             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faOtter", "faOtter") object faOtter    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faOutdent", "faOutdent") object faOutdent
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPaintBrush", "faPaintBrush") object faPaintBrush
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPaintRoller", "faPaintRoller") object faPaintRoller
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPalette", "faPalette") object faPalette
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPallet", "faPallet") object faPallet extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPaperPlane", "faPaperPlane") object faPaperPlane
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPaperclip", "faPaperclip") object faPaperclip
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faParachuteBox", "faParachuteBox") object faParachuteBox
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faParagraph", "faParagraph") object faParagraph
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faParking", "faParking") object faParking
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPassport", "faPassport") object faPassport
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPastafarianism", "faPastafarianism") object faPastafarianism
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPaste", "faPaste") object faPaste    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPause", "faPause") object faPause    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPauseCircle", "faPauseCircle") object faPauseCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPaw", "faPaw") object faPaw          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPeace", "faPeace") object faPeace    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPen", "faPen") object faPen          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPenAlt", "faPenAlt") object faPenAlt extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPenFancy", "faPenFancy") object faPenFancy
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPenNib", "faPenNib") object faPenNib extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPenSquare", "faPenSquare") object faPenSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPencilAlt", "faPencilAlt") object faPencilAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPencilRuler", "faPencilRuler") object faPencilRuler
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPeopleCarry", "faPeopleCarry") object faPeopleCarry
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPercent", "faPercent") object faPercent
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPercentage", "faPercentage") object faPercentage
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPersonBooth", "faPersonBooth") object faPersonBooth
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPhone", "faPhone") object faPhone    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPhoneSlash", "faPhoneSlash") object faPhoneSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPhoneSquare", "faPhoneSquare") object faPhoneSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPhoneVolume", "faPhoneVolume") object faPhoneVolume
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPiggyBank", "faPiggyBank") object faPiggyBank
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPills", "faPills") object faPills    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlaceOfWorship", "faPlaceOfWorship") object faPlaceOfWorship
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlane", "faPlane") object faPlane    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlaneArrival", "faPlaneArrival") object faPlaneArrival
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlaneDeparture", "faPlaneDeparture") object faPlaneDeparture
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlay", "faPlay") object faPlay       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlayCircle", "faPlayCircle") object faPlayCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlug", "faPlug") object faPlug       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlus", "faPlus") object faPlus       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlusCircle", "faPlusCircle") object faPlusCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPlusSquare", "faPlusSquare") object faPlusSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPodcast", "faPodcast") object faPodcast
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPoll", "faPoll") object faPoll       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPollH", "faPollH") object faPollH    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPoo", "faPoo") object faPoo          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPooStorm", "faPooStorm") object faPooStorm
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPoop", "faPoop") object faPoop       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPortrait", "faPortrait") object faPortrait
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPoundSign", "faPoundSign") object faPoundSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPowerOff", "faPowerOff") object faPowerOff
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPray", "faPray") object faPray       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPrayingHands", "faPrayingHands") object faPrayingHands
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPrescription", "faPrescription") object faPrescription
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faPrescriptionBottle",
    "faPrescriptionBottle",
  ) object faPrescriptionBottle                                                                  extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faPrescriptionBottleAlt",
    "faPrescriptionBottleAlt",
  ) object faPrescriptionBottleAlt                                                               extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPrint", "faPrint") object faPrint    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faProcedures", "faProcedures") object faProcedures
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faProjectDiagram", "faProjectDiagram") object faProjectDiagram
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faPuzzlePiece", "faPuzzlePiece") object faPuzzlePiece
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faQrcode", "faQrcode") object faQrcode extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faQuestion", "faQuestion") object faQuestion
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faQuestionCircle", "faQuestionCircle") object faQuestionCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faQuidditch", "faQuidditch") object faQuidditch
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faQuoteLeft", "faQuoteLeft") object faQuoteLeft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faQuoteRight", "faQuoteRight") object faQuoteRight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faQuran", "faQuran") object faQuran    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRadiation", "faRadiation") object faRadiation
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRadiationAlt", "faRadiationAlt") object faRadiationAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRainbow", "faRainbow") object faRainbow
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRandom", "faRandom") object faRandom extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faReceipt", "faReceipt") object faReceipt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRecycle", "faRecycle") object faRecycle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRedo", "faRedo") object faRedo       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRedoAlt", "faRedoAlt") object faRedoAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRegistered", "faRegistered") object faRegistered
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faReply", "faReply") object faReply    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faReplyAll", "faReplyAll") object faReplyAll
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRepublican", "faRepublican") object faRepublican
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRestroom", "faRestroom") object faRestroom
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRetweet", "faRetweet") object faRetweet
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRibbon", "faRibbon") object faRibbon extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRing", "faRing") object faRing       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRoad", "faRoad") object faRoad       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRobot", "faRobot") object faRobot    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRocket", "faRocket") object faRocket extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRoute", "faRoute") object faRoute    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRss", "faRss") object faRss          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRssSquare", "faRssSquare") object faRssSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRubleSign", "faRubleSign") object faRubleSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRuler", "faRuler") object faRuler    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRulerCombined", "faRulerCombined") object faRulerCombined
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faRulerHorizontal",
    "faRulerHorizontal",
  ) object faRulerHorizontal                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRulerVertical", "faRulerVertical") object faRulerVertical
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRunning", "faRunning") object faRunning
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faRupeeSign", "faRupeeSign") object faRupeeSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSadCry", "faSadCry") object faSadCry extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSadTear", "faSadTear") object faSadTear
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSatellite", "faSatellite") object faSatellite
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSatelliteDish", "faSatelliteDish") object faSatelliteDish
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSave", "faSave") object faSave       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSchool", "faSchool") object faSchool extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faScrewdriver", "faScrewdriver") object faScrewdriver
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faScroll", "faScroll") object faScroll extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSdCard", "faSdCard") object faSdCard extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSearch", "faSearch") object faSearch extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSearchDollar", "faSearchDollar") object faSearchDollar
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSearchLocation", "faSearchLocation") object faSearchLocation
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSearchMinus", "faSearchMinus") object faSearchMinus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSearchPlus", "faSearchPlus") object faSearchPlus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSeedling", "faSeedling") object faSeedling
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faServer", "faServer") object faServer extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShapes", "faShapes") object faShapes extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShare", "faShare") object faShare    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShareAlt", "faShareAlt") object faShareAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShareAltSquare", "faShareAltSquare") object faShareAltSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShareSquare", "faShareSquare") object faShareSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShekelSign", "faShekelSign") object faShekelSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShieldAlt", "faShieldAlt") object faShieldAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShip", "faShip") object faShip       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShippingFast", "faShippingFast") object faShippingFast
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShoePrints", "faShoePrints") object faShoePrints
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShoppingBag", "faShoppingBag") object faShoppingBag
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShoppingBasket", "faShoppingBasket") object faShoppingBasket
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShoppingCart", "faShoppingCart") object faShoppingCart
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShower", "faShower") object faShower extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faShuttleVan", "faShuttleVan") object faShuttleVan
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSign", "faSign") object faSign       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSignInAlt", "faSignInAlt") object faSignInAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSignLanguage", "faSignLanguage") object faSignLanguage
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSignOutAlt", "faSignOutAlt") object faSignOutAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSignal", "faSignal") object faSignal extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSignature", "faSignature") object faSignature
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSimCard", "faSimCard") object faSimCard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSitemap", "faSitemap") object faSitemap
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSkating", "faSkating") object faSkating
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSkiing", "faSkiing") object faSkiing extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSkiingNordic", "faSkiingNordic") object faSkiingNordic
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSkull", "faSkull") object faSkull    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faSkullCrossbones",
    "faSkullCrossbones",
  ) object faSkullCrossbones                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSlash", "faSlash") object faSlash    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSleigh", "faSleigh") object faSleigh extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSlidersH", "faSlidersH") object faSlidersH
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSmile", "faSmile") object faSmile    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSmileBeam", "faSmileBeam") object faSmileBeam
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSmileWink", "faSmileWink") object faSmileWink
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSmog", "faSmog") object faSmog       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSmoking", "faSmoking") object faSmoking
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSmokingBan", "faSmokingBan") object faSmokingBan
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSms", "faSms") object faSms          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSnowboarding", "faSnowboarding") object faSnowboarding
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSnowflake", "faSnowflake") object faSnowflake
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSnowman", "faSnowman") object faSnowman
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSnowplow", "faSnowplow") object faSnowplow
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSocks", "faSocks") object faSocks    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSolarPanel", "faSolarPanel") object faSolarPanel
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSort", "faSort") object faSort       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSortAlphaDown", "faSortAlphaDown") object faSortAlphaDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSortAlphaUp", "faSortAlphaUp") object faSortAlphaUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSortAmountDown", "faSortAmountDown") object faSortAmountDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSortAmountUp", "faSortAmountUp") object faSortAmountUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSortDown", "faSortDown") object faSortDown
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faSortNumericDown",
    "faSortNumericDown",
  ) object faSortNumericDown                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSortNumericUp", "faSortNumericUp") object faSortNumericUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSortUp", "faSortUp") object faSortUp extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSpa", "faSpa") object faSpa          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSpaceShuttle", "faSpaceShuttle") object faSpaceShuttle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSpider", "faSpider") object faSpider extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSpinner", "faSpinner") object faSpinner
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSplotch", "faSplotch") object faSplotch
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSprayCan", "faSprayCan") object faSprayCan
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSquare", "faSquare") object faSquare extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSquareFull", "faSquareFull") object faSquareFull
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSquareRootAlt", "faSquareRootAlt") object faSquareRootAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStamp", "faStamp") object faStamp    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStar", "faStar") object faStar       extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faStarAndCrescent",
    "faStarAndCrescent",
  ) object faStarAndCrescent                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStarHalf", "faStarHalf") object faStarHalf
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStarHalfAlt", "faStarHalfAlt") object faStarHalfAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStarOfDavid", "faStarOfDavid") object faStarOfDavid
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStarOfLife", "faStarOfLife") object faStarOfLife
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStepBackward", "faStepBackward") object faStepBackward
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStepForward", "faStepForward") object faStepForward
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStethoscope", "faStethoscope") object faStethoscope
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStickyNote", "faStickyNote") object faStickyNote
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStop", "faStop") object faStop       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStopCircle", "faStopCircle") object faStopCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStopwatch", "faStopwatch") object faStopwatch
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStore", "faStore") object faStore    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStoreAlt", "faStoreAlt") object faStoreAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStream", "faStream") object faStream extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStreetView", "faStreetView") object faStreetView
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStrikethrough", "faStrikethrough") object faStrikethrough
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faStroopwafel", "faStroopwafel") object faStroopwafel
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSubscript", "faSubscript") object faSubscript
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSubway", "faSubway") object faSubway extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSuitcase", "faSuitcase") object faSuitcase
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faSuitcaseRolling",
    "faSuitcaseRolling",
  ) object faSuitcaseRolling                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSun", "faSun") object faSun          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSuperscript", "faSuperscript") object faSuperscript
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSurprise", "faSurprise") object faSurprise
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSwatchbook", "faSwatchbook") object faSwatchbook
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSwimmer", "faSwimmer") object faSwimmer
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSwimmingPool", "faSwimmingPool") object faSwimmingPool
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSynagogue", "faSynagogue") object faSynagogue
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSync", "faSync") object faSync       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSyncAlt", "faSyncAlt") object faSyncAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faSyringe", "faSyringe") object faSyringe
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTable", "faTable") object faTable    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTableTennis", "faTableTennis") object faTableTennis
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTablet", "faTablet") object faTablet extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTabletAlt", "faTabletAlt") object faTabletAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTablets", "faTablets") object faTablets
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTachometerAlt", "faTachometerAlt") object faTachometerAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTag", "faTag") object faTag          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTags", "faTags") object faTags       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTape", "faTape") object faTape       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTasks", "faTasks") object faTasks    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTaxi", "faTaxi") object faTaxi       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTeeth", "faTeeth") object faTeeth    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTeethOpen", "faTeethOpen") object faTeethOpen
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faTemperatureHigh",
    "faTemperatureHigh",
  ) object faTemperatureHigh                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTemperatureLow", "faTemperatureLow") object faTemperatureLow
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTenge", "faTenge") object faTenge    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTerminal", "faTerminal") object faTerminal
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTextHeight", "faTextHeight") object faTextHeight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTextWidth", "faTextWidth") object faTextWidth
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTh", "faTh") object faTh             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faThLarge", "faThLarge") object faThLarge
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faThList", "faThList") object faThList extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTheaterMasks", "faTheaterMasks") object faTheaterMasks
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faThermometer", "faThermometer") object faThermometer
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faThermometerEmpty",
    "faThermometerEmpty",
  ) object faThermometerEmpty                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faThermometerFull",
    "faThermometerFull",
  ) object faThermometerFull                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faThermometerHalf",
    "faThermometerHalf",
  ) object faThermometerHalf                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faThermometerQuarter",
    "faThermometerQuarter",
  ) object faThermometerQuarter                                                                  extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faThermometerThreeQuarters",
    "faThermometerThreeQuarters",
  ) object faThermometerThreeQuarters                                                            extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faThumbsDown", "faThumbsDown") object faThumbsDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faThumbsUp", "faThumbsUp") object faThumbsUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faThumbtack", "faThumbtack") object faThumbtack
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTicketAlt", "faTicketAlt") object faTicketAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTimes", "faTimes") object faTimes    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTimesCircle", "faTimesCircle") object faTimesCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTint", "faTint") object faTint       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTintSlash", "faTintSlash") object faTintSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTired", "faTired") object faTired    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faToggleOff", "faToggleOff") object faToggleOff
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faToggleOn", "faToggleOn") object faToggleOn
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faToilet", "faToilet") object faToilet extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faToiletPaper", "faToiletPaper") object faToiletPaper
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faToolbox", "faToolbox") object faToolbox
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTools", "faTools") object faTools    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTooth", "faTooth") object faTooth    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTorah", "faTorah") object faTorah    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faToriiGate", "faToriiGate") object faToriiGate
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTractor", "faTractor") object faTractor
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTrademark", "faTrademark") object faTrademark
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTrafficLight", "faTrafficLight") object faTrafficLight
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTrain", "faTrain") object faTrain    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTram", "faTram") object faTram       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTransgender", "faTransgender") object faTransgender
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTransgenderAlt", "faTransgenderAlt") object faTransgenderAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTrash", "faTrash") object faTrash    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTrashAlt", "faTrashAlt") object faTrashAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTree", "faTree") object faTree       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTrophy", "faTrophy") object faTrophy extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTruck", "faTruck") object faTruck    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTruckLoading", "faTruckLoading") object faTruckLoading
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTruckMonster", "faTruckMonster") object faTruckMonster
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTruckMoving", "faTruckMoving") object faTruckMoving
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTruckPickup", "faTruckPickup") object faTruckPickup
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTshirt", "faTshirt") object faTshirt extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTty", "faTty") object faTty          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faTv", "faTv") object faTv             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUmbrella", "faUmbrella") object faUmbrella
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUmbrellaBeach", "faUmbrellaBeach") object faUmbrellaBeach
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUnderline", "faUnderline") object faUnderline
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUndo", "faUndo") object faUndo       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUndoAlt", "faUndoAlt") object faUndoAlt
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-solid-svg-icons/faUniversalAccess",
    "faUniversalAccess",
  ) object faUniversalAccess                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUniversity", "faUniversity") object faUniversity
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUnlink", "faUnlink") object faUnlink extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUnlock", "faUnlock") object faUnlock extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUnlockAlt", "faUnlockAlt") object faUnlockAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUpload", "faUpload") object faUpload extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUser", "faUser") object faUser       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserAlt", "faUserAlt") object faUserAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserAltSlash", "faUserAltSlash") object faUserAltSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserAstronaut", "faUserAstronaut") object faUserAstronaut
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserCheck", "faUserCheck") object faUserCheck
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserCircle", "faUserCircle") object faUserCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserClock", "faUserClock") object faUserClock
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserCog", "faUserCog") object faUserCog
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserEdit", "faUserEdit") object faUserEdit
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserFriends", "faUserFriends") object faUserFriends
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserGraduate", "faUserGraduate") object faUserGraduate
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserInjured", "faUserInjured") object faUserInjured
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserLock", "faUserLock") object faUserLock
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserMd", "faUserMd") object faUserMd extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserMinus", "faUserMinus") object faUserMinus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserNinja", "faUserNinja") object faUserNinja
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserPlus", "faUserPlus") object faUserPlus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserSecret", "faUserSecret") object faUserSecret
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserShield", "faUserShield") object faUserShield
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserSlash", "faUserSlash") object faUserSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserTag", "faUserTag") object faUserTag
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserTie", "faUserTie") object faUserTie
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUserTimes", "faUserTimes") object faUserTimes
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUsers", "faUsers") object faUsers    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUsersCog", "faUsersCog") object faUsersCog
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUtensilSpoon", "faUtensilSpoon") object faUtensilSpoon
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faUtensils", "faUtensils") object faUtensils
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVectorSquare", "faVectorSquare") object faVectorSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVenus", "faVenus") object faVenus    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVenusDouble", "faVenusDouble") object faVenusDouble
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVenusMars", "faVenusMars") object faVenusMars
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVial", "faVial") object faVial       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVials", "faVials") object faVials    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVideo", "faVideo") object faVideo    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVideoSlash", "faVideoSlash") object faVideoSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVihara", "faVihara") object faVihara extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVolleyballBall", "faVolleyballBall") object faVolleyballBall
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVolumeDown", "faVolumeDown") object faVolumeDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVolumeMute", "faVolumeMute") object faVolumeMute
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVolumeOff", "faVolumeOff") object faVolumeOff
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVolumeUp", "faVolumeUp") object faVolumeUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVoteYea", "faVoteYea") object faVoteYea
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faVrCardboard", "faVrCardboard") object faVrCardboard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWalking", "faWalking") object faWalking
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWallet", "faWallet") object faWallet extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWarehouse", "faWarehouse") object faWarehouse
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWater", "faWater") object faWater    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWeight", "faWeight") object faWeight extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWeightHanging", "faWeightHanging") object faWeightHanging
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWheelchair", "faWheelchair") object faWheelchair
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWifi", "faWifi") object faWifi       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWind", "faWind") object faWind       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWindowClose", "faWindowClose") object faWindowClose
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWindowMaximize", "faWindowMaximize") object faWindowMaximize
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWindowMinimize", "faWindowMinimize") object faWindowMinimize
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWindowRestore", "faWindowRestore") object faWindowRestore
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWineBottle", "faWineBottle") object faWineBottle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWineGlass", "faWineGlass") object faWineGlass
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWineGlassAlt", "faWineGlassAlt") object faWineGlassAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWonSign", "faWonSign") object faWonSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faWrench", "faWrench") object faWrench extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faXRay", "faXRay") object faXRay       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faYenSign", "faYenSign") object faYenSign
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-solid-svg-icons/faYinYang", "faYinYang") object faYinYang
      extends IconDefinition

}
