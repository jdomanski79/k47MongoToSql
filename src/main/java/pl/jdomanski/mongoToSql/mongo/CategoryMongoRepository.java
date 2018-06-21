package pl.jdomanski.mongoToSql.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CategoryMongoRepository extends MongoRepository<CategoryMongo, String>{
    
    public List<CategoryMongo> findAll();
}
