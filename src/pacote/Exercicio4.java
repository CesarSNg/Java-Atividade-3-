package pacote;

import javax.swing.JOptionPane;

public class Exercicio4 
{
    
   public static void main(String[]args)
   {      
       double alt[] = new double [10];
       double soma = 0, media = 0;
       String aux;
       
       aux = JOptionPane.showInputDialog(null,"Insira as 10 alturas em metros: ");
 
        for(int i=0; i < 10; i++)
        {
         alt[i] = Double.parseDouble(aux);
        }

        for(int i=0; i < 10; i++)
        {
                soma = soma + alt[i];
        }

        media = soma / 10;

        JOptionPane.showMessageDialog(null, "A média das 10 alturas é: " + media);
       
   }
}
