package Class;

public class LavadoraClass extends ElectrodomesticoClass{
	// Atributos de clase
	protected double carga;
	
	// Constantes por defecto
	protected static final double CARGAF= 5;

	public LavadoraClass(double carga) {
		this.carga = carga;
	}

	public LavadoraClass() {
		this.carga = CARGAF;
		
	}

	public LavadoraClass(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public LavadoraClass(double precioBase, String color, char consumo, double peso) {
		super(precioBase, color, consumo, peso);
		// TODO Auto-generated constructor stub
		
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "LavadoraClass [carga=" + carga + "]";
	}
	
	
}
