import javax.swing.JOptionPane;

public class UsaPilha {
    public static void main(String[] args) {
        String strTamanho = JOptionPane.showInputDialog("Qual o tamanho da pilha?");
        int n = Integer.parseInt(strTamanho);
        
        Pilha pl = new Pilha(n);
        String menu = "*** Menu Pilha Estática ***\n1. Push (Empilhar)\n2. Listar\n3. Pop (Remover)\n4. Destruir\n5. Sair";

        while (true) {
            String op = JOptionPane.showInputDialog(menu);
            if (op == null || op.equals("5")) break;

            switch (op) {
                case "1":
                    String nome = JOptionPane.showInputDialog("Nome do Aluno:");
                    double media = Double.parseDouble(JOptionPane.showInputDialog("Média do Aluno:"));
                    pl.push(new Notas(nome, media));
                    break;
                case "2":
                    pl.listar();
                    break;
                case "3":
                    Notas removido = pl.pop();
                    if (removido != null) {
                        JOptionPane.showMessageDialog(null, "Removido: " + removido.getNome());
                    }
                    break;
                case "4":
                    pl.destruir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}