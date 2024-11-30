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

WebUI.setText(findTestObject('Object Repository/Admin/IzinPulangCepatPage/002/Page_HADIR/input_Search_search'), '29001')

WebUI.click(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/button_Search'))

// Define the table TestObject
TestObject tableObject = findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/Table')

// Check if the table is present on the page
boolean isTablePresent = WebUI.verifyElementPresent(tableObject, 5, FailureHandling.OPTIONAL)

if (isTablePresent) {
	// Get the table content
	String tableText = WebUI.getText(tableObject).trim()
	
	// Assert if the table is empty or null
	if (tableText == null || tableText.isEmpty()) {
		WebUI.comment("Table is empty or null.")
		assert true  // Test passes if the table is empty or null
	} else {
		WebUI.comment("Table contains data: " + tableText)
		assert false : "Table is not empty."  // Test fails if the table contains data
	}
} else {
	WebUI.comment("Table is not present on the page.")
	assert true  // Test passes if the table does not exist at all
}

// Close the browser
WebUI.closeBrowser()
