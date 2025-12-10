import java.io.*;
import java.util.ArrayList;

public class prueba {

    static void main() {

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


        try{
            ArrayList<Datos> datos1 = new ArrayList<>();

            File file = new File("db.csv");

            if (file.exists()){
                BufferedReader br = new BufferedReader(new FileReader(file));

                br.readLine();

                String linea;
                while ((linea = br.readLine()) != null){
                    datos1.add(new Datos(Integer.parseInt(linea.split(",")[0]),linea.split(",")[1],linea.split(",")[2]=="true"));
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

}
