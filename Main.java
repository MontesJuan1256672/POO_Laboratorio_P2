class Main{
	public static void main(String args[]){
		String opc;//variable de control para condicional if
		boolean seguir = true;//variable de control para el ciclo while
		
		//declaración de arreglo de objetos clase Estudiante
		Estudiante als[] = new Estudiante[5];
		
		System.out.println("\n");
		
		
		while(seguir){
			
			opc = CapturaEntrada.capturaString("Desea capturar informacion: \nS / N\n");
			if(opc.equals("s") || opc.equals("S")){
						
				//inicialización de los elementos del arreglo
				System.out.println("Ingrese los datos del alumno");
				for(int i = 0; i < als.length; i++){
					System.out.println("Alumno "+ (i+1) +": " );
					als[i] = new Estudiante(CapturaEntrada.capturaString("Indique nombre: "),
											CapturaEntrada.capturaEntero("Indique matricula: "),
											CapturaEntrada.capturaString("Indique materia: "),
											CapturaEntrada.capturaEntero("Indique calificacion: "),
											"");
					if(als[i].getCalificacion() < 60){
						als[i].estado = "Reprobado";
					}else{
						als[i].estado = "Aprobado";
					}
					System.out.println("\n");
				}
				
				//mostrar en pantalla la informacion de los 5 alumnos
				for(int i = 0; i < als.length; i++){
					System.out.println("Nombre alumno"+(i+1)+": "+als[i].getNombre());
					System.out.println("Matricula alumno"+(i+1)+": "+als[i].getMatricula());
					System.out.println("Materia alumno"+(i+1)+": "+als[i].getMateria());
					System.out.println("Calificacion alumno"+(i+1)+": "+als[i].getCalificacion());
					System.out.println("Estado alumno"+(i+1)+": "+als[i].getEstado());	
					System.out.println("\n");
				}
				
			}else{
				seguir = false;
			}
			/*
			Estudiante alumno1 = new Estudiante(CapturaEntrada.capturaString("Indique nombre: "),
												CapturaEntrada.capturaEntero("Indique matricula: "),
												CapturaEntrada.capturaString("Indique materia: "),
												CapturaEntrada.capturaEntero("Indique calificacion: "),
												"");

			if(alumno1.getCalificacion() < 60){
				alumno1.estado = "Reprobado";
			}else{
				alumno1.estado = "Aprobado";
			}
					
			//invocar getters
			System.out.println(alumno1.getNombre());
			System.out.println(alumno1.getMatricula());
			System.out.println(alumno1.getMateria());
			System.out.println(alumno1.getCalificacion());
			System.out.println(alumno1.getEstado());
			*/
			
			
		}		
	}
}