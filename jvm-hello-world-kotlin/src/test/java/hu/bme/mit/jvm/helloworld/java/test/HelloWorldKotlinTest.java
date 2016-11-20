package hu.bme.mit.jvm.helloworld.java.test;

import hu.bme.mit.jvm.helloworld.kotlin.HelloWorldKotlin;
import hu.bme.mit.jvm.helloworld.test.HelloWorldTest;

public class HelloWorldKotlinTest extends HelloWorldTest<HelloWorldKotlin> {

	@Override
	protected HelloWorldKotlin createTestObject() {
		return new HelloWorldKotlin();
	}

}
