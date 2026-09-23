import javax.swing.JOptionPane;

public class Algoritmo39 {
    /*
    revisão:
        - Classe Abstrata;
        - Interfaces;
        - Polimorfismo;
        - Encapsulamento; e
        - Static.

    Transporte
    Onibus
    Metro
    */

    public void main(){
        Onibus o1 = new Onibus("PCU 5678");
        Onibus o2 = new Onibus("ZRE 4567");
        Onibus o3 = new Onibus("ABC 5277");

        Metro m1 = new Metro("RTS 5634");
        Metro m2 = new Metro("BVF 4534");
        Metro m3 = new Metro("BNH 2345");
        
        int op;

        final String TITULO = "VIAÇÃO TRANSPORTE";
        int janelaPadrao = JOptionPane.WARNING_MESSAGE;
        int janelaClose = JOptionPane.CLOSED_OPTION;
        int janelaErro = JOptionPane.ERROR_MESSAGE;

        do{

            String opcao = JOptionPane.showInputDialog("1 - Ônibus;\n2 - Metrô;\n3 - Sair.");
            op = Integer.parseInt(opcao);

            if(op == 1){
            JOptionPane.showMessageDialog(null, o1.calcularTarifa(), TITULO,janelaPadrao);
            JOptionPane.showMessageDialog(null, "Frota: " + Onibus.getCont(), TITULO,janelaPadrao);
            }
            else if(op == 2){
            JOptionPane.showMessageDialog(null, m1.calcularTarifa(), TITULO,janelaPadrao);
            }
            else if(op == 3){
            JOptionPane.showMessageDialog(null, "Saindo...", TITULO,janelaClose);
            }
            else {
            JOptionPane.showMessageDialog(null, "Opção INVÁLIDA!", TITULO,janelaErro);
            }

        }while(op!=3);
        
    }

}