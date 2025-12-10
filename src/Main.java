import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Gestor gestor = new Gestor();

        opcion();
        gestor.menu();
    }

    public static void opcion() {
        System.out.println("MENÚ");
        System.out.println("=================");
        System.out.println("1. Crear incidencia");
        System.out.println("2. Test conectividad");
        System.out.println("3. Salir");
        System.out.println("=================");
    }

    public static ArrayList<Datos> leerCsv(){
        ArrayList<Datos> datos = new ArrayList<>();

        try{
            File file = new File("db.csv");

            if (!file.exists()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("db.csv"));
                bw.write("id,titulo,estado");
                bw.close();
            }

            BufferedWriter bw2 = new BufferedWriter(new FileWriter("db.csv", true));

            datos.forEach(d -> {
                try {
                    bw2.newLine();
                    bw2.write(d.toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return datos;
    }

    public static void escribirCSV(ArrayList<Datos> datos){
        try{
            File file = new File("db.csv");

            if (file.exists()){
                BufferedReader br = new BufferedReader(new FileReader(file));

                br.readLine();

                String linea;
                while ((linea = br.readLine()) != null){
                    Estado estado = Estado.ABIERTO;
                    if (!estado.equals("ABIERTO")){
                        estado = Estado.CERRADO;
                    }

                    datos.add(new Datos(linea.split(",")[1],estado));
                }

            } else {
                System.out.println("No existe");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
