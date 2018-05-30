package cr.ac.ucenfotec.process_manager.Classes;

import cr.ac.ucenfotec.process_manager.Annotations.MongoAttr;

@MongoAttr(Collection = "User")
public class User extends BaseClass {
	// >> Attributes
	private String fname;
	private String lname;
	private String email;
	
	// >> Constructors
	
	// >> Get Set
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
