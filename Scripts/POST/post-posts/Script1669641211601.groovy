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

//import groovy.json.JsonSlurper as JsonSlurper
//def slurper = new JsonSlurper()
//import groovy.json.JsonSlurper as JsonSlurper
//def slurper = new JsonSlurper()
//response = WS.sendRequest(findTestObject('POST/posts'))
//WS.verifyResponseStatusCode(response, 201)
//
//WS.verifyElementPropertyValue(response, 'title', 'azizah')
//WS.verifyElementPropertyValue(response, 'body', 'katalon')
//WS.verifyElementPropertyValue(response, 'userId', '1')
//WS.verifyElementPropertyValue(response, 'id', '101')
GlobalVariable.title = 'ulfa'

GlobalVariable.body = 'testing1'

response = WS.sendRequest(findTestObject('POST/posts'))

WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'title', 'ulfa')
WS.verifyElementPropertyValue(response, 'body', 'testing1')

GlobalVariable.title = 'azizah'

GlobalVariable.body = 'testing2'

response1 = WS.sendRequest(findTestObject('POST/posts'))

WS.verifyResponseStatusCode(response1, 201)
WS.verifyElementPropertyValue(response1, 'title', 'azizah')
WS.verifyElementPropertyValue(response1, 'body', 'testing2')

