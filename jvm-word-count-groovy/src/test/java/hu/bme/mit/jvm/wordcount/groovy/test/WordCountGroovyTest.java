package hu.bme.mit.jvm.wordcount.groovy.test;

import hu.bme.mit.jvm.wordcount.groovy.WordCountGroovy;
import hu.bme.mit.jvm.wordcount.test.WordCountTest;

public class WordCountGroovyTest extends WordCountTest<WordCountGroovy> {

	@Override
	protected WordCountGroovy createTestObject() {
		return new WordCountGroovy(getInput());
	}

}
