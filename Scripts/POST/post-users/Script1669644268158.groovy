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
GlobalVariable.username = 'ulfa azizah'
GlobalVariable.email = 'ulfa@mailsac.com'
GlobalVariable.street = 'sudirman'
GlobalVariable.suite = 'No. 556'
GlobalVariable.city = 'jakarta'
GlobalVariable.zipcode = '92998-3874'
GlobalVariable.lat = '-37.3159'
GlobalVariable.lng = '81.1496'
GlobalVariable.phone = '089636062256'
GlobalVariable.website = 'bri.co.id'
GlobalVariable.company = 'BRI'
GlobalVariable.catchPhrase = 'Multi-layered client-server neural-net'
GlobalVariable.bs = 'harness real-time e-markets'


response = WS.sendRequest(findTestObject('POST/users'))

WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'name', 'ulfa')
WS.verifyElementPropertyValue(response, 'username', 'ulfa azizah')
WS.verifyElementPropertyValue(response, 'email', 'ulfa@mailsac.com')
WS.verifyElementPropertyValue(response, 'street', 'sudirman')
WS.verifyElementPropertyValue(response, 'suite', 'No. 556')
WS.verifyElementPropertyValue(response, 'city', 'jakarta')
WS.verifyElementPropertyValue(response, 'lat', '-37.3159')
WS.verifyElementPropertyValue(response, 'lng', '81.1496')
WS.verifyElementPropertyValue(response, 'phone', '089636062256')
WS.verifyElementPropertyValue(response, 'website', 'bri.co.id')
WS.verifyElementPropertyValue(response, 'company', 'BRI')
WS.verifyElementPropertyValue(response, 'catchPhrase', 'Multi-layered client-server neural-net')
WS.verifyElementPropertyValue(response, 'bs', 'harness real-time e-markets')




GlobalVariable.name = 'azizah'
GlobalVariable.username = 'azizah ulfa'
GlobalVariable.email = 'azizah@mailsac.com'
GlobalVariable.street = 'sudirman'
GlobalVariable.suite = 'No. 555'
GlobalVariable.city = 'jakarta'
GlobalVariable.zipcode = '92998-3874'
GlobalVariable.lat = '-37.3159'
GlobalVariable.lng = '81.1496'
GlobalVariable.phone = '089636062257'
GlobalVariable.website = 'bri.co.id'
GlobalVariable.company = 'BRI'
GlobalVariable.catchPhrase = 'ulti-tiered zero tolerance productivity'
GlobalVariable.bs = 'transition cutting-edge web services'

response1 = WS.sendRequest(findTestObject('POST/users'))

WS.verifyResponseStatusCode(response1, 201)

WS.verifyElementPropertyValue(response1, 'name', 'azizah')
WS.verifyElementPropertyValue(response1, 'username', 'azizah ulfa')
WS.verifyElementPropertyValue(response1, 'email', 'azizah@mailsac.com')
WS.verifyElementPropertyValue(response1, 'street', 'sudirman')
WS.verifyElementPropertyValue(response1, 'suite', 'No. 555')
WS.verifyElementPropertyValue(response1, 'city', 'jakarta')
WS.verifyElementPropertyValue(response1, 'lat', '-37.3159')
WS.verifyElementPropertyValue(response1, 'lng', '81.1496')
WS.verifyElementPropertyValue(response1, 'phone', '089636062257')
WS.verifyElementPropertyValue(response1, 'website', 'bri.co.id')
WS.verifyElementPropertyValue(response1, 'company', 'BRI')
WS.verifyElementPropertyValue(response1, 'catchPhrase', 'ulti-tiered zero tolerance productivity')
WS.verifyElementPropertyValue(response1, 'bs', 'transition cutting-edge web services')

