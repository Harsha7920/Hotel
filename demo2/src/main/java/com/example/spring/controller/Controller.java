package com.example.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Hotel;
import com.example.spring.service.service;

@RestController
@RequestMapping("Hotel")
public class Controller {
	Hotel h;
	service service;

		
	
	public Controller(com.example.spring.service.service service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String addHotel(@RequestBody Hotel h) {
		String msg = service.addHotel(h);
		return msg;
	}
	
	@GetMapping("{hotelId}")
	public Hotel getHotelinfo(@PathVariable String hotelId) {
	    Hotel h = service.getHotelinfo(hotelId);
	    return h;
	}

	@GetMapping
	public List<Hotel> getAllHotelinfo(){
		List<Hotel> hotel = service.getAllHotelinfo();
		return hotel;
	}
	
	@PutMapping
	public String updateHotel(@RequestBody Hotel h) {
		String msg = service.updateHotel(h);
		return msg;
	}
	@DeleteMapping("{hotelId}")
	public String deleteHotel(@PathVariable String hotelId) {
	    String msg = service.deleteHotel(hotelId);
	    return msg;
	}


}
