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

WebUI.setText(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/input_Email_email'), 'Admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')

WebUI.click(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/div_Management'))

WebUI.click(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/p_Jabatan'))

WebUI.click(findTestObject('Admin/Jabatan/Page_HADIR/button_Tambahkan'))

WebUI.click(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanNama'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanNama'), 'Service Customer')

WebUI.click(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanLevel'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanLevel'), '2')

WebUI.click(findTestObject('Admin/Jabatan/Page_HADIR/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/input_Admin Hadir_search'), '2')

WebUI.click(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/button_Search'))
// Capture the entire row text
String rowText = WebUI.getText(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/tableRows'))

// Extract the level (assuming it's always the last word in the row)
String actualLevel = rowText.split("\\s+").last()  // Splits by spaces and gets the last element

// Define the expected level
String expectedLevel = "2"

// Perform the assertion for the level
assert actualLevel == expectedLevel : "Expected level '${expectedLevel}' but found '${actualLevel}'"

WebUI.closeBrowser()

