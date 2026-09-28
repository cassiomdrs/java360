public class Algoritmo51 {
    void main (){
        // Criar uma calculadora que só tem a operação de divisão
        // Tratar uma exceção de um número dividindo por 0
        // Use um robozinho...
        try {
            int numero1 = Integer.parseInt(IO.readln("Digite o primeiro número: "));
            int numero2 = Integer.parseInt(IO.readln("Digite o segundo número: "));

            int resultado = numero1 / numero2;

            IO.println("O resultado da divisão de " + numero1 + " por " + numero2 + " é: " + resultado);
        }
        catch (ArithmeticException e){
            IO.println("Não dá para dividir por zero!");
        } 
        catch (NumberFormatException e){
            IO.println("Por favor, digite apenas números!");
        } 
        finally{
            IO.println("Tchau! Desligando...");
        };
    }
}