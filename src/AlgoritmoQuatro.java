public class AlgoritmoQuatro {
    
    void main () {
        
        int week = Integer.parseInt(IO.readln("Digite o dia da semana atual do 1 ao 7: "));
        IO.println("O dia da semana atual é: " + week);
        
        switch (week) {
            case 1:
                IO.println("Domingo");
                break;
            case 2:
                IO.println("Segunda-feira");
                break;
            case 3:
                IO.println("Terça-feira");
                break;
            case 4:
                IO.println("Quarta-feira");
                break;
            case 5:
                IO.println("Quinta-feira");
                break;
            case 6:
                IO.println("Sexta-feira");
                break;
            case 7:
                IO.println("Sábado");
                break;
        
            default:
                IO.println("Dia da semana inválido!");
                break;
        }

    }

}
