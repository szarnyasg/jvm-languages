package hu.bme.mit.jvm.helloworld.java.test;

import hu.bme.mit.jvm.TestObject;
import hu.bme.mit.jvm.helloworld.java.HelloWorldJava;
import hu.bme.mit.jvm.helloworld.test.HelloWorldTest;

public class HelloWorldJavaTest extends HelloWorldTest<TestObject> {

	@Override
	protected TestObject createTestObject() {
		return new HelloWorldJava();
	}

}
