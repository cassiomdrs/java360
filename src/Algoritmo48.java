public class Algoritmo48 {
    // Considere a matriz quadrada
    /*
    
        20,50,80
        45,60,90
        45,67,89

    */
   // Faça um algoritmo que mostre os valores
   // da diagonal principal

   public void main (){

        double[][] matrizQuadrada = {
            {20,50,80},
            {45,60,90},
            {45,67,89}
        };

        int i = 0;
        for (int j = 0; j < matrizQuadrada.length; j++){
            IO.println(matrizQuadrada[i][j]);
            i++;
        }
        
   }
}
