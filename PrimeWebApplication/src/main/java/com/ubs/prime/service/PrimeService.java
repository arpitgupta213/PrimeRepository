package com.ubs.prime.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ubs.prime.ro.PrimeData;


@Service
public class PrimeService {
	
	public PrimeData getPrimeNumber(int initial) {
		PrimeData primeData = new PrimeData();
		List<Integer> primes = new ArrayList<Integer>();
		primes = findPrimes(initial);
		primeData.setInitial(initial);
		primeData.setPrimes(primes);
		return primeData;
	}

	private List<Integer> findPrimes(int initial) {
		List<Integer> primes = new ArrayList<>();
		boolean isPrime = true;
		for (int i = 2; i<=initial; i++) {
			isPrime = true;
			for (int j=2; j<i; j++) {
				if (i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				primes.add(i);
		}
		return primes;
	}
}
