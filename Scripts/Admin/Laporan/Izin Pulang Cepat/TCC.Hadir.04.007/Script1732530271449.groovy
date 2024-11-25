import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

// Login steps
WebUI.setText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/input_Email_email'), 'Admin@hadir.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/button_Masuk'))

// Navigation to the specific report
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/div_Laporan'))
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/p_Izin Pulang Cepat'))

// Search functionality
WebUI.setText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/input_Search_search'), 'Kazama')

// Date selection
WebUI.click(findTestObject('Admin/IzinPulangCepatPage/002/Page_HADIR/StartDate'))
WebUI.setText(findTestObject('Admin/IzinPulangCepatPage/002/Page_HADIR/StartDate'), 'Nov 1, 2024')


// Execute search
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/svg_Search_MuiSvgIcon-root MuiSvgIcon-fontS_495b60'))

// Verification step
boolean isKazamaPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/td_kazama'), 10)
assert isKazamaPresent : "The search result for 'Nov 1, 2024' is displayed."

WebUI.closeBrowser()

