/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroEstudiante;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class RegistroEstudiante {
   private ArrayList<Estudiante> estudiantes;

    public RegistroEstudiante() {
        estudiantes = new ArrayList<Estudiante>();
    }

    public ArrayList<Estudiante> ListarEstudiantes() {
        return estudiantes;
    }
   
   public void AgregarEstudiante(Estudiante estudiante){
       estudiantes.add(estudiante);
   }
   
     public void EliminarEstudiante(String id){
       estudiantes.removeIf(estudiante -> estudiante.getId() == id);
       
   }

     public boolean VerificarEstudiante(Estudiante estudiante){
         if(estudiantes.contains(estudiante)){
             return true;
         }
         return false;
     }
    @Override
    public String toString() {
        return "RegistroEstudiante{" + "estudiantes=" + estudiantes + '}';
    }
     
}
