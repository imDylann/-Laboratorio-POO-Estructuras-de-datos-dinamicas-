/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedidos;

/**
 *
 * @author ASUS
 */
public class Pedido {
    private int NumeroPedido;
    private String descripcion;
    private String cliente;
    private double monto;    

    public int getNumeroPedido() {
        return NumeroPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public Pedido(int NumeroPedido, String descripcion, String cliente, double monto) {
        this.NumeroPedido = NumeroPedido;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.monto = monto;
    }

    public Pedido() {
    }

    @Override
    public String toString() {
        return "Pedido" + " NumeroPedido: " + NumeroPedido + ", descripcion: " + descripcion + ", cliente: " + cliente + ", monto: " + monto ;
    }
    
    
}
