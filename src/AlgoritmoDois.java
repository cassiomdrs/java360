public class AlgoritmoDois {
    void main () {
        //ENTRADA
        IO.println("Deseja entrar no portal?");
        String usuario = IO.readln("Qual o seu nome? ");

        IO.println("\nOlá " + usuario + "! Bem vindo ao portal java 360.\n");

        // int estrelas = 0;
        // //int é tipo primitivo e é mais rápido porém não tem métodos

        // Integer.parseInt(valor para conversão);
        // Integer é uma classe. É mais lento e com métodos. (Classes Wrappers)

        int estrelas = 0;

        IO.println("Quem criou o Java?");
        IO.println("1 - James Gosling");
        IO.println("2 - Bill Gates");
        IO.println("3 - Steve Jobs");
        IO.println("4 - Mark Zuckerberg\n");

        int resp = Integer.parseInt(IO.readln("Digite o número: "));

        if (resp == 1){
            IO.println("\nRESPOSTA CORRETA! Parabéns, obteve 1 estrela.");
            estrelas = estrelas + 1;
        }
        else {
            IO.println("\nResposta ERRADA!");
        }

        IO.println("\nQuantidade de estrelas atual: " + estrelas + "\n");

    }
}
