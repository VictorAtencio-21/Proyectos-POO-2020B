package zoov2.gui.pack;

public class Felinos extends Animal {
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
	
	public String toString() {
		return "\nFelino:\n" + super.toString() + Pelaje;
	}
}