import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.testng.Assert

// Open browser and navigate to the login page
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

// Enter email
WebUI.setText(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 'Admin@hadir.com')

// Enter password (you might want to use encrypted text here in real test)
WebUI.setText(findTestObject('Object Repository/Login/Login_Page/input_Password_password'), 'admin@hadir')

// Click the hidden password button to reveal the password
WebUI.click(findTestObject('Object Repository/Login/Login_Page/button_HiddenPassword'))

// Verify the password field type changes to 'text' (revealing the password)
String passwordFieldType = WebUI.getAttribute(findTestObject('Object Repository/Login/Login_Page/input_Password_password'), 'type')

// Assert that the password is revealed (the type should be 'text')
Assert.assertEquals(passwordFieldType, 'text')

// Close the browser after the test
WebUI.closeBrowser()
