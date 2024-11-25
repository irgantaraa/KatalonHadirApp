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

WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Laporan/CutiPage/input_Email_email'), 'admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Laporan/CutiPage/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')

WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/p_Berhasil login'))

WebUI.click(findTestObject('Laporan/CutiPage/div_Laporan'))

WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/div_Cuti'))

WebUI.setText(findTestObject('Object Repository/Laporan/CutiPage/input_Search_search'), 'Anif Biantoro')

WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/svg_Start Date_feather feather-calendar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Laporan/CutiPage/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/span_24'))

WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/span_30'))

WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/button_save'))

// Validate search and employee details
WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/button_Search'))

KeywordUtil.logInfo('Clicked the \'Search\' button.')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Laporan/CutiPage/h6_Anif Biantoro'), 10) && WebUI.verifyElementVisible(
    findTestObject('Object Repository/Laporan/CutiPage/h6_Anif Biantoro'))) {
    WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/h6_Anif Biantoro'))

    KeywordUtil.logInfo('Found and clicked on \'Anif Biantoro\'.')
} else {
    KeywordUtil.logInfo('Failed to find or interact with \'Anif Biantoro\'.')
}

// Validate date range
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Laporan/CutiPage/h6_25 Sep 2024 - 25 Sep 2024'), 10) && 
WebUI.verifyElementVisible(findTestObject('Object Repository/Laporan/CutiPage/h6_25 Sep 2024 - 25 Sep 2024'))) {
    WebUI.click(findTestObject('Object Repository/Laporan/CutiPage/h6_25 Sep 2024 - 25 Sep 2024'))

    KeywordUtil.logInfo('Found and clicked on the date range: \'25 Sep 2024 - 25 Sep 2024\'.')
} else {
    KeywordUtil.logInfo('Failed to find or interact with the date range element.')
}

// Close browser
WebUI.closeBrowser()

KeywordUtil.logInfo('Browser closed successfully.')

