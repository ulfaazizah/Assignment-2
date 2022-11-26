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

response = WS.sendRequest(findTestObject('GET/users'))

WS.verifyResponseStatusCode(response, 200)

WS.comment('data 1')

WS.verifyElementPropertyValue(response, '[3].id', '4')

WS.verifyElementPropertyValue(response, '[3].name', 'Patricia Lebsack')

WS.verifyElementPropertyValue(response, '[3].username', 'Karianne')

WS.verifyElementPropertyValue(response, '[3].email', 'Julianne.OConner@kory.org')

//WS.verifyElementPropertyValue(response, '[3].address', '')

WS.verifyElementPropertyValue(response, '[3].address.street', 'Hoeger Mall')

WS.verifyElementPropertyValue(response, '[3].address.suite', 'Apt. 692')

WS.verifyElementPropertyValue(response, '[3].address.city', 'South Elvis')

WS.verifyElementPropertyValue(response, '[3].address.zipcode', '53919-4257')

//WS.verifyElementPropertyValue(response, '[3].address.geo', '')

WS.verifyElementPropertyValue(response, '[3].address.geo.lat', '29.4572')

WS.verifyElementPropertyValue(response, '[3].address.geo.lng', '-164.2990')

WS.verifyElementPropertyValue(response, '[3].phone', '493-170-9623 x156')

WS.verifyElementPropertyValue(response, '[3].website', 'kale.biz')

//WS.verifyElementPropertyValue(response, '[3].company', '')

WS.verifyElementPropertyValue(response, '[3].company.name', 'Robel-Corkery')

WS.verifyElementPropertyValue(response, '[3].company.catchPhrase', 'Multi-tiered zero tolerance productivity')

WS.verifyElementPropertyValue(response, '[3].company.bs', 'transition cutting-edge web services')

WS.comment('data 2')

WS.verifyElementPropertyValue(response, '[4].id', '5')

WS.verifyElementPropertyValue(response, '[4].name', 'Chelsey Dietrich')

WS.verifyElementPropertyValue(response, '[4].username', 'Kamren')

WS.verifyElementPropertyValue(response, '[4].email', 'Lucio_Hettinger@annie.ca')

//WS.verifyElementPropertyValue(response, '[4].address', '')

WS.verifyElementPropertyValue(response, '[4].address.street', 'Skiles Walks')

WS.verifyElementPropertyValue(response, '[4].address.suite', 'Suite 351')

WS.verifyElementPropertyValue(response, '[4].address.city', 'Roscoeview')

WS.verifyElementPropertyValue(response, '[4].address.zipcode', '33263')

//WS.verifyElementPropertyValue(response, '[4].address.geo', '')

WS.verifyElementPropertyValue(response, '[4].address.geo.lat', '-31.8129')

WS.verifyElementPropertyValue(response, '[4].address.geo.lng', '62.5342')

WS.verifyElementPropertyValue(response, '[4].phone', '(254)954-1289')

WS.verifyElementPropertyValue(response, '[4].website', 'demarco.info')

//WS.verifyElementPropertyValue(response, '[4].company', '')

WS.verifyElementPropertyValue(response, '[4].company.name', 'Keebler LLC')

WS.verifyElementPropertyValue(response, '[4].company.catchPhrase', 'User-centric fault-tolerant solution')

WS.verifyElementPropertyValue(response, '[4].company.bs', 'revolutionize end-to-end systems')

