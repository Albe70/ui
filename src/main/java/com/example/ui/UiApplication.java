package com.example.ui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@SpringBootApplication
@RestController
@Slf4j
public class UiApplication {
	//@CrossOrigin( origins = "http://localhost:4200")
	@RequestMapping("/api/resource")
	public Map<String,Object> home() {

		Map<String,Object> model = new HashMap<String,Object>();
		String uid= UUID.randomUUID().toString();
		model.put("id", uid);
		log.debug("arrivo {}",uid);
		model.put("content", "Hello World");
		SimpleDateFormat simpleDateFormat =
				new SimpleDateFormat("dd-MMM-yyyy HH:mm");

		model.put("serverTime", simpleDateFormat.format(new Date()));
		return model;
	}

	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}

}
