package vc.com.justa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import vc.com.justa.model.EnumUnits;
import vc.com.justa.model.Units;

@Service
public class UnitsService {

	public List<Units> convertUnits(String pValue) {
		EnumUnits.toEnum(pValue);

		// Test
		List<Units> uni = new ArrayList<>();
		Units u = new Units();
		u.setUnit_name("(rad/s)");
		u.setMultiplication_factor(".00029088820866572");
		uni.add(u);
		return uni;
	}
}
