package com.example.pro;
import javax.swing.*;
import java.util.Scanner;
public class pro {
    public static void main(String[] args){
        String Alumno;
        Alumno = JOptionPane.showInputDialog("Esbe tu nombre");

        JOptionPane.showMessageDialog(null, "Escriba sus cinco calificaciones ");

        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {

            array[i] = Double.parseDouble(JOptionPane.showInputDialog("calificacion:" + (i + 1)));
            if (array[i] >=10) {
            }
            else{
                JOptionPane.showMessageDialog(null, "El valor que agregaste no es el correcto tiene que ser un valor entre 10 a 100");
                return;
            }
        }
        double promedio;
        promedio = (array[0] + array[1] + array[2] + array[3] + array[4])/5;
        int Prom = (int)promedio;

        if (promedio <= 50 ){
            JOptionPane.showMessageDialog(null, "Nombre del estudiante: "+Alumno + "\n"+
                    "Calificacion 1: "+ array[0] + "\n"
                    + "Calificacion 2: "+ array[1]+ "\n"
                    + "Calificacion 3: " + array[2]+"\n"
                    + "Calificacion 4: " + array[3]+"\n"
                    + "Calificacion 5: " + array[4]+"\n"
                    + "Promedio: " + Prom +"\n"
                    + "Calificacion: " + "F" +"\n");
        }
        else if (promedio >= 51 && promedio <= 61 ){
            JOptionPane.showMessageDialog(null, "Nombre del estudiante: "+Alumno + "\n"+
                    "Calificacion 1: "+ array[0] + "\n"
                    + "Calificacion 2: "+ array[1]+ "\n"
                    + "Calificacion 3: " + array[2]+"\n"
                    + "Calificacion 4: " + array[3]+"\n"
                    + "Calificacion 5: " + array[4]+"\n"
                    + "Promedio: " + Prom +"\n"
                    + "Calificacion: " + "E" +"\n");
        }else if (promedio >= 61 && promedio <= 70 ){
            JOptionPane.showMessageDialog(null, "Nombre del estudiante: "+Alumno + "\n"+
                    "Calificacion 1: "+ array[0] + "\n"
                    + "Calificacion 2: "+ array[1]+ "\n"
                    + "Calificacion 3: " + array[2]+"\n"
                    + "Calificacion 4: " + array[3]+"\n"
                    + "Calificacion 5: " + array[4]+"\n"
                    + "Promedio: " + Prom +"\n"
                    + "Calificacion: " + "D" +"\n");
        }else if (promedio >= 71 && promedio <= 80 ){
            JOptionPane.showMessageDialog(null, "Nombre del estudiante: "+Alumno + "\n"+
                    "Calificacion 1: "+ array[0] + "\n"
                    + "Calificacion 2: "+ array[1]+ "\n"
                    + "Calificacion 3: " + array[2]+"\n"
                    + "Calificacion 4: " + array[3]+"\n"
                    + "Calificacion 5: " + array[4]+"\n"
                    + "Promedio: " + Prom +"\n"
                    + "Calificacion: " + "C" +"\n");
        }else if (promedio >= 81 && promedio <= 90 ){
            JOptionPane.showMessageDialog(null, "Nombre del estudiante: "+Alumno + "\n"+
                    "Calificacion 1: "+ array[0] + "\n"
                    + "Calificacion 2: "+ array[1]+ "\n"
                    + "Calificacion 3: " + array[2]+"\n"
                    + "Calificacion 4: " + array[3]+"\n"
                    + "Calificacion 5: " + array[4]+"\n"
                    + "Promedio: " + Prom +"\n"
                    + "Calificacion: " + "B" +"\n");
        }else if (promedio >= 91 && promedio <= 11 ){
            JOptionPane.showMessageDialog(null, "Nombre del estudiante: "+Alumno + "\n"+
                    "Calificacion 1: "+ array[0] + "\n"
                    + "Calificacion 2: "+ array[1]+ "\n"
                    + "Calificacion 3: " + array[2]+"\n"
                    + "Calificacion 4: " + array[3]+"\n"
                    + "Calificacion 5: " + array[4]+"\n"
                    + "Promedio: " + Prom +"\n"
                    + "Calificacion: " + "A" +"\n");
        }

        return;
    }

}


