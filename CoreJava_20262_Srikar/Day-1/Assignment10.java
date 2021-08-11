package com.sonata;

public class Assignment10 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int fn=a[0];
		int sn=a[1];
		if(fn<sn)
		{
			int temp=fn;
			fn=sn;
			sn=fn;
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>fn)
			{
				sn=fn;
				fn=a[i];
			}
			else if(a[i]>sn && a[i]!=fn)
			{
				sn=a[i];
			}
		}
		System.out.println(fn+" is largest ");
		System.out.println(sn +" is second largest");
	}

}
