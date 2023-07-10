/*
 En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de métodos estáticos:
 dibujaCuadrado(): Este método recibe un número entero N, y dibujará un
cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 elMayorEs(): Este método recibe 3 números enteros y mostrará por consola cual es el
mayor. En caso de ser iguales lo deberá informar.
 elDiaEs(): Se espera que este método reciba un numero entero entre 1 y 7 que
corresponderá a un día de la semana, retornando el nombre que le corresponda, por
ejemplo: 1 Lunes, 2Martes, 3Miércoles, 4Jueves, 5Viernes, 6Sábado, 7
Domingo. Si recibe un valor distinto retornará “No existe ese día!!!”.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de Utilitario:
a) Dibujar un cuadrado de 5 elementos.
b) Mostrar el mayor entre (20,75 y 40)
c) Mostrar el nombre del día 5.
 */
package ejer5;


public class Utilitario {
    public static void dibujaCuadrado(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void elMayorEs(int a, int b, int c) {
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        if (a == b && b == c) {
            System.out.println("Los tres números son iguales");
        } else {
            System.out.println("El mayor es " + mayor);
        }
    }
    
    public static String elDiaEs(int num) {
        switch(num) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "No existe ese día!!!";
        }
    }
}
