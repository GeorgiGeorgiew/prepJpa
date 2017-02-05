package com.acn.prepJpa;

public class PurchaseItem {
	private long PurchaseItemId;
	private String name;
	private double price;
	private ReasonForExpense reasonForExpense;
	
	public enum ReasonForExpense {
		UNSPECIFIED,
		PRIVATE,
		BUSINESS
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public ReasonForExpense getReasonForExpense() {
		return reasonForExpense;
	}
	
	public void setReasonForExpense(ReasonForExpense reasonForExpense) {
		this.reasonForExpense = reasonForExpense;
	}

	public PurchaseItem(String name, double price, ReasonForExpense reasonForExpense) {
		super();
		this.name = name;
		this.price = price;
		this.reasonForExpense = reasonForExpense;
	}

	public PurchaseItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.reasonForExpense = ReasonForExpense.UNSPECIFIED;
	}



	@Override
	public String toString() {
		return "PurchaseItem [PurchaseItemId=" + PurchaseItemId + ", name=" + name + ", price=" + price
				+ ", reasonForExpense=" + reasonForExpense + "]";
	}

	public long getPurchaseItemId() {
		return PurchaseItemId;
	}

	public void setPurchaseItemId(long purchaseItemId) {
		PurchaseItemId = purchaseItemId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (PurchaseItemId ^ (PurchaseItemId >>> 32));
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
		PurchaseItem other = (PurchaseItem) obj;
		if (PurchaseItemId != other.PurchaseItemId)
			return false;
		return true;
	};
	
	
}
