/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpractico;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio 2
 */
public class ExamenPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   
        
     String[] nombre = new String[300];
     double[]precio = new  double[300];
     int[]cantidad = new  int[300];
     double[] subtotal = new double[300];
     double acu = 0, bandera =0;
     int op = 0;
   
     int cantv = 0;
       do{
    op = Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido a nuestro sistema:)\n Teinvitamos a ingresar el numero de la opccion que gustes realizar:) "
                + "\n 1-----Agregar Compra \n 2-----Calcular COmpra \n 3-----Salir:("));
    
    if(op == 1){
        
    
    
    cantv = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productosn a agregar:"));
    
        for (int i = 0; i <cantv; i++) {
            nombre[i] = JOptionPane.showInputDialog(null,"ingrese el nombre");
            precio[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese lel precio"));
            cantidad[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad"));
            subtotal[i]= precio[i] * cantidad[i];
            acu += subtotal[i];
        }
    }
        if(op == 2){
      
         
            for (int j = 0; j < cantv; j++) {
                if(nombre[j] != " "){
                    
                    JOptionPane.showMessageDialog(null," Producto : "+nombre[j]+"\n Con precio de: "+precio[j]+"\n La cantidad de: "+ cantidad[j]
                    +"\nEl total de esta venta es: " + subtotal[j]);
                   
                    
                }
            }
             JOptionPane.showMessageDialog(null,"el total de todas los productos  es: "+ acu);
         
    }
        
       
        bandera = JOptionPane.showConfirmDialog(null,"Desea continuar con el programa?", "confirmar",JOptionPane.YES_NO_OPTION);
       
    }while( bandera == JOptionPane.YES_OPTION);
    }
    }
    

