import javax.swing.JOptionPane;

public class ContatinhosInterface  {
    public static void main(String[] args) {
        int qtdcontatos = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Contatos:"));

        String[] nomes = new String[qtdcontatos];
        String[] numeros = new String[qtdcontatos];

        for (int i = 0; i < qtdcontatos; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o Nome do " + (i + 1) + "º Contato:");
            numeros[i] = JOptionPane.showInputDialog("Digite o Número do Contato (" + nomes[i] + "):");
        }

        StringBuilder result = new StringBuilder("| Seus Contatinhos |\n");

        for (int i = 0; i < qtdcontatos; i++) {
            result.append("(").append(nomes[i]).append("): ").append(numeros[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
