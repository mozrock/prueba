

package multiplicar;

import javax.swing.JOptionPane;

public class Multiplicar {

   
    public static void main(String[] args) {
       
        
       int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de tabla que desea m,ultiplicar"));
       
       for(int i=1; i<=10;i++){
           
          int s=a*i;
        JOptionPane.showMessageDialog(null,"imprima"+a*i +"=" +s );
           
       }
    }
    
}
