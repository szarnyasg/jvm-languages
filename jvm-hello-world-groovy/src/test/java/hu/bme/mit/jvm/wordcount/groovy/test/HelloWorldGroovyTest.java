package hu.bme.mit.jvm.wordcount.groovy.test;

import hu.bme.mit.jvm.wordcount.groovy.HelloWorldGroovy;
import hu.bme.mit.jvm.wordcount.test.HelloWorldTest;

public class HelloWorldGroovyTest extends HelloWorldTest<HelloWorldGroovy> {

	@Override
	protected HelloWorldGroovy createTestObject() {
		return new HelloWorldGroovy();
	}

}
