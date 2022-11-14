package main;
//Isra Rahman 
//11/13/22

public class LineItem
{
	private int quantity;
    private Product theProduct;

	public LineItem(Product aProduct, int aQuantity)
	{
		theProduct = aProduct;
	       quantity = aQuantity;
	}
	 public double getTotalPrice()
	    {  
	       return theProduct.getPrice() * quantity;
	    }

	    public String getDescription() {
	 	   return theProduct.getDescription();
	    }

	    public double getPrice() {
	 	   return theProduct.getPrice();
	    }
	    public int getQuantity() {
	 		return quantity;
	 	}
}
