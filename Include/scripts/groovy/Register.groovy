import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.apache.commons.lang3.RandomStringUtils
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Input Data Register")
	def input_data_register() {
		String random1 = RandomStringUtils.randomAlphabetic(4)
		WebUI.openBrowser('https://stage.mobipaid.com/en/register')
		WebUI.setText(findTestObject('Object Repository/first_name'), 'Risnawati')
		WebUI.setText(findTestObject('Object Repository/last_name'), 'Risnawati')
		WebUI.setText(findTestObject('Object Repository/email'), 'testauto' + '_' + random1 + '@gmail.com')
		WebUI.setText(findTestObject('Object Repository/password'), 'Andromeda31_')
		WebUI.setText(findTestObject('Object Repository/company'), 'Test Auto')
		WebUI.click(findTestObject('Object Repository/number'))
		WebUI.sendKeys(findTestObject('Object Repository/number'), '85591234324')
		WebUI.sendKeys(findTestObject('Object Repository/country'), 'Indonesia')
		WebUI.setText(findTestObject('Object Repository/state'), 'Jakarta')
		WebUI.takeFullPageScreenshot()
		
	}

	@When("Finished Regis")
	def Finished_Regis() {
		WebUI.click(findTestObject('Object Repository/checkbox'))
		WebUI.click(findTestObject('Object Repository/submit'))
		WebUI.takeFullPageScreenshot()
		
	}

	@Then("Succes Register")
	def Succes_Register(){
	WebUI.takeFullPageScreenshot()
	
	}
}