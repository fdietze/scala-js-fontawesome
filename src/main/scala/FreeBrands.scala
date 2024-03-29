package fontAwesome

import scala.scalajs.js
import scala.scalajs.js.annotation._

object freeBrands {
  // https://github.com/FortAwesome/Font-Awesome/blob/master/advanced-options/use-with-node-js/free-brands-svg-icons/index.d.ts
  // https://fontawesome.com/how-to-use/with-the-api/other/tree-shaking
  // generate directives using vim:
  // :read !export FAVERSION=5.6.3 PACK=free-brands; curl --silent https://raw.githubusercontent.com/FortAwesome/Font-Awesome/$FAVERSION/js-packages/@fortawesome/$PACK-svg-icons/index.d.ts | grep "export const fa[A-Z]" | sed -E "s/export const (.+): IconDefinition;/  @js.native @JSImport(\"@fortawesome\/$PACK-svg-icons\/\1\", \"\1\") object \1 extends IconDefinition/"

  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faAccessibleIcon",
    "faAccessibleIcon",
  ) object faAccessibleIcon                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAccusoft", "faAccusoft") object faAccusoft
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faAcquisitionsIncorporated",
    "faAcquisitionsIncorporated",
  ) object faAcquisitionsIncorporated                                                             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAdn", "faAdn") object faAdn          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAdobe", "faAdobe") object faAdobe    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAdversal", "faAdversal") object faAdversal
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faAffiliatetheme",
    "faAffiliatetheme",
  ) object faAffiliatetheme                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAlgolia", "faAlgolia") object faAlgolia
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAlipay", "faAlipay") object faAlipay extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAmazon", "faAmazon") object faAmazon extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAmazonPay", "faAmazonPay") object faAmazonPay
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAmilia", "faAmilia") object faAmilia extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAndroid", "faAndroid") object faAndroid
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAngellist", "faAngellist") object faAngellist
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAngrycreative", "faAngrycreative") object faAngrycreative
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAngular", "faAngular") object faAngular
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAppStore", "faAppStore") object faAppStore
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAppStoreIos", "faAppStoreIos") object faAppStoreIos
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faApper", "faApper") object faApper    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faApple", "faApple") object faApple    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faApplePay", "faApplePay") object faApplePay
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faArtstation", "faArtstation") object faArtstation
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAsymmetrik", "faAsymmetrik") object faAsymmetrik
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAtlassian", "faAtlassian") object faAtlassian
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAudible", "faAudible") object faAudible
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAutoprefixer", "faAutoprefixer") object faAutoprefixer
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAvianex", "faAvianex") object faAvianex
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAviato", "faAviato") object faAviato extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faAws", "faAws") object faAws          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBandcamp", "faBandcamp") object faBandcamp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBehance", "faBehance") object faBehance
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBehanceSquare", "faBehanceSquare") object faBehanceSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBimobject", "faBimobject") object faBimobject
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBitbucket", "faBitbucket") object faBitbucket
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBitcoin", "faBitcoin") object faBitcoin
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBity", "faBity") object faBity       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBlackTie", "faBlackTie") object faBlackTie
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBlackberry", "faBlackberry") object faBlackberry
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBlogger", "faBlogger") object faBlogger
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBloggerB", "faBloggerB") object faBloggerB
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBluetooth", "faBluetooth") object faBluetooth
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBluetoothB", "faBluetoothB") object faBluetoothB
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBtc", "faBtc") object faBtc          extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faBuromobelexperte",
    "faBuromobelexperte",
  ) object faBuromobelexperte                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faBuysellads", "faBuysellads") object faBuysellads
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCanadianMapleLeaf",
    "faCanadianMapleLeaf",
  ) object faCanadianMapleLeaf                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcAmazonPay", "faCcAmazonPay") object faCcAmazonPay
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcAmex", "faCcAmex") object faCcAmex extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcApplePay", "faCcApplePay") object faCcApplePay
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcDinersClub", "faCcDinersClub") object faCcDinersClub
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcDiscover", "faCcDiscover") object faCcDiscover
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcJcb", "faCcJcb") object faCcJcb    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcMastercard", "faCcMastercard") object faCcMastercard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcPaypal", "faCcPaypal") object faCcPaypal
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcStripe", "faCcStripe") object faCcStripe
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCcVisa", "faCcVisa") object faCcVisa extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCentercode", "faCentercode") object faCentercode
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCentos", "faCentos") object faCentos extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faChrome", "faChrome") object faChrome extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCloudscale", "faCloudscale") object faCloudscale
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCloudsmith", "faCloudsmith") object faCloudsmith
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCloudversify", "faCloudversify") object faCloudversify
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCodepen", "faCodepen") object faCodepen
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCodiepie", "faCodiepie") object faCodiepie
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faConfluence", "faConfluence") object faConfluence
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faConnectdevelop",
    "faConnectdevelop",
  ) object faConnectdevelop                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faContao", "faContao") object faContao extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCpanel", "faCpanel") object faCpanel extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommons",
    "faCreativeCommons",
  ) object faCreativeCommons                                                                      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsBy",
    "faCreativeCommonsBy",
  ) object faCreativeCommonsBy                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsNc",
    "faCreativeCommonsNc",
  ) object faCreativeCommonsNc                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsNcEu",
    "faCreativeCommonsNcEu",
  ) object faCreativeCommonsNcEu                                                                  extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsNcJp",
    "faCreativeCommonsNcJp",
  ) object faCreativeCommonsNcJp                                                                  extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsNd",
    "faCreativeCommonsNd",
  ) object faCreativeCommonsNd                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsPd",
    "faCreativeCommonsPd",
  ) object faCreativeCommonsPd                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsPdAlt",
    "faCreativeCommonsPdAlt",
  ) object faCreativeCommonsPdAlt                                                                 extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsRemix",
    "faCreativeCommonsRemix",
  ) object faCreativeCommonsRemix                                                                 extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsSa",
    "faCreativeCommonsSa",
  ) object faCreativeCommonsSa                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsSampling",
    "faCreativeCommonsSampling",
  ) object faCreativeCommonsSampling                                                              extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsSamplingPlus",
    "faCreativeCommonsSamplingPlus",
  ) object faCreativeCommonsSamplingPlus                                                          extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsShare",
    "faCreativeCommonsShare",
  ) object faCreativeCommonsShare                                                                 extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faCreativeCommonsZero",
    "faCreativeCommonsZero",
  ) object faCreativeCommonsZero                                                                  extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCriticalRole", "faCriticalRole") object faCriticalRole
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCss3", "faCss3") object faCss3       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCss3Alt", "faCss3Alt") object faCss3Alt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faCuttlefish", "faCuttlefish") object faCuttlefish
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDAndD", "faDAndD") object faDAndD    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDAndDBeyond", "faDAndDBeyond") object faDAndDBeyond
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDashcube", "faDashcube") object faDashcube
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDelicious", "faDelicious") object faDelicious
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDeploydog", "faDeploydog") object faDeploydog
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDeskpro", "faDeskpro") object faDeskpro
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDev", "faDev") object faDev          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDeviantart", "faDeviantart") object faDeviantart
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDhl", "faDhl") object faDhl          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDiaspora", "faDiaspora") object faDiaspora
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDigg", "faDigg") object faDigg       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDigitalOcean", "faDigitalOcean") object faDigitalOcean
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDiscord", "faDiscord") object faDiscord
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDiscourse", "faDiscourse") object faDiscourse
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDochub", "faDochub") object faDochub extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDocker", "faDocker") object faDocker extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDraft2digital", "faDraft2digital") object faDraft2digital
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDribbble", "faDribbble") object faDribbble
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faDribbbleSquare",
    "faDribbbleSquare",
  ) object faDribbbleSquare                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDropbox", "faDropbox") object faDropbox
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDrupal", "faDrupal") object faDrupal extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faDyalog", "faDyalog") object faDyalog extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEarlybirds", "faEarlybirds") object faEarlybirds
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEbay", "faEbay") object faEbay       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEdge", "faEdge") object faEdge       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faElementor", "faElementor") object faElementor
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEllo", "faEllo") object faEllo       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEmber", "faEmber") object faEmber    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEmpire", "faEmpire") object faEmpire extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEnvira", "faEnvira") object faEnvira extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faErlang", "faErlang") object faErlang extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEthereum", "faEthereum") object faEthereum
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faEtsy", "faEtsy") object faEtsy       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faExpeditedssl", "faExpeditedssl") object faExpeditedssl
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFacebook", "faFacebook") object faFacebook
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFacebookF", "faFacebookF") object faFacebookF
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faFacebookMessenger",
    "faFacebookMessenger",
  ) object faFacebookMessenger                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faFacebookSquare",
    "faFacebookSquare",
  ) object faFacebookSquare                                                                       extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faFantasyFlightGames",
    "faFantasyFlightGames",
  ) object faFantasyFlightGames                                                                   extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFedex", "faFedex") object faFedex    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFedora", "faFedora") object faFedora extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFigma", "faFigma") object faFigma    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFirefox", "faFirefox") object faFirefox
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFirstOrder", "faFirstOrder") object faFirstOrder
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFirstOrderAlt", "faFirstOrderAlt") object faFirstOrderAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFirstdraft", "faFirstdraft") object faFirstdraft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFlickr", "faFlickr") object faFlickr extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFlipboard", "faFlipboard") object faFlipboard
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFly", "faFly") object faFly          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFontAwesome", "faFontAwesome") object faFontAwesome
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faFontAwesomeAlt",
    "faFontAwesomeAlt",
  ) object faFontAwesomeAlt                                                                       extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faFontAwesomeFlag",
    "faFontAwesomeFlag",
  ) object faFontAwesomeFlag                                                                      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faFontAwesomeLogoFull",
    "faFontAwesomeLogoFull",
  ) object faFontAwesomeLogoFull                                                                  extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFonticons", "faFonticons") object faFonticons
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFonticonsFi", "faFonticonsFi") object faFonticonsFi
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFortAwesome", "faFortAwesome") object faFortAwesome
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faFortAwesomeAlt",
    "faFortAwesomeAlt",
  ) object faFortAwesomeAlt                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faForumbee", "faForumbee") object faForumbee
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFoursquare", "faFoursquare") object faFoursquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFreeCodeCamp", "faFreeCodeCamp") object faFreeCodeCamp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFreebsd", "faFreebsd") object faFreebsd
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faFulcrum", "faFulcrum") object faFulcrum
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faGalacticRepublic",
    "faGalacticRepublic",
  ) object faGalacticRepublic                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faGalacticSenate",
    "faGalacticSenate",
  ) object faGalacticSenate                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGetPocket", "faGetPocket") object faGetPocket
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGg", "faGg") object faGg             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGgCircle", "faGgCircle") object faGgCircle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGit", "faGit") object faGit          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGitSquare", "faGitSquare") object faGitSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGithub", "faGithub") object faGithub extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGithubAlt", "faGithubAlt") object faGithubAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGithubSquare", "faGithubSquare") object faGithubSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGitkraken", "faGitkraken") object faGitkraken
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGitlab", "faGitlab") object faGitlab extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGitter", "faGitter") object faGitter extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGlide", "faGlide") object faGlide    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGlideG", "faGlideG") object faGlideG extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGofore", "faGofore") object faGofore extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGoodreads", "faGoodreads") object faGoodreads
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGoodreadsG", "faGoodreadsG") object faGoodreadsG
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGoogle", "faGoogle") object faGoogle extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGoogleDrive", "faGoogleDrive") object faGoogleDrive
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGooglePlay", "faGooglePlay") object faGooglePlay
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGooglePlus", "faGooglePlus") object faGooglePlus
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGooglePlusG", "faGooglePlusG") object faGooglePlusG
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faGooglePlusSquare",
    "faGooglePlusSquare",
  ) object faGooglePlusSquare                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGoogleWallet", "faGoogleWallet") object faGoogleWallet
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGratipay", "faGratipay") object faGratipay
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGrav", "faGrav") object faGrav       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGripfire", "faGripfire") object faGripfire
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGrunt", "faGrunt") object faGrunt    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faGulp", "faGulp") object faGulp       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHackerNews", "faHackerNews") object faHackerNews
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faHackerNewsSquare",
    "faHackerNewsSquare",
  ) object faHackerNewsSquare                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHackerrank", "faHackerrank") object faHackerrank
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHips", "faHips") object faHips       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHireAHelper", "faHireAHelper") object faHireAHelper
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHooli", "faHooli") object faHooli    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHornbill", "faHornbill") object faHornbill
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHotjar", "faHotjar") object faHotjar extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHouzz", "faHouzz") object faHouzz    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHtml5", "faHtml5") object faHtml5    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faHubspot", "faHubspot") object faHubspot
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faImdb", "faImdb") object faImdb       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faInstagram", "faInstagram") object faInstagram
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faIntercom", "faIntercom") object faIntercom
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faInternetExplorer",
    "faInternetExplorer",
  ) object faInternetExplorer                                                                     extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faInvision", "faInvision") object faInvision
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faIoxhost", "faIoxhost") object faIoxhost
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faItunes", "faItunes") object faItunes extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faItunesNote", "faItunesNote") object faItunesNote
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJava", "faJava") object faJava       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJediOrder", "faJediOrder") object faJediOrder
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJenkins", "faJenkins") object faJenkins
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJira", "faJira") object faJira       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJoget", "faJoget") object faJoget    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJoomla", "faJoomla") object faJoomla extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJs", "faJs") object faJs             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJsSquare", "faJsSquare") object faJsSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faJsfiddle", "faJsfiddle") object faJsfiddle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faKaggle", "faKaggle") object faKaggle extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faKeybase", "faKeybase") object faKeybase
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faKeycdn", "faKeycdn") object faKeycdn extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faKickstarter", "faKickstarter") object faKickstarter
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faKickstarterK", "faKickstarterK") object faKickstarterK
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faKorvue", "faKorvue") object faKorvue extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLaravel", "faLaravel") object faLaravel
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLastfm", "faLastfm") object faLastfm extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLastfmSquare", "faLastfmSquare") object faLastfmSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLeanpub", "faLeanpub") object faLeanpub
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLess", "faLess") object faLess       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLine", "faLine") object faLine       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLinkedin", "faLinkedin") object faLinkedin
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLinkedinIn", "faLinkedinIn") object faLinkedinIn
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLinode", "faLinode") object faLinode extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLinux", "faLinux") object faLinux    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faLyft", "faLyft") object faLyft       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMagento", "faMagento") object faMagento
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMailchimp", "faMailchimp") object faMailchimp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMandalorian", "faMandalorian") object faMandalorian
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMarkdown", "faMarkdown") object faMarkdown
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMastodon", "faMastodon") object faMastodon
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMaxcdn", "faMaxcdn") object faMaxcdn extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMedapps", "faMedapps") object faMedapps
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMedium", "faMedium") object faMedium extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMediumM", "faMediumM") object faMediumM
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMedrt", "faMedrt") object faMedrt    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMeetup", "faMeetup") object faMeetup extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMegaport", "faMegaport") object faMegaport
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMendeley", "faMendeley") object faMendeley
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMicrosoft", "faMicrosoft") object faMicrosoft
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMix", "faMix") object faMix          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMixcloud", "faMixcloud") object faMixcloud
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMizuni", "faMizuni") object faMizuni extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faModx", "faModx") object faModx       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faMonero", "faMonero") object faMonero extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faNapster", "faNapster") object faNapster
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faNeos", "faNeos") object faNeos       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faNimblr", "faNimblr") object faNimblr extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faNintendoSwitch",
    "faNintendoSwitch",
  ) object faNintendoSwitch                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faNode", "faNode") object faNode       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faNodeJs", "faNodeJs") object faNodeJs extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faNpm", "faNpm") object faNpm          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faNs8", "faNs8") object faNs8          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faNutritionix", "faNutritionix") object faNutritionix
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faOdnoklassniki", "faOdnoklassniki") object faOdnoklassniki
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faOdnoklassnikiSquare",
    "faOdnoklassnikiSquare",
  ) object faOdnoklassnikiSquare                                                                  extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faOldRepublic", "faOldRepublic") object faOldRepublic
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faOpencart", "faOpencart") object faOpencart
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faOpenid", "faOpenid") object faOpenid extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faOpera", "faOpera") object faOpera    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faOptinMonster", "faOptinMonster") object faOptinMonster
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faOsi", "faOsi") object faOsi          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPage4", "faPage4") object faPage4    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPagelines", "faPagelines") object faPagelines
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPalfed", "faPalfed") object faPalfed extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPatreon", "faPatreon") object faPatreon
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPaypal", "faPaypal") object faPaypal extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPennyArcade", "faPennyArcade") object faPennyArcade
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPeriscope", "faPeriscope") object faPeriscope
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPhabricator", "faPhabricator") object faPhabricator
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faPhoenixFramework",
    "faPhoenixFramework",
  ) object faPhoenixFramework                                                                     extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faPhoenixSquadron",
    "faPhoenixSquadron",
  ) object faPhoenixSquadron                                                                      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPhp", "faPhp") object faPhp          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPiedPiper", "faPiedPiper") object faPiedPiper
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPiedPiperAlt", "faPiedPiperAlt") object faPiedPiperAlt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPiedPiperHat", "faPiedPiperHat") object faPiedPiperHat
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPiedPiperPp", "faPiedPiperPp") object faPiedPiperPp
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPinterest", "faPinterest") object faPinterest
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPinterestP", "faPinterestP") object faPinterestP
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faPinterestSquare",
    "faPinterestSquare",
  ) object faPinterestSquare                                                                      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPlaystation", "faPlaystation") object faPlaystation
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faProductHunt", "faProductHunt") object faProductHunt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPushed", "faPushed") object faPushed extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faPython", "faPython") object faPython extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faQq", "faQq") object faQq             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faQuinscape", "faQuinscape") object faQuinscape
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faQuora", "faQuora") object faQuora    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRProject", "faRProject") object faRProject
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRaspberryPi", "faRaspberryPi") object faRaspberryPi
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRavelry", "faRavelry") object faRavelry
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faReact", "faReact") object faReact    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faReacteurope", "faReacteurope") object faReacteurope
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faReadme", "faReadme") object faReadme extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRebel", "faRebel") object faRebel    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRedRiver", "faRedRiver") object faRedRiver
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faReddit", "faReddit") object faReddit extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRedditAlien", "faRedditAlien") object faRedditAlien
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRedditSquare", "faRedditSquare") object faRedditSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRedhat", "faRedhat") object faRedhat extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRenren", "faRenren") object faRenren extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faReplyd", "faReplyd") object faReplyd extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faResearchgate", "faResearchgate") object faResearchgate
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faResolving", "faResolving") object faResolving
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRev", "faRev") object faRev          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRocketchat", "faRocketchat") object faRocketchat
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faRockrms", "faRockrms") object faRockrms
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSafari", "faSafari") object faSafari extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSass", "faSass") object faSass       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSchlix", "faSchlix") object faSchlix extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faScribd", "faScribd") object faScribd extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSearchengin", "faSearchengin") object faSearchengin
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSellcast", "faSellcast") object faSellcast
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSellsy", "faSellsy") object faSellsy extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faServicestack", "faServicestack") object faServicestack
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faShirtsinbulk", "faShirtsinbulk") object faShirtsinbulk
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faShopware", "faShopware") object faShopware
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSimplybuilt", "faSimplybuilt") object faSimplybuilt
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSistrix", "faSistrix") object faSistrix
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSith", "faSith") object faSith       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSketch", "faSketch") object faSketch extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSkyatlas", "faSkyatlas") object faSkyatlas
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSkype", "faSkype") object faSkype    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSlack", "faSlack") object faSlack    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSlackHash", "faSlackHash") object faSlackHash
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSlideshare", "faSlideshare") object faSlideshare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSnapchat", "faSnapchat") object faSnapchat
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSnapchatGhost", "faSnapchatGhost") object faSnapchatGhost
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faSnapchatSquare",
    "faSnapchatSquare",
  ) object faSnapchatSquare                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSoundcloud", "faSoundcloud") object faSoundcloud
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSourcetree", "faSourcetree") object faSourcetree
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSpeakap", "faSpeakap") object faSpeakap
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSpotify", "faSpotify") object faSpotify
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSquarespace", "faSquarespace") object faSquarespace
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStackExchange", "faStackExchange") object faStackExchange
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStackOverflow", "faStackOverflow") object faStackOverflow
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStaylinked", "faStaylinked") object faStaylinked
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSteam", "faSteam") object faSteam    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSteamSquare", "faSteamSquare") object faSteamSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSteamSymbol", "faSteamSymbol") object faSteamSymbol
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStickerMule", "faStickerMule") object faStickerMule
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStrava", "faStrava") object faStrava extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStripe", "faStripe") object faStripe extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStripeS", "faStripeS") object faStripeS
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStudiovinari", "faStudiovinari") object faStudiovinari
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faStumbleupon", "faStumbleupon") object faStumbleupon
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faStumbleuponCircle",
    "faStumbleuponCircle",
  ) object faStumbleuponCircle                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSuperpowers", "faSuperpowers") object faSuperpowers
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSupple", "faSupple") object faSupple extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faSuse", "faSuse") object faSuse       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTeamspeak", "faTeamspeak") object faTeamspeak
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTelegram", "faTelegram") object faTelegram
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTelegramPlane", "faTelegramPlane") object faTelegramPlane
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTencentWeibo", "faTencentWeibo") object faTencentWeibo
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTheRedYeti", "faTheRedYeti") object faTheRedYeti
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faThemeco", "faThemeco") object faThemeco
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faThemeisle", "faThemeisle") object faThemeisle
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faThinkPeaks", "faThinkPeaks") object faThinkPeaks
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faTradeFederation",
    "faTradeFederation",
  ) object faTradeFederation                                                                      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTrello", "faTrello") object faTrello extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTripadvisor", "faTripadvisor") object faTripadvisor
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTumblr", "faTumblr") object faTumblr extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTumblrSquare", "faTumblrSquare") object faTumblrSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTwitch", "faTwitch") object faTwitch extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTwitter", "faTwitter") object faTwitter
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTwitterSquare", "faTwitterSquare") object faTwitterSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faTypo3", "faTypo3") object faTypo3    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUber", "faUber") object faUber       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUbuntu", "faUbuntu") object faUbuntu extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUikit", "faUikit") object faUikit    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUniregistry", "faUniregistry") object faUniregistry
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUntappd", "faUntappd") object faUntappd
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUps", "faUps") object faUps          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUsb", "faUsb") object faUsb          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUsps", "faUsps") object faUsps       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faUssunnah", "faUssunnah") object faUssunnah
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faVaadin", "faVaadin") object faVaadin extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faViacoin", "faViacoin") object faViacoin
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faViadeo", "faViadeo") object faViadeo extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faViadeoSquare", "faViadeoSquare") object faViadeoSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faViber", "faViber") object faViber    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faVimeo", "faVimeo") object faVimeo    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faVimeoSquare", "faVimeoSquare") object faVimeoSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faVimeoV", "faVimeoV") object faVimeoV extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faVine", "faVine") object faVine       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faVk", "faVk") object faVk             extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faVnv", "faVnv") object faVnv          extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faVuejs", "faVuejs") object faVuejs    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWeebly", "faWeebly") object faWeebly extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWeibo", "faWeibo") object faWeibo    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWeixin", "faWeixin") object faWeixin extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWhatsapp", "faWhatsapp") object faWhatsapp
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faWhatsappSquare",
    "faWhatsappSquare",
  ) object faWhatsappSquare                                                                       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWhmcs", "faWhmcs") object faWhmcs    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWikipediaW", "faWikipediaW") object faWikipediaW
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWindows", "faWindows") object faWindows
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWix", "faWix") object faWix          extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faWizardsOfTheCoast",
    "faWizardsOfTheCoast",
  ) object faWizardsOfTheCoast                                                                    extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faWolfPackBattalion",
    "faWolfPackBattalion",
  ) object faWolfPackBattalion                                                                    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWordpress", "faWordpress") object faWordpress
      extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faWordpressSimple",
    "faWordpressSimple",
  ) object faWordpressSimple                                                                      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWpbeginner", "faWpbeginner") object faWpbeginner
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWpexplorer", "faWpexplorer") object faWpexplorer
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWpforms", "faWpforms") object faWpforms
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faWpressr", "faWpressr") object faWpressr
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faXbox", "faXbox") object faXbox       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faXing", "faXing") object faXing       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faXingSquare", "faXingSquare") object faXingSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faYCombinator", "faYCombinator") object faYCombinator
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faYahoo", "faYahoo") object faYahoo    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faYandex", "faYandex") object faYandex extends IconDefinition
  @js.native @JSImport(
    "@fortawesome/free-brands-svg-icons/faYandexInternational",
    "faYandexInternational",
  ) object faYandexInternational                                                                  extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faYarn", "faYarn") object faYarn       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faYelp", "faYelp") object faYelp       extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faYoast", "faYoast") object faYoast    extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faYoutube", "faYoutube") object faYoutube
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faYoutubeSquare", "faYoutubeSquare") object faYoutubeSquare
      extends IconDefinition
  @js.native @JSImport("@fortawesome/free-brands-svg-icons/faZhihu", "faZhihu") object faZhihu    extends IconDefinition

}
