package cartSystemExample;

public class Item {
	private String itemDesc;
	private Double itemPrice;
	private Integer quantity;
	private Integer availableQuantity;
	private String itemName;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	

	public Item() {
		this.quantity = 1;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	@Override
	public String toString() {
		String itemString = "";
//		itemName;
//		itemDesc;
//		quantity;
//		itemPrice;
//		availableQuantity;
		itemString += itemName;
		itemString += ", " + itemDesc;
		itemString += ", " + quantity;
		itemString += ", " + availableQuantity;
		itemString += ", $" + itemPrice;
		
		//System.out.println(itemString);
		
		return itemString;
	}
	
	

}
