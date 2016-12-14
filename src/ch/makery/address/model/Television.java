package ch.makery.address.model;


import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ch.makery.address.util.LocalDateAdapter;

 
public class Television {

	private final StringProperty marca;
	private final StringProperty sonido;
	private final StringProperty entradas;
	private final IntegerProperty colores;
	private final StringProperty resolucion;
	private final FloatProperty pulgadas;

	 
	public Television() {
		this(null, null);
	}
	
 
	public Television(String marca, String sonido) {
		this.marca = new SimpleStringProperty(marca);
		this.sonido = new SimpleStringProperty(sonido);
 		this.entradas = new SimpleStringProperty("Usb, HDMI");
		this.colores = new SimpleIntegerProperty(12);
		this.resolucion = new SimpleStringProperty("FULL HD");
		this.pulgadas = new SimpleFloatProperty();
	}
	
	public String getMarca() {
		return marca.get();
	}

	public void setMarca(String Marca) {
		this.marca.set(Marca);
	}
	
	public StringProperty MarcaProperty() {
		return marca;
	}

	public String getSonido() {
		return sonido.get();
	}

	public void setSonido(String Sonido) {
		this.sonido.set(Sonido);
	}
	
	public StringProperty SonidoProperty() {
		return sonido;
	}

	public String getEntradas() {
		return entradas.get();
	}

	public void setEntradas(String Entradas) {
		this.entradas.set(Entradas);
	}
	
	public StringProperty streetEntradas() {
		return entradas;
	}

	public int getColores() {
		return colores.get();
	}

	public void setColores(int Colores) {
		this.colores.set(Colores);
	}
	
	public IntegerProperty ColoresProperty() {
		return colores;
	}

	public String getResolucion() {
		return resolucion.get();
	}

	public void setResolucion(String Resolucion) {
		this.resolucion.set(Resolucion);
	}
	
	public StringProperty ResolucionProperty() {
		return resolucion;
	}

	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public float getPulgadas() {
		return pulgadas.get();
	}

	public void setPulgadas(float Pulgadas) {
		this.pulgadas.set(Pulgadas);
	}
	
	public FloatProperty PulgadasProperty() {
		return pulgadas;
	}
}