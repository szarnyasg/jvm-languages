package hu.bme.mit.jvm.wordcount.xtend.test;

import hu.bme.mit.jvm.helloworld.xtend.HelloWorldXtend;
import hu.bme.mit.jvm.wordcount.test.HelloWorldTest;

public class HelloWorldXtendTest extends HelloWorldTest<HelloWorldXtend> {

	@Override
	protected HelloWorldXtend createTestObject() {
		return new HelloWorldXtend();
	}

}
