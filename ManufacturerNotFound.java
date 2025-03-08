package com.stockInfo.exception;

public class ManufacturerNotFound extends RuntimeException{
	
	public ManufacturerNotFound() {}
	
	public ManufacturerNotFound(String msg) {
		super(msg);
	}
}
