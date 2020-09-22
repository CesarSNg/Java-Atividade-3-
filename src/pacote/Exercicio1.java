package pacote;  

import javax.swing.*;  

public class Exercicio1 {  
    
    public static void main (String args []){  
        double altInf;  
        char sexInf = 0;  
        int idadeInf;  
        double maiorAlt = 0.0;  
        double menorAlt = 5.0;  
        double mediaAlt = 0.0;  
        double contMulher = 0;  
        int menorIdadeM = 200;  
        int maiorIdadeH = 0;   
        
        JOptionPane.showMessageDialog(null, "Esse programa calcula:  \n a maior altura e a menor altura\n" +
        "a média de altura de mulheres\n" +
        "a idade do homem mais velho e da mulher mais nova");
        
        for(int i = 0; i < 3; i++){           
             String altura = JOptionPane.showInputDialog ((i+1)+"ª Pessoa - Digite a altura");  
             altInf = Double.parseDouble(altura);              
             if (altInf > maiorAlt) {  
                 maiorAlt = altInf;                   
             } else  
             if (altInf < menorAlt) {  
                 menorAlt = altInf;  
             }              
               
             boolean saida = false;  
             while (saida == false){            
                String sexo = JOptionPane.showInputDialog((i+1)+"ª Pessoa - Digite o sexo ('M' para masculino e 'F' para feminino)");                 
                sexInf = sexo.charAt(0);          
                switch (sexInf) {
                     case 'F':
                         mediaAlt += altInf;
                         contMulher++;
                         saida = true;
                         break;
                     case 'M':   
                         saida = true;
                         break;
                     default:
                         JOptionPane.showMessageDialog(null, "Por favor! Insira apenas 'M' ou 'F'.");
                         break;
                }
             }  
               
             String idade = JOptionPane.showInputDialog((i+1)+"ª Pessoa - Digite a idade");         
             idadeInf = Integer.parseInt(idade);     
             if (idadeInf > maiorIdadeH && sexInf == 'M') {       
                 maiorIdadeH = idadeInf;       
             } else      
             if (idadeInf < menorIdadeM && sexInf == 'F') {       
                 menorIdadeM = idadeInf;       
             }               
  }  
        JOptionPane.showMessageDialog(null, "A maior altura: " + maiorAlt + "A menor altura: " + menorAlt + "\nA media de altura de Mulheres: " + mediaAlt/contMulher + "\nA idade do homem mais velho: " + maiorIdadeH + "A idade da mulher mais nova: " + menorIdadeM);
 }  
}