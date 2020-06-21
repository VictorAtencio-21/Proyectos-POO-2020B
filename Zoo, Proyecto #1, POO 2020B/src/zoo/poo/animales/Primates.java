package zoo.poo.animales;

import interfaces.pack.Comida;

public class Primates extends Animal implements Comida {
	private String Color;
	public Primates(String nombre, String raza, int edad, Float peso, String Color) {
		super(nombre,raza,edad,peso);
		this.Color = Color;
	}

	@Override
	public void Comportamiento() {
		System.out.println("Comportamiento: Balancearse y Trepar");
		
	}
	
	public void Trepar() {
		System.out.println("Caracteristica: Los primates trepan para buscar comida, escapar, o llegar a su casa");
		
	}
	
	@Override
	public void Comer() {
		System.out.println("Comida: Herviboro, se alimentan de plantas y frutas");
	}
	
	public String toString() {
		return "\nPrimate:\n" + super.toString() + Color;
	}
}
