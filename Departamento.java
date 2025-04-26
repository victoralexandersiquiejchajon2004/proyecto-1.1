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
class Departamento {
    private String nombre;
    private String descripcion;
    private List<Usuario> tecnicos;
    private ColaAtencion cola;

    public Departamento(String nombre, String descripcion, List<Usuario> tecnicos) throws Exception {
        if (nombre == null || nombre.length() < 3 || nombre.length() > 50)
            throw new Exception("Nombre de departamento inválido.");

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tecnicos = new ArrayList<>(tecnicos);
        this.cola = new ColaAtencion(this);  // Se crea automáticamente
    }

    public void asignarTecnicos(List<Usuario> nuevosTecnicos) {
        this.tecnicos.clear();
        this.tecnicos.addAll(nuevosTecnicos);
    }

    public ColaAtencion getCola() {
        return cola;
    }

    public String getNombre() {
        return nombre;
    }
}