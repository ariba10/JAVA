public class Notas {
   
    private String nome;
    private double media;

    
    public Notas(String nome, double media) {
        this.nome = nome;
        this.media = media;
    }

    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getMedia() { return media; }
    public void setMedia(double media) { this.media = media; }

   
    @Override
    public String toString() {
        return "Aluno: " + nome + " - Média: " + media;
    }
}