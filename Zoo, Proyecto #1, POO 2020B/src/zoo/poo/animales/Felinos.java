package zoo.poo.animales;

import interfaces.pack.Comida;

public class Felinos extends Animal implements Comida {
	public String Pelaje;
	
	public Felinos(String nombre, String raza, int edad, Float peso, String Pelaje ) {
		super(nombre ,raza,edad,peso);
		this.Pelaje = Pelaje;
	}

	@Override
	public void Comportamiento() {
		System.out.println("Comportamiento: Rugir para comunicarse y Acechar sus presas");
		
	}
	
	public void Rugir() {
		System.out.println("Caracteristica: Los felinos rugen para comunicarse entre si");
		
	}
	
	@Override
	public void Comer() {
		System.out.println("Comida: Carnivoro, se alimentan de carne de sus presas");
	}
	
	
	public String toString() {
		return "\nFelino:\n" + super.toString() + Pelaje;
	}
}
