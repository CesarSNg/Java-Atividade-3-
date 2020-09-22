package pacote;  

import javax.swing.*;  

public class Exercicio2 
{  
    
    public static void main (String args [])
    {    
        char sexInf = 0, corInf = 0;  
        int idadeInf, idadeMais = 0, sexF = 0, corP = 0, corC = 0, sexM = 0;  
        
            for(int i = 0; i < 5; i++)
            {
                String idade = JOptionPane.showInputDialog((i+1)+"ª Pessoa - Digite a idade");         
                idadeInf = Integer.parseInt(idade);
                if (idadeInf > 30)
                {
                    idadeMais++;
                }
                
                boolean saida = false;
                while (saida == false)
                {
                    String sexo = JOptionPane.showInputDialog((i+1)+"ª Pessoa - Digite 'F' para feminino e 'M' para masculino)");                 
                    sexInf = sexo.charAt(0);
                    switch (sexInf) 
                    {
                    case 'F':
                        sexF++;
                        saida = true;
                        break;
                    case 'M':
                        sexM++;
                        saida =  true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor, digite apenas 'F' ou 'M'");
                        break;
                    }
                }
                
                boolean saida2 = false;  
                while (saida2 == false){
                String cor = JOptionPane.showInputDialog((i+1)+"ª Pessoa - Digite 'C' para cabelos castanhos e 'P' para cabelos pretos");         
                corInf = cor.charAt(0);
                switch (corInf) {
                case 'C':
                    corC++;
                    saida2 = true;
                    break;
                case 'P':
                    saida2 = true;
                    break;
                default:
                    JOptionPane.showInputDialog ("Por favor! Digite apenas 'C' ou 'P'");
                    break;
            }
            }}
            JOptionPane.showMessageDialog(null, "A quantidade de mulheres é: " + sexF + "\na porcentagem de habitantes com idade superior a 30 anos: " + idadeMais + "\nQuantas pessoas têm a cor dos cabelos castanho: " + corC);
    }            
}
