package fontAwesome

import scala.scalajs.js
import scala.scalajs.js.annotation._

object freeRegular {
  // https://github.com/FortAwesome/Font-Awesome/blob/master/advanced-options/use-with-node-js/free-regular-svg-icons/index.d.ts
  // https://fontawesome.com/how-to-use/with-the-api/other/tree-shaking
  // generate directives using vim:
  // :read !export FAVERSION=5.6.3 PACK=free-regular; curl --silent https://raw.githubusercontent.com/FortAwesome/Font-Awesome/$FAVERSION/js-packages/@fortawesome/$PACK-svg-icons/index.d.ts | grep "export const fa[A-Z]" | sed -E "s/export const (.+): IconDefinition;/  @js.native @JSImport(\"@fortawesome\/$PACK-svg-icons\/\1\", \"\1\") object \1 extends IconDefinition/"

  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faAddressBook", "faAddressBook") object faAddressBook
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faAddressCard", "faAddressCard") object faAddressCard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faAngry", "faAngry") object faAngry extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faArrowAltCircleDown",
    "faArrowAltCircleDown",
  ) object faArrowAltCircleDown                                                                 extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faArrowAltCircleLeft",
    "faArrowAltCircleLeft",
  ) object faArrowAltCircleLeft                                                                 extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faArrowAltCircleRight",
    "faArrowAltCircleRight",
  ) object faArrowAltCircleRight                                                                extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faArrowAltCircleUp",
    "faArrowAltCircleUp",
  ) object faArrowAltCircleUp                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faBell", "faBell") object faBell    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faBellSlash", "faBellSlash") object faBellSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faBookmark", "faBookmark") object faBookmark
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faBuilding", "faBuilding") object faBuilding
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCalendar", "faCalendar") object faCalendar
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCalendarAlt", "faCalendarAlt") object faCalendarAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCalendarCheck", "faCalendarCheck") object faCalendarCheck
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCalendarMinus", "faCalendarMinus") object faCalendarMinus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCalendarPlus", "faCalendarPlus") object faCalendarPlus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCalendarTimes", "faCalendarTimes") object faCalendarTimes
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faCaretSquareDown",
    "faCaretSquareDown",
  ) object faCaretSquareDown                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faCaretSquareLeft",
    "faCaretSquareLeft",
  ) object faCaretSquareLeft                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faCaretSquareRight",
    "faCaretSquareRight",
  ) object faCaretSquareRight                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCaretSquareUp", "faCaretSquareUp") object faCaretSquareUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faChartBar", "faChartBar") object faChartBar
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCheckCircle", "faCheckCircle") object faCheckCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCheckSquare", "faCheckSquare") object faCheckSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCircle", "faCircle") object faCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faClipboard", "faClipboard") object faClipboard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faClock", "faClock") object faClock extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faClone", "faClone") object faClone extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faClosedCaptioning",
    "faClosedCaptioning",
  ) object faClosedCaptioning                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faComment", "faComment") object faComment
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCommentAlt", "faCommentAlt") object faCommentAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCommentDots", "faCommentDots") object faCommentDots
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faComments", "faComments") object faComments
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCompass", "faCompass") object faCompass
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCopy", "faCopy") object faCopy    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCopyright", "faCopyright") object faCopyright
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faCreditCard", "faCreditCard") object faCreditCard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faDizzy", "faDizzy") object faDizzy extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faDotCircle", "faDotCircle") object faDotCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faEdit", "faEdit") object faEdit    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faEnvelope", "faEnvelope") object faEnvelope
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faEnvelopeOpen", "faEnvelopeOpen") object faEnvelopeOpen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faEye", "faEye") object faEye       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faEyeSlash", "faEyeSlash") object faEyeSlash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFile", "faFile") object faFile    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFileAlt", "faFileAlt") object faFileAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFileArchive", "faFileArchive") object faFileArchive
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFileAudio", "faFileAudio") object faFileAudio
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFileCode", "faFileCode") object faFileCode
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFileExcel", "faFileExcel") object faFileExcel
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFileImage", "faFileImage") object faFileImage
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFilePdf", "faFilePdf") object faFilePdf
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faFilePowerpoint",
    "faFilePowerpoint",
  ) object faFilePowerpoint                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFileVideo", "faFileVideo") object faFileVideo
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFileWord", "faFileWord") object faFileWord
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFlag", "faFlag") object faFlag    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFlushed", "faFlushed") object faFlushed
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFolder", "faFolder") object faFolder
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFolderOpen", "faFolderOpen") object faFolderOpen
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faFontAwesomeLogoFull",
    "faFontAwesomeLogoFull",
  ) object faFontAwesomeLogoFull                                                                extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFrown", "faFrown") object faFrown extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFrownOpen", "faFrownOpen") object faFrownOpen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faFutbol", "faFutbol") object faFutbol
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGem", "faGem") object faGem       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrimace", "faGrimace") object faGrimace
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrin", "faGrin") object faGrin    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinAlt", "faGrinAlt") object faGrinAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinBeam", "faGrinBeam") object faGrinBeam
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinBeamSweat", "faGrinBeamSweat") object faGrinBeamSweat
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinHearts", "faGrinHearts") object faGrinHearts
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinSquint", "faGrinSquint") object faGrinSquint
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faGrinSquintTears",
    "faGrinSquintTears",
  ) object faGrinSquintTears                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinStars", "faGrinStars") object faGrinStars
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinTears", "faGrinTears") object faGrinTears
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinTongue", "faGrinTongue") object faGrinTongue
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faGrinTongueSquint",
    "faGrinTongueSquint",
  ) object faGrinTongueSquint                                                                   extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faGrinTongueWink",
    "faGrinTongueWink",
  ) object faGrinTongueWink                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faGrinWink", "faGrinWink") object faGrinWink
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandLizard", "faHandLizard") object faHandLizard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandPaper", "faHandPaper") object faHandPaper
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandPeace", "faHandPeace") object faHandPeace
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandPointDown", "faHandPointDown") object faHandPointDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandPointLeft", "faHandPointLeft") object faHandPointLeft
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faHandPointRight",
    "faHandPointRight",
  ) object faHandPointRight                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandPointUp", "faHandPointUp") object faHandPointUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandPointer", "faHandPointer") object faHandPointer
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandRock", "faHandRock") object faHandRock
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandScissors", "faHandScissors") object faHandScissors
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandSpock", "faHandSpock") object faHandSpock
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHandshake", "faHandshake") object faHandshake
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHdd", "faHdd") object faHdd       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHeart", "faHeart") object faHeart extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHospital", "faHospital") object faHospital
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faHourglass", "faHourglass") object faHourglass
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faIdBadge", "faIdBadge") object faIdBadge
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faIdCard", "faIdCard") object faIdCard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faImage", "faImage") object faImage extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faImages", "faImages") object faImages
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faKeyboard", "faKeyboard") object faKeyboard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faKiss", "faKiss") object faKiss    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faKissBeam", "faKissBeam") object faKissBeam
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faKissWinkHeart", "faKissWinkHeart") object faKissWinkHeart
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faLaugh", "faLaugh") object faLaugh extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faLaughBeam", "faLaughBeam") object faLaughBeam
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faLaughSquint", "faLaughSquint") object faLaughSquint
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faLaughWink", "faLaughWink") object faLaughWink
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faLemon", "faLemon") object faLemon extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faLifeRing", "faLifeRing") object faLifeRing
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faLightbulb", "faLightbulb") object faLightbulb
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faListAlt", "faListAlt") object faListAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faMap", "faMap") object faMap       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faMeh", "faMeh") object faMeh       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faMehBlank", "faMehBlank") object faMehBlank
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faMehRollingEyes",
    "faMehRollingEyes",
  ) object faMehRollingEyes                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faMinusSquare", "faMinusSquare") object faMinusSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faMoneyBillAlt", "faMoneyBillAlt") object faMoneyBillAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faMoon", "faMoon") object faMoon    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faNewspaper", "faNewspaper") object faNewspaper
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faObjectGroup", "faObjectGroup") object faObjectGroup
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faObjectUngroup", "faObjectUngroup") object faObjectUngroup
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faPaperPlane", "faPaperPlane") object faPaperPlane
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faPauseCircle", "faPauseCircle") object faPauseCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faPlayCircle", "faPlayCircle") object faPlayCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faPlusSquare", "faPlusSquare") object faPlusSquare
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faQuestionCircle",
    "faQuestionCircle",
  ) object faQuestionCircle                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faRegistered", "faRegistered") object faRegistered
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSadCry", "faSadCry") object faSadCry
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSadTear", "faSadTear") object faSadTear
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSave", "faSave") object faSave    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faShareSquare", "faShareSquare") object faShareSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSmile", "faSmile") object faSmile extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSmileBeam", "faSmileBeam") object faSmileBeam
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSmileWink", "faSmileWink") object faSmileWink
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSnowflake", "faSnowflake") object faSnowflake
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSquare", "faSquare") object faSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faStar", "faStar") object faStar    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faStarHalf", "faStarHalf") object faStarHalf
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faStickyNote", "faStickyNote") object faStickyNote
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faStopCircle", "faStopCircle") object faStopCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSun", "faSun") object faSun       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faSurprise", "faSurprise") object faSurprise
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faThumbsDown", "faThumbsDown") object faThumbsDown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faThumbsUp", "faThumbsUp") object faThumbsUp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faTimesCircle", "faTimesCircle") object faTimesCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faTired", "faTired") object faTired extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faTrashAlt", "faTrashAlt") object faTrashAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faUser", "faUser") object faUser    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faUserCircle", "faUserCircle") object faUserCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faWindowClose", "faWindowClose") object faWindowClose
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faWindowMaximize",
    "faWindowMaximize",
  ) object faWindowMaximize                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-regular-svg-icons/faWindowMinimize",
    "faWindowMinimize",
  ) object faWindowMinimize                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-regular-svg-icons/faWindowRestore", "faWindowRestore") object faWindowRestore
      extends IconDefinition

}
