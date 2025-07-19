/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author juanjoanduquia
 */
public class Reserva {
    
    private int idReserva;
    private LocalDate FechaDeEntrada;
    private LocalDate fechaDeSalida;
    private Huesped huesped;
    private Habitacion habitacion;

    public Reserva(int idReserva, LocalDate FechaDeEntrada, LocalDate fechaDeSalida, Huesped huesped, Habitacion habitacion) {
        this.idReserva = idReserva;
        this.FechaDeEntrada = FechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaDeEntrada() {
        return FechaDeEntrada;
    }

    public void setFechaDeEntrada(LocalDate FechaDeEntrada) {
        this.FechaDeEntrada = FechaDeEntrada;
    }

    public LocalDate getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(LocalDate fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    
    
}
