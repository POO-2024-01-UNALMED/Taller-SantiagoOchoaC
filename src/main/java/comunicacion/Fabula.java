package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	//CONSTRUCTOR
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	// METODOS ABSTRACTOS QUE HEREDA
	@Override
	public int palabrasTotales(int palabras) {
		int totalPaginas = super.getPaginas()*palabras*1;
		return totalPaginas;
	}
	
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
		String mensaje = super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.ensenanza;
		return mensaje;
	}
	
	// METODOS GET Y SET

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

}
