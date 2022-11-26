<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>users</name>
   <tag></tag>
   <elementGuidId>8b458475-1cef-414f-9112-39c8839f9083</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyResponseStatusCode(response,200)
WS.verifyElementPropertyValue(response, '[3].id', '4')
WS.verifyElementPropertyValue(response, '[3].name', 'Patricia Lebsack')
WS.verifyElementPropertyValue(response, '[3].username', 'Karianne')
WS.verifyElementPropertyValue(response, '[3].email', 'Julianne.OConner@kory.org')
WS.verifyElementPropertyValue(response, '[3].address', '')
WS.verifyElementPropertyValue(response, '[3].address.street', 'Hoeger Mall')
WS.verifyElementPropertyValue(response, '[3].address.suite', 'Apt. 692')
WS.verifyElementPropertyValue(response, '[3].address.city', 'South Elvis')
WS.verifyElementPropertyValue(response, '[3].address.zipcode', '53919-4257')
WS.verifyElementPropertyValue(response, '[3].address.geo', '')
WS.verifyElementPropertyValue(response, '[3].address.geo.lat', '29.4572')
WS.verifyElementPropertyValue(response, '[3].address.geo.lng', '-164.2990')
WS.verifyElementPropertyValue(response, '[3].phone', '493-170-9623 x156')
WS.verifyElementPropertyValue(response, '[3].website', 'kale.biz')
WS.verifyElementPropertyValue(response, '[3].company', '')
WS.verifyElementPropertyValue(response, '[3].company.name', 'Robel-Corkery')
WS.verifyElementPropertyValue(response, '[3].company.catchPhrase', 'Multi-tiered zero tolerance productivity')
WS.verifyElementPropertyValue(response, '[3].company.bs', 'transition cutting-edge web services')

WS.verifyElementPropertyValue(response, '[4].id', '5')
WS.verifyElementPropertyValue(response, '[4].name', 'Chelsey Dietrich')
WS.verifyElementPropertyValue(response, '[4].username', 'Kamren')
WS.verifyElementPropertyValue(response, '[4].email', 'Lucio_Hettinger@annie.ca')
WS.verifyElementPropertyValue(response, '[4].address', '')
WS.verifyElementPropertyValue(response, '[4].address.street', 'Skiles Walks')
WS.verifyElementPropertyValue(response, '[4].address.suite', 'Suite 351')
WS.verifyElementPropertyValue(response, '[4].address.city', 'Roscoeview')
WS.verifyElementPropertyValue(response, '[4].address.zipcode', '33263')
WS.verifyElementPropertyValue(response, '[4].address.geo', '')
WS.verifyElementPropertyValue(response, '[4].address.geo.lat', '-31.8129')
WS.verifyElementPropertyValue(response, '[4].address.geo.lng', '62.5342')
WS.verifyElementPropertyValue(response, '[4].phone', '(254)954-1289')
WS.verifyElementPropertyValue(response, '[4].website', 'demarco.info')
WS.verifyElementPropertyValue(response, '[4].company', '')
WS.verifyElementPropertyValue(response, '[4].company.name', 'Keebler LLC')
WS.verifyElementPropertyValue(response, '[4].company.catchPhrase', 'User-centric fault-tolerant solution')
WS.verifyElementPropertyValue(response, '[4].company.bs', 'revolutionize end-to-end systems')
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
