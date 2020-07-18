package com.raju;

import java.util.Objects;

@FunctionalInterface
public interface MyIntf<T, R> {

	R apply(T t);
	
	default <V> MyIntf<V, R> compose(MyIntf<V, T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }
	
	default  <V> MyIntf<T, V> andThen(MyIntf<R, V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }
	
	default <W> MyIntf<W,W> identity() {
        return t -> t;
    }
	
}
