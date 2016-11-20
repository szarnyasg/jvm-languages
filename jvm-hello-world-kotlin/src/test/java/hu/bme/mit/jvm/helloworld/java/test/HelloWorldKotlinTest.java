package hu.bme.mit.jvm.helloworld.java.test;

import hu.bme.mit.jvm.TestObject;
import hu.bme.mit.jvm.helloworld.kotlin.HelloWorldKotlin;
import hu.bme.mit.jvm.helloworld.test.HelloWorldTest;

public class HelloWorldKotlinTest extends HelloWorldTest<TestObject> {

	@Override
	protected TestObject createTestObject() {
		return new HelloWorldKotlin();
	}

}
