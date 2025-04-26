/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Sayda
 */
class ColaAtencion {
    private Departamento departamento;
    private Queue<Ticket> tickets = new LinkedList<>();

    public ColaAtencion(Departamento depto) {
        this.departamento = depto;
    }

    public void agregarTicket(Ticket ticket) {
        tickets.offer(ticket);
    }

    public Ticket obtenerSiguienteTicket() {
        return tickets.poll();
    }

    public List<Ticket> listarTickets() {
        return new ArrayList<>(tickets);
    }
}