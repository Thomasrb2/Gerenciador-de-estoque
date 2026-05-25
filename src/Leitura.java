import java.util.Scanner;

public class Leitura{
    private static Scanner scan = new Scanner(System.in);

    public static String lerTexto() {
        return scan.nextLine();
    }

    public static int lerInteiro() {
        return scan.nextInt();
    }

    public static void fechar() {
        scan.close();
    }
} 
    

