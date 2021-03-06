package com.sonata.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductDetails {
	
	@Id
	private Long pId;
	private String pName;
	private Double pPrice;
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpPrice() {
		return pPrice;
	}
	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}
	public ProductDetails(Long pId, String pName, Double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "ProductDetails [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	public ProductDetails(){
		
	}
	

}
