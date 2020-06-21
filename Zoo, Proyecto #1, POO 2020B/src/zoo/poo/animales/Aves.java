package zoo.poo.animales;

import interfaces.pack.Comida;

public class Aves extends Animal implements Comida {
	private String Plumaje;
	
	public Aves(String nombre, String raza, int edad, float peso, String Plumaje) {
		super(nombre, raza, edad,peso);
		this.Plumaje = Plumaje;
	}

	@Override
	public void Comportamiento() {
		System.out.println("Comportamiento: Vuelan para escapar, llegar a sus nidos, o comer");
		
	}
	
	public void hacerNido() {
		System.out.println("Caracteristica: Las Aves crean su nido para vivir y tener sus crias");
		
	}
	
	@Override
	public void Comer() {
		System.out.println("Comida: Herviboro, se alimentan de semillas, o alpiste");
	}
	
	public String toString() {
		return "\nAve:\n" + super.toString() + Plumaje;
	}
	
}