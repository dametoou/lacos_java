import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    int op = 0, resultado;
    System.out.println("Digite um valor: ");
    int v1 = leitor.nextInt();
    System.out.println("Digite outro valor: ");
    int v2 = leitor.nextInt();

    do {
        System.out.println("Calculadora: \n1 - Soma \n2 - Subtração \n3 - Multiplicação \n4- Divisão \n 0 - Sair");
        switch(op) {
            case 1: resultado = v1+v2; System.out.println("Resultado: " + resultado);break;
            case 2: resultado = v1-v2; System.out.println("Resultado: " + resultado);break;
            case 3: resultado = v1*v2; System.out.println("Resultado: " + resultado);break;
            case 4: resultado = v1/v2; System.out.println("Resultado: " + resultado);break;
        }
        op = leitor.nextInt();
    }
    while (op != 0);
        }
}