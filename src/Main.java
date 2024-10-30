//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.InputMismatchException;
import java.util.Scanner;

class Metodos1 {
    public static double calculaPromedio(double suma) {
        double promedio;
        promedio = suma / 20;
        return promedio;
    }

    public static boolean esAprobado(double promedio) {
        boolean Aprobado = false;

        if (promedio >= 80 && promedio <= 100) {
            Aprobado = true;
        }
        return Aprobado;
    }

    public static void main(String[] args) {
        System.out.printf("Hola y bienvenid@!\n");
        double promedio, suma, calif;
        String aprobado="REPROBADO";
        boolean aprob;

        suma = 0;
        System.out.println("Ingresa las calificaciones del alumno");

        for (int i = 1; i <= 20; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Calificacion #" + i);
            calif = teclado.nextDouble();
            suma = suma + calif;
        }
        promedio = calculaPromedio(suma);
        aprob = esAprobado(promedio);
        if (aprob==true)
        {
            aprobado = "APROBADO.";
        }
        System.out.println("\nEl promedio final es de: " + promedio + "\nLo cual significa que el alumno fue " + aprobado);
    }
}
class Metodos2 {
        public static double IMC(double altura, double peso) {
            double IMC;
            IMC= (peso/(altura*altura));
            return IMC;
        }
        public static String Peso(double imc) {
            String Peso="";
            if (imc < 18.5) {
                Peso = ("BAJO PESO");
            }
            if (imc >= 18.5 && imc <= 24.9)
            {
                Peso=("PESO NORMAL");
            }
            if (imc >= 25 && imc <= 29.9)
            {
                Peso=("SOBREPESO");
            }
            if (imc >= 30 && imc <= 34.9)
            {
                Peso=("OBESIDAD TIPO 1");
            }
            if (imc >= 35 && imc <= 39.9)
            {
                Peso=("OBESIDAD TIPO 2");
            }
            if (imc >= 40)
            {
                Peso=("OBESIDAD TIPO 3");
            }
            return Peso;
        }
        public static void main(String[] args) {
            Persona p = new Persona();
            System.out.println("Hola y bienvenid@!\n");
            String resultados, pesodiag;
            
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese su altura en metros:");
                try
                {
                    p.altura = teclado.nextDouble();
                }
                catch(InputMismatchException caracterIncorrecto)
                {
                    System.out.println("Ingrese un dato numerico.");
                }
                System.out.println("Ingrese su peso en kilogramos:");
                try
                {
                    p.peso = teclado.nextDouble();
                }
                catch(InputMismatchException caracterIncorrecto)
                {
                    System.out.println("Ingrese un dato numerico.");
                }

            p.imc = IMC(p.altura, p.peso);
            pesodiag = Peso(p.imc);
            resultados=("Resultado de Diagnostico:\nAltura: "+p.altura+"\nPeso: "+p.peso+"\nIndice de Masa Corporal: "+p.imc+"\nDiagnostico: "+pesodiag);
            System.out.println(resultados);
        }
    }