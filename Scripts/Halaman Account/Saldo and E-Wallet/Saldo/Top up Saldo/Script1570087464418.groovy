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
Mobile.takeScreenshot()

Mobile.waitForElementAttributeValue(findTestObject('Menu Bawah/Menu - Akun'), 'text', 'Akun', 5)

Mobile.tap(findTestObject('Menu Bawah/Menu - Akun'), 5)

Mobile.tap(findTestObject('Object Repository/Halaman Akun/android.widget.TextView1 - Saldo  E-wallet'), 5)

Mobile.tap(findTestObject('Object Repository/Halaman Akun/Saldo and E-Wallet/Saldo/Topup'), 5)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/Halaman Akun/Saldo and E-Wallet/Saldo/Top UP/Input Balance'), GlobalVariable.balance_topup, 5)

Mobile.tap(findTestObject('Object Repository/Halaman Akun/Saldo and E-Wallet/Saldo/Top UP/Lanjut'), 5)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Halaman Akun/Saldo and E-Wallet/Saldo/Top UP/Pilih DOKU'), 5)

Mobile.setText(findTestObject('Object Repository/Halaman Akun/Saldo and E-Wallet/Saldo/Top UP/Doku ID'), GlobalVariable.doku_id, 5)

Mobile.setText(findTestObject('Object Repository/Halaman Akun/Saldo and E-Wallet/Saldo/Top UP/Password Doku'), GlobalVariable.doku_pass, 5)

Mobile.tap(findTestObject('Object Repository/Halaman Akun/Saldo and E-Wallet/Saldo/Top UP/PAY button'), 5)
