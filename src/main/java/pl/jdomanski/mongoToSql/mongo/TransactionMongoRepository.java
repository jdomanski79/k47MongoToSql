package pl.jdomanski.mongoToSql.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionMongoRepository extends MongoRepository<TransactionMongo, String>{
    
}
