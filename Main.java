package PROG;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciamos al trabajador
		Trabajador trabajador1 = new Trabajador();
		//Damos valor a las variables a través de los setters
		trabajador1.setNombre("Alfonso");
		trabajador1.setCiudad("Cadiz");
		trabajador1.setSalarioBruto(24000.9f);
		trabajador1.setContratoTemporal(false);
		//Sacamos la ficha del trabajador
		System.out.println(trabajador1.fichaTrabajador());
		//Instanciamos la clase hija de la cuestión 2
		Hija hija1 = new Hija();
		//Con sobreescritura de métodos empleamos saludar que será el de la clase hija
		hija1.Saludar();
		//Instanciamos a los deportistas, futbolistas y atletas
		Futbolista futbolista1 = new Futbolista();
		Futbolista futbolista2 = new Futbolista();
		Futbolista futbolista3 = new Futbolista();
		Deportista deportista1 = new Deportista();
		Deportista deportista2 = new Deportista();
		Atleta atleta1 = new Atleta();
		Atleta atleta2 = new Atleta();
		Atleta atleta3 = new Atleta();
		//Creamos un array de deportistas
		Deportista deportistas[]= {futbolista1, atleta1, deportista1, futbolista2, deportista2, atleta2, atleta3, futbolista3};
		
		//Con el bucle for recorremos el array
		for(int i = 0; i<=7; i++) {
			deportistas[i].jugar();//Gracias al polimorfismo por herencia nos muestra como juega cada uno si tiene método, sino emplearía el del padre
		}
	
	}


}
