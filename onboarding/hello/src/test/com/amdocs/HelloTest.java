package com.amdocs;

import com.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

        public class HelloTest {
		@Test
		public void testSayHello()
		{
			Hello hello = new Hello();
			String expectedResponse = "Hello Maven!";
			String actualResponse = hello.sayHello();
			assertEquals(expectedResponse,actualResponse);
		}

}
