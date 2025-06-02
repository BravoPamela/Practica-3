/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovill;

//import com.mycompany.automovill.Autos;
import com.mycompany.automovill.Autos.Autos;
import com.mycompany.automovill.Autos.Color;
import com.mycompany.automovill.Autos.TipoAutomovil;
import com.mycompany.automovill.Autos.TipoCombustible;

public class Automovill {

    public static void main(String[] args) {
        Autos Automovil = new Autos (" Toyota", 100, 2,  TipoCombustible. Diesel, TipoAutomovil. Familiar, 4, 6, 500, Color.Azul, 100);
        Automovil.imprimir();
        System.out.println("......................Automovil.2.......................");
        Automovil.setMarca("Toyota");
        Automovil.setModelo(110);
        Automovil.setMotor(5);
        Automovil.setColor(Color.Rojo);
        Automovil.setTipoCombustible(TipoCombustible.Biodiesel);
        Automovil.setTipoAutomovil(TipoAutomovil.Cuidad);
        Automovil.setnumeroPuertas(4);
        Automovil.setcantidadAsientos(6);
        Automovil.setVelocidadMaxima(520);
        Automovil.setVelocidadActual(150);
        
        System.out.println("Marca: "+Automovil.getMarca());
        System.out.println("Modelo: "+Automovil.getModelo());
        System.out.println("Motor: "+Automovil.getMotor());
        System.out.println("Color del Automovil: "+Automovil.getColor());
        System.out.println("Tipo de Combustible: "+Automovil.getTipoCombustible());
        System.out.println("Tipo de Automovil: "+Automovil.getTipoAutomovil());
        System.out.println("Numero de Puertas: "+Automovil.getnumeroPuertas());
        System.out.println("Cantidad de Acientos: "+Automovil.getcantidadAsientos());
        System.out.println("Velocidad Maxima: "+Automovil.getVelocidadMaxima());
        System.out.println("Velocidad Actual: "+Automovil.getVelocidadActual());
        Automovil.acelerar(20);
        Automovil.desacelerar(50);
        Automovil.frenar();
        
    }
}
