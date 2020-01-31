import java.util.Scanner;

public class Algoritmo1 {
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        int matriz[][];
        int a, b;
        System.out.println("Tamaño matriz");
        a = read.nextInt();
        b = read.nextInt();
        matriz = new int[a][b];
        llenado(matriz);
    }
    
    public static void llenado(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Posicion: "+"["+i+"]["+j+"]");
                matriz[i][j] = read.nextInt();
            }
        }
        llenadoVector(matriz);
    }
    
    static void llenadoVector(int matriz[][]) {
        int index = matriz.length + matriz[0].length, m = 0;
        int vector[] = new int[index];
        
        System.out.println("llenando vector...");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vector[m] = matriz[i][j];
                m++;        
            }
        }
        System.out.println("Se ha llenado satisfactoriamente");
        System.out.println("Su vector es: ");
        for (int i = 0; i < index; i++) {
            System.out.println("Posicion: "+"["+i+"]: "+ vector[i]);
        }
    }
}
