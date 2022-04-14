
/*
 * @author:		Josep Oriol L�pez Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		14/04/2022
 * @versi�n:	0.0.1
 */

package Class;

public class TelevisorClass extends ElectrodomesticoClass {

	/* Atributos de clase */
	protected double resolucion;
	protected boolean sintonizador;

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
	public TelevisorClass(double precioBase, String color, char consumo, double peso, double resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	/* Getters y setters */
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	/* M�todo toString con los atributos propios de clase */
	@Override
	public String toString() {
		return "TelevisorClass [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
	}

}
