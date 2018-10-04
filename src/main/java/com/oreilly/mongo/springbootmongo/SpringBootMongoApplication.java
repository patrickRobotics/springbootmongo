package com.oreilly.mongo.springbootmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMongoApplication {

	@Autowired
	private StockRepository repository;

	@RequestMapping("/stocks")
	private Stock stocks(){
//		Stock stock = new Stock();
//		stock.setCompanyName("Tesla");
//		stock.setCeo("PIN");
//		stock.setPrice(234);
//		stock.setSymbol("T");
//		template.insert(stock, "stock");

		return repository.findBySymbol("T");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoApplication.class, args);
	}
}
