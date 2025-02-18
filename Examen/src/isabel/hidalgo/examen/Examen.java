package isabel.hidalgo.examen;

public class Examen {

	public static void main(String[] args) {
		int[] numeros = UtilidadesExamen.crearArray(); // Así llamamos al método crearArray de la clase UtilidadesExamen
														// y creamos un array de números
		UtilidadesExamen.mostrarArray(numeros);// Tenemos que pasarle el array creado
		double promedio = UtilidadesExamen.calcularPromedio(numeros);
		System.out.println("El procedio es" + promedio);
		int[] extremos = UtilidadesExamen.encontrarExtremos(numeros);
		System.out.println("El valor máximo es: " + extremos[0] + "y el valor minimos es " + extremos[1]);

		int[] mayoresPromedio = UtilidadesExamen.filtrarMayoresQuePromedio(numeros, promedio);
		if (mayoresPromedio.length == 0) {
			System.out.println("No hay valores mayores que el promedio");
			} else {
			StringBuilder sb = new StringBuilder();// nos pemite concatenar cadenas de texto si no salta la posición de memoria
			for (int i = 0; i < mayoresPromedio.length; i++) {// tenemos que recorrer el array mayoresPromedio para
																// imprimirlo
				//sb.append(mayoresPromedio[i]);
				System.out.print(mayoresPromedio[i]);
				//if (i < mayoresPromedio.length - 1)para que no imprima la coma al final
				//sb.append("	");// AÑADIMOS UN TABULADOR SI NO ES EL ÚLTIMO VALOR
				//	System.out.println("Los valores mayores que el promedio son: " + mayoresPromedio);
			}
			
		}

	}

}
