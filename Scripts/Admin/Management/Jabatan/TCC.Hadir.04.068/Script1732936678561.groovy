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

WebUI.click(findTestObject('Admin/Jabatan/Page_HADIR/button_Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Jabatan/Page_HADIR/button_EditTabel'), FailureHandling.STOP_ON_FAILURE)

// Clear and input 'nama' (Name)
WebUI.click(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanNama'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanNama'), Keys.chord(Keys.CONTROL, 'a' // Select all text
        ))

WebUI.sendKeys(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanNama'), Keys.chord(Keys.DELETE // Delete selected text
        ))

WebUI.setText(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanNama'), 'Customer Service')


WebUI.sendKeys(findTestObject('Admin/Jabatan/Page_HADIR/txtTambahkanLevel'), Keys.chord(Keys.ENTER))
// Search for the edited data (level '1')
WebUI.setText(findTestObject('Object Repository/Admin/Jabatan/Page_HADIR/input_Admin Hadir_search'), '2')

// Verify that the result contains the expected level '1'
TestObject searchResult = findTestObject('Admin/Jabatan/Page_HADIR/tableRows')  // Replace with actual object for search result
String resultText = WebUI.getText(searchResult)

assert resultText.contains('2') : "Data edit failed. Expected '2' in search result but found: " + resultText

WebUI.closeBrowser()


