package hu.bme.mit.jvm.wordcount.scala

import hu.bme.mit.jvm.wordcount.WordCount

class WordCountScala(input2: String) extends WordCount(input2) {
  def getResult(): String = {
    input.split(" ").size.toString
  }
}
