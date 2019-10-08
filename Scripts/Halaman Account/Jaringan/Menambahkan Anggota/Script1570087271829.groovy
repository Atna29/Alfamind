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

Mobile.waitForElementAttributeValue(findTestObject('Menu Bawah/Menu - Akun'), 'text', 'Akun', 5)

Mobile.tap(findTestObject('Menu Bawah/Menu - Akun'), 5)

'Halaman Login/Account'
Mobile.takeScreenshot()

'Check User already Login or Not'
if (Mobile.verifyElementNotExist(findTestObject('Object Repository/LOGIN/Assert/Profil Saya'), 5, FailureHandling.OPTIONAL)) {
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

Mobile.waitForElementAttributeValue(findTestObject('Menu Bawah/Menu - Akun'), 'text', 'Akun', 5)

Mobile.tap(findTestObject('Menu Bawah/Menu - Akun'), 5)

'Tap Menu Jaringan'
Mobile.tap(findTestObject('Object Repository/Halaman Akun/android.widget.TextView4 - Jaringan'), 5)

'Tap Daftar Anggota Baru'
Mobile.tap(findTestObject('Object Repository/Halaman Akun/Jaringan/Pendaftaran Anggota'), 5)

'Call Test Case Register'
Mobile.callTestCase(findTestCase('Halaman Account/Jaringan/0 Registrasi jaringan'), [:], FailureHandling.STOP_ON_FAILURE)

