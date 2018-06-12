package com.burgaggle.exception;

public class FUException extends Exception{
	private static final long serialVersionUID = -9208497088537350996L;

	@Override
	public void printStackTrace() {
		System.out.println("Fuck You, you fucking piece of shit");
		super.printStackTrace();
	}
}
