package com.features8.p2.interface8;

//from JournalDev
public class MyClass implements Interface1,Interface2{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}

	/* MyClass won't compile without having it's own log() implementation
	   you have to override log method from either of the interfaces to avoid problem */
	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.super.log(str);
	}

	

}
