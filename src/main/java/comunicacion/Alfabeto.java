package comunicacion;

public class Alfabeto extends Pictograma{
	private String [] letras;
	private String interpretacion;
	
	// CONSTRUCTOR 
	public Alfabeto(String origen, String [] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	// METODOS DE LA CLASE
	public int cantidadLetras() {
		int total = this.letras.length;
		return total;
	}
	
	// SOBREESCRITURA DE LOS METODOS ABSTRACTOS
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
		String alfabeto = "";
		for (String letra : letras) {
			alfabeto+=letra;
			if (letra != letras[letras.length-1]) {
				alfabeto += ", ";
			}
		}
		return alfabeto;
	}
	
	// METODOS GET Y SET
	public String [] getLetras() {
		return letras;
	}
	
	public void setLetras (String [] letras) {
		this.letras = letras;
		
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
