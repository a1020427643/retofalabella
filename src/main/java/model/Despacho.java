package model;

public class Despacho {
    private String departamento;
    private String ciudad;
    private String barrio;
    private String direccion;
    private String detalle;

    public Despacho(String departamento, String ciudad, String barrio, String direccion, String detalle) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccion = direccion;
        this.detalle = detalle;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
