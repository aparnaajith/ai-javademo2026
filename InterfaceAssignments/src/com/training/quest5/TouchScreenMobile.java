package com.training.quest5;

public class TouchScreenMobile extends BasicMobile implements ISmartPhone{

	@Override
	public void showApps() {
		System.out.println("Apps: WhatsApp, YouTube, Instagram");
		
	}

	@Override
	public void cameraTypes() {
		 System.out.println("Camera types: Selfie camera, Rear camera");
		
	}

}
