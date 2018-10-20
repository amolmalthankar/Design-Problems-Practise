/**
 * 
 */
package com.practise.design.service;

import java.util.List;

import com.practise.design.Customer;
import com.practise.design.Day;
import com.practise.design.Hotel;

/**
 * @author amol_malthankar
 *
 */
public interface HotelService {
	Hotel getCheapest(Customer customer, final List<Day> days);
}
