/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.Date;
import java.util.Stack;

public class HistorialCambios {
    private Stack<String> cambios = new Stack<>();

    public void registrarCambio(String usuario, String descripcionCambio) {
        String registro = String.format("[%s] %s: %s", new Date(), usuario, descripcionCambio);
        cambios.push(registro);
    }

    public String deshacerUltimoCambio() {
        return cambios.isEmpty() ? null : cambios.pop();
    }

    public Stack<String> getHistorialCompleto() {
        return cambios;
    }
}