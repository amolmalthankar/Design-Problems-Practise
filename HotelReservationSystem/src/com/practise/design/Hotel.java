package com.practise.design;

import java.util.List;
import java.util.Map;

public class Hotel {

	private String name;
	private Rating rating;
	
	private Map<Category, Float> rateCard;

	
	/**
	 * @param name
	 * @param rating
	 */
	public Hotel(String name, Rating rating) {
		super();
		this.name = name;
		this.rating = rating;
	}

	
	/**
	 * @param name
	 * @param rating
	 * @param rateCard
	 */
	public Hotel(String name, Rating rating, Map<Category, Float> rateCard) {
		super();
		this.name = name;
		this.rating = rating;
		this.rateCard = rateCard;
	}


	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rating
	 */
	public final Rating getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public final void setRating(Rating rating) {
		this.rating = rating;
	}

	/**
	 * @return the rateCard
	 */
	public final Map<Category, Float> getRateCard() {
		return rateCard;
	}

	/**
	 * @param rateCard the rateCard to set
	 */
	public final void setRateCard(Map<Category, Float> rateCard) {
		this.rateCard = rateCard;
	}
	
	public void addEntryInRateCard(Category category, Float price) {
		rateCard.put(category, price);
	}
	
	public float costOf(final Customer customer, final List<Day> days) {
		float price = 0;
		
		for( Day day: days) {
				price += rateCard.get(new Category(customer, day));
		}
		return price;
	}
	
} 
