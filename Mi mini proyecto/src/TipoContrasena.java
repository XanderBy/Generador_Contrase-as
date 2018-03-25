
public enum TipoContrasena {
	larga (14),
	corta (8);
	
	private int largo;
	
	private TipoContrasena(int largo) {
		this.largo=largo;
	}

}
