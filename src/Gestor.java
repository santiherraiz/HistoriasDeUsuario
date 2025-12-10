import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestor {
    public void menu() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Datos> datos = new ArrayList<>();

        boolean terminar = true;

        while(terminar) {
            System.out.print("¿Qué quieres hacer? ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("1. Crear incidencia");

                    System.out.println("¿Qué incidencia has tenido?");
                    String titulo = sc.nextLine();

                    Datos datos1 = new Datos( titulo, Estado.ABIERTO);
                    System.out.println("Incidencia creada");
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
