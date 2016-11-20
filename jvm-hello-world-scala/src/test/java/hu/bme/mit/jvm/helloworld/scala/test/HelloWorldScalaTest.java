package hu.bme.mit.jvm.helloworld.scala.test;

import hu.bme.mit.jvm.helloworld.scala.HelloWorldScala;
import hu.bme.mit.jvm.helloworld.test.HelloWorldTest;

public class HelloWorldScalaTest extends HelloWorldTest<HelloWorldScala> {

	@Override
	protected HelloWorldScala createTestObject() {
		return new HelloWorldScala();
	}

}
