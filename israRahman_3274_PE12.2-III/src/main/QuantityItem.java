package main;

public class QuantityItem extends FixedPriceItem {

	int quantity = 0;

	public QuantityItem(Product product, int quantity) {
		super(product.getDescription(), product.getPrice());
		this.quantity = quantity;
	}

	@Override
	public double getTotalPrice() {
		return super.getTotalPrice() * quantity;
	}

	@Override
	public String getDescription(int length) {
		return super.getDescription(length) + this.quantity;
	}

}
