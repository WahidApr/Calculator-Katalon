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

Mobile.tap(findTestObject('Object Repository/6- Button_Squared Root'), 0)

Mobile.tap(findTestObject('2.2- Button_2'), 0)

Mobile.tap(findTestObject('1.1- Button_5'), 0)

Mobile.tap(findTestObject('3- Button_Multiplication'), 0)

Mobile.tap(findTestObject('2.1- Button_3'), 0)

Mobile.tap(findTestObject('1.7- Button_ Equals'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/6.1- Assertion_Squared Root'), 0)

Mobile.closeApplication()

