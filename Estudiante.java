class Estudiante{
	String nombre;
	int matricula;
	String materia;
	int calificacion;
	String estado;
	
	//contructor 
	public Estudiante (String nombre, int matricula, String materia, int calificacion, String estado){
		setNombre(nombre);
		setMatricula(matricula);
		setMateria(materia);
		setCalificacion(calificacion);
		setEstado(estado);
	}
	
	//setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public void setMateria(String materia){
		this.materia = materia;
	}
	
	public void setCalificacion(int calificacion){
		this.calificacion = calificacion;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	//getters
	public String getNombre(){
		return nombre;
	}
	
	public int getMatricula(){
		return matricula;
	}
	
	public  String getMateria(){
		return materia;
	}
	
	public int getCalificacion(){
		return calificacion;
	}
	
	public String getEstado(){
		return estado;
	}
}