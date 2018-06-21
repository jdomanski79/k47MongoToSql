package pl.jdomanski.mongoToSql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.jdomanski.mongoToSql.mongo.CategoryMongo;
import pl.jdomanski.mongoToSql.mongo.CategoryMongoRepository;
import pl.jdomanski.mongoToSql.mongo.TransactionMongo;
import pl.jdomanski.mongoToSql.mongo.TransactionMongoRepository;

@SpringBootApplication
public class MongoToSqlApplication implements CommandLineRunner{

    @Autowired
    CategoryMongoRepository catMongoDAO;
    
    @Autowired
    TransactionMongoRepository tMongoDao;
    
	public static void main(String[] args) {
		SpringApplication.run(MongoToSqlApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("Finding all categories");
        
        for (CategoryMongo category: catMongoDAO.findAll()){
            System.out.println(category);
        }
        
        for (TransactionMongo transaction :tMongoDao.findAll()){
            System.out.println(transaction);
        }
    }
}
