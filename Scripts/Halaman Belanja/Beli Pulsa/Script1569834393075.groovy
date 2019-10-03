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

Mobile.startApplication(GlobalVariable.ApkFile, false)

Mobile.delay(3)

punya_toko = Mobile.getText(findTestObject('Object Repository/Landing Page/android.widget.TextView0 - Punya Toko Sendiri Dengan Modal Minim'), 
    5, FailureHandling.OPTIONAL)

Landing_page = Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Landing Page/android.widget.TextView0 - Punya Toko Sendiri Dengan Modal Minim'), 
    'text', punya_toko, 5, FailureHandling.OPTIONAL)

if (Landing_page == true) {
    'Landing Page/Home Page'
    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Landing Page/next 1'), 5)

    Mobile.tap(findTestObject('Landing Page/next 2'), 5)

    Mobile.tap(findTestObject('Object Repository/Landing Page/android.widget.Button0 - MULAI'), 5)
}

'Home Page'
not_run: Mobile.takeScreenshot()

not_run: Mobile.waitForElementAttributeValue(findTestObject('Menu Bawah/Menu - Akun'), 'text', 'Akun', 5)

not_run: Mobile.tap(findTestObject('Menu Bawah/Menu - Akun'), 5)

'Halaman Login'
not_run: Mobile.takeScreenshot()

'Check User already Login or Not'
not_run: if (Mobile.verifyElementNotExist(findTestObject('Object Repository/LOGIN/Assert/Profil Saya'), 5, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Object Repository/LOGIN/android.widget.EditText0 - Username or email address'), GlobalVariable.email_dev, 
        5)

    Mobile.setText(findTestObject('Object Repository/LOGIN/android.widget.EditText1 - Password'), GlobalVariable.pass_dev, 
        5)

    'Menginput field email & password'
    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Object Repository/LOGIN/Login Button'), 5)

    Mobile.waitForElementPresent(findTestObject('Object Repository/LOGIN/Assert/Profil Saya'), 5)

    'Verify'
    Mobile.verifyElementText(findTestObject('Object Repository/LOGIN/Assert/Profil Saya'), 'Profil Saya')

    'Halaman Akun'
    Mobile.takeScreenshot()
}

'Menu Belanja'
Mobile.tap(findTestObject('Object Repository/Menu Bawah/Menu - Belanja'), 5)

'Masuk ke menu Pulsa & Paket data'
Mobile.tap(findTestObject('Object Repository/Halaman Belanja/Beli pulsa or paket data/BELI pulsa or paket data'), 5)

'Memilih pulsa'
Mobile.tap(findTestObject('Halaman Belanja/Beli pulsa or paket data/katagori/Pulsa'), 5)

'Input phone number'
Mobile.setText(findTestObject('Object Repository/Halaman Belanja/Beli pulsa or paket data/Input Phone number'), GlobalVariable.no_phone_pulsa, 5)

'Memilih jenis pulsa'
Mobile.tap(findTestObject('Object Repository/Halaman Belanja/Beli pulsa or paket data/Product Harga Rp. 25.000'), 5)

'Menekan button BAYAR'
Mobile.tap(findTestObject('Object Repository/Halaman Belanja/Beli pulsa or paket data/button BAYAR'), 5)

'Menginput CVV'
Mobile.setText(findTestObject('Object Repository/Halaman Belanja/Beli pulsa or paket data/Input CVV'), GlobalVariable.CVV, 5)

'Menekan button KIRIM'
Mobile.tap(findTestObject('Object Repository/Halaman Belanja/Beli pulsa or paket data/button KIRIM'), 5)

'Verifikasi'
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Halaman Belanja/Beli pulsa or paket data/Response/Response failed') , 'text', '''Failed.

Kolom Order Number harus diisi.

''', 0)
