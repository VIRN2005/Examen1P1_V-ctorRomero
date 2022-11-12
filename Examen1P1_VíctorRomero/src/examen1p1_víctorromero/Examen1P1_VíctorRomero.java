package examen1p1_víctorromero;

import java.util.Scanner;
import java.security.SecureRandom;

public class Examen1P1_VíctorRomero {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Victor Romero - 12211079");

        int opcion;

        do {
            System.out.println("_____________________________________________________________ ");
            System.out.println(" ");
            System.out.println(">> MENU <<");
            System.out.println("----------------------- ");

            System.out.println("1 -> EJERCICIO 1 - DIVISORES PRIMOS");
            System.out.println("2 -> EJERCICIO 2 - CONTORNO DE PIRAMIDE");
            System.out.println("3 -> EJERCICIO 3 - VECINOS");
            System.out.println("4 -> EJERCICIO EXTRA - TRIANGULO PASCAL ");
            System.out.println("5 -> EJERCICIO EXTRA - TRIANGULO PASCAL <<PASO A PASO>>");
            System.out.println("6 -> SALIDA");
            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Ingrese su Opcion: ");
            opcion = leer.nextInt();
            System.out.println("=> La Opcion escojida es: " + opcion);
            System.out.println(" ");

            switch (opcion) {
                case 1: {
                    System.out.println(".: OPCION 1 :.");
                    System.out.println("DIVISIONES PRIMAS EN CURSO...");
                    System.out.println(" ");

                    System.out.print("> Ingrese el numero a DIVIDIR: ");
                    int num = leer.nextInt();

                    if (num <= 1) {
                        System.out.println("> Ingrese un numero mayor o igual que 1: ");
                        num = leer.nextInt();
                    }

                    System.out.println(">>Los números primos que dividen el número " + num + " es: " + primos(num));

                }
                break; // FIN EJERCICIO 1

                case 2: {
                    System.out.println(".: OPCION 2 :.");
                    System.out.println("--- EN CURSO...");
                    System.out.println(" ");

                    System.out.println("> Ingrese el numero para la Piramide: ");
                    int tamano = leer.nextInt();

                    System.out.println(" ");
                    contorno(tamano);
                }
                break; // FIN EJERCICIO 2

                case 3: {
                    System.out.println(".: OPCION 3 :.");
                    System.out.println("VECINOS EN CURSO...");
                    System.out.println(" ");

                    System.out.println("> Ingrese la cadena de Texto: ");
                    String palabra = leer.next().toLowerCase();

                    boolean repetir = true;

                    for (int i = 0; i < palabra.length(); i++) {
                        char lt = palabra.charAt(i);
                        if ((int) lt >= 97 && (int) lt <= 122) {
                            repetir = false;
                        } else {
                            System.out.println("> Ingrese la cadena de Texto VALIDA: ");
                            palabra = leer.next().toLowerCase();
                            repetir = true;
                        }
                    }
                    if (repetir = true) {
                        System.out.println("CADENA RESULTANTE: " + vecinos(palabra));
                    } else {
                        break;
                    }

                }
                break; // FIN EJERCICIO 3    

                case 4:{
                    System.out.println(".: OPCION 4 :.");
                    System.out.println("PASCAL EN CURSO...");
                    System.out.println(" ");

                    System.out.println("Ingrese un numero para el tamano: ");
                    int filas = leer.nextInt();

                    System.out.println("Triangulo Pascal: ");
                    pascal(filas);
                }break;

                case 5:{
                    System.out.println(".: OPCION 4 :.");
                    System.out.println("PASCAL EN CURSO...");
                    System.out.println(" ");
                    
                    System.out.println("Ingrese un numero para el tamano: ");
                    int N = leer.nextInt();

                    while (N <= 0) {
                        System.out.println("ERROR 404!");
                        System.out.println(">>Ingrese un tamano valido: ");
                        N = leer.nextInt();
                    }
                    pascal2(N);
                }break;

                default: {
                    System.out.println("LAB COMPLETED!");
                    System.out.println("TENGAN UN BUEN DIA CARLOS & EDUARDO!");
                    System.out.println(" ");

                }

            }// FIN SWITCH

        } while (opcion != 5); // FIN DO WHILE
    }

    public static String primos(int numero) {

        String Num_Primos = " ";

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                Num_Primos += (Integer.toString(i) + " ");
            }
        }

        return Num_Primos;
    }

    public static void contorno(int tamano) {
        for (int i = 0; i < (tamano + 1) / 2; i++) {
            for (int j = 0; j < tamano; j++) {
                //System.out.print("*");
                /* if (j == (((tamano - 1) / 2) - i) || j == ((tamano - 1) / 2) + i || j==(tamano - 1) / 2) {
                    System.out.print("+");
                }*/
                if (i == (((tamano - 1) / 2) - 1) && (j > 0) && (j < (tamano - 1))) {
                    System.out.print("+");
                } else if (i == ((tamano + 1) / 2) - 1) {
                    System.out.print("*");
                } else if (j == (((tamano - 1) / 2) - i) || j == ((tamano - 1) / 2) + i) {
                    System.out.print("+");
                } else if (j < (((tamano - 1) / 2) - i) || j > ((tamano - 1) / 2) + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println("");// For J
            /*for (int j = 1; j <= tamano; j++) {
                for (int v = 1; v <= tamano - j; v++) {
                    System.out.print("*");
                }// For Interno
                for (int v = 1; v <= j; v++) {
                    System.out.print(" *");
                }
                System.out.println(" ");
            }*/

        }
    }

    public static String vecinos(String palabra) {
        String palabra2 = " ";
        SecureRandom random = new SecureRandom();
        int rand = random.nextInt(2);

        System.out.println("El numero generado es: " + rand);

        if (rand == 0) {
            for (int i = 0; i < palabra.length(); i++) {
                char lt = palabra.charAt(i);
                int lt2 = (int) lt - 1;
                if (lt2 >= 97 && lt2 <= 122) {
                    char letras = (char) lt2;
                    palabra2 += letras;
                }
            }

        } else if (rand == 1) {
            for (int i = 0; i < palabra.length(); i++) {
                char lt = palabra.charAt(i);
                int lt2 = (int) lt + 1;
                if (lt2 >= 97 && lt2 <= 122) {
                    char letras = (char) lt2;
                    palabra2 += letras;
                }
            }
        }
        return palabra2;
    }

    public static void pascal(int filas) {
        int[] a = new int[1];
        for (int i = 1; i <= filas; i++) {
            int[] x = new int[i];
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == (i - 1)) {
                    x[j] = 1;
                } else {
                    x[j] = a[j] + a[j - 1];
                }
                System.out.print(x[j] + " ");
            }
            a = x;
            System.out.println();
        }
    }

    public static int factorial(int N) {
        int facto = 1;
        for (int i = 1; i <= N; i++) {
            facto = facto * i;
        }
        return facto;
    }

    public static int permutacion(int n, int r) {
        int permu = 0;
        permu = factorial(n) / factorial(n - r);

        return permu;
    }

    public static int combinacion(int n, int r) {
        int combi = 0;
        combi = permutacion(n, r) / factorial(r);

        return combi;

    }

    public static void pascal2(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                int n = i;
                int r = j;
                System.out.print("[" + combinacion(n, r) + "]");
            }
            System.out.println("");
        }
    }

}
