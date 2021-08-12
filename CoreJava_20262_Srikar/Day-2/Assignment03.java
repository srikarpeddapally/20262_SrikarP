package com.assignments.day2;
//T-shirt Class
public class Assignment03 
{
	String Color;
	String Material;
	String Design;
	private String Size;

	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		this.Size = size;
	}
	
	public void display() {
		System.out.println(Color);
		System.out.println(Material);
		System.out.println(Design);
		System.out.println(Size);
		System.out.println();
		
	}
	public static void main(String[] args) {
		Assignment03 t1=new Assignment03();
		t1.Color="blue";
		t1.Design="v-shape";
		t1.Material="cotton";
		t1.setSize("small");
		t1.display();
		Assignment03 t2 = new Assignment03();
		t2.Color="red";
		t2.Design="round-neck";
		t2.Material="polyster";
		t2.setSize("L");
		t2.display();
		Assignment03 t3 = new Assignment03();
		t3.Color="yellow";
		t3.Design="polo";
		t3.Material="mixed cotton";
		t3.setSize("xl");
		t3.display();
	}
}



