package hu.bme.mit.jvm.wordcount.java.test;

import hu.bme.mit.jvm.wordcount.java.WordCountJava;
import hu.bme.mit.jvm.wordcount.test.WordCountTest;

public class WordCountJavaTest extends WordCountTest<WordCountJava> {

	@Override
	protected WordCountJava createTestObject() {
		return new WordCountJava(getInput());
	}

}
