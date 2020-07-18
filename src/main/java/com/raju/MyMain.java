package com.raju;

import java.util.function.Function;

public class MyMain {

	public static void main(String[] args) {
		final int y = 0 ;
		
		Function<Integer,Integer> myFunction = (x) -> {
			
			return x + y;
		} ;
		
	}
	
	static int doWork(int a,CallBackIntf callBackIntf) {
		return callBackIntf.myFunct(a);
	}

}
