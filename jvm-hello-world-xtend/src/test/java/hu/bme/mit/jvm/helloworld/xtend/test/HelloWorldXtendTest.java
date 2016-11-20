package hu.bme.mit.jvm.helloworld.xtend.test;

import hu.bme.mit.jvm.helloworld.test.HelloWorldTest;
import hu.bme.mit.jvm.helloworld.xtend.HelloWorldXtend;

public class HelloWorldXtendTest extends HelloWorldTest<HelloWorldXtend> {

	@Override
	protected HelloWorldXtend createTestObject() {
		return new HelloWorldXtend();
	}

}
