package hu.bme.mit.jvm.wordcount.java.test;

import hu.bme.mit.jvm.wordcount.kotlin.HelloWorldKotlin;
import hu.bme.mit.jvm.wordcount.test.HelloWorldTest;

public class HelloWorldKotlinTest extends HelloWorldTest<HelloWorldKotlin> {

	@Override
	protected HelloWorldKotlin createTestObject() {
		return new HelloWorldKotlin();
	}

}
