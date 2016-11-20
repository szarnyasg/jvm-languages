package hu.bme.mit.jvm.helloworld.kotlin

import hu.bme.mit.jvm.TestObject

class HelloWorldKotlin : TestObject() {
	
	override fun getResult(): String {
		return "Hello world"
	}
	
}