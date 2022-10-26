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

WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_Colaboradores'), 0)

WebUI.click(findTestObject('1.1_General_Objects/a_Colaboradores'))

String Estado = WebUI.getText(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Ver Activos'), FailureHandling.STOP_ON_FAILURE)

if (Estado == 'Ver Retirados') {
    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Ver Activos'), 
        1)

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Ver Activos'))
}

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_RETIRADO_us-icon-descargar-colaborador'), 
    0)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_RETIRADO_us-icon-descargar-colaborador'))

if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/span_Total Devengos'), 
    1)) {
    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/span_Total Devengos'))

    WebUI.delay(3)

    WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Colaboradores'), 
        0)

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Colaboradores'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/span_Activos'), 0)
} else if (WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Regresar'))) {
    WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_RETIRADO_us-icon-descargar-colaborador - Copy'), 
        1)

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_RETIRADO_us-icon-descargar-colaborador - Copy'), 
        0)

    if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/span_Total Devengos'), 
        1)) {
        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/span_Total Devengos'))

        WebUI.delay(3)

        WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Colaboradores'), 
            0)

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Colaboradores'))

        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/span_Activos'), 
            0)
    } else {
        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Regresar'))

        WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_RETIRADO_us-icon-descargar-colaborador - Copy - Copy'), 
            0)

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_RETIRADO_us-icon-descargar-colaborador - Copy - Copy'), 
            0)

        if (Estado == 'Ver Activos') {
            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Ver Activos'), 
                GlobalVariable.G_timeout)

            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/3_Ver_retirados/a_Ver Activos'))
        }
    }
}

WebUI.closeBrowser()

