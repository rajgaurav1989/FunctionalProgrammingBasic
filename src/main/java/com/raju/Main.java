package com.raju;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MyIntf<Integer, Integer> multiply = (value) -> value * 2;
		MyIntf<Integer, Integer> add      = (value) -> value  + 1 ;

		MyIntf<Integer, Integer> addThenMultiply = multiply.compose(add);

	//	MyIntf<Integer, Integer> myIdentity = add.identity();
		System.out.println(addThenMultiply.apply(5));
		
	}

}
