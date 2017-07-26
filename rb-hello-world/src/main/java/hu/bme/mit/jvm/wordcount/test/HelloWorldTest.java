package hu.bme.mit.jvm.wordcount.test;
import hu.bme.mit.jvm.BaseTest;
import hu.bme.mit.jvm.wordcount.HelloWorld;

public abstract class HelloWorldTest<THelloWorld extends HelloWorld> extends BaseTest<HelloWorld> {

	@Override
	protected String getExprectedResult() {
		return "Hello world";
	}


}
