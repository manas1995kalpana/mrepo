package com.ebx.multiserv;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	
	
	@GetMapping("/")
	public String getLocations() {
		return "Kana kala se..QQ_server  .";
	}

}