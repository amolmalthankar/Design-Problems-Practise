/**
 * 
 */
package com.practise.design;

/**
 * @author amol_malthankar
 *
 */
public class Category {

	private Customer customer;
	private Day day;

	/**
	 * @param customer
	 * @param day
	 */
	public Category(Customer customer, Day day) {
		super();
		this.customer = customer;
		this.day = day;
	}
	
	/**
	 * @return the customer
	 */
	public final Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public final void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the day
	 */
	public final Day getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public final void setDay(Day day) {
		this.day = day;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Category)) {
			return false;
		}
		Category other = (Category) obj;
		if (customer != other.customer) {
			return false;
		}
		if (day != other.day) {
			return false;
		}
		return true;
	}
}
	
