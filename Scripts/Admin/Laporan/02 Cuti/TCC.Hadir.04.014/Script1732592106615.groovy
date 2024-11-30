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

WebUI.setText(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/input_Email_email'), 'Admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')

WebUI.click(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/div_Laporan'))

WebUI.click(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/p_Cuti'))

WebUI.click(findTestObject('Admin/Cuti/014/Page_HADIR/StartDate'))

WebUI.setText(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/StartDate'), 'Jun 1, 2024')

WebUI.click(findTestObject('Admin/Cuti/014/Page_HADIR/EndDate'))

WebUI.setText(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/EndDate'), 'Nov 16, 2024')

WebUI.click(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/button_Search'))

String expectedLeaveDate = '24 Sep 2024'

TestObject nameObject = findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/Nama_table')

TestObject dateObject = findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/Tanggal')

// Assert the presence of the name in the results
WebUI.verifyElementText(nameObject, expectedName, FailureHandling.STOP_ON_FAILURE)

// Assert the leave date is correctly displayed in the results
WebUI.verifyElementText(dateObject, expectedLeaveDate, FailureHandling.STOP_ON_FAILURE)

// Verify that the search results are within the specified date range
String actualStartDate = WebUI.getAttribute(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/StartDate'), 'value')

String actualEndDate = WebUI.getAttribute(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/EndDate'), 'value')

WebUI.verifyMatch(actualStartDate, 'Jun 1, 2024', false)

WebUI.verifyMatch(actualEndDate, 'Nov 16, 2024', false)

WebUI.closeBrowser()

