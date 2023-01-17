package com.infybuzz.cloud.departmentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	@GetMapping("messages")
	public String getMessage() {
		return "Welcom to Depertment!";
	}
}
