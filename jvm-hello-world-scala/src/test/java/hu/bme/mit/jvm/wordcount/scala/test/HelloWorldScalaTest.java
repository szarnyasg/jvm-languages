package hu.bme.mit.jvm.wordcount.scala.test;

import hu.bme.mit.jvm.wordcount.scala.HelloWorldScala;
import hu.bme.mit.jvm.wordcount.test.HelloWorldTest;

public class HelloWorldScalaTest extends HelloWorldTest<HelloWorldScala> {

	@Override
	protected HelloWorldScala createTestObject() {
		return new HelloWorldScala();
	}

}
