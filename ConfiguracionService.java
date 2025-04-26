/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

/**
 *
 * @author Sayda
 */
public class ConfiguracionService {
    public void guardar(ParametroConfiguracion configuracion, String usuario) {
        try {
            configuracion.validar();
            configuracion.registrarCambio(usuario);
            System.out.println("Configuración guardada por " + usuario + " a las " + configuracion.getFechaModificacion());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}