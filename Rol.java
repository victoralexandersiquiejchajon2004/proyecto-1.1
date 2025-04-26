/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sayda
 */
public class Rol {
    private String nombre;
    private String descripcion;
    private List<Permiso> permisos;

    public Rol(String nombre, String descripcion) throws Exception {
        if (nombre == null || nombre.length() < 3 || nombre.length() > 50)
            throw new Exception("Nombre del rol inválido.");
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.permisos = new ArrayList<>();
    }

    Rol(String técnico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void asignarPermiso(Permiso permiso) {
        if (!permisos.contains(permiso)) {
            permisos.add(permiso);
        }
    }

    public void eliminarPermiso(Permiso permiso) {
        permisos.remove(permiso);
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


}