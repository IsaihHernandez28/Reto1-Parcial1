import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number1;
        String number2;

        System.out.print("Captura Operación: ");
        String operation = scan.nextLine();

        switch (operation) {
            case "SUMA":
                System.out.print("Operando 1: ");
                number1 = scan.nextLine();
                int operando1 = Integer.parseInt(number1);
                System.out.print("Operando 2: ");
                number2 = scan.nextLine();
                int operando2 = Integer.parseInt(number2);
                System.out.println(operando1 + " + " + operando2 + " = " + (operando1+operando2));
                break;
            case "RESTA":
                System.out.print("Operando 1: ");
                number1 = scan.nextLine();
                int operando3 = Integer.parseInt(number1);
                System.out.print("Operando 2: ");
                number2 = scan.nextLine();
                int operando4 = Integer.parseInt(number2);
                System.out.println(operando3 + " - " + operando4 + " = " + (operando3-operando4));
                break;
            case "MULTIPLICACION":
                System.out.print("Operando 1: ");
                number1 = scan.nextLine();
                int operando5 = Integer.parseInt(number1);
                System.out.print("Operando 2: ");
                number2 = scan.nextLine();
                int operando6 = Integer.parseInt(number2);
                System.out.println(operando5 + " * " + operando6 + " = " + (operando5*operando6));
                break;
            case "DIVISION":
                System.out.print("Operando 1: ");
                number1 = scan.nextLine();
                int operando7 = Integer.parseInt(number1);
                System.out.print("Operando 2: ");
                number2 = scan.nextLine();
                int operando8 = Integer.parseInt(number2);
                System.out.println(operando7 + " / " + operando8 + " = " + (operando7/operando8));
                break;
            default:
                System.out.println("Operación no soportada");
                break;
        }
    }
}