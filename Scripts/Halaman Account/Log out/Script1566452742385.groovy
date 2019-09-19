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

Mobile.waitForElementAttributeValue(findTestObject('Menu Bawah/Menu - Akun'), 'text', 'Akun', 10)

Mobile.tap(findTestObject('Menu Bawah/Menu - Akun'), 10)

Mobile.waitForElementAttributeValue(findTestObject('Halaman Akun/Log out Button'), 'text', 'Logout', 10)

Mobile.tap(findTestObject('Object Repository/Halaman Akun/Log out Button'), 10)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/LOGIN/android.widget.EditText0 - Username or email address'), 'text', 'Username or email address', 10)

Mobile.closeApplication()

