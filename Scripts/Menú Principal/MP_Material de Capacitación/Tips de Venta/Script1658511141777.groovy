import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://pru-gnp-portalideas.biaani.com/')

WebUI.setText(findTestObject('Object Repository/Tips de Ventas/input_nombreusuario'), usuario)

WebUI.setEncryptedText(findTestObject('Object Repository/Tips de Ventas/input_pass'), pass)

WebUI.click(findTestObject('Object Repository/Tips de Ventas/button_Iniciar sesin'))

WebUI.navigateToUrl('https://pru-gnp-portalideas.biaani.com/index.php/material-de-apoyo/tips-de-venta?rand=0.6195581960155545')

WebUI.verifyElementText(findTestObject('Nuevos Objetos/CalCursos'), 'Tips de Venta')

WebUI.closeBrowser()

