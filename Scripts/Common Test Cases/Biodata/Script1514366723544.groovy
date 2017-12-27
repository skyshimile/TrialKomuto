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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('mobiledev.komuto.com/signin')

WebUI.setText(findTestObject('Page_Login/Page_Pasar Grobogan/Page_Pasar Grobogan/input_email'), 'emile@skyshi.io')

WebUI.setText(findTestObject('Page_Login/Page_Pasar Grobogan/Page_Pasar Grobogan (2)/input_password'), 'katakmati')

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan/button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan/button_Masuk'))

WebUI.openBrowser('')

WebUI.setText(findTestObject('BIODATA/Page_Pasar Grobogan (2)/input_email'), 'emile@skyshi.io')

WebUI.setText(findTestObject('BIODATA/Page_Pasar Grobogan (2)/input_password'), 'katakmati')

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan (2)/button_Masuk'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan (2)/p_Kelola Akun'))

WebUI.rightClick(findTestObject('BIODATA/Page_Pasar Grobogan (2)/p'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan (2)/li bio'))

WebUI.closeBrowser()

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan (1)/kelola akun'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan (1)/strong_emileskyshi.io'))

WebUI.click(findTestObject('Object Repository/BIODATA/Page_Pasar Grobogan (1)/kelola akun'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan/Biodata'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan/label_Pria'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan/li_Kabupaten Aceh Jaya'))

WebUI.selectAllOption(findTestObject('BIODATA/Page_Pasar Grobogan/li_Kabupaten Aceh Barat Daya'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan/span_01-03-1989'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan/a_Ganti Foto Profil'))

WebUI.click(findTestObject('BIODATA/Page_Pasar Grobogan/a_Simpan Perubahan'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.closeBrowser()

