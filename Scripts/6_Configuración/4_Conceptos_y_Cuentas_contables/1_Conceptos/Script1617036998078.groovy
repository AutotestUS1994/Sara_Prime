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

WebUI.callTestCase(findTestCase('1_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/Page_/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/Page_/a_Interfaz Contable'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/Page_/a_Interfaz Contable'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/Page_/a_Ver Configuracion Contable'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/Page_/a_Ver Configuracion Contable'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/span_Activo_ui-icon ui-icon-pencil'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/span_Activo_ui-icon ui-icon-pencil'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/input_ABONO CUENTA_form_cuentasContables'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/input_ABONO CUENTA_form_cuentasContables'), 
    '23451234568')

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/select_--Seleccione--EmpleadoFijoNit Entidad'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/select_--Seleccione--EmpleadoFijoNit Entidad'))

WebUI.selectOptionByIndex(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/select_--Seleccione--EmpleadoFijoNit Entidad'), 
    1)

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/span_Activo_ui-icon ui-icon-check ui-c'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/1_Nómina/span_Activo_ui-icon ui-icon-check ui-c'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/a_Seguridad Social'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/a_Seguridad Social'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/span_CEDULA CIUDADANIA_ui-icon ui-icon-pencil'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/span_CEDULA CIUDADANIA_ui-icon ui-icon-pencil'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/input_ARL CREDITO_form_cuentasContablestabs'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/input_ARL CREDITO_form_cuentasContablestabs'))

WebUI.setText(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/input_ARL CREDITO_form_cuentasContablestabs'), 
    '09876543123')

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/select_--Seleccione--EmpleadoFijoNit Entidad_1'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/select_--Seleccione--EmpleadoFijoNit Entidad_1'))

WebUI.selectOptionByIndex(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/select_--Seleccione--EmpleadoFijoNit Entidad_1'), 
    2)

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/select_--Seleccione--CEDULA CIUDADANIACEDULA'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/select_--Seleccione--CEDULA CIUDADANIACEDULA'))

WebUI.selectOptionByIndex(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/select_--Seleccione--CEDULA CIUDADANIACEDULA'), 
    2)

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/input_CEDULA CIUDADANIA_form_cuentasContablestabs'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/input_CEDULA CIUDADANIA_form_cuentasContablestabs'))

WebUI.setText(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/input_CEDULA CIUDADANIA_form_cuentasContablestabs'), 
    '333433455')

//WebUI.waitForElementClickable(findTestObject('Page_/Configuración_Contable1.1/PrimeFace/Page_/input_ARL Credito_form_cuentas_NV'), 
//    GlobalVariable.G_timeout)
//WebUI.click(findTestObject('Page_/Configuración_Contable1.1/PrimeFace/Page_/input_ARL Credito_form_cuentas_NV'))
WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/span_CEDULA CIUDADANIA_ui-icon ui-icon-check ui-c'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/2_Seguridad_social/span_CEDULA CIUDADANIA_ui-icon ui-icon-check ui-c'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/a_Provisiones'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/a_Provisiones'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/span_CEDULA CIUDADANIA_ui-icon ui-icon-pencil'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/span_CEDULA CIUDADANIA_ui-icon ui-icon-pencil'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/input_CESANTIAS CREDITO_form_cuentasContablestabs'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/input_CESANTIAS CREDITO_form_cuentasContablestabs'))

WebUI.setText(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/input_CESANTIAS CREDITO_form_cuentasContablestabs'), 
    '8765432345')

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/select_--Seleccione--EmpleadoFijoNit Entidad'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/select_--Seleccione--EmpleadoFijoNit Entidad'))

WebUI.selectOptionByIndex(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/select_--Seleccione--EmpleadoFijoNit Entidad'), 
    2)

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/select_--Seleccione--CEDULA CIUDADANIACEDULA'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/select_--Seleccione--CEDULA CIUDADANIACEDULA'))

WebUI.selectOptionByIndex(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/select_--Seleccione--CEDULA CIUDADANIACEDULA'), 
    2)

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/input_CEDULA CIUDADANIA_form_cuentasContablestabs'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/input_CEDULA CIUDADANIA_form_cuentasContablestabs'))

WebUI.setText(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/input_CEDULA CIUDADANIA_form_cuentasContablestabs'), 
    '999333444')

WebUI.waitForElementClickable(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/span_CEDULA CIUDADANIA_ui-icon ui-icon-check ui-c'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/4_Conceptos_y_Cuentas_contables/3_Provisiones/Page_/span_CEDULA CIUDADANIA_ui-icon ui-icon-check ui-c'))

WebUI.closeBrowser()

