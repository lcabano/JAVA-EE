package if_anidados;

import java.util.Scanner;

public class if_anid {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int nota;
		//int nota = 66;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese la nota: ");
		nota= reader.nextInt();						
		System.out.println("ingreso el número: ");
		
		System.out.println(nota);
		if(nota >90) {
			System.out.println("Grade A");
		}else if(nota>75 ){
			System.out.println("Grade B");
		}else if(nota>60) {
			System.out.println("Grade C");
		}else if(nota>40) {
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
		}
		
		
	}

	

}
