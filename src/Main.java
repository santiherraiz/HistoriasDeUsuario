public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();

        opcion();

        gestor.menu();
    }

    public static void opcion() {
        System.out.println("MENÚ");
        System.out.println("=================");
        System.out.println("1. Prueba");
        System.out.println("2. Test conectividad");
        System.out.println("3. Salir");
        System.out.println("=================");
    }
}
