package hu.bme.mit.jvm.wordcount.java.test;

import hu.bme.mit.jvm.wordcount.kotlin.WordCountKotlin;
import hu.bme.mit.jvm.wordcount.test.WordCountTest;

public class WordCountKotlinTest extends WordCountTest<WordCountKotlin> {

	@Override
	protected WordCountKotlin createTestObject() {
		return new WordCountKotlin(getInput());
	}

}
