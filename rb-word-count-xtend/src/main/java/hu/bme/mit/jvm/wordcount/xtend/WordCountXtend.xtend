package hu.bme.mit.jvm.wordcount.xtend

import hu.bme.mit.jvm.wordcount.WordCount

class WordCountXtend extends WordCount {

    new(String input) {
        super(input)
    }

	override getResult() {
		'''«input.split(" ").size()»'''
	}

}
