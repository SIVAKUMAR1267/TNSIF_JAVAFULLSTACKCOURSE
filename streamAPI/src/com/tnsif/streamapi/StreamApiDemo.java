package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		
		List<Integer> evenSquare = numbers.stream()
				
		
		//Intermediate Operations
		
		.filter(n -> n % 2 == 0)
		.map(n -> n * n)
		
		//Terminal Operations
		
		.collect(Collectors.toList());
		
		System.out.println("Even Square: "+ evenSquare);
		
	}

}
