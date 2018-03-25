
public enum TipoContraseña {
	larga (14),
	corta (8);
	
	private int largo;
	
	private TipoContraseña(int largo) {
		this.largo=largo;
	}

}
