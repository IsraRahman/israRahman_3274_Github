package main;

public class Address {

	//HIDE
	/**
	   Describes a mailing address.
	*/
	   private String name;
	   private String street;
	   private String city;
	   private String state;
	   private String zip;

	   /**
	      Constructs a mailing address.
	      @param aName the recipient name
	      @param aStreet the street
	      @param aCity the city
	      @param aState the two-letter state code
	      @param aZip the ZIP postal code
	   */
	   public Address(String aName, String aStreet,
	         String aCity, String aState, String aZip)
	   {
	      name = aName;
	      street = aStreet;
	      city = aCity;
	      state = aState;
	      zip = aZip;
	   }

}
