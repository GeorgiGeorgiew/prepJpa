package com.acn.prepJpa;

import java.util.Date;

public class Purchase {
	public enum Medium {
		ONLINE,
		SHOP
	}
	
	private long purchaseId;
	private Medium medium;
	private Date dateOfPurchase;
	private String vendor;
	private String location;
	
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	
	public Medium getMedium() {
		return medium;
	}
	
	public void setMedium(Medium medium) {
		this.medium = medium;
	}
	
	public String getVendor() {
		return vendor;
	}
	
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public long getPurchaseId() {
		return purchaseId;
	}
	
	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Purchase(Medium medium, String vendor, String location) {
		super();
		this.medium = medium;
		this.vendor = vendor;
		this.location = location;
		this.dateOfPurchase = new Date();
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", medium=" + medium + ", dateOfPurchase=" + dateOfPurchase
				+ ", vendor=" + vendor + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (purchaseId ^ (purchaseId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Purchase) obj;
		if (purchaseId != other.purchaseId)
			return false;
		return true;
	}
	
	
	
}
