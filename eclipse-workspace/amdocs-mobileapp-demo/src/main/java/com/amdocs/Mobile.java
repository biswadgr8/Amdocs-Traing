package com.amdocs;

public class Mobile {

	private Camera camera;
	
	public Mobile()
	{
		this.camera = new Camera();
	}
	
	//Construction Dependency Injection
	public Mobile(Camera camera)
	{
		this.camera = camera;
	}
	
	public boolean startCameraApp()
	{
		System.out.println("Mobile startCameraApp method");
		
		if(camera.on())
		{
			System.out.println("Mobile startCameraApp positive code path");
			return true;
		}
		System.out.println("Mobile startCameraApp negative code path");
		
		return false;
	}
}
