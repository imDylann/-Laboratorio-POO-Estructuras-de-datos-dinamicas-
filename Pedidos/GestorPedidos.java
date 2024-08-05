/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedidos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class GestorPedidos {
    
    
    private Queue<Pedido> pedidosPendientes;

    public GestorPedidos() {
        this.pedidosPendientes = new LinkedList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidosPendientes.add(pedido);
    }

    public Pedido atenderPedido() {
        return pedidosPendientes.poll(); 
    }
    
      public String listarPedidos() {
        StringBuilder sb = new StringBuilder();
        for (Pedido pedido : pedidosPendientes) {
            sb.append(pedido.toString()).append("\n");
        }
        return sb.toString();
    }
}
