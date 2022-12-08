package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {
		List<Integer> ms = new ArrayList<>();
		ms.add(2);
		ms.add(3);
		ms.add(5);
		ms.add(7);
		ms.add(11);

		List<Integer> firstTenPrimeNumbers = new ArrayList<>(ms);
		firstTenPrimeNumbers.add(13);
		firstTenPrimeNumbers.add(15);
		firstTenPrimeNumbers.add(17);
		firstTenPrimeNumbers.add(19);
		firstTenPrimeNumbers.add(21);
		firstTenPrimeNumbers.add(23);
		firstTenPrimeNumbers.add(25);
		firstTenPrimeNumbers.add(29);
		// Adding an entire collection to an ArrayList
		firstTenPrimeNumbers.addAll(ms);
		System.out.println(firstTenPrimeNumbers);
	}

}
