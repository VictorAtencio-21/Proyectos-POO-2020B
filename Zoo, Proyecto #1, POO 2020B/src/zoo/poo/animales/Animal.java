package zoo.poo.animales;

public abstract class Animal {
	private String nombre;
	private String raza;
	private int edad;
	private float peso;
	
	public Animal() {
	}
	
	public Animal(String nombre, String raza, int edad, float peso) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.peso = peso;
	}

	public abstract void Comportamiento();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Nombre: "+getNombre()+
		", Raza: "+getRaza()+
		", Edad: años "+getEdad()+
		", Peso: kg "+getPeso();
	}
	
}