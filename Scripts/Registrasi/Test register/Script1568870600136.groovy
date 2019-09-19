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
Mobile.selectListItemByLabel(findTestObject('Object Repository/Halaman Registrasi/Registrasi - Jenis kelamin') , GlobalVariable.jenis_kelamin, 0)


