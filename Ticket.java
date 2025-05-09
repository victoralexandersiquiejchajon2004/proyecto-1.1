/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.Stack;

class Ticket {
    private String titulo;
    private String descripcion;
    private Departamento departamento;
    private HistorialCambios historial;

    public Ticket(String titulo, String descripcion, Departamento departamento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.departamento = departamento;
        this.historial = new HistorialCambios();
        historial.registrarCambio("Sistema", "Ticket creado.");
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String nuevaDescripcion, String usuario) {
        historial.registrarCambio(usuario, "Descripción actualizada.");
        this.descripcion = nuevaDescripcion;
    }

    public void agregarCambio(String descripcionCambio, String usuario) {
        historial.registrarCambio(usuario, descripcionCambio);
    }

    public Stack<String> getHistorial() {
        return historial.getHistorialCompleto();
    }
}
