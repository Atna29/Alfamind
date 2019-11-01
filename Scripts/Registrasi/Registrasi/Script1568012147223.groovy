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

'Halaman Login'
Mobile.takeScreenshot()

'Button Daftar Baru'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - DAFTAR BARU'), 5)

'Input nama depan'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Register - nama depan'), GlobalVariable.nama_depan, 5)

'Input nama belakang'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Register - nama belakang'), GlobalVariable.nama_belakang, 5)

'Pilih jenis kelamin'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - Jenis kelamin'), 5)

object_jeniskelamin = findTestObject('Halaman Registrasi/pilihan registrasi/Pilihan - jenis kelamin')

object_jeniskelamin.addProperty('text', ConditionType.EQUALS, GlobalVariable.jenis_kelamin)

Mobile.tap(object_jeniskelamin, 5)

'Pilih email'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Registrasi - email'), GlobalVariable.new_email_register, 5)

'Pilih tanggal lahir'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - tanggal lahir'), 5)

object_tanggal = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Tanggal lahir')

object_tanggal.addProperty('text', ConditionType.EQUALS, GlobalVariable.tanggal_lahir)

if (Mobile.verifyElementNotExist(object_tanggal, 5, FailureHandling.OPTIONAL)) {
    Mobile.scrollToText(GlobalVariable.tanggal_lahir)
}

Mobile.tap(object_tanggal, 5)

'Pilih bulan lahir'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - bulan lahir'), 5)

object_bulan = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Bulan lahir')

object_bulan.addProperty('text', ConditionType.EQUALS, GlobalVariable.bulan_lahir)

if (Mobile.verifyElementNotExist(object_bulan, 10, FailureHandling.OPTIONAL)) {
    Mobile.scrollToText(GlobalVariable.bulan_lahir)
}

Mobile.tap(object_bulan, 5)

'Pilih Tahun lahir'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - tahun lahir'), 5)

object_tahun = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Tahun lahir')

object_tahun.addProperty('text', ConditionType.EQUALS, GlobalVariable.tahun_lahir)

if (Mobile.verifyElementNotExist(object_tahun, 5, FailureHandling.OPTIONAL)) {
    Mobile.scrollToText(GlobalVariable.tahun_lahir)
}

Mobile.tap(object_tahun, 5)

'Input phone number'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Registrasi input phone number'), GlobalVariable.no_phone, 5)

'Tap button lanjut'
Mobile.tap( findTestObject('Object Repository/Halaman Registrasi/Button - LANJUT'), 5)

'Input KTP NO'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Regitrasi - nomor KTP'), GlobalVariable.no_ktp, 5)

'Upload KTP'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - Upload KTP'), 5)

upload_foto = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Tahun lahir')

upload_foto.addProperty('text', ConditionType.EQUALS, GlobalVariable.choose_upload_foto)

Mobile.tap(upload_foto, 5)

'Mengambil gambar'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Upload KTP/Button Kamera'), 5)

Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Upload KTP/android.widget.TextView2 - OK'), 5)

Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Upload KTP/CROP'), 5)

'Scrool to text'
Mobile.scrollToText('Kode Pos')

'Input Alamat'
Mobile.setText(findTestObject('Object Repository/Halaman Registrasi/Registrasi - alamat'), GlobalVariable.new_alamat, 5)

'Pilih provinsi'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - provinsi'), 5)

object_provinsi = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Provinsi')

object_provinsi.addProperty('text', ConditionType.EQUALS, GlobalVariable.provinsi)

if (Mobile.verifyElementNotExist(object_provinsi, 5, FailureHandling.OPTIONAL)) {
    Mobile.scrollToText(GlobalVariable.provinsi)
}

Mobile.tap(object_provinsi, 5)

'Pilih kabupaten'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - Kotakabupaten'), 5)

object_kabupaten = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - kabupaten')

object_kabupaten.addProperty('text', ConditionType.EQUALS, GlobalVariable.kabupaten)

if (Mobile.verifyElementNotExist(object_kabupaten, 5, FailureHandling.OPTIONAL)) {
	Mobile.scrollToText(GlobalVariable.kabupaten)
}

Mobile.tap(object_kabupaten, 5)

'Pilih kecamatan'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - kecamatan'), 5)

object_kecamatan = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - kecamatan')

object_kecamatan.addProperty('text', ConditionType.EQUALS, GlobalVariable.kecamatan)

if (Mobile.verifyElementNotExist(object_kecamatan, 5, FailureHandling.OPTIONAL)) {
	Mobile.scrollToText(GlobalVariable.kecamatan)
}

Mobile.tap(object_kecamatan, 5)

'Pilih kelurahan'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - kelurahan'), 5)

object_kelurahan = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - kelurahan')

object_kelurahan.addProperty('text', ConditionType.EQUALS, GlobalVariable.kelurahan)

if (Mobile.verifyElementNotExist(object_kelurahan, 5, FailureHandling.OPTIONAL)) {
	Mobile.scrollToText(GlobalVariable.kelurahan)
}

Mobile.tap(object_kelurahan, 5)

'Input Kode pos'
Mobile.setText( findTestObject('Object Repository/Halaman Registrasi/Registrasi - kode pos'), GlobalVariable.kode_pos, 5)

'Tap button lanjut'
Mobile.tap( findTestObject('Object Repository/Halaman Registrasi/Button - LANJUT'), 5)

'Ceklist Agreement'
Mobile.checkElement(findTestObject('Object Repository/Halaman Registrasi/Registrasi - CheckBox0'), 5)

'Daftar'
Mobile.tap(findTestObject('Object Repository/Halaman Registrasi/Registrasi - DAFTAR'), 5)

'Capture'
Mobile.takeScreenshot()