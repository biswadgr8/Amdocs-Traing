Feature: Develop a Hello SOAP Web Service.

	Scenario: As a end user I should be able to invoke Hello SOAP API
		Given the hello soap api is up and running
		When I invoke the soap api at url "http://localhost:8080/hello?wsdl"
		Then I expect the response "Hello SOAP WebService!"