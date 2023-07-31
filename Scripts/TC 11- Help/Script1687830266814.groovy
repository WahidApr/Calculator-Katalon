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

Mobile.startApplication('D:\\2. Eduporto\\Automate\\CalculatorApp\\MobileApp\\Calculator_v8.1.apk', true)

Mobile.tap(findTestObject('8- Dot3_Button'), 0)

Mobile.tap(findTestObject('Object Repository/11- Button_Help'), 0)

Mobile.tap(findTestObject('Object Repository/11.1- Detailed Info_Use ur calculator app'), 0)

Mobile.scrollToText('If your result is a long number')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/11.2- Detailed Info_Change text display settings'), 0)

Mobile.scrollToText('Get more help')

Mobile.tap(findTestObject('Object Repository/11.3- Button_Back'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/11.4_Assertion_Help'), 0)

Mobile.closeApplication()
