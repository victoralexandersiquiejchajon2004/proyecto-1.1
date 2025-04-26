/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

/**
 *
 * @author Sayda
 */
public class Permiso {
    private String nombre;
    private String descripcion;

    public Permiso(String nombre, String descripcion) throws Exception {
        if (nombre == null || nombre.length() < 3 || nombre.length() > 50)
            throw new Exception("Nombre del permiso inválido.");
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }

   

}