/**
 * 
 */
package com.practise.design;

/**
 * @author amol_malthankar
 *
 */
public enum Rating {

	ONE(1) ,TW0(2), THREE(3), FOUR(4), FIVE(5);
	
	private int rating;
	
	private Rating(int rating) {
		this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}
}
