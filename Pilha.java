import javax.swing.JOptionPane;

public class Pilha {
    private int topo;
    private Notas[] dados; // Array de objetos Notas

    // Construtor: Inicializa a pilha com o tamanho desejado
    public Pilha(int tamanho) {
        this.topo = -1; // Indica pilha vazia
        this.dados = new Notas[tamanho];
    }

 
    public boolean isCheia() {
        return topo == dados.length - 1;
    }

    public boolean isVazia() {
        return topo == -1;
    }

   
    public void push(Notas novoDado) {
        if (!isCheia()) {
            topo++;
            dados[topo] = novoDado;
        } else {
            JOptionPane.showMessageDialog(null, "Erro: A Pilha está cheia!");
        }
    }

  
    public Notas pop() {
        if (!isVazia()) {
            Notas removido = dados[topo];
            topo--;
            return removido;
        } else {
            JOptionPane.showMessageDialog(null, "Erro: A Pilha está vazia!");
            return null;
        }
    }

   
    public void listar() {
        if (isVazia()) {
            JOptionPane.showMessageDialog(null, "Pilha vazia!");
        } else {
            String conteudo = "*** Conteúdo da Pilha ***\n";
            for (int i = topo; i >= 0; i--) {
                conteudo += dados[i].toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, conteudo);
        }
    }

   
    public void destruir() {
        topo = -1;
        JOptionPane.showMessageDialog(null, "Pilha reiniciada!");
    }
}