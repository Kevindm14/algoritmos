
import java.util.Scanner;

public class Algoritmo2 {

    static Scanner read = new Scanner(System.in);
    int arr[];
    int tope;

    public Algoritmo2(int size) {
        arr = new int[size];
        tope = -1;
    }

    void push(int valor) {
        if (tope == arr.length - 1) {
            System.out.println("Overflow");
        } else {
            arr[++tope] = valor;
        }
    }
    
    int pop() {
        if (tope < 0) {
            System.out.println("Underflow");
            return 0;
        } else {
            return arr[tope--];
        }
    }
    
    int top() {
        if (tope != -1) {
            return arr[tope];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int sze, decision, dato;
        System.out.print("Digite tamaño de la pila: ");
        sze = read.nextInt();
        Algoritmo2 pilas = new Algoritmo2(sze);
        System.out.println("1.Agregar\n2 Eliminar\n3 Traer tope");
        decision = read.nextInt();

        switch (decision) {
            case 1:
                System.out.print("Digite dato a agregar: ");
                dato = read.nextInt();
                pilas.push(dato);
                break;
            case 2:
                pilas.pop();
            default:
                System.out.println("Ingrese numero valido");
        }
        System.out.println("El tope de la pila es: "+pilas.top());
    }
}
