package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.entity.Hotel;
import com.example.spring.repository.hotelRepository;

@Service
public class HotelserviceImpl implements service {
	hotelRepository hRepo;

	public HotelserviceImpl(hotelRepository hRepo) {
		super();
		this.hRepo = hRepo;
	}

	@Override
	public String addHotel(Hotel h) {
		hRepo.save(h);
		return "Hotel is CREATED successfully";
	}

	@Override
	public Hotel getHotelinfo(String hotelId) {
	Hotel ho= hRepo.findById(hotelId).get();
		return ho;
	}

	@Override
	public List<Hotel> getAllHotelinfo() {
		List <Hotel> ho = hRepo.findAll(); 
		return ho;
	}

	@Override
	public String updateHotel(Hotel h) {
		hRepo.save(h);
		return "Hotel is UPATED successfully";
		
	}

	@Override
	public String deleteHotel(String hotelId) {
		hRepo.deleteById(hotelId);
		return "Hotel is DELETED successfully";
	}



}
