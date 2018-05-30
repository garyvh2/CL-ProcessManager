package cr.ac.ucenfotec.process_manager.Classes;

import cr.ac.ucenfotec.process_manager.Annotations.MongoAttr;

@MongoAttr(Collection = "Group")
public class Group extends BaseClass {
	// >> Attributes
	private String name;
	private String description;
	
	// >> Constructors
	
	// >> Get & Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
