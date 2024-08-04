/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroEstudiante;

/**
 *
 * @author PC
 */
public class Estudiante {
    
    private String nombre;
    private String carrera;
    private String edad;
    private String id;

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Estudiante(String nombre, String carrera, String edad, String id) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.id = id;
    }

    public Estudiante() {
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carrera=" + carrera + ", edad=" + edad + ", id=" + id + '}';
    }
    
    
}
