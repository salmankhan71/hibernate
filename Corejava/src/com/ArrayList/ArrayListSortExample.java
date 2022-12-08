package com.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {

	public static void main(String[] args) {
		List<String> sm = new ArrayList<>();
		sm.add("Salman");
		sm.add("Kaleem");
		sm.add("Adil");
		sm.add("Kalam");
		sm.add("Ayaz");
		System.out.println("Name" + sm);

		// Sort an ArrayList using its sort() method. You must pass a Comparator to the
		// ArrayList.sort() method.

		sm.sort(new Comparator<String>() {

			@Override
			public int compare(String name1, String name2) {

				return name1.compareTo(name2);
			}

		});
		// The above `sort()` method call can also be written simply using lambda expression
		sm.sort((name1,name2)->name1.compareTo(name2));
		
        // Following is an even more concise solution
  sm.sort(Comparator.naturalOrder());
		System.out.println("sort name:"+sm);	
		
	}

}
