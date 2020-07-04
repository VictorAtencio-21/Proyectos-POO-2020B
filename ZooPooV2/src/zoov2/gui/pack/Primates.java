package zoov2.gui.pack;

public class Primates extends Animal {
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
	
	public String toString() {
		return "\nPrimate:\n" + super.toString() + Color;
	}
}