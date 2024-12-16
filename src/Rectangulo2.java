package src;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	public Rectangulo() {
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}	
	
	public Rectangulo(int color, Punto centro, double base, double altura) {
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = new Punto(r.centro);
	}


	public void mostrarDatos() {
		Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));
		Pantalla.escribirSaltoLinea();		
		Pantalla.escribirString("");
		centro.mostrarDatos();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
	}
	
	/*
	 * Código duplicado
	 * Control de errores
	 * No usa métodos, los redefine
	 * No se ha leído la documentación de Teclado
	 * 
	 * Crear funciones para evitar código duplicado
	 * Modificar leerDatos() para cumplir especificaciones
	 * Usar los métodos adecuados para cada tipo
	 * Buscar un método para realizar conversiones seguras
	 */
	
	
	   public double leerDouble(String mensaje, double valorPorDefecto) {
	        double valor = valorPorDefecto;
	        while (true) {
	            Pantalla.escribirString(mensaje);
	            String input = Teclado.leerString();
	            if (input.isEmpty()) {
	                break;
	            }
	            try {
	                valor = Double.parseDouble(input);
	                break;
	            } catch (NumberFormatException e) {
	                Pantalla.escribirString("Entrada no válida. Intente de nuevo.\n");
	            }
	        }
	        return valor;
	    }

	    public void cambiarDatos() {
	        this.altura = leerDouble("Indica el nuevo valor de la altura: ", this.altura);
	        this.base = leerDouble("Indica el nuevo valor de la base: ", this.base);
	        this.color = leerInt("Indica el nuevo valor del color: ", this.color);
	        int nuevaX = leerInt("Indica el nuevo valor de la X del punto: ", this.centro.getX());
	        int nuevaY = leerInt("Indica el nuevo valor de la Y del punto: ", this.centro.getY());
	        this.centro.setX(nuevaX);
	        this.centro.setY(nuevaY);
	    }

	
	
	
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
