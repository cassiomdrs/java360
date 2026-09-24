import javax.swing.JOptionPane;

public class Algoritmo47 {
    public void main (){
        double[] numeros = new double[10]; // Criei um vetor com capacidade para armazenar 10 números
        double soma = 0; // Variável soma para receber os valores de cada número digitado
        int contador = 0; // Variável para contar quantos espaços tem no vetor

        for(int i = 0; i < numeros.length; i++){
            //int numeroDigitado = Integer.parseInt(IO.readln("Posição " + (i+1) + " selecionada, digite o número: "));
            
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, (i + 1) + "º Número = Digite um número:", "Inserir 10 números", JOptionPane.QUESTION_MESSAGE));

            soma += numeros[i];
            contador++;
        }
        
        double media = soma / contador;

        //IO.println("A SOMA de todos os números inseridos é: " + soma);
        //IO.println("A MÉDIA dos números é: " + media);

        JOptionPane.showMessageDialog(null, "A SOMA de todos os números inseridos é: " + soma + "\nA MÉDIA dos números é: " + media, "Resultado", JOptionPane.WARNING_MESSAGE);

    }
}