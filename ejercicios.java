package PracticaJava1;

public class Practica {

///////////////////EJERCICIO 1//////////////////////////
// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
// Revisar si es un triángulo válido

    public static void main(String[] args) {
        double area = calcularArea(6, 8, 12);
        System.out.println("El área del triángulo es: " + area); //El área del triángulo es: 21.330729007701542

    }
    
    public static double calcularArea(double a, double b, double c) {
        // Verificar si es un triángulo válido
        if (a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (b + c) <= a || (c + a) <= b) {
            throw new IllegalArgumentException("Los lados ingresados no forman un triángulo válido.");
        }

        // Calcular semiperímetro
        double s = (a + b + c) / 2;

        // Calcular área utilizando fórmula de Herón
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }

///////////////////EJERCICIO 2//////////////////////////
// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
// Utilizar PI de la libreria de Java

        public static void main(String[] args) {
            double radio = 5;
            areaYCircunferencia(radio);
        }
        public static void areaYCircunferencia(double radio){
            double area = Math.PI * (radio * radio);
            double perimetro = Math.PI *(radio + radio);

            System.out.println("El area del circulo es: " + area);
            System.out.println("La circunferencia del circulo es: " circunferencia);
        }
///////////////////EJERCICIO 3//////////////////////////
 // 3 Escribir un metodo que muestre por consola la hora del sistema
// Utilizar e investigar la libreria de Java

    public static void main(String[] args) {
	        mostrarHora();
	    }
    public static void mostrarHora() {
	        LocalTime horaActual = LocalTime.now(); //.now() contiene la hora actual del sistema
	        System.out.println("La hora actual del sistema es: " + horaActual);
	  }

///////////////////EJERCICIO 4//////////////////////////
// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
// ej 3600 = "1 hora = 60 min = 3600 seg"

public class Practica {
    public static void main(String[] args) {
        int segundos = 4000; //segundos ingresados
        String resultado = convertirSegundos(segundos);
        System.out.println(resultado);

        int minutosRedondeados = convertirSegundosToMinutos(segundos);
        System.out.println("Minutos: " + minutosRedondeados);
        System.out.println("Segundos: " + segundos);
    }

    public static String convertirSegundos(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos %= 60;

        // redondear las horas al entero más cercano
        if (minutos > 29) {
            horas++;
        }

        String resultado ="horas: " + horas;
        return resultado;
    }

    public static int convertirSegundosToMinutos(int segundos) {
        int minutos = (int) Math.round(segundos / 60.0);
        return minutos;
    }   //Resultado:
    }    //horas: 1
        //Minutos: 67
        //Segundos: 4000

///////////////////EJERCICIO 5//////////////////////////
//Escribir un metodo para encontrar el volumen de una esfera dado el radio

public class Practica {
public static void main(String[] args) {
	double radio = 2.5;
	double volumen = volumenEsfera(radio);
	System.out.println("El volumen de la esfera cuyo radio es: " + radio + " seria " + volumen);
	  }
public static double volumenEsfera(double radio) {
    double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    return volumen;

}}
///////////////////EJERCICIO 6//////////////////////////
//Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura V=1/3hπr²
public class Practica {
public static void main(String[] args) {
	double radio = 5.0;
	double altura = 10.0;
	double volumen = volumenCono(radio, altura);
	System.out.println("El volumen del cono es: " + volumen);
	}
public static double volumenCono(double radio, double altura) {
    double volumen = (1.0/3.0) * Math.PI * Math.pow(radio, 2) * altura;
    return volumen;
} }

///////////////////EJERCICIO 7//////////////////////////
//Encontrar el area superficial de un cubo dado un lado a
public class Practica {
    public static void main(String[] args) {
        double a = 5.5; // Lado del cubo
        double area = aSuperfCubo(a);
        System.out.println("El área superficial del cubo es " + area);
    }

    public static double aSuperfCubo(double a) {
        double area = 6 * Math.pow(a, 2);
        return area;
    }

///////////////////EJERCICIO 8//////////////////////////
//Escribir un metodo para descubrir si un año ingresado es bisiesto o no
public class Practica {
    public static void main(String[] args) {
        int anio = 2024; // año ingresado
        if (esBisiesto(anio)) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
    }

    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
} // 2024 es un año bisiesto

}
}