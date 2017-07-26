package hu.bme.mit.jvm.wordcount.scala.test;

import hu.bme.mit.jvm.wordcount.scala.WordCountScala;
import hu.bme.mit.jvm.wordcount.test.WordCountTest;

public class WordCountScalaTest extends WordCountTest<WordCountScala> {

	@Override
	protected WordCountScala createTestObject() {
		return new WordCountScala(getInput());
	}

}
