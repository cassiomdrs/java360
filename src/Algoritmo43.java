public class Algoritmo43 {
    public void main (){
        int[] vetor = {10,20,30,50,8,1523,45,5,44,55,66,77,88,9,134};
        int maior = vetor[0];
        int menor = vetor[0];

        for(int i = 1; i < vetor.length; i++){
            IO.println(vetor[i]);
            if(vetor[i]>maior){
                maior = vetor[i];
            }
            if(vetor[i]<menor){
                menor = vetor[i];
            }
        }
        IO.println("O número maior é: " + maior);
        IO.println("O número menor é: " + menor);
    }
}
