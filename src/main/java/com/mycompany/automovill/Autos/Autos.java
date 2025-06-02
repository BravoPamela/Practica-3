/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovill.Autos;

/**
 *
 * @author User
 */
public class Autos {
    private String marca; 
    private int modelo;
    private float motor;
    private TipoCombustible tipoCombustible;  
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private float velocidadMaxima;
    private Color color;
    private float velocidadActual;
    
    public Autos (String marca, int modelo, float motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, float velocidadMaxima, Color color, float velocidadActual){
    
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return (int) motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    
    public int getnumeroPuertas() {
        return numeroPuertas;
    }

    public void setnumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getcantidadAsientos() {
        return numeroPuertas;
    }

    public void setcantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return (int) velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return (int) velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public void acelerar(int incremento) {
        if (incremento < velocidadMaxima) {
            velocidadActual += incremento;
            System.out.println("Velocidad Actual Acelerada "+velocidadActual+"km/h");
        } else {
            System.out.println("No se puede superar la velocidad maxima.");
        }
    }

    public void desacelerar(int decremento) {
        if ((decremento > 0)&& (decremento < velocidadActual)) {
            velocidadActual=velocidadActual - decremento;
            System.out.println("Velocidad Actual desacelerada"+velocidadActual+"km/h");
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        }
    }

    public void frenar() {
        int frenar = 0;
        System.out.println("Frenar: "+frenar);
        
    }

    public double calcularTiempoLlegada(int distancia) {
        if (velocidadActual == 0) {
        }
        return distancia / velocidadActual;
    }

    public void imprimir(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Motor: "+motor);
        System.out.println("Tipo de Combustible: "+tipoCombustible);
        System.out.println("Tipo de Automovil: "+tipoAutomovil);
        System.out.println("Numero de Puestras: "+numeroPuertas);
        System.out.println("Cantidad de Asientos: "+cantidadAsientos);
        System.out.println("Velocidad Maxima: "+velocidadMaxima);
        System.out.println("Color: "+color);
        System.out.println("Velocidad Actual: "+velocidadActual);
      
        
        
    } 
}
