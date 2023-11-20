package com.example.ec3_prietobrigitte;

public class ruta {
    private int imagen;
    private int paradero;
    private String fechahora;
    private int pasajero;

    public ruta(int imagen, int paradero, String fechahora, int pasajero) {
        this.imagen = imagen;
        this.paradero = paradero;
        this.fechahora = fechahora;
        this.pasajero = pasajero;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getParadero() {
        return paradero;
    }

    public void setParadero(int paradero) {
        this.paradero = paradero;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }
}
