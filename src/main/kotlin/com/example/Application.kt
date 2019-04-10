package com.example

import kotlinx.coroutines.future.await
import kotlinx.coroutines.runBlocking


fun main() {
	runBlocking {
		val foo = Foo("foo")
		val value = foo.awaitFoo()
	}
}

suspend fun <T : Any> Foo<T>.awaitFoo(): T = foo().await()
