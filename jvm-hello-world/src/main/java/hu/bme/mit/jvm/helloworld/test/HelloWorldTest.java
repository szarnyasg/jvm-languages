package hu.bme.mit.jvm.helloworld.test;
import hu.bme.mit.jvm.BaseTest;
import hu.bme.mit.jvm.TestObject;

public abstract class HelloWorldTest<TTestObject extends TestObject> extends BaseTest<TestObject> {

	@Override
	protected String getExprectedResult() {
		return "Hello world";
	}


}
