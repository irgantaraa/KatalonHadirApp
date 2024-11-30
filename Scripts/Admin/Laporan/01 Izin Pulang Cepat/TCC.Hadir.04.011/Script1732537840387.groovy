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

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/input_Password_password'), 
    'aSC42nPN26UggVXAwmiGmQ==')

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/button_Masuk'))

// Navigation to the specific report
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/div_Laporan'))

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/p_Izin Pulang Cepat'))

// Search functionality
WebUI.setText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/input_Search_search'), 'Agung Aji Nugraha')

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/009/Page_HADIR/svg__feather feather-filter'))

WebUI.setText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/009/Page_HADIR/input_Unit_job_departement'), 'AMEX MERCHANT')

WebUI.sendKeys(findTestObject('Object Repository/Admin/IzinPulangCepatPage/009/Page_HADIR/input_Unit_job_departement'), 
    Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Admin/IzinPulangCepatPage/009/Page_HADIR/input_Unit_job_departement'), 
    Keys.chord(Keys.ENTER))

// Execute search
WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/svg_Search_MuiSvgIcon-root MuiSvgIcon-fontS_495b60'))

// Capture and assert "Nama" and "Unit" column values
String actualNama = WebUI.getText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/009/Page_HADIR/td_nama'))

String actualUnit = WebUI.getText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/009/Page_HADIR/td_unit'))

// Replace these with your expected values
String expectedNama = 'Agung Aji Nugraha' // Replace with the actual expected name

String expectedUnit = 'AMEX MERCHANT' // Replace with the actual expected unit

// Perform assertions
assert actualNama == expectedNama

assert actualUnit == expectedUnit

WebUI.closeBrowser()

