package com.sonata;

public class Assignment05 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b=6;
		for(int x : a) 
		{
			if(x==b)
			{
				System.out.println(b + " is present");
				return;
			}
		}
		System.out.println("not present");
		
	}

}
