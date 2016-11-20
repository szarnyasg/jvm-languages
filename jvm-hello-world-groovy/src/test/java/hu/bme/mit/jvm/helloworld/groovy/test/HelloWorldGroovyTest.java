package hu.bme.mit.jvm.helloworld.groovy.test;

import hu.bme.mit.jvm.helloworld.groovy.HelloWorldGroovy;
import hu.bme.mit.jvm.helloworld.test.HelloWorldTest;

public class HelloWorldGroovyTest extends HelloWorldTest<HelloWorldGroovy> {

	@Override
	protected HelloWorldGroovy createTestObject() {
		return new HelloWorldGroovy();
	}

}
