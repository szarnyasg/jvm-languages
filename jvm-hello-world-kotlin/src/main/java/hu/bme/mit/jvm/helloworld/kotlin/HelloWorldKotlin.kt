package hu.bme.mit.jvm.helloworld.kotlin

import hu.bme.mit.jvm.helloworld.HelloWorld

class HelloWorldKotlin : HelloWorld() {
	
	override fun getResult(): String {
		return "Hello world"
	}
	
}