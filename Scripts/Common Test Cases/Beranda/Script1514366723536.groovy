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
import org.openqa.selenium.support.ui.Select

WebUI.openBrowser('')

WebUI.navigateToUrl('mobiledev.komuto.com/signin')

WebUI.setText(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/input_email'), 'emile@skyshi.io')

WebUI.setText(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/input_password'), 'katakmati')

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/button_Masuk'))

WebUI.waitForPageLoad(30)

//Step 7
WebUI.click(findTestObject())

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/div_slick-slide slick-active'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Es Teh/span_icon-wishlist solid'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Es Teh/span_icon-wishlist false'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Es Teh/a_Favoritkan'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Es Teh/a_Favorit'))

WebUI.rightClick(findTestObject('Page_Login/Saldo/Page_Es Teh/span_icon-close white'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Es Teh/span_icon-arrow-down'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Es Teh/a_Beli Sekarang'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/span_Isi Informasi Data Pengir'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/p_Jalan Tampomas Raya No. 9  T'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/span_Pilih Kurir Pengiriman'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/label_JNE'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/span_Pilih Paket Pengiriman'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/span_Service tidak ditemukan'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/html'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/div_sort-option expeditionPack'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/span_Kurir Pengiriman'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/label_TIKI'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/span_Kurir Pengiriman'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/label_POS'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/span_Pilih Paket Pengiriman'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/label_radio false'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/span_Asuransi'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/label_Tidak'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/a_Masukan Ke Keranjang'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/button_Lihat Keranjang Belanja'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/button_Bayar Sekarang'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/div_Metode Pembayaran Lainnya'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/div_text-button-main'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/div_Kartu Kredit'))

WebUI.setText(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/input_cardnumber'), '5211 1111 1111 1117')

WebUI.setText(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/input'), '01 / 20')

WebUI.setText(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/input_1'), '123')

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/a_button-main-content'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/a_button-main-content'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/a_Lihat daftar transaksi'))

WebUI.click(findTestObject('Page_Login/Saldo/Page_Pasar Grobogan/a_Beranda'))

WebUI.closeBrowser()

