package com.oreilly.mongo.springbootmongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends MongoRepository<Stock, Integer> {
    public Stock findBySymbol(String symbol);
}
