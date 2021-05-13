package com.wiley.streamMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeNList {
	
	public static List<String> join(List<String>...lists)
	{
		List<String> mergedList=Stream.of(lists).flatMap(List<String>::stream).collect(Collectors.toList());
		
		return mergedList;
	}

	public static void main(String[] args) {

		// merge n-given list 
		
		List<String> a=Arrays.asList("F","B");
		List<String> b=Arrays.asList("r","w");
		List<String> c=Arrays.asList("k","a");
		List<String> d=Arrays.asList("q","m");
		
		List<String> res=MergeNList.join(a,b,c,d);
		System.out.println(res);
		
	}

}
