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

'Pilih provinsi'
Mobile.tap(findTestObject('Object Repository/Halaman Akun/Pengaturan/Tambah_alamat/provinsi'), 5)

object_provinsi = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - Provinsi')

object_provinsi.addProperty('text', ConditionType.EQUALS, GlobalVariable.provinsi)

if (Mobile.verifyElementNotExist(object_provinsi, 5, FailureHandling.OPTIONAL)) {
	Mobile.scrollToText(GlobalVariable.provinsi)
}

Mobile.tap(object_provinsi, 5)

'Pilih kabupaten'
Mobile.tap(findTestObject('Object Repository/Halaman Akun/Pengaturan/Tambah_alamat/Kabupatenkota'), 5)

object_kabupaten = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - kabupaten')

object_kabupaten.addProperty('text', ConditionType.EQUALS, GlobalVariable.kabupaten)

if (Mobile.verifyElementNotExist(object_kabupaten, 5, FailureHandling.OPTIONAL)) {
	Mobile.scrollToText(GlobalVariable.kabupaten)
}

Mobile.tap(object_kabupaten, 5)

'Pilih kecamatan'
Mobile.tap(findTestObject('Object Repository/Halaman Akun/Pengaturan/Tambah_alamat/Kecamatan'), 5)

object_kecamatan = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - kecamatan')

object_kecamatan.addProperty('text', ConditionType.EQUALS, GlobalVariable.kecamatan)

if (Mobile.verifyElementNotExist(object_kecamatan, 5, FailureHandling.OPTIONAL)) {
	Mobile.scrollToText(GlobalVariable.kecamatan)
}

Mobile.tap(object_kecamatan, 5)

'Pilih kelurahan'
Mobile.tap(findTestObject('Object Repository/Halaman Akun/Pengaturan/Tambah_alamat/Kelurahan'), 5)

object_kelurahan = findTestObject('Object Repository/Halaman Registrasi/pilihan registrasi/Pilihan - kelurahan')

object_kelurahan.addProperty('text', ConditionType.EQUALS, GlobalVariable.kelurahan)

if (Mobile.verifyElementNotExist(object_kelurahan, 5, FailureHandling.OPTIONAL)) {
	Mobile.scrollToText(GlobalVariable.kelurahan)
}

Mobile.tap(object_kelurahan, 5)

'Input Kode pos'
Mobile.setText(findTestObject('Object Repository/Halaman Akun/Pengaturan/Tambah_alamat/Kode POS'), GlobalVariable.kode_pos, 5)
