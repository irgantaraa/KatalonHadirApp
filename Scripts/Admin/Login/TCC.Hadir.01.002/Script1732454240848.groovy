import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject

// Open browser and maximize window
WebUI.openBrowser('')

WebUI.maximizeWindow()

// Navigate to the login page
WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

// Verify the login page loaded
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 10, FailureHandling.STOP_ON_FAILURE)

// Enter email
WebUI.setText(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 'Irga@hadir.com')

// Enter password (encrypted)
WebUI.setEncryptedText(findTestObject('Object Repository/Login/Login_Page/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')

// Click the login button
WebUI.click(findTestObject('Object Repository/Login/Login_Page/button_Masuk'))

// Verify error message instead of alert
TestObject errorMessageObject = findTestObject('Object Repository/Login/Login_Page/div_ErrorMessage')

if (errorMessageObject != null) {
    WebUI.waitForElementVisible(errorMessageObject, 10)

    WebUI.verifyElementText(errorMessageObject, 'Akun tidak ditemukan', FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.comment('Error message object not found. Verify the Object Repository setup.')
}

// Close the browser
WebUI.closeBrowser()

