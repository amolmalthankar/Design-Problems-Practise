/**
 * 
 */
package com.practise.design.service;

import java.util.List;
import java.util.Set;

import com.practise.design.Customer;
import com.practise.design.Day;
import com.practise.design.Hotel;

/**
 * @author amol_malthankar
 *
 */
public class HotelServiceImpl implements HotelService {

	private Set<Hotel> hotels;
	
	/**
	 * @param hotels
	 */
	public HotelServiceImpl(Set<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	public boolean addNew(Hotel hotel) {
		return(hotels.add(hotel));
	}
	
	/**
	 * @return the hotels
	 */
	public final Set<Hotel> getHotels() {
		return hotels;
	}
	
	@Override
	public Hotel getCheapest(Customer customer, List<Day> days) {
		float minCost = Float.MAX_VALUE;
		Hotel minRateHotel = null;
		for(Hotel hotel : hotels) {
			float cost = hotel.costOf(customer, days);
			if (cost < minCost) {
				minCost = cost;
				minRateHotel = hotel;				
			}
		}
		
		System.out.println("Minimum rate hotel is "+minRateHotel.getName()+" with rate "+minCost);
		return minRateHotel;
	}

}
