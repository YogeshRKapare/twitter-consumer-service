package com.yogesh.microservices.twitter.consumer;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TwitterConsumerController {

	@Autowired
	private TwitterMessageProxy proxy;

	@GetMapping("/twitter-client/from/{from}")
	public TwitterMessage getTwitterMessage(@PathVariable String from) {

		HashMap<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);

		ResponseEntity<TwitterMessage> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/twitter-message/from/{from}", TwitterMessage.class, uriVariables);

		TwitterMessage twitterMessage = responseEntity.getBody();

		return new TwitterMessage(twitterMessage.getId(),twitterMessage.getMessage());

	}

	@GetMapping("/twitter-client-feign/from/{from}")
	public TwitterMessage getTwitterMessageFeign(@PathVariable String from) {

		TwitterMessage twitterMessage = proxy.retrieveTwitterMessage(from);

		return new TwitterMessage(twitterMessage.getId(),twitterMessage.getMessage());


	}

}
