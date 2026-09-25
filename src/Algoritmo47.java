import javax.swing.JOptionPane;

public class Algoritmo47 {
    public void main (){
        double[] numeros = new double[10]; // Criei um vetor com capacidade para armazenar 10 números
        double soma = 0; // Variável soma para somar ela mesma mais o valor adicionado a cada loop

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, (i + 1) + "º Número = Digite um número:", "Inserir 10 números", JOptionPane.QUESTION_MESSAGE));
            soma += numeros[i];
        }
        
        double media = soma / numeros.length;
        JOptionPane.showMessageDialog(null, "A SOMA de todos os números inseridos é: " + soma + "\nA MÉDIA dos números é: " + media, "Resultado", JOptionPane.WARNING_MESSAGE);
    }
}