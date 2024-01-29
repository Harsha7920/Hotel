package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Hotel;

public interface service {
   	public String addHotel(Hotel h);
   	public Hotel getHotelinfo(String hotelId);
   	public List<Hotel> getAllHotelinfo();
   	public String updateHotel(Hotel h);
   	public String deleteHotel(String hotelId);

}
