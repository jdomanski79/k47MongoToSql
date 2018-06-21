package pl.jdomanski.mongoToSql.mongo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="categories")
public class CategoryMongo {
    @Id
    private String id;
    
    private String name;
    
    private String type;
    
    public String toString(){
        return "Category id: " + this.id + ", name: " + this.name + ", type: " + this.type;
    }
}
