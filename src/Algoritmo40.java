public class Algoritmo40 {
    public void main (){
        /*
        Vetor = É uma matriz unidimensional
            acadêmico - programação simples básico

        Tabela = É uma matriz bidimensional
            banco de dados - planilha excel

        3D = É uma matriz tridimensional
            cinema - desenho - animações - games (GTA 6)
        */


        int[] notas = {7,9,5,10,6,20,23,30,59,14,19}; // Vetor ou Matriz unidimensional
        int maior = notas[0];

        for(int i = 1; i < notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
        }

        IO.println(maior);

    }
}
