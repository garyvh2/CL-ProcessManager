package cr.ac.ucenfotec.process_manager.Enums;

public enum MessageStorage {
	MAIN_MENU ("Bienvenido al Sistema\n" 			+
			   "---------------------\n"			+
			   "1. Iniciar Sesion    \n"			+
			   "2. Registrarse       \n"			+
			   "---------------------\n"			+
			   "-1. Salir"),
	SALIR_SYS ("Gracias por utilizar el sistema\n" 	+
			   "Adios");
	
	
	private	String Message;	
	MessageStorage (String Message) {
		this.Message = Message;
	}
	public String val () {
		return Message;
	}
}
