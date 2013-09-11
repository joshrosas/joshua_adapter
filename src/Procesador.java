package adapter;

public class Procesador {
	 public static final int SUMA = 1;
	 public static final int RESTA = 2;
	 public static final int MULTIPLICACION = 3;
	 public static final int DIVISION = 4;
	 public static int operaciones(
	   int valor1,
	   int valor2,
	   int operacion) {
	  int resultado = 0;
	  
	  switch(operacion) {
	   case SUMA:
	    resultado = valor1 + valor2;
	    break;
	   case RESTA:
	    resultado = valor1 - valor2;
	    break;
	   case  MULTIPLICACION:
		  resultado = valor1 *valor2;
		  break;
	   case DIVISION:
		   resultado = valor1/valor2;
		   break;
	  }
	  
	  return resultado;
	 }
	}