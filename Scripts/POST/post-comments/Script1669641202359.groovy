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

GlobalVariable.name = 'ulfa'

GlobalVariable.email = 'ulfa@mailsac.com'

GlobalVariable.body = 'testing1'

response = WS.sendRequest(findTestObject('POST/comments'))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'name', 'ulfa')

WS.verifyElementPropertyValue(response, 'email', 'ulfa@mailsac.com')

WS.verifyElementPropertyValue(response, 'body', 'testing1')

GlobalVariable.name = 'azizah'

GlobalVariable.email = 'azizah@mailsac.com'

GlobalVariable.body = 'testing2'

response1 = WS.sendRequest(findTestObject('POST/comments'))

WS.verifyResponseStatusCode(response1, 201)

WS.verifyElementPropertyValue(response1, 'name', 'azizah')

WS.verifyElementPropertyValue(response1, 'email', 'azizah@mailsac.com')

WS.verifyElementPropertyValue(response1, 'body', 'testing2')

