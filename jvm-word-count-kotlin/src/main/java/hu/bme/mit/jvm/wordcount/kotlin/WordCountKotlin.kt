package hu.bme.mit.jvm.wordcount.kotlin

import hu.bme.mit.jvm.wordcount.WordCount

class WordCountKotlin(input: String) : WordCount(input) {

	override fun getResult(): String {
		return Integer.toString(input.split(" ").size)
	}

}
