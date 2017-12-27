import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('mobiledev.komuto.com/signup')

WebUI.setText(findTestObject('Page_SignUp/Page_Pasar Grobogan/input_nama'), 'emile27')

WebUI.setText(findTestObject('Page_SignUp/Page_Pasar Grobogan/input_handphone'), '081393121317')

WebUI.setText(findTestObject('Page_SignUp/Page_Pasar Grobogan/input_email'), '20171227i@mailinator.com')

WebUI.setText(findTestObject('Page_SignUp/Page_Pasar Grobogan/input_password'), 'katakmati')

WebUI.setText(findTestObject('Page_SignUp/Page_Pasar Grobogan/input_passwordRetype'), 'katakmati')

WebUI.click(findTestObject('Page_SignUp/Page_Pasar Grobogan/label_Pria'))

WebUI.click(findTestObject('Page_SignUp/Page_Pasar Grobogan/button_Daftar'))

WebUI.delay(10)

LandingPage = WebUI.verifyElementPresent(findTestObject('Page_SignUp/Page_Pasar Grobogan/strong_Verifikasikan email unt'), 
    GlobalVariable.G_Timeout, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

