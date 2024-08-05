/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

import java.util.HashSet;

/**
 *
 * @author PC
 */
public class inventario {
    private  HashSet<Producto> inv;

    public inventario() {
        inv = new HashSet<>();
    }

    public HashSet<Producto> ListarProductos() {
        return inv;
    }
    
    public void AgregarProducto(Producto producto){
        inv.add(producto);
    }
    
    public Producto BuscarProducto(String codigo){
                for (Producto producto : inv) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;

    }
            
    public void EliminarProducto(String codigo){
        inv.removeIf(Producto -> Producto.getCodigo().equals(codigo));
    }
}
