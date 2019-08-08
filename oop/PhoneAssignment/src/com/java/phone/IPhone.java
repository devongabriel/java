package com.java.phone;

public class IPhone extends Phone implements Ringable {
	
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "iPhone X says " + this.getRingTone();
    }
    @Override
    public String unlock() {
    	return "iPhone X from " + this.getCarrier(); 
    	
    	}
    @Override
    public void displayInfo() {
        System.out.println("unlocked using facial recognition");   
    }
}
