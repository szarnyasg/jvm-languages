package hu.bme.mit.jvm.wordcount.groovy

import hu.bme.mit.jvm.wordcount.WordCount

class WordCountGroovy extends WordCount {

    WordCountGroovy(String input) {
        super(input)
    }

	@Override
	public String getResult() {
		return input.split("\\W+").size();
	}

}
