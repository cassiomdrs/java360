import br.senai.df.vo.Planejamento;

public class App {
    public static void main(String[] args) throws Exception {
        
        Planejamento p = new Planejamento("Terça-feira",
                                     "Classe-Método-Construtor-Parâmetros",
                                        4);
        IO.println(">>> Listando Planejamento <<<");
        IO.println("Semana: " + p.getSemana());
        IO.println("Dia: " + p.getDia());
        IO.println("Conteúdo: " + p.getConteudo());
        
    }
}