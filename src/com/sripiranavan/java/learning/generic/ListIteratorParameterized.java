package com.sripiranavan.java.learning.generic;

import java.util.Iterator;

public interface ListIteratorParameterized<T> extends Iterator<T> {
	boolean hasPrevious();

	T previous();

	void set(T e);

	@Override
	void remove();
}
