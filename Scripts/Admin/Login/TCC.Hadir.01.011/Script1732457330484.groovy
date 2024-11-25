import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// Open browser and navigate to the login page
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

// Verify the login page loaded
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 10, FailureHandling.STOP_ON_FAILURE)

// Enter email
WebUI.setText(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 'Admin@hadir.com')

// Verify the input field type is 'password', which ensures it is masking the text
String inputFieldType = WebUI.getAttribute(findTestObject('Object Repository/Login/Login_Page/input_Password_password'), 'type')
WebUI.verifyMatch(inputFieldType, 'password', false)

// Close the browser
WebUI.closeBrowser()

