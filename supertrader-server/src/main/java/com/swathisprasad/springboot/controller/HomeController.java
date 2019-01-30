/**
 * 
 */
package com.swathisprasad.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Swathi
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String home() {
		return "forward:/index.html";
	}

	@RequestMapping("/version")
	@ResponseBody
	String version() {
		return "2019-01-29";
	}
}
