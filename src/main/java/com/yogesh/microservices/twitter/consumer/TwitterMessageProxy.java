package com.yogesh.microservices.twitter.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exchange", url="localhost:8000")
@FeignClient(name="twitter-message-service", url="localhost:8000")
public interface TwitterMessageProxy {
	
	@GetMapping("/twitter-message/from/{from}")
	public TwitterMessage retrieveTwitterMessage(@PathVariable("from") String from);

}
