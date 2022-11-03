package main;
//Isra Rahman
//11/1/22

import java.util.ArrayList;

public class Invoice {

		private Address billingAddress;
		private ArrayList<AbstractItem> items;

		/**
		 * Constructs an invoice.
		 * 
		 * @param anAddress the billing address
		 */
		public Invoice(Address anAddress) {
			items = new ArrayList<AbstractItem>();
			billingAddress = anAddress;
		}
		
		public void add(AbstractItem item) {
			items.add(item);
		}

		/**
		 * Adds a charge for a product to this invoice.
		 * 
		 * @param aProduct the product that the customer ordered
		 * @param quantity the quantity of the product
		 */
		public void add(Product aProduct, int quantity) {
			AbstractItem anItem = new QuantityItem(aProduct, quantity);
			items.add(anItem);
		}

		/**
		 * Formats the invoice.
		 * 
		 * @return the formatted invoice
		 */
		public String format() {
			String r = "                     I N V O I C E\n\n" + billingAddress.format()
					+ String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");

			for (AbstractItem item : items) {
				r = r + item.format() + "\n";
			}

			r = r + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());

			return r;
		}

		/**
		 * Computes the total amount due.
		 * 
		 * @return the amount due
		 */
		private double getAmountDue() {
			double amountDue = 0;
			for (AbstractItem item : items) {
				amountDue = amountDue + item.getTotalPrice();
			}
			return amountDue;
		}

	}
