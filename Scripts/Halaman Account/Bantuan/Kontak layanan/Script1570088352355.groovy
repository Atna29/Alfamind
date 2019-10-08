import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Memulai Aplikasi'
Mobile.startApplication(GlobalVariable.ApkFile, false)

'Delay'
Mobile.delay(3)

'Check Landing page'
punya_toko = Mobile.getText(findTestObject('Object Repository/Landing Page/android.widget.TextView0 - Punya Toko Sendiri Dengan Modal Minim'), 
    5, FailureHandling.OPTIONAL)

'Landing page'
Landing_page = Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Landing Page/android.widget.TextView0 - Punya Toko Sendiri Dengan Modal Minim'), 
    'text', punya_toko, 5, FailureHandling.OPTIONAL)

'Run Landing page'
if (Landing_page == true) {
    'Landing Page/Home Page'
    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Landing Page/next 1'), 5)

    Mobile.tap(findTestObject('Landing Page/next 2'), 5)

    Mobile.tap(findTestObject('Object Repository/Landing Page/android.widget.Button0 - MULAI'), 5)
}

'Home Page'
Mobile.takeScreenshot()

'Menunggu Menu Akun'
Mobile.waitForElementAttributeValue(findTestObject('Menu Bawah/Menu - Akun'), 'text', 'Akun', 5)

'Tap Menu Akun'
Mobile.tap(findTestObject('Menu Bawah/Menu - Akun'), 5)

Mobile.tap(findTestObject('Halaman Akun/Bantuan/Kontak Layanan/android.widget.TextView5 - Bantuan'), 5)

Mobile.tap(findTestObject('Halaman Akun/Bantuan/Kontak Layanan/android.widget.TextView1 - Kontak Layanan'), 5)

Mobile.setText(findTestObject('Halaman Akun/Bantuan/Kontak Layanan/android.widget.EditText0 - Judul Pesan'), 'Testing', 5)

Mobile.setText(findTestObject('Halaman Akun/Bantuan/Kontak Layanan/android.widget.EditText1 - Isi Pesan (1)'), '1234567890123456789012345', 5)

Mobile.tap(findTestObject('Halaman Akun/Bantuan/Kontak Layanan/android.widget.TextView7 - KIRIM'), 0)
