import java.util.Scanner;

public class Gestor {
    public void menu() {
        Scanner sc = new Scanner(System.in);

        boolean terminar = true;

        while(terminar) {
            System.out.print("¿Qué quieres hacer? ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("1. Prueba");
                    break;

                case 2:
                    System.out.println("2. Prueba");
                    TestConectividad tc = new TestConectividad();

                    tc.conectividad();
                    break;

                case 3:
                    terminar = false;
                    break;
            }
        }
    }
}
