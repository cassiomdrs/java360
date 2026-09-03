public class AlgoritmoTres {

    void main (){
        int nota1, nota2, nota3;

        double media;

        nota1 = Integer.parseInt(IO.readln("Digite a primeira nota: "));
        nota2 = Integer.parseInt(IO.readln("Digite a segunda nota: "));
        nota3 = Integer.parseInt(IO.readln("Digite a terceira nota: "));

        int soma = nota1 + nota2 + nota3;

        media = soma / 3;

        IO.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        IO.println("Soma: " +soma);
        IO.println("Média: " +media);

        if (media >= 6){
            IO.println("\nAluno APROVADO!");
        }
        else {
            IO.println("\nAluno REPROVADO!");
        }
    }

}