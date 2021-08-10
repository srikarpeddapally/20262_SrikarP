package com.sonata;

public class Assignment09 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6, 0, 1 ,1,7};
		int count=0;
		int maxcount=0;
		int duplicate_item=0;;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(maxcount<count) {
				maxcount=count;
				duplicate_item=a[i];
			}
		}
		System.out.println(duplicate_item + " repeated " +maxcount + " times");

	}

}
