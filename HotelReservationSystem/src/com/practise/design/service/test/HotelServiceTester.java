/**
 * 
 */
package com.practise.design.service.test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.practise.design.Category;
import com.practise.design.Customer;
import com.practise.design.Day;
import com.practise.design.Hotel;
import com.practise.design.Rating;
import com.practise.design.service.HotelServiceImpl;

/**
 * @author amol_malthankar
 *
 */
class HotelServiceTester {
	HotelServiceImpl hotelService;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		Set<Hotel> hotels = new HashSet();
		Map<Category, Float> lakeWoodRateCard = new HashMap();
		Map<Category, Float> bridgewoodRateCard = new HashMap();
		Map<Category, Float> ridgewoodRateCard = new HashMap();
		
		Hotel lakeWood = new Hotel("Lakewood", Rating.THREE);
		Hotel bridgewood = new Hotel("Bridgewood", Rating.FOUR);
		Hotel ridgewood = new Hotel("Ridgewodo", Rating.FIVE);

		hotels.add(lakeWood);
		hotels.add(bridgewood);
		hotels.add(ridgewood);

		lakeWoodRateCard.put(new Category(Customer.REGULAR, Day.WEEKDAY), (float) 110.0);
		lakeWoodRateCard.put(new Category(Customer.REGULAR, Day.WEEKEND), (float) 90.0);		
		lakeWoodRateCard.put(new Category(Customer.PREMIUM, Day.WEEKDAY), (float) 80.0);
		lakeWoodRateCard.put(new Category(Customer.PREMIUM, Day.WEEKEND), (float) 80.0);
		
		bridgewoodRateCard.put(new Category(Customer.REGULAR, Day.WEEKDAY), (float) 160.0);
		bridgewoodRateCard.put(new Category(Customer.REGULAR, Day.WEEKEND), (float) 60.0);		
		bridgewoodRateCard.put(new Category(Customer.PREMIUM, Day.WEEKDAY), (float) 110.0);
		bridgewoodRateCard.put(new Category(Customer.PREMIUM, Day.WEEKEND), (float) 50.0);
		
		ridgewoodRateCard.put(new Category(Customer.REGULAR, Day.WEEKDAY), (float) 220.0);
		ridgewoodRateCard.put(new Category(Customer.REGULAR, Day.WEEKEND), (float) 150.0);		
		ridgewoodRateCard.put(new Category(Customer.PREMIUM, Day.WEEKDAY), (float) 100.0);
		ridgewoodRateCard.put(new Category(Customer.PREMIUM, Day.WEEKEND), (float) 40.0);
		
		lakeWood.setRateCard(lakeWoodRateCard);
		bridgewood.setRateCard(bridgewoodRateCard);
		ridgewood.setRateCard(ridgewoodRateCard);
		
		hotelService = new HotelServiceImpl(hotels);
		
	}

	
	/**
	 * Test method for {@link com.practise.design.service.HotelServiceImpl#getCheapest(com.practise.design.Customer, java.util.List)}.
	 */
	@Test
	void testGetCheapest() {
		List<Day> days = new ArrayList();
		days.add(Day.WEEKDAY);
		days.add(Day.WEEKDAY);
		days.add(Day.WEEKEND);
		days.add(Day.WEEKEND);
		
		assertEquals("Lakewood" , hotelService.getCheapest(Customer.REGULAR, days).getName());
	}

}
