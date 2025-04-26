/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

/**
 *
 * @author Sayda
 */
class Ticket {
    private String titulo;
    private String descripcion;
    private Departamento departamento;

    public Ticket(String titulo, String descripcion, Departamento departamento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getTitulo() {
        return titulo;
    }

    Iterable<String> getComentarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}