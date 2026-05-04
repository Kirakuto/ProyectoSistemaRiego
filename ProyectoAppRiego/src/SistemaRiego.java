
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author WEB1-32
 */
public class SistemaRiego implements Serializable {

    private ArrayList<Aspersor> aspersores = new ArrayList<Aspersor>();
    private boolean valvulaGeneral = true;

    public SistemaRiego() {
    }

    public SistemaRiego(ArrayList<Aspersor> aspersores, boolean valvulaGeneral) {
        this.aspersores = aspersores;
        this.valvulaGeneral = valvulaGeneral;
    }

    public boolean isValvulaGeneral() {
        return valvulaGeneral;
    }

    public void setValvulaGeneral(boolean valvulaGeneral) {
        this.valvulaGeneral = valvulaGeneral;
    }

    public ArrayList<Aspersor> getListaAspersores() {//Devuelve una lista ordenada de aspersores

        ArrayList<Aspersor> aux = new ArrayList(this.aspersores);
        Collections.sort(aux);
        return aux;
    }

    public void agregarAspersor(String zona, String caudal) throws Exception {//Crea aspersores

        int caudalA = Integer.parseInt(caudal);
        if (caudalA < 0) {
            throw new Exception("El caudal no puede ser negativo");
        }

        // Buscamos el ID más alto existente para sincronizar los contadores de Aspersor
        int maxIdEncontrado = -1;
        for (Aspersor a : aspersores) {
            // Extraemos la parte numérica (asumiendo formato "AS_XX")
            try {
                int numId = Integer.parseInt(a.getId().substring(3));
                if (numId > maxIdEncontrado) {
                    maxIdEncontrado = numId;
                }
            } catch (Exception e) {
                System.out.println("Formato erroneo");
            }
        }

        // Si encontramos aspersores, actualizamos los contadores estáticos de la clase Aspersor
        // para que el siguiente que se cree sea correcto
        if (maxIdEncontrado != -1) {
            int siguiente = maxIdEncontrado + 1;
            // Sincronizamos con tu sistema de count (unidades) y count2 (decenas)
            Aspersor.setCount2(siguiente / 10); // Decenas
            Aspersor.setCount(siguiente % 10);  // Unidades
        }

        Aspersor nuevo = new Aspersor(zona, caudal);
        aspersores.add(nuevo);
    }

    /**
     * Borra el aspersor cuya id sea la indicada
     *
     * @param id
     * @return
     */
    public boolean borrarAspersor(String id) {

        for (Aspersor a : aspersores) {//Recorre la coleccion en busca de la id
            if (a.getId().equals(id)) {
                aspersores.remove(a);
                return true;
            }

        }
        return false;
    }

    /**
     * Permite cambiar el estado de un aspersor cuya id coincida
     *
     * @param id
     * @param estado
     * @return
     * @throws Exception
     */
    public boolean modificarAspersor(String id, boolean estado) throws Exception {

        for (Aspersor a : aspersores) {
            if (a.getId().equals(id)) {
                a.setActivo(estado);
                return true;
            }
        }
        throw new Exception("NO existe aspersor con esta id");//Si no existe, salta excepcion
    }

    /**
     * Permite calcular el consumo total, si la valvula esta cerrada, este sera
     * de 0
     *
     * @return
     */
    public int calcularConsumoTotal() {

        int res = 0;

        if (valvulaGeneral == false) {

            return 0;

        } else {

            for (Aspersor a : aspersores) {//Recorre la coleccion y va sumando al resultado los valores del caudal de aspersores activos

                if (a.isActivo() == true) {

                    res += a.getCaudal();

                }
            }
            return res;
        }
    }

}
