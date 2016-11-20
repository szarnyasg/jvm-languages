package hu.bme.mit.jvm.helloworld.test;
import hu.bme.mit.jvm.BaseTest;
import hu.bme.mit.jvm.helloworld.HelloWorld;

public abstract class HelloWorldTest<THelloWorld extends HelloWorld> extends BaseTest<HelloWorld> {

	@Override
	protected String getExprectedResult() {
		return "Hello world";
	}


}
