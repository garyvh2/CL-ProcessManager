package cr.ac.ucenfotec.process_manager.Enums;

public enum ErrorStorage {
	DEFAULT 	("Error. Imposible realizar la operacion solicitada"),
	INVALID		("Error. El valor ingresado es invalido");
	
	private	String Error;	
	ErrorStorage (String Error) {
		this.Error = Error;
	}
	public String val () {
		return Error;
	}
}
