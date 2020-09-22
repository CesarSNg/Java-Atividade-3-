package pacote;

public class Exercicio3 {
   public static void main(String[]args){
       int[] x = {1,2,3,4,5,6,7,8,9,10};
       int posicao;
       int z[] = new int[10];
       
       for (int i=0;i<10;i++){
           posicao = i + 1;
           if (posicao%2 == 0){
               z[i] = x[i] * 2;
               System.out.println(posicao + "  " + x[i] + " " + z[i] );
           }else{
               z[i] = x[i] *3;
               System.out.println(posicao + "  " + x[i] + " " + z[i] );
           }
   }
   }
}
