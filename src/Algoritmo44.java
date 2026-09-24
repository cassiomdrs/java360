public class Algoritmo44 {
    public void main (){
        // Matriz unidmensional 1D
        // Matriz bidmensional 2D
        // Matriz tridmensional 3D
        // Tensores (N dimensões - Redes Neurais)
        // i,j: Linha e conluna

        double[][] notas = {
            {100,80,40,30},
            {78,87,55,90},
            {67,78,34,56},
            {99,100,56,96}
        };

        double soma = 0;
        double mediaTurma = 0;
        int contagem = 0;

        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                IO.println(notas[i][j]);
                soma += notas[i][j];
                contagem++;
            }
        }
        
        mediaTurma = soma / contagem;

        IO.println("A quantidade de notas que temos inseridos são: " + contagem);
        IO.println("A soma de todas as notas são: " + soma);
        IO.println("A média é: " + mediaTurma);

    }
}
