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

WebUI.setText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/input_Email_email (1)'), 'Admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/input_Password_password (1)'), 
    'aSC42nPN26UggVXAwmiGmQ==')

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/button_Masuk (1)'))

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/p_Laporan'))

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/p_Izin Pulang Cepat'))

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/svg_Start Date_feather feather-calendar (1)'))

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/November1'))

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/November24'))

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/button_save'))

WebUI.click(findTestObject('Object Repository/Admin/IzinPulangCepatPage/button_Search (1)'))

// Assert that the user "kazama" is displayed in the results
assert WebUI.verifyElementText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/td_kazama (1)'), 'kazama')

WebUI.closeBrowser()

