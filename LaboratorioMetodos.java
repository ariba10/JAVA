import javax.swing.JOptionPane;

public class LaboratorioMetodos {

    public double calcularTempoQueda(double altura) {
        double gravidade = 9.81;
        return Math.sqrt((2 * altura) / gravidade);
    }

   
    public long calcularFatorial(int n) {
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        LaboratorioMetodos lab = new LaboratorioMetodos();
        
        
        double h = Double.parseDouble(JOptionPane.showInputDialog("Altura para queda (m):"));
        double tempo = lab.calcularTempoQueda(h);
        JOptionPane.showMessageDialog(null, "Tempo de queda: " + String.format("%.2f", tempo) + "s");

        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o Fatorial:"));
        long resultadoFatorial = lab.calcularFatorial(num);
        JOptionPane.showMessageDialog(null, "Fatorial de " + num + " é: " + resultadoFatorial);
    }
}