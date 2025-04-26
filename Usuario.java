/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

/**
 *
 * @author Sayda
 */
class Usuario {
    private String nombreUsuario;
    private Rol rol;

    public Usuario(String nombreUsuario, Rol rol) {
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
    }

    Usuario(String juan_Pérez, String juancorreocom, String jperez, String pass123, Rol tecnico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public boolean tienePermiso(String permisoBuscado) {
        return rol.getPermisos().stream().anyMatch(p -> p.getNombre().equals(permisoBuscado));
    }
}