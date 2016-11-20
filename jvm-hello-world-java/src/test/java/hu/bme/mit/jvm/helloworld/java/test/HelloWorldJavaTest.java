package hu.bme.mit.jvm.helloworld.java.test;

import hu.bme.mit.jvm.helloworld.java.HelloWorldJava;
import hu.bme.mit.jvm.helloworld.test.HelloWorldTest;

public class HelloWorldJavaTest extends HelloWorldTest<HelloWorldJava> {

	@Override
	protected HelloWorldJava createTestObject() {
		return new HelloWorldJava();
	}

}
