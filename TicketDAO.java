/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketDAO {

    public void crearTicket(Ticket ticket) {
        String sql = "INSERT INTO tickets (titulo, descripcion, departamento) VALUES (?, ?, ?)";
        try (Connection conn = ConexionDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ticket.getTitulo());
            stmt.setString(2, ticket.getDescripcion());
            stmt.setString(3, ticket.getDepartamento().getNombre()); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al crear ticket: " + e.getMessage());
        }
    }

    public List<Ticket> obtenerTodosLosTickets() {
        List<Ticket> lista = new ArrayList<>();
        String sql = "SELECT * FROM tickets";
        try (Connection conn = ConexionDB.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String titulo = rs.getString("titulo");
                String descripcion = rs.getString("descripcion");
                String departamentoNombre = rs.getString("departamento");
                Departamento depto = new Departamento(departamentoNombre);
                Ticket ticket = new Ticket(titulo, descripcion, depto);
                lista.add(ticket);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener tickets: " + e.getMessage());
        }
        return lista;
    }


}