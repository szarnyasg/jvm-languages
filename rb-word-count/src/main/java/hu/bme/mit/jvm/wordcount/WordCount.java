package hu.bme.mit.jvm.wordcount;

import hu.bme.mit.jvm.TestObject;

public abstract class WordCount extends TestObject {

	protected final String input;

	public WordCount(final String input) {
		this.input = input;
	}

}
