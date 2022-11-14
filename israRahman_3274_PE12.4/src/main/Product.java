package main;
//Isra Rahman 
//11/13/22

public class Product 
{  private String description;
private double price;

	public Product(String aDescription, double aPrice)
{ 
description = aDescription;
price = aPrice;
		
	}
	public String getDescription()
    {  
       return description;
    }

    /**
       Gets the product price.
       @return the unit price
    */
    public double getPrice()
    {
       return price;
    }
}
