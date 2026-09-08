public class AlgoritmoOnzeAl {
    void main () {
        //Crie um algoritmo que leia o seu nome e verifique que realmente é o seu nome.

        String nome = IO.readln("Digite seu nome: ");

        if (nome.toLowerCase().equals("cassio")) {
            IO.println(nome + " realmente é seu nome.");
        }
        else {
            IO.println(nome + " NÃO é seu nome.");
        }

    }
}
