/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioarbolesii;

/**
 *
 * @author valen
 */
public class EjercicioArbolesII {

    public static void main(String[] args) {
 System.out.println("Arbol binario de busqueda:");

     ArbolBinarioBusqueda arbolBinarioBusqueda = new ArbolBinarioBusqueda();
    try{
      
      arbolBinarioBusqueda.insertar(32);
      arbolBinarioBusqueda.insertar(1);
      arbolBinarioBusqueda.insertar(4);
      arbolBinarioBusqueda.insertar(78);
      arbolBinarioBusqueda.insertar(5);
      arbolBinarioBusqueda.insertar(51);
      arbolBinarioBusqueda.insertar(2);
      arbolBinarioBusqueda.insertar(76);
      arbolBinarioBusqueda.insertar(56);
      arbolBinarioBusqueda.insertar(27);

      arbolBinarioBusqueda.imprimirArbol(arbolBinarioBusqueda.raizArbol(), 0);

      
      arbolBinarioBusqueda.buscar(1);
      arbolBinarioBusqueda.eliminar(51);
      arbolBinarioBusqueda.eliminar(76);
      
      arbolBinarioBusqueda.insertar(150);
      

      arbolBinarioBusqueda.imprimirArbol(arbolBinarioBusqueda.raizArbol(), 0);
      
      
      
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
    }
}
