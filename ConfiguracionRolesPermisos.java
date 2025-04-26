/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.List;

/**
 *
 * @author Sayda
 */
public class ConfiguracionRolesPermisos extends ParametroConfiguracion {
    private List<Rol> roles;
    private List<Permiso> permisos;

    public ConfiguracionRolesPermisos(List<Rol> roles, List<Permiso> permisos) {
        this.roles = roles;
        this.permisos = permisos;
    }

    @Override
    public void validar() throws Exception {
        if (roles == null || permisos == null)
            throw new Exception("Roles o permisos no pueden ser nulos.");

        for (Rol rol : roles) {
            if (rol.getNombre() == null || rol.getNombre().length() < 3)
                throw new Exception("Nombre de rol inválido: " + rol.getNombre());

            for (Permiso permiso : rol.getPermisos()) {
                if (!permisos.contains(permiso)) {
                    throw new Exception("Permiso no registrado: " + permiso.getNombre());
                }
            }
        }
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }
}