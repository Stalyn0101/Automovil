package ec.edu.espoch.automovil;

import ec.edu.espoch.enumeracion.TipoAutomovil;
import ec.edu.espoch.enumeracion.TipoCombustible;
import ec.edu.espoch.enumeracion.color.Color;

public class Automovil {

    /**
     *
     */
    public String marcaAutomovil;
    public Integer añoFabricacion, cantidadPuertas, cantidadAsientos;
    public TipoCombustible tipoCombustible;
    public TipoAutomovil tipoAutomovil;
    public Color color;
    public Double velocidadMax, velocidadActual = 0.0, velocidadAdicional = 0.0, motorAutomovil;
    public Double distanciaARecorrer = 0.0;

    //Métodos
    public void acelerarAutomovil() {
        velocidadActual = velocidadActual + velocidadAdicional;
        if (velocidadActual > velocidadMax) {
            System.out.println("No se puede superar la velocidad máxima ...Limitando Velocidad...");
            velocidadActual = velocidadMax;
        }
        System.out.println("La velocidad actual es de: " + velocidadActual);
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Integer añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public Integer getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(Integer cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(Double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Double getVelocidadAdicional() {
        return velocidadAdicional;
    }

    public void setVelocidadAdicional(Double velocidadAdicional) {
        this.velocidadAdicional = velocidadAdicional;
    }

    public Double getMotorAutomovil() {
        return motorAutomovil;
    }

    public void setMotorAutomovil(Double motorAutomovil) {
        this.motorAutomovil = motorAutomovil;
    }

    public Double getDistanciaARecorrer() {
        return distanciaARecorrer;
    }

    public void setDistanciaARecorrer(Double distanciaARecorrer) {
        this.distanciaARecorrer = distanciaARecorrer;
    }
    
    

    public void desacelerarAutomovil() {
        while (velocidadAdicional < 0) {
            System.out.println("No se puede ingresar una desaceleración negativa");
        }
        velocidadActual = velocidadActual - velocidadAdicional;
        System.out.println("La velocidad actual es de: " + velocidadActual);
    }

    public void frenar() {
        velocidadActual = 0.0;
        System.out.println("La velocidad actual es: de " + velocidadActual);
    }

    public Double estimarTiempo() {
        return distanciaARecorrer / velocidadActual;
    }

    public void impAtributos() {
        System.out.println("Marca: " + marcaAutomovil + "\nAño de Fabricación: " + añoFabricacion + "\nMotor: " + motorAutomovil + "\nCantidad de Puertas: " + cantidadPuertas + "\nCantidad de Asientos: " + cantidadAsientos + "\nCombustible: " + tipoCombustible + "\nTipo: " + tipoAutomovil + "\nColor: " + color);
    }
}
