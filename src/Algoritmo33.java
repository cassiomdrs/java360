public class Algoritmo33 {

    public void chave(){
        int chaveNumero = Integer.parseInt(IO.readln("Digite o número da chave que deseja usar: "));

        if(chaveNumero == 7){
            IO.println("Porta aberta!!!");
        }
        else {
            IO.println("Chave errada, porta fechada!!!");
        }
    }
}
