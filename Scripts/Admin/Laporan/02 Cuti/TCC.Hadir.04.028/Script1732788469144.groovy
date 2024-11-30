import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import org.openqa.selenium.InvalidElementStateException

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://magang.dikahadir.com/authentication/login')

WebUI.setText(findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/input_Email_email'), 'Admin@hadir.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/input_Password_password'), 'aSC42nPN26UggVXAwmiGmQ==')
WebUI.click(findTestObject('Object Repository/Admin/Cuti/014/Page_HADIR/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/div_Laporan'))
WebUI.click(findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/p_Cuti'))
WebUI.click(findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/svg_Menunggu Approval V1_feather feather-mo_10e371'))
WebUI.click(findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/button_Edit'))

// Attempt to set text and assert that the element is not interactable
try {
    WebUI.setText(findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/inputUpliner'), 'BCA')
    assert false : "Test failed: Element was interactable, but it should not be!"
} catch (InvalidElementStateException e) {
    println("Assertion Passed: Element is not interactable as expected.")
} catch (Exception e) {
    assert false : "An unexpected exception occurred: " + e.getMessage()
}

// Click 'Ubah Data' button after attempted edit
WebUI.click(findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/button_Ubah Data'))

// Verify the success message appears after update
boolean isSuccessMessagePresent = WebUI.verifyElementPresent(
    findTestObject('Object Repository/Admin/Cuti/028/Page_HADIR/div_Berhasil Mengubah Atasan'), 
    10, 
    FailureHandling.CONTINUE_ON_FAILURE
)
assert isSuccessMessagePresent : "Test failed: Success message did not appear after updating!"

WebUI.closeBrowser()
