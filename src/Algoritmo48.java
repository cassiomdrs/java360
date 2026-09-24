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

        IO.println(matrizQuadrada[0][0] + " | " + matrizQuadrada[1][1] + " | " + matrizQuadrada[2][2]);
   }
}
