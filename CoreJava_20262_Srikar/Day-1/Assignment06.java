package com.sonata;

public class Assignment06 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int low=0;
		int high=a.length-1;
		while(low<high)
		{
			int temp;
			temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
		for(int x : a)
		{
			System.out.println(x+" ");
		}

	}

}
