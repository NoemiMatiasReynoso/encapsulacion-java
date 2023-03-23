package com.adecco.modelo;

public class producto {
    //atributos,
    private int numProducto;
    private String nombreProducto;
    private double precio;

    private int cantidadExistencia;
    public void setNumProducto(int numProducto){

        this.numProducto= numProducto;}

        public int getNumProducto() {
            return numProducto;
        }
        public void setPrecio(double precio){
            this.precio= precio;
        }
        public double getPrecio()
        {

            return precio;
        }



        // métodos´,
        // constructores,
        // setter y getters


    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
}

