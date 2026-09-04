public class AlgoritmoCinco {
    
    void main () {
        
        int mes = Integer.parseInt(IO.readln("Digite e mês atual do 1 ao 12: "));
        IO.println("O mês atual é: " + mes);

        if (mes == 1) {
            IO.println("Janeiro");
        }
        else if (mes == 2) {
            IO.println("Fevereiro");
        }
        else if (mes == 3) {
            IO.println("Março");
        }
        else if (mes == 4) {
            IO.println("Abril");
        }
        else if (mes == 5) {
            IO.println("Maio");
        }
        else if (mes == 6) {
            IO.println("Junho");
        }
        else if (mes == 7) {
            IO.println("Julho");
        }
        else if (mes == 8) {
            IO.println("Agosto");
        }
        else if (mes == 9) {
            IO.println("Setembro");
        }
        else if (mes == 10) {
            IO.println("Outubro");
        }
        else if (mes == 11) {
            IO.println("Novembro");
        }
        else if (mes == 12) {
            IO.println("Dezembro");
        }
        else {
            IO.println("Mês inválido!");
        }

    }

}
