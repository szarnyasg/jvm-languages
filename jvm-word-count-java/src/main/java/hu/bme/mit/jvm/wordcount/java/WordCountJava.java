package hu.bme.mit.jvm.wordcount.java;

import hu.bme.mit.jvm.wordcount.WordCount;

public class WordCountJava extends WordCount {

	public WordCountJava(String input) {
		super(input);
	}

	@Override
	public String getResult() {
		return Integer.toString(input.split("\\W+").length);
	}

}
