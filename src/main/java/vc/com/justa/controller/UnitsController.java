package vc.com.justa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vc.com.justa.model.Units;
import vc.com.justa.service.UnitsService;

@RestController
@RequestMapping("/units")
public class UnitsController {

	@Autowired
	private UnitsService service;

	@GetMapping("/si{units}")
	public List<Units> getConvertUnits(@RequestParam("units") String pValue) {
		return this.service.convertUnits(pValue);
	}
}
