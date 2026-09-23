public class Algoritmo41 {

    public void main (){
        // Matrizes
        // Matriz bidimensional (2D)
        // 2x2 Matriz quadrada = mesma quantidade de linhas e colunas

        int[][] matriz = {
            {21,25},
            {33,35}
        };

        int soma = 0;

        // i = Identifica o número da linha
        // j = Identifica o número da coluna
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }
        }

        IO.println("Linha 0 e Coluna 0: " + matriz[0][0]);
        IO.println("Linha 0 e Coluna 1: " + matriz[0][1]);
        IO.println("Linha 1 e Coluna 0: " + matriz[1][0]);
        IO.println("Linha 1 e Coluna 1: " + matriz[1][1]);
        IO.println("A soma de toda a matriz é: " + soma);

    }
    
}
