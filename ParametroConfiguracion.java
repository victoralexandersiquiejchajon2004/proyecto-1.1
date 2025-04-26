/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.Date;

/**
 *
 * @author Sayda
 */
public abstract class ParametroConfiguracion {
    protected String modificadoPor;
    protected Date fechaModificacion;

    public void registrarCambio(String usuario) {
        this.modificadoPor = usuario;
        this.fechaModificacion = new Date();
    }

    public abstract void validar() throws Exception;

    public String getModificadoPor() {
        return modificadoPor;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }
}