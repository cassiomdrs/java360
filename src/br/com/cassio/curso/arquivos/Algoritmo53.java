package br.com.cassio.curso.arquivos;
import java.util.HashMap;
import java.util.Map;
// Um pacote é um conjunto de classes e ou interfaces


public class Algoritmo53 {
    void main (){
        // Toda classe herda de Object
        // Esse sinal onde tem a String e o Aluno <> = Definir tipo Generics
        Map<String, Estudante> estudantes = new HashMap<>();
        
        IO.println(">>> Java Doctor -  Escola de Programação <<<");

        Estudante e1 = new Estudante("JP", "ADS", 2025);
        estudantes.put("MAT-1223", e1);

        Estudante e2 = new Estudante("Elias", "Ciência da Computação", 2023);
        estudantes.put("MAT-1224", e2);

        Estudante e3 = new Estudante("Daniel", "Publicidade e Propaganda", 2016);
        estudantes.put("MAT-1225", e3);

        Estudante e4 = new Estudante("Cassio", "ADS", 2015);
        estudantes.put("MAT-1226", e4);

        Estudante e5 = new Estudante("Natália", "Ciência da Computação", 2027);
        estudantes.put("MAT-1227", e5);

        Estudante e6 = new Estudante("Maria Eduarda", "ADS", 2028);
        estudantes.put("MAT-1228", e6);

        Estudante e7 = new Estudante("Júlio Cézar", "TSI", 2028);
        estudantes.put("MAT-1229", e7);

        Estudante e8 = new Estudante("Gabriel I", "Autodidata", 2026);
        estudantes.put("MAT-1230", e8);

        Estudante e9 = new Estudante("Fábio Pio", "Marketing", 2026);
        estudantes.put("MAT-1231", e9);

        Estudante e10 = new Estudante("Carlos", "ADS", 2016);
        estudantes.put("MAT-1232", e10);

        Estudante e11 = new Estudante("Gabriel II", "Engenharia de Software", 2028);
        estudantes.put("MAT-1233", e11);

        Estudante e12 = new Estudante("Thalita", "ADS", 2026);
        estudantes.put("MAT-1234", e12);
        
        estudantes.put("MAT-1235", new Estudante("Romulo", "GTI", 2012));

        /*
        for (Estudante e : estudantes.values()){
            IO.println(e);
        }
        */
        
        for (String matricula : estudantes.keySet()){
            Estudante e = estudantes.get(matricula);
            IO.println("\n" + matricula + " -> " + e + "\n");
            IO.println("------------------------------------------------------------");
        }

        String matriculaDigitada = IO.readln("Digite a matricula:\n");
        Estudante e = estudantes.get(matriculaDigitada.trim().toUpperCase());

        if (e != null){
            IO.println("\n" + matriculaDigitada + " -> " + e);
        }
        else {
            IO.println("Matrícula não encontrada!");
        }

        
    }
}
