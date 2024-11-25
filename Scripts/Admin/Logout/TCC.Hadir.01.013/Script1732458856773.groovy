import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.testng.Assert

// Open browser and navigate to the login page
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

// Enter email
WebUI.setText(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 'Admin@hadir.com')

// Enter password (encrypted)
WebUI.setEncryptedText(findTestObject('Object Repository/Login/Login_Page/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')

// Click the login button
WebUI.click(findTestObject('Object Repository/Login/Login_Page/button_Masuk'))

// Click on the profile icon (or any element that allows you to log out)
WebUI.click(findTestObject('Object Repository/Login/Login_Page/Page_HADIR/polyline'))

// Click the logout button
WebUI.click(findTestObject('Object Repository/Login/Login_Page/Page_HADIR/button_Logout'))

// Click the "Login" button to ensure we're on the login page after logout
WebUI.click(findTestObject('Object Repository/Login/Login_Page/Page_HADIR/p_Login'))

// Assert that the login page is displayed by verifying the presence of the email input field
boolean isEmailFieldVisible = WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 10)
Assert.assertTrue(isEmailFieldVisible, "Login page is not displayed after logout.")

// Close the browser after the test
WebUI.closeBrowser()
