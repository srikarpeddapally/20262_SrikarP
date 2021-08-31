<<<<<<< HEAD
package com.sonata.product;

public class Products {
	private int proId;
	private String proName;
	private double proPrice;
	
	
	public Products(int proid, String proname, double proprice) {
		this.proId=proid;
		this.proName=proname;
		this.proPrice=proprice;
}


	public int getProId() {
		return proId;
	}


	public void setProId(int proId) {
		this.proId = proId;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public double getProPrice() {
		return proPrice;
	}


	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}


	@Override
	public String toString() {
		return "Products [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}

}

=======
package com.sonata.product;

public class Products {
	private int proId;
	private String proName;
	private double proPrice;
	
	
	public Products(int proid, String proname, double proprice) {
		this.proId=proid;
		this.proName=proname;
		this.proPrice=proprice;
}


	public int getProId() {
		return proId;
	}


	public void setProId(int proId) {
		this.proId = proId;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public double getProPrice() {
		return proPrice;
	}


	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}


	@Override
	public String toString() {
		return "Products [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}

}

>>>>>>> refs/remotes/origin/master
