package cr.ac.ucenfotec.process_manager.ArchitectureComponents;

import java.util.*;
import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import cr.ac.ucenfotec.process_manager.Annotations.MongoAttr;
import cr.ac.ucenfotec.process_manager.Classes.BaseClass;

public class MongoConnection {
	// >> Attributes
	// Self Instance
	private static MongoConnection Instance;
	// DB Instance
	private static MongoDatabase DB;
	// DB Client
	private static MongoClient Client;
	// DB Collection
	private static MongoCollection<Document> Collection;
	// GSON Processor
	private static Gson Gson;

	
	
	// >> Constructor
	private MongoConnection () {
		
	}
	
	// >> Methods
	public static MongoConnection GetInstance(String CollectionName) {
		// >> If the instance is null then create it
		if (Instance == null) {
			Instance 	= new MongoConnection();
			Client 		= new MongoClient("localhost", 27017);
			Gson		= new Gson();
			DB			= Client.getDatabase("ProcessManager");
		}
		if (Collection == null) {
			Collection = DB.getCollection(CollectionName);
		}
		// >> Otherwise return the instance
		return Instance;
	}
	// ===================>> DB Methods <<===================
	// >> Insert
	public <T extends BaseClass> void Insert (T Doc) {
		// >> Process Doc (To JSON)
		String GDoc 	= Gson.toJson(Doc);
		// >> Process To Mongo Document
		Document BDoc	= Document.parse(GDoc);

		Collection.insertOne(BDoc);		
	}
	// >> Update
	
	// >> Get
	
	// >> List
	public <T extends BaseClass> T Find (String Query) {
		// >> Execute Query
		//List<Document> Results = Collection.find();
		return null;
		
	}
	// >> Delete
	

	// ===================>> DB Utils <<===================
}
