import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Buka browser dan navigasi ke URL
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://magang.dikahadir.com/absen/login')

// Masuk ke akun
WebUI.setText(findTestObject('Object Repository/User/Cuti/Page_HADIR/input_Email_email'), 'testuser1@gmail.com')
WebUI.setEncryptedText(findTestObject('Object Repository/User/Cuti/Page_HADIR/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')
WebUI.click(findTestObject('Object Repository/User/Cuti/Page_HADIR/button_Masuk'))

// Navigasi ke halaman Info Cuti
WebUI.click(findTestObject('Object Repository/User/Cuti/Page_HADIR/img'))
WebUI.click(findTestObject('Object Repository/User/Cuti/Page_HADIR/button_Ajukan Cuti'))
WebUI.click(findTestObject('Object Repository/User/Cuti/Page_HADIR/button_Info Cuti'))

// Memeriksa apakah Test Object 'TotalCuti' tersedia
if (findTestObject('Object Repository/TotalCuti') == null) {
    WebUI.comment("Test Object 'TotalCuti' is null. Please check the Object Repository path.")
} else {
    // Ambil nilai "Total Cuti" dari Test Object
    WebUI.delay(3) // Menunggu elemen untuk dimuat
    String totalCutiText = WebUI.getText(findTestObject('Object Repository/TotalCuti')).trim()
    
    // Validasi dan ekstraksi nilai
    if (totalCutiText.contains("Total :")) {
        String totalCutiValue = totalCutiText.replace("Total :", "").trim()
        WebUI.comment("Total Cuti value is: " + totalCutiValue)
    } else {
        WebUI.comment("Unexpected text format: " + totalCutiText)
    }
}

// Tutup browser
WebUI.closeBrowser()
