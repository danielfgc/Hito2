package PROG;
//Generamos clase abstracta para que no se pueda instanciar
public abstract class Padre {
	private String texto;
	private int numero;
	
	public Padre() {
		// TODO Auto-generated constructor stub
	}
	//Generamos método saludar
	public void Saludar() {
		System.out.println("Hola, soy el padre");
	}

}
