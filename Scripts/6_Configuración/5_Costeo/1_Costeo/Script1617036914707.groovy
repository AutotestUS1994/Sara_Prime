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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('1.1_General_Objects/a_Configuracin'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/5_Costeo/Page_/a_Costeo'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/5_Costeo/Page_/a_Costeo'))

WebUI.setText(findTestObject('6_Configuración/5_Costeo/Page_/input_Filtro_form_configuracionCosteoj_idt700'), '199')

WebUI.sendKeys(findTestObject('6_Configuración/5_Costeo/Page_/input_Filtro_form_configuracionCosteoj_idt700'), Keys.chord(
        Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('6_Configuración/5_Costeo/Page_/td_68'), 1)) {
    WebUI.click(findTestObject('6_Configuración/5_Costeo/Page_/span_Activo_glyphicons glyphicons-remove-sign1'))

    if(WebUI.waitForElementVisible(findTestObject('6_Configuración/5_Costeo/Page_/a_Aceptar - Copy'),1)){
    WebUI.click(findTestObject('6_Configuración/5_Costeo/Page_/a_Aceptar - Copy'))
    }
}

//if (WebUI.waitForElementClickable(findTestObject('Page_/Configuración.Costeo1.1/PrimeFace/Page_/a_Aceptar_Elimi'), GlobalVariable.G_timeout)) {
//    WebUI.click(findTestObject('Page_/Configuración.Costeo1.1/PrimeFace/Page_/a_Aceptar_Elimi'))
//}
WebUI.setText(findTestObject('6_Configuración/5_Costeo/Page_/input_Cdigo _form_configuracionCosteocodigoLineaCosto'), '199')

WebUI.setText(findTestObject('6_Configuración/5_Costeo/Page_/input_Descripcin _form_configuracionCosteodescripcionLineaCosto'), 
    'MarketingKatalon')

WebUI.click(findTestObject('6_Configuración/5_Costeo/Page_/a_Descripcin _form_configuracionCosteoj_idt777'))

WebUI.click(findTestObject('6_Configuración/5_Costeo/Page_/a_Aceptar'))

WebUI.click(findTestObject('6_Configuración/5_Costeo/Page_/a_Costeo'))

WebUI.setText(findTestObject('6_Configuración/5_Costeo/Page_/input_Filtro_form_configuracionCosteoj_idt700'), '199')

WebUI.sendKeys(findTestObject('6_Configuración/5_Costeo/Page_/input_Filtro_form_configuracionCosteoj_idt700'), Keys.chord(
        Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('6_Configuración/5_Costeo/Page_/td_68'), 1)) {
    WebUI.click(findTestObject('6_Configuración/5_Costeo/Page_/span_Activo_glyphicons glyphicons-remove-sign1'))
	if(WebUI.waitForElementVisible(findTestObject('6_Configuración/5_Costeo/Page_/a_Aceptar - Copy'),1)){
    WebUI.click(findTestObject('6_Configuración/5_Costeo/Page_/a_Aceptar - Copy'))}
}

WebUI.waitForElementVisible(findTestObject('Result/p_Resultado'), 0)

String Result = WebUI.getText(findTestObject('Result/p_Resultado'))
if(Result == 'Se elimino correctamente el registro') {
	String Resultado = 'PRUEBA OK'
	WebUI.closeBrowser()
	}
	else {WebUI.acceptAlert()}

