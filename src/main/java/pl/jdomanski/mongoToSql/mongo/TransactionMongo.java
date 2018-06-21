package pl.jdomanski.mongoToSql.mongo;

import java.time.LocalDate;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="transactions")
public class TransactionMongo {

    @Id
    private String id;

    private LocalDate date;

    private LocalDate created;

    private String description;
    
    private int sum;
    
    private ObjectId category;
    
    private ObjectId createdBy;

    
//    public String getSum(){
//        return this.sum;
//    }
// getters and setters


	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", created=" + created + ", amount=" + sum + ", category=" + category + ", userId: " + createdBy + ", description=" + description
				+ "]";
	}



}

