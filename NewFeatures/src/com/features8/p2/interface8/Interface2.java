package com.features8.p2.interface8;


/* An interface with exactly one abstract method becomes Functional Interface. */

@FunctionalInterface
public interface Interface2 {

	void method2();

	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}
	
	static void print(String str) {
		System.out.println("Printing " + str);
	}
}
