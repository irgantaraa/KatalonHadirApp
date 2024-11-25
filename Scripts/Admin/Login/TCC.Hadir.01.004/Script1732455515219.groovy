import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By

// Open browser and maximize window
WebUI.openBrowser('')
WebUI.maximizeWindow()

// Navigate to the login page
WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

// Verify the login page loaded
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 10)

// Enter an invalid email without '@'
WebUI.setText(findTestObject('Object Repository/Login/Login_Page/input_Email_email'), 'Adminhadir.com')

// Enter password (encrypted)
WebUI.setEncryptedText(findTestObject('Object Repository/Login/Login_Page/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')

// Trigger form validation (e.g., by attempting to submit the form)
WebUI.click(findTestObject('Object Repository/Login/Login_Page/button_Masuk'))

// Capture the validation message using JavaScript
WebElement emailField = DriverFactory.getWebDriver().findElement(By.name('email'))
String validationMessage = emailField.getAttribute('validationMessage')

// Verify the validation message
String expectedMessage = "Please include an '@' in the email address. 'adminhadir.com' is missing an '@'."
if (validationMessage == expectedMessage) {
    WebUI.comment("Validation message is correct: ${validationMessage}")
} else {
    WebUI.comment("Validation message is incorrect. Found: ${validationMessage}")
}

// Close the browser
WebUI.closeBrowser()
