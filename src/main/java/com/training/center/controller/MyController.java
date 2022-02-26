package com.training.center.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraintvalidation.SupportedValidationTarget;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.center.entity.CenterInformation;
import com.training.center.service.CenterService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@ControllerAdvice
@RestController
@RequestMapping("/center")
@Api(tags = "New training center controller is here.")
public class MyController {

	@Autowired
	private CenterService centerService;

	private static Logger log = LoggerFactory.getLogger(MyController.class);

	@ApiOperation(value = "Insert the data of training centers")
	@PostMapping("/insert")
	public ResponseEntity<Object> insertData(@Valid @RequestBody CenterInformation centerInformation) {
		log.info("You are in insert request");
		return ResponseEntity.ok(this.centerService.centerInsertData(centerInformation));
	}

	@ApiOperation(value = "List of all stored training centers information")
	@GetMapping("/getData")
	public ResponseEntity<List<CenterInformation>> getAllCenter() {
		log.info("You are in get Data request");
		return ResponseEntity.ok(this.centerService.getAllCenter());
	}

}
