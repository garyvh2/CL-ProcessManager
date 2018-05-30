package cr.ac.ucenfotec.process_manager.Classes;

public class BaseClass {
	// >> Base Attributes
	private String c_id;
	private String c_owner;
	private String c_parent_doc_id;
	
	// >> Constructors
	public BaseClass () {
		
	}

	// >> Get & Sets
	public String get_id() {
		return c_id;
	}
	public void set_id(String c_id) {
		this.c_id = c_id;
	}
	public String get_owner() {
		return c_owner;
	}
	public void set_owner(String c_owner) {		
		this.c_owner = c_owner;
	}
	public String get_parent_doc_id() {
		return c_parent_doc_id;
	}
	public void set_parent_doc_id(String c_parent_doc_id) {
		this.c_parent_doc_id = c_parent_doc_id;
	}
}
