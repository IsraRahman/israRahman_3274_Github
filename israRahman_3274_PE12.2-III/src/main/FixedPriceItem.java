package main;

public class FixedPriceItem extends AbstractItem{

	private String description;
	private double charge;

	/*
	 * Construct an item that has a fixed charge
	 * 
	 * @param description the description for the item
	 * 
	 * @param charge the charge
	 */
	public FixedPriceItem(String description, double charge) {
		this.description = description;
		this.charge = charge;
	}

	/*
	 * Computes the total cost of this item
	 * 
	 * @return the total price
	 */
	public double getTotalPrice() {
		return charge;
	}

	public String getDescription(int length) {
		return String.format("%-" + (length - 13) + "s%8.2f    ", this.description, this.charge);
	}

}
