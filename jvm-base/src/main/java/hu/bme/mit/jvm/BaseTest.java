package hu.bme.mit.jvm;

import org.junit.Assert;
import org.junit.Test;

public abstract class BaseTest<TTestObject extends TestObject> {

	protected abstract TTestObject createTestObject();
	protected abstract String getExprectedResult();

	@Test
	public void test() {
		TTestObject testObject = createTestObject();
		Assert.assertEquals(getExprectedResult(), testObject.getResult());
	}

}
