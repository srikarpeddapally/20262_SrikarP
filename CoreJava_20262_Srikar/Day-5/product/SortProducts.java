<<<<<<< HEAD
package com.sonata.product;

import java.util.Comparator;
import java.util.List;

public class SortProducts {

	public static void main(String[] args) {
		List<Products> product = ProductData.getProducts();
		product
		.stream()
		.sorted((o1,o2)->(int)(o1.getProPrice()-o2.getProPrice()))
		.forEach(System.out::println);
		
		System.out.println();
		
		product
		.stream()
		.sorted((o1,o2)->(int)(o2.getProPrice()-o1.getProPrice()))
		.forEach(System.out::println);
		
		System.out.println();

	}
	
	
}
=======
package com.sonata.product;

import java.util.Comparator;
import java.util.List;

public class SortProducts {

	public static void main(String[] args) {
		List<Products> product = ProductData.getProducts();
		product
		.stream()
		.sorted((o1,o2)->(int)(o1.getProPrice()-o2.getProPrice()))
		.forEach(System.out::println);
		
		System.out.println();
		
		product
		.stream()
		.sorted((o1,o2)->(int)(o2.getProPrice()-o1.getProPrice()))
		.forEach(System.out::println);
		
		System.out.println();

	}
	
	
}
>>>>>>> refs/remotes/origin/master
