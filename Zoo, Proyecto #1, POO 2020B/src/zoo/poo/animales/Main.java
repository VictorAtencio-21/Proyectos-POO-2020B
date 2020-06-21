package zoo.poo.animales;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Aves a1 = new Aves ("Blue","Guacamayo Azul",3,(float) 1.30,", Plumaje: Azul\n");
		
		Aves a2 = new Aves ("Rafael","Tucan Toco",5,1,", Plumaje: Negro con Blanco\n");
	
		Aves a3 = new Aves ("Nigel","Cacatua",5,(float) 1.50,", Plumaje: Blanco Grisaceo\n");
		
		Aves a4 = new Aves ("Nico","Canario Amarillo",2,(float) 0.50,", Plumaje: Amarillo\n");
		
		Aves a5 = new Aves ("Pedro","Cardenal Cresta Roja",3,(float) 1.60,", Plumaje: Rojo, Blanco y Negro\n");
		
		Felinos l1 = new Felinos ("Simba","Leon Africano",21,(float) 190,", Pelaje: Oro Brillante\n");
		
		Felinos l2 = new Felinos ("Cheetara","Guepardo",19,(float) 130,", Pelaje: Oro con manchas negras\n");
		
		Felinos l3 = new Felinos ("Diego","Tigre",20,(float) 200,", Pelaje: Naranja Rayado\n");

		Felinos l4 = new Felinos ("Kenny","Tigre blanco",17,(float) 160,", Pelaje: Blanco Rayado\n");
		
		Felinos l5 = new Felinos ("Danni","Puma",13,(float) 64,", Pelaje: Beige blanquecino\n");
		
		Primates p1 = new Primates ("Jorge","Chimpance",25,(float) 37,", Color: Marron claro\n");
		
		Primates p2 = new Primates ("Julien","Lemur",20,(float) 2.2,", Color: Gris anillado\n");
		
		Primates p3 = new Primates ("Crystal","Mono Capuchino",12,(float) 1.5,", Color: Marron oscuro\n");
		
		Primates p4 = new Primates ("Kala","Gorila",40,(float) 180,", Color: Negro\n");
		
		Primates p5 = new Primates ("Kerchak","Gorila espalda plateada",32,(float) 200,", Color: Negro y Gris\n");
		
		
			ArrayList <Aves> Aves = new ArrayList<Aves>();
		Aves.add(a1);
		Aves.add(a2);
		Aves.add(a3);			
		Aves.add(a4);
		Aves.add(a5);
		
			ArrayList <Primates> Primates = new ArrayList<Primates>();
		Primates.add(p1);
		Primates.add(p2);
		Primates.add(p3);
		Primates.add(p4);
		Primates.add(p5);
		
			ArrayList <Felinos> Felinos = new ArrayList<Felinos>();
		Felinos.add(l1);
		Felinos.add(l2);
		Felinos.add(l3);
		Felinos.add(l4);
		Felinos.add(l5);
		
			ArrayList <Animal> Herviboros = new ArrayList <Animal>();
		//Aves
		Herviboros.add(a1);
		Herviboros.add(a2);
		Herviboros.add(a3);
		Herviboros.add(a4);
		Herviboros.add(a5);
		
		//Primates
		Herviboros.add(p1);
		Herviboros.add(p2);
		Herviboros.add(p3);
		Herviboros.add(p4);
		Herviboros.add(p5);
		
			ArrayList <Animal> Carnivoros = new ArrayList <Animal>();
		//Felinos
		Carnivoros.add(l1);
		Carnivoros.add(l2);
		Carnivoros.add(l3);
		Carnivoros.add(l4);
		Carnivoros.add(l5);
		
		
		int opcion=5;
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		
		while(opcion!=4)
		{
		System.out.println("|=======================================|");
		System.out.println("|Bienvenido a ZooPoo, Seleccione opcion |");
        System.out.println("|       1. Mostrar Aves                 |");
        System.out.println("|       2. Mostrar Primates             |");
        System.out.println("|       3. Mostrar Felinos              |");
        System.out.println("|       4. Mostrar Herviboros           |");
        System.out.println("|       5. Mostrar Carniboros           |");
        System.out.println("|       6. Agregar Ave                  |");
        System.out.println("|       7. Agregar Primate              |");
        System.out.println("|       8. Agregar Felino               |");
        System.out.println("|       9. Salir                        |");
        System.out.println("|    *Apriete un numero para escoger*   |");
        System.out.println("|=======================================|");
        opcion = sn.nextInt();
        
        Scanner Lectura = new Scanner(System.in);
        switch (opcion) {
        
        case 1:
        	System.out.println("Mostrando Aves...");
        	System.out.println(Aves);
        	break;
        case 2:
        	System.out.println("Mostrando Primates...");
        	System.out.println(Primates);
        	break;
        case 3:
        	System.out.println("Mostrando Felinos...");
        	System.out.println(Felinos);
        	break;
        case 4:
        	System.out.println("Mostrando Herviboros...");
        	System.out.println(Herviboros);
        	break;
        case 5:
        	System.out.println("Mostrando Carnivoros...");
        	System.out.println(Carnivoros);
        	break;
        case 6:
        	System.out.println("Agregue Ave con sus atributos.");
        		System.out.println("Inserte Nombre:");
        		String nombre = Lectura.next();
        		System.out.println("Inserte raza");
        		String raza = Lectura.next();
        		System.out.println("Inserte Edad");
        		int edad = Lectura.nextInt();
        		System.out.println("Inserte Peso");
        		float peso = Lectura.nextFloat();
        		System.out.println("Inserte Plumaje");
        		String plumaje = Lectura.next();
        		Aves Ave_nueva = new Aves(nombre,raza,edad,peso,plumaje);
        		Aves.add(Ave_nueva);
        		Herviboros.add(Ave_nueva);
        		System.out.println("Agregaste Ave y nuevo Herviboro:" + Ave_nueva);
        	break;
        case 7:
        	System.out.println("Agregue Primate con sus atributos.");
    			System.out.println("Inserte Nombre:");
    			nombre = Lectura.next();
    			System.out.println("Inserte raza");
    			raza = Lectura.next();
    			System.out.println("Inserte Edad");
    			edad = Lectura.nextInt();
    			System.out.println("Inserte Peso");
    			peso = Lectura.nextFloat();
    			System.out.println("Inserte Color");
    			String color = Lectura.next();
    			Primates Primate_nuevo = new Primates(nombre,raza,edad,peso,color);
    			Primates.add(Primate_nuevo);
    			Herviboros.add(Primate_nuevo);
    			System.out.println("Agregaste Primate y Herviboro:" + Primate_nuevo);
        	break;
        case 8:
        	System.out.println("Agregue Felino con sus atributos.");
				System.out.println("Inserte Nombre:");
				nombre = Lectura.next();
				System.out.println("Inserte raza");
				raza = Lectura.next();
				System.out.println("Inserte Edad");
				edad = Lectura.nextInt();
				System.out.println("Inserte Peso");
				peso = Lectura.nextFloat();
				System.out.println("Inserte Color");
				String pelaje = Lectura.next();
				Felinos Felino_nuevo = new Felinos(nombre,raza,edad,peso,pelaje);
				Felinos.add(Felino_nuevo);
				Carnivoros.add(Felino_nuevo);
				System.out.println("Agregaste Felino y Herviboro:" + Felino_nuevo);
        	break;
        case 9:
        	salir=true;
        	break;
        default:
        	System.out.println("Opcion Incorrecta, Intente de nuevo");
        	}
		}   
	}
}