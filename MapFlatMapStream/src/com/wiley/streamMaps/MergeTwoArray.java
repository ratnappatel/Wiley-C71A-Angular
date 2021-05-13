package com.wiley.streamMaps;

import java.util.Arrays;
import java.util.stream.Stream;

// merge two array
// given two 
public class MergeTwoArray {

	public static Integer []  join(Integer [] i1,Integer[] i2)
	{
		Stream<Integer> stream=Stream.of(i1,i2).flatMap(Arrays::stream); //intermediate operation result into stream object terminator operation
		Integer [] arr=stream.toArray(Integer[]::new);
		
		return arr;
	}
	public static void main(String[] args) {
		
		Integer a[]= {23,56,23,56,89,9};
		Integer b[]= {24,64,74,87,11};
		Integer arr[]=MergeTwoArray.join(a, b);
		System.out.println(Arrays.toString(arr));
		
	}

}
