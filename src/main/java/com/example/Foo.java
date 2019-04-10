package com.example;

import java.util.concurrent.CompletableFuture;

public class Foo<T> {

	private T value;

	public Foo(T value) {
		this.value = value;
	}

	CompletableFuture<T> foo() {
		return CompletableFuture.completedFuture(value);
	}
}
