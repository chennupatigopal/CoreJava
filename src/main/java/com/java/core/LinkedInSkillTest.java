package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Question5:
class Car {
	public void accelerate() {

	}
}

class Lambo extends Car {
	public void accelerate(int speedLimit) {
	}

	public void accelerate() {
	}
}

public class LinkedInSkillTest {

	String berry = "blue";

	public static void main(String[] args) {
		// Question1:
		String[] array = new String[] { "a", "b", "c" };
		List<String> list1 = Arrays.asList(array);
		List<String> list2 = new ArrayList<>(Arrays.asList(array));
		List<String> list3 = new ArrayList<>(Arrays.asList("a", new String("b"), "c"));
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));

		// Question2:
		Map<String, Integer> forestSpecies = new HashMap<>();
		forestSpecies.put("Amazon", 30000);
		forestSpecies.put("Congo", 10000);
		forestSpecies.put("Daintree", 15000);
		forestSpecies.put("Amazon", 40000);
		System.out.println(forestSpecies.size());

		// Question3:
		LinkedInSkillTest lis = new LinkedInSkillTest();
		lis.juicy("straw");

		// Question4:
		List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
		/*
		 * for(String str:list) { if(str.equals("a")) { list.remove(str); } }
		 */
		System.out.println(list);

		// Question6:
		List<String> songTitles = Arrays.asList("humble", "element", "dna");
		// ________<String,String>upper=str->str.toUpperCase();?
		Function<String, String> upper = str -> str.toUpperCase();
		songTitles.stream().map(upper).forEach(System.out::println);
		// or
		songTitles.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

		// Question8:
		Map<String, Integer> pantry = new HashMap<>();
		pantry.put("Apples", 3);
		pantry.put("Oranges", 5);
		int currApples = pantry.get("Apples");
		pantry.put("Apples", currApples + 4);
		System.out.println("Current Apples:" + pantry.get("Apples"));

		//Convert List to Array and iterate
		List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");
		String[]strs=names.toArray(new String[0]);
		Arrays.asList(strs).stream().forEach(str-> System.out.println(str));
		
		//Flat Map example
		List<String> Icities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Kokata", "Bengalore");
		List<String> Acities= Arrays.asList("New York","Denver","Washington","Los Angels");
		List<List<String>>countryCities=new ArrayList<>();
		countryCities.add(Icities);
		countryCities.add(Acities);
		
		List<String>flatCities=countryCities.stream().flatMap(cities->cities.stream()
				.map(city->city.toUpperCase()))
				.collect(Collectors.toList());
		System.out.println("Cities->"+flatCities);
		
		
		
	}

	void juicy(String berry) {
		this.berry = "resp";
		System.out.println(berry + " berry");
		System.out.println(this.berry + " berry");

	}

}
