package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class MobileTest {

	@Test
	public void testStartCameraAppWhenCameraFunctionsNormally()
	{
		//Mocking
		Camera mockedCamera = Mockito.mock(Camera.class);
		
		//Stubbing - hard coding the response of dependent method
		Mockito.when(mockedCamera.on()).thenReturn(true);
		
		Mobile mobile =new Mobile();
		boolean actualStatus = mobile.startCameraApp();
		boolean expectedStatus = true;
		
		assertEquals(actualStatus,expectedStatus);
	}
}
