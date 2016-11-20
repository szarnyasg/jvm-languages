package hu.bme.mit.jvm.wordcount.xtend.test;

import hu.bme.mit.jvm.wordcount.test.WordCountTest;
import hu.bme.mit.jvm.wordcount.xtend.WordCountXtend;

public class WordCountXtendTest extends WordCountTest<WordCountXtend> {

	@Override
	protected WordCountXtend createTestObject() {
		return new WordCountXtend(getInput());
	}

}
