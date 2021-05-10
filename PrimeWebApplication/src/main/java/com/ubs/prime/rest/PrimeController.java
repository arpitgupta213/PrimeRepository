package com.ubs.prime.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubs.prime.ro.PrimeData;
import com.ubs.prime.service.PrimeService;

@RestController
@RequestMapping("/prime")
public class PrimeController {
	@Autowired
	private PrimeService primeService;

	@GetMapping("/{initial}")
	public PrimeData getPrimeNumber(@PathVariable("initial") String initial) {
		return primeService.getPrimeNumber(Integer.valueOf(initial));
	}
	
}