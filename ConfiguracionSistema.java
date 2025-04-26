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
public class ConfiguracionSistema extends ParametroConfiguracion {
    private String nombreEmpresa;
    private String logoEmpresaPath;
    private String idiomaPredeterminado;
    private String zonaHoraria;
    private int tiempoVencimientoInactivo;
    private List<String> nivelesPrioridad;

    public ConfiguracionSistema(String nombreEmpresa, String logoEmpresaPath, String idioma, String zona,
                                 int dias, List<String> prioridades) {
        this.nombreEmpresa = nombreEmpresa;
        this.logoEmpresaPath = logoEmpresaPath;
        this.idiomaPredeterminado = idioma;
        this.zonaHoraria = zona;
        this.tiempoVencimientoInactivo = dias;
        this.nivelesPrioridad = prioridades;
    }

    @Override
    public void validar() throws Exception {
        if (nombreEmpresa == null || nombreEmpresa.length() < 3 || nombreEmpresa.length() > 100)
            throw new Exception("Nombre de empresa inválido.");

        if (!logoEmpresaPath.endsWith(".jpg") && !logoEmpresaPath.endsWith(".png"))
            throw new Exception("Logo debe ser JPG o PNG.");

        List<String> idiomas = List.of("Español", "Inglés");
        if (!idiomas.contains(idiomaPredeterminado))
            throw new Exception("Idioma no soportado.");

        List<String> zonas = List.of("UTC", "America/Mexico_City", "Europe/Madrid");
        if (!zonas.contains(zonaHoraria))
            throw new Exception("Zona horaria inválida.");

        if (tiempoVencimientoInactivo < 1 || tiempoVencimientoInactivo > 365)
            throw new Exception("Tiempo de vencimiento fuera de rango.");

        if (nivelesPrioridad == null || nivelesPrioridad.size() < 3)
            throw new Exception("Debe definir al menos tres niveles de prioridad.");
    }
}