public class AlgoritmoDozeAl {
    void main () {
        //Crie um algoritmo que leia um número e mostre se esse número é par ou impar...
        // O resto da divisão:   %

        int numero = Integer.parseInt(IO.readln("Digite um número: "));
    
        float resto = numero % 2;

        if (resto == 0) {
            IO.println(numero + " é número PAR!");
        }
        else {
            IO.println(numero + " é número IMPAR!");
        }
    }
}
