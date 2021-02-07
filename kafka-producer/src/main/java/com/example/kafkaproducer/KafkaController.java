package com.example.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	
	@Autowired
	private KafkaProducerDemo kafkaProducer;

//	@GetMapping("/producer/{message}")
//	public void postMessage(@PathVariable String message)
//	{
//		kafkaProducer.produceMessage(message);
//	}
//	
	@PostMapping("producer")
	public void productMessage(@RequestBody Products product)
	{
	//	Products product=new Products();
		//product.setProductId(productId);
	//	product.setProductName(productName);
		System.out.println(product);
		kafkaProducer.produceProduct(product);
		
	}
}
