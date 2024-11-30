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

WebUI.setText(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/input_Email_email'), 'Admin@hadir.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')

WebUI.click(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/div_Laporan'))

WebUI.click(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/p_Cuti'))

WebUI.click(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/button__Filter'))

WebUI.setText(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/input_Unit_job_departement'), 'AMEX MERCHANT')

WebUI.sendKeys(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/input_Unit_job_departement'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Admin/Cuti/022/Page_HADIR/input_Unit_job_departement'), Keys.chord(Keys.ENTER))

TestObject nameObject = findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/Nama_table')

boolean isTableVisible = WebUI.verifyElementPresent(nameObject, 10 // Timeout of 10 seconds
    )

if (isTableVisible) {
    WebUI.comment('Data table is visible on the page.')
} else {
    WebUI.comment('Data table is not visible on the page.')
}

WebUI.closeBrowser()

