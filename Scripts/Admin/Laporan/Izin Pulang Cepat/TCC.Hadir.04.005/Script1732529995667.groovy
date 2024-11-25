import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

// Login steps
WebUI.setText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/005/Page_HADIR/input_Email_email'), 'Admin@hadir.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/005/Page_HADIR/input_Password_password'), 
    'aSC42nPN26UggVXAwmiGmQ==')
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/005/Page_HADIR/button_Masuk'))

// Navigation
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/005/Page_HADIR/div_Laporan'))
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/005/Page_HADIR/p_Izin Pulang Cepat'))

// Perform Search
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/005/Page_HADIR/button_Search'))

// Click the search result
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/005/Page_HADIR/td_kazama'))

// Assertion: Verify if the search result is displayed
boolean isPresent = WebUI.verifyElementVisible(findTestObject('Object Repository/Admin/IzinPulangCepatPage/005/Page_HADIR/td_kazama'))
assert isPresent == true : "Search result for 'Kazama' not found."

WebUI.closeBrowser()