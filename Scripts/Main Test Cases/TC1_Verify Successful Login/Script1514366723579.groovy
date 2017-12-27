import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

WebUI.comment('Story: Login to KOmuto Web')

WebUI.comment('Given that the user has the valid login information')

WebUI.openBrowser('')

WebUI.navigateToUrl('mobiledev.komuto.com/signin')

WebUI.delay(10)

WebUI.setText(findTestObject('Page_Login/Page_Pasar Grobogan/Page_Pasar Grobogan (2)/input_email'), 'emile@skyshi.io')

WebUI.setText(findTestObject('Page_Login/Page_Pasar Grobogan/Page_Pasar Grobogan (2)/input_password'), 'katakmati')

WebUI.comment('When he logins to Komuto')

WebUI.click(findTestObject('Page_Login/Page_Pasar Grobogan/Page_Pasar Grobogan (2)/button_Masuk'))

WebUI.comment('Then he should be able to login successfully')

landingPage = WebUI.verifyElementPresent(findTestObject('Page_Login/Page_Pasar Grobogan/Page_Pasar Grobogan (1)/a_Profil'), 
    GlobalVariable.G_Timeout)

WebUI.closeBrowser()

