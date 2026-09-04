public class AlgoritmoCinco {
    
    void main () {
        
        int week = Integer.parseInt(IO.readln("Digite o dia da semana atual do 1 ao 7: "));
        IO.println("O dia da semana atual é: " + week);

        if (week == 1) {
            IO.println("Domingo");
        }
        else if (week == 2) {
            IO.println("Segunda-feira");
        }
        else if (week == 3) {
            IO.println("Terça-feira");
        }
        else if (week == 4) {
            IO.println("Quarta-feira");
        }
        else if (week == 5) {
            IO.println("Quinta-feira");
        }
        else if (week == 6) {
            IO.println("Sexta-feira");
        }
        else if (week == 7) {
            IO.println("Sábado");
        }
        else {
            IO.println("Dia da semana inválido!");
        }

    }

}
