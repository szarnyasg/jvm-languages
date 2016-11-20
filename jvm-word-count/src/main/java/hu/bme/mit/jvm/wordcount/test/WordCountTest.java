package hu.bme.mit.jvm.wordcount.test;
import hu.bme.mit.jvm.BaseTest;
import hu.bme.mit.jvm.wordcount.WordCount;

public abstract class WordCountTest<TWordCount extends WordCount> extends BaseTest<WordCount> {

	@Override
	protected String getExprectedResult() {
		return "3";
	}

	protected String getInput() { return "Count my words"; }

}
