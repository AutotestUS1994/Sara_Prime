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

WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_Configuracin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('1.1_General_Objects/a_Configuracin'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/6_Nuevo_concepto/a_Conceptos y Cuentas Contables'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/6_Nuevo_concepto/a_Conceptos y Cuentas Contables'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/6_Nuevo_concepto/a_Nuevo Concepto'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/6_Nuevo_concepto/a_Nuevo Concepto'))

WebUI.selectOptionByIndex(findTestObject('6_Configuración/6_Nuevo_concepto/select_-- Seleccione --DEVENGODEDUCCIN'), '2')

WebUI.selectOptionByIndex(findTestObject('6_Configuración/6_Nuevo_concepto/select_-- Seleccione --AUXILIO NO SALARIAL'), 
    '2')

WebUI.setText(findTestObject('6_Configuración/6_Nuevo_concepto/input_Nombre_popupNuevoConceptonombreConcepto'), 'DEVENGO PRIMER SEMESTRE')

WebUI.selectOptionByIndex(findTestObject('6_Configuración/6_Nuevo_concepto/select_NOSI'), 1)

WebUI.waitForElementClickable(findTestObject('6_Configuración/6_Nuevo_concepto/a_Agregar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/6_Nuevo_concepto/a_Agregar'))

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Aceptar'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/6_Nuevo_concepto/a_icon_trash can'), 0)

WebUI.click(findTestObject('6_Configuración/6_Nuevo_concepto/a_icon_trash can'))

String Result = WebUI.getText(findTestObject('Result/p_Resultado'))

if (Result == 'Se elimino correctamente el registro') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

