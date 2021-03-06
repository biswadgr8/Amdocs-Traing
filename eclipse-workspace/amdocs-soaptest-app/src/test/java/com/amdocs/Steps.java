package com.amdocs;

import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {
	
	private Hello hello;
	private HelloService helloService;
	private String actualResponse;

	@Given("the hello soap api is up and running")
	public void createHelloSOAPObject()
	{
		helloService = new HelloService();
		hello = helloService.getHello();
		//System.out.println("Step 1");
	}
	
	@When("I invoke the soap api at url {string}")
	public void invokeHelloSOAPAPI(String wsdlURL)
	{
		actualResponse = hello.sayHello();
		//System.out.println("Step 2");
	}
	
	@Then("I expect the response {string}")
	public void testResponse(String expectedResponse)
	{
		assertEquals(actualResponse,expectedResponse);
		//System.out.println("Step 3");
	}
}
