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
import com.kms.katalon.core.appium.driver.SwipeableAndroidDriver as SwipeableAndroidDriver
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Mobile.startApplication(GlobalVariable.ApkFile, false)

Mobile.delay(3)

punya_toko = Mobile.getText(findTestObject('Object Repository/Landing Page/android.widget.TextView0 - Punya Toko Sendiri Dengan Modal Minim'), 
    10, FailureHandling.OPTIONAL)

Landing_page = Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Landing Page/android.widget.TextView0 - Punya Toko Sendiri Dengan Modal Minim'), 
    'text', punya_toko, 10, FailureHandling.OPTIONAL)

if (Landing_page == true) {
    'Landing Page/Home Page'
    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Landing Page/next 1'), 10)

    Mobile.tap(findTestObject('Landing Page/next 2'), 10)

    Mobile.tap(findTestObject('Object Repository/Landing Page/android.widget.Button0 - MULAI'), 10)
}

'Home Page'
Mobile.takeScreenshot()

Mobile.waitForElementAttributeValue(findTestObject('Menu Bawah/Menu - Akun'), 'text', 'Akun', 10)

Mobile.tap(findTestObject('Menu Bawah/Menu - Akun'), 10)

'Halaman Login'
Mobile.takeScreenshot()

'Button Daftar Baru'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - DAFTAR BARU'), 10)

'Input nama depan'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Register - nama depan'), 'Testing', 10)

'Input nama belakang'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Register - nama belakang'), 'Testing', 10)

'Pilih jenis kelamin'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - Jenis kelamin'), 10)

object_jeniskelamin = findTestObject('Halaman Registrasi/pilihan registrasi/Pilihan - jenis kelamin')

object_jeniskelamin.addProperty('text', ConditionType.EQUALS, GlobalVariable.jenis_kelamin)

Mobile.tap(object_jeniskelamin, 10)

'Pilih email'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Registrasi - email'), 'semangat45@gmail.com', 10)

'Pilih tanggal lahir'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - tanggal lahir'), 10)

object_tanggal = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Tanggal lahir')

object_tanggal.addProperty('text', ConditionType.EQUALS, GlobalVariable.tanggal_lahir)

if (Mobile.verifyElementNotExist(object_tanggal, 10, FailureHandling.OPTIONAL)) {
    Mobile.scrollToText(GlobalVariable.tanggal_lahir)
}

Mobile.tap(object_tanggal, 10)

'Pilih bulan lahir'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - bulan lahir'), 10)

object_bulan = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Bulan lahir')

object_bulan.addProperty('text', ConditionType.EQUALS, GlobalVariable.bulan_lahir)

if (Mobile.verifyElementNotExist(object_bulan, 10, FailureHandling.OPTIONAL)) {
    Mobile.scrollToText(GlobalVariable.bulan_lahir)
}

Mobile.tap(object_bulan, 10)

'Pilih Tahun lahir'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - tahun lahir'), 10)

object_tahun = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Tahun lahir')

object_tahun.addProperty('text', ConditionType.EQUALS, GlobalVariable.tahun_lahir)

if (Mobile.verifyElementNotExist(object_tahun, 10, FailureHandling.OPTIONAL)) {
    Mobile.scrollToText(GlobalVariable.tahun_lahir)
}

Mobile.tap(object_tahun, 10)

'Input phone number'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Registrasi input phone number'), '080809090980', 10)

Mobile.tap( findTestObject('Object Repository/Halaman Registrasi/Button - LANJUT'), 10)

'Input KTP NO'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Regitrasi - nomor KTP'), '1234567890123456', 10)

'Upload KTP'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - Upload KTP'), 10)

upload_foto = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Tahun lahir')

upload_foto.addProperty('text', ConditionType.EQUALS, GlobalVariable.choose_upload_foto)

Mobile.tap(upload_foto, 10)


