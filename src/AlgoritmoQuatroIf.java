public class AlgoritmoQuatroIf {
    void main (){
        // Entre com um número inteiro e mostre se ele é positivo, negativo ou nulo.
        int n = Integer.parseInt(IO.readln("Digite um número inteiro: "));

        if (n>0) {
            IO.println("Número POSITIVO!");
        }
        else if (n<0) {
            IO.println("Número NEGATIVO!");
        }
        else {
            IO.println("Número NULO!");
        }

        // Operador ternário
        int a = 10;
        String resultado = (a>10) ? "Maior que 10" : "Menor ou igual a 10";
        IO.println(resultado);

        // Estrutura de seleção multipla
        int numAula = Integer.parseInt(IO.readln("Entre com um número de 1 a 4: "));
        switch (numAula) {
            case 1:
                IO.println("Aula: Segunda-feira");
                break;
            case 2:
                IO.println("Aula: Terça-feira");
                break;
            case 3:
                IO.println("Aula: Quarta-feira");
                break;
            case 4:
                IO.println("Aula: Quinta-feira");
                break;
            default:
                IO.println("Número inválido");
                break;
        }
    }
}