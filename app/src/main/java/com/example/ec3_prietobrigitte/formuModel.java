package com.example.ec3_prietobrigitte;

public class formuModel {
    private String distrito;
    private String fechaInicio;

    public formuModel(String distrito, String fechaInicio) {
        this.distrito = distrito;
        this.fechaInicio = fechaInicio;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
