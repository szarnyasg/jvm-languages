package hu.bme.mit.jvm.wordcount.java.test;

import hu.bme.mit.jvm.wordcount.java.HelloWorldJava;
import hu.bme.mit.jvm.wordcount.test.HelloWorldTest;

public class HelloWorldJavaTest extends HelloWorldTest<HelloWorldJava> {

	@Override
	protected HelloWorldJava createTestObject() {
		return new HelloWorldJava();
	}

}
