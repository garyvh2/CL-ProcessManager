package cr.ac.ucenfotec.process_manager.Classes;

import cr.ac.ucenfotec.process_manager.Annotations.MongoAttr;

@MongoAttr(Collection = "Usuario")
public class Usuario extends BaseClass {
	// >> Attributes
	private String _id;
	private String _fname;
	private String _lname;
	
	// >> Constructors
	
	// >> Get Set
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_fname() {
		return _fname;
	}
	public void set_fname(String _fname) {
		this._fname = _fname;
	}
	public String get_lname() {
		return _lname;
	}
	public void set_lname(String _lname) {
		this._lname = _lname;
	}
	
}
