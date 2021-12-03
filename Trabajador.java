package PROG;

public class Trabajador {
	//Declaramos las variables como privadas
	private	String nombre; 
	private	String ciudad;
	private	float salarioBruto;
	private	boolean contratoTemporal;
	
	public Trabajador() {
		// TODO Auto-generated constructor stub
	}
	//Empleamos getters y setters para encapsular

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public boolean isContratoTemporal() {
		return contratoTemporal;
	}

	public void setContratoTemporal(boolean contratoTemporal) {
		this.contratoTemporal = contratoTemporal;
	}
	public String fichaTrabajador() { //Sacamos la ficha del trabajador
		
		return "El trabajador "+getNombre()+" vive en "+getCiudad()+", su salario bruto es "+getSalarioBruto()+" y tiene un contrato temporal(true/false): "+isContratoTemporal()+".";
	}
}
