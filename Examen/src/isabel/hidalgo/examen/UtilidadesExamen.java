package isabel.hidalgo.examen;

import java.util.Scanner;

public class UtilidadesExamen {
	
	public static int pideDatoNumerico (String texto) {//podría habelo cogido de la clase Utilidades/inicio /funciones, así repaso
		System.out.println(texto);					//en Strin texto va lo que le pido por consola por eso es un String y lo que guardo en variable 													es el int numero
		Scanner scan =new Scanner (System.in);
		int numero =scan.nextInt();
		return numero;
	}

	public static int [] crearArray () {
		int size =0;
		do {
			size=pideDatoNumerico("Introduce tamaño del array"); //El tamaño del array el usuario lo introduce por consola y luego también rellena 
		} while(size<1||size>10);															//por consola los valores del array
		int []numeros = new int [size];
		for (int i=0;i<size;i++) {
		numeros [i]= pideDatoNumerico ("Introduce el valor de las posiciones del array");
		Scanner scan = new Scanner (System.in);
		}
		return numeros;	//nos tiene que devolver uno por uno los valores de cada posición del array
	}
	
	public static void mostrarArray(int []numeros) {//poner como hemos llamado al array en el main
		for (int i=0; i<numeros.length; i++) {
		System.out.println (numeros[i]);			
		}
	}
	//es más fácil hacerlo con un for each
//	public static void mostrarArray2(int[] numeros) {
//		for (int numero : numeros) {
//			System.out.println(numero);
//		}
//	}
	
	
	
	public static double calcularPromedio (int[] numeros) {
		double promedio=0;
		int suma= 0; // la utilizamos para calcular la suma de todos los números del Array
		for (int numero:numeros) {//el array es int de numeros
			suma+=numero;
		}
		return promedio=suma/numeros.length; //el promedio es la suma de todos los números del array entre la longitud del array
		}
	
	public static double calcularPromedio2 (int[]numeros) {
		double promedio=0;
		int suma=0;
		for (int i=0;i<numeros.length;i++) {
			suma+=numeros[i];
		promedio=(double)suma/numeros.length; //con el double entre paréntesis convertidos el int suma a doucle y luedo lo dividimos entre la 	longitud del array
		}return promedio;
	}
			
    public static int[] encontrarExtremos (int[] numeros){
        int [] extremos = new int[2];//Este arreglo va a almacenar los dos valores que se buscan: el máximo y el mínimo.
        int maximoValor = Integer.MIN_VALUE; //	se inicializa con Integer.MIN_VALUE, que es el valor más bajo que un entero puede tener en Java. 												Esto garantiza que cualquier número en el arreglo será mayor que este valor.
        int minimoValor = Integer.MAX_VALUE; //lo mismo ocurre aquí
        for (int numero : numeros) {
            if (numero>maximoValor){
                maximoValor = numero;//aquí se va guardando el valor máximo
            }
            if (numero<minimoValor){
                minimoValor = numero;//aquí se va guardando el valor mínimo
            }
        }

        extremos[0]= maximoValor;
        extremos[1]= minimoValor;
        //int [] extremosBis = {maximoValor,minimoValor};
        //return new int[] {maximoValor,minimoValor};
        return extremos;
    }

    public static int[] filtrarMayoresQuePromedio (int[] numeros, double promedio){ //comparar cada número del array con el promedio
        int contador = 0;//para saber cuantos números son mayores que el promedio, lo acumulo en esta variable

        // String numerosString = "";
        // for (int numero : numeros) {
        //     if(numero>promedio){
        //         numerosString += numero+";"; 
        //     }
        // }
        // "8;9;11;".split(";");

        for (int numero : numeros) {//recorro el array
            if(numero>promedio){
                contador++;//si el número es mayor que el promedio, incremento el contador
            }
        }
        
        int[] mayoresPromedio = new int[contador];//creo un array con el tamaño del contador
        int posicionArray = 0;//para ir guardando los números que son mayores que el promedio
        for (int numero : numeros) {//recorro el array
            if(numero>promedio){//si el número es mayor que el promedio
                mayoresPromedio[posicionArray++] = numero;//guardo el número en la posición del array mayoresPromedio
                //posicionArray++;
            }
        }

        return mayoresPromedio;//devuelvo el array con los números mayores que el promedio
    }
}