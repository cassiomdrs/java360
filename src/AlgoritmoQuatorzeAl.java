public class AlgoritmoQuatorzeAl {
    void main () {
        // Considere um menu de um joguinho. Esse menu deverá mostrar uma mensagem personalizada.
        // Se 1 : " jogo iniciado"
        // Se 2: " suas vidas estão acabando"
        // Se 3: "Game Over!"
        // Se qualquer número fora desses números então: "Número inválido".

        IO.println("MENU DO JOGO\n");
        IO.println("1 - Iniciar Jogo.");
        IO.println("2 - Verificar vidas.");
        IO.println("3 - Fugir");
        int opcao = Integer.parseInt(IO.readln("Digite o número da opção desejada: "));

        switch (opcao) {
            case 1:
                IO.println("Jogo iniciado!");
                break;
        
            case 2:
                IO.println("Você tem 2 vidas. Suas vidas estão acabando!");
                break;
        
            case 3:
                IO.println("Ops! Game Over!");
                break;
        
            default:
                IO.println("Número inválido.");
                break;
        }
    }
}
