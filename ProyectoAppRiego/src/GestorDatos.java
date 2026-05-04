
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author WEB1-32
 */
public class GestorDatos {

    public static final String FICHEROSER = "ficheros/riego_backup.ser";

    public static void guardarCopiaSeguridad(SistemaRiego sistema) {

        FileOutputStream fo = null;//Iniciamos los recursos
        BufferedOutputStream bo = null;//
        ObjectOutputStream oo = null;//

        try {
            fo = new FileOutputStream(FICHEROSER);//Le damos los valores de forma que ObjectOutput(BufferedOutput(FIleOutput))
            bo = new BufferedOutputStream(fo);
            oo = new ObjectOutputStream(bo); //lanza excepción. Especificar el fichero. Creamos el flujo de datos externo            
            oo.writeObject(sistema);//Escribimos los datos de sistema
        } catch (IOException ex) {//Manejo de errores
            System.out.println("Error al escribir");
            ex.printStackTrace();//Muestra donde se produjo el error(?
        } finally {//Liberamos la memoria
            try {
                if (oo != null) {
                    oo.close();
                }
                if (bo != null) {
                    bo.close();
                }
                if (fo != null) {
                    fo.close();
                }
            } catch (IOException ex) {//Manejo de errores
                System.out.println("error al cerrar el fichero");
            }
        }
    }

    public static SistemaRiego cargarCopiaSeguridad() {

        ObjectInputStream leer = null;//Iniciamos el lector de bytes
        File f = new File(FICHEROSER);//Iniciamos el fichero, en este caso uno serializado, asi evitamos pueda ser modificado externamente
        try {
            if (f.exists()) {//Si hay fichero...
                leer = new ObjectInputStream(new FileInputStream(f)); //Abrimos el archivo, traducimos de bytes a objetos y lo guardamos en leer
                return (SistemaRiego) leer.readObject();
            } else {//Manejo de errores
                System.out.println("El fichero no existe");
            }
        } catch (Exception e) {//Manejo de errores
            System.out.println("Error al trabajar con los ficheros");
            e.printStackTrace();
        } finally {
            try {//Liberamos memoria
                if (leer != null) {
                    leer.close();
                }
            } catch (IOException e) {//Manejo de errores
                System.out.println("Error al cerrar");
            }
        }
        return new SistemaRiego();
    }

    public static void exportarInformeTexto(SistemaRiego sistema, String zona) {
        String nombreFichero = "ficheros/informe_" + zona + ".txt";
        // Obtenemos la lista ya ordenada
        ArrayList<Aspersor> lista = sistema.getListaAspersores();

        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreFichero))) {
            pw.println("INFORME DE RIEGO - ZONA: " + zona.toUpperCase());
            pw.println("-------------------------------------------");

            for (Aspersor a : lista) {
                // Filtros: misma zona y caudal superior a 50
                if (a.getZona().equalsIgnoreCase(zona) && a.getCaudal() > 50) {
                    pw.println(a.toString());
                }
            }
            System.out.println("Informe exportado en: " + nombreFichero);
        } catch (IOException e) {
            System.out.println("Error al exportar informe ");
        }
    }
}
