import javax.swing.JOptionPane;

public class CalculosCirculo {

    
    public double getDiametro(double comprimento) {
        return comprimento / 3.14;
    }

    
    public double getRaio(double diametro) {
        return diametro / 2;
    }

   
    public double getArea(double raio) {
        return raio * raio * 3.14;
    }

    public static void main(String[] args) {
        CalculosCirculo calc = new CalculosCirculo();
        
        double comp = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento:"));
        
        
        double d = calc.getDiametro(comp);
        double r = calc.getRaio(d);
        double a = calc.getArea(r);
        
        String resultado = String.format("Diâmetro: %.2f\nRaio: %.2f\nÁrea: %.2f", d, r, a);
        JOptionPane.showMessageDialog(null, resultado);
    }
}