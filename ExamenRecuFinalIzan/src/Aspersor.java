
import java.io.Serializable;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author WEB1-32
 */
public class Aspersor implements Comparable, Serializable {

    //Declaracion attributos
    private String id;
    private String zona;
    private int caudal;
    private static int count = 0;
    private static int count2 = 0;
    private boolean activo;

    public Aspersor(String zona, String caudal) throws Exception {
        this.setId();
        this.setZona(zona);
        this.setCaudal(caudal);
        this.activo = false;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = ("AS_" + this.count2 + this.count);//De esta forma mantenemos el id como AS_00 con 2 digitos numericos
        upcount();
    }

    public void upcount() {
        //Como necesitamos dos digitos numericos
        if (this.count < 10) {//Si el primero es menor o igual a 10 seguimos sumandole

            if (this.count == 9) {//Cuando llegue a 9 lo reseteamos 
                this.count = 0;
            }
            this.count++;

        } else if (this.count2 < 10) {//Añadimos al segundo digito 1 cuando el primero sea 10
            this.count2++;
        } else {
            System.out.println("Maximo alcanzado");//El maximo seran 99
        }
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) throws Exception {//Comprobamos que la zona indicada sea correcta
        if (zona.equalsIgnoreCase("norte") || zona.equalsIgnoreCase("sur") || zona.equalsIgnoreCase("este") || zona.equalsIgnoreCase("oeste")) {
            this.zona = zona;
        } else {
            System.out.println("Fallo al setear zona");
            throw new Exception("Zona invalida, solo puede ser, sur,este,norte u oeste");
        }
    }

    public int getCaudal() {
        return caudal;
    }

    public void setCaudal(String caudal) throws Exception {
        
        int res = 0;

        for (int i = 0; i < caudal.length(); i++) {//Comprobamos que el caudal sea un numero

            char c = caudal.charAt(i);
            if (!Character.isDigit(c)) {
                System.out.println("Fallo al setear caudal");
                throw new Exception("El caudal solo deben ser numeros.");
            }
            else{
                res += c - '0';
            }
        }
        this.caudal = res;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aspersor other = (Aspersor) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + "," + zona + "," + caudal + "," + activo;
    }

    @Override
    public int compareTo(Object obj) {
        Aspersor con = (Aspersor) obj;
        return this.caudal - con.getCaudal();
    }
}
