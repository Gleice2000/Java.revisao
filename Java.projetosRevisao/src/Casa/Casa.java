package Casa;

public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas() {
        int count = 0;
        if (this.porta1.estaAberta()) {
            count++;
        }
        if (this.porta2.estaAberta()) {
            count++;
        }
        if (this.porta3.estaAberta()) {
            count++;
        }
        return count;
    }

   public static void main(String[] args) {
    Casa minhaCasa = new Casa("branca");
    minhaCasa.pinta("amarela");

    minhaCasa.porta1.fecha();
    minhaCasa.porta2.abre();
    minhaCasa.porta3.abre();

    int portasAbertas = minhaCasa.quantasPortasEstaoAbertas();
    String corDaCasa = minhaCasa.cor;
    System.out.println("A minha casa está pintada de " + corDaCasa + " e tem " + portasAbertas + " portas abertas neste momento.");
}
}
