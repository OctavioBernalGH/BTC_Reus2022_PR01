package Class;

public class TelevisorClass extends ElectrodomesticoClass {

	/* Atributos de clase */
	protected double resolucion = RESOLUCIONF;
	protected boolean sintonizador = SINTONIZADORF;
	
	/* Constantes por defecto */
	protected static final double RESOLUCIONF = 20.0;
	protected static final boolean SINTONIZADORF = false;
	
	/* Constructor por defecto */
	public TelevisorClass() {
		this.resolucion = RESOLUCIONF;
		this.sintonizador = SINTONIZADORF;
	}

	/* Constructor de superclase. */
	public TelevisorClass(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	/* Constructor de clase con superclase. */
	public TelevisorClass(double precioBase, String color, char consumo, double peso, double resolucion, boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	
	
}
