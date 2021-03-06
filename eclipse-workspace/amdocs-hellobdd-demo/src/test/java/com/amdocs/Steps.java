package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class Steps {

	private Hello hello;
	private String actualResponse;

@Given("there is a hello object")
public void there_is_a_hello_object() {
    hello=new Hello();
}

@When("I invoke the sayHello method")
public void i_invoke_the_sayHello_method() {
	actualResponse = hello.sayHello();
}

@Then("I expect {string} as the response")
public void i_expect_as_the_response(String expectedResponse) {
	assertEquals (expectedResponse , actualResponse);
}


}
