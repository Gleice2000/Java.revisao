package Casa;

public class Porta {


    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;


    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public boolean estaAberta() {
        return this.aberta;
    }

    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.abre();
        System.out.println("A porta está aberta: " + porta.estaAberta());

        porta.fecha();
        System.out.println("\nA porta está fechada: " + porta.estaAberta());

        porta.pinta("verde");
        System.out.println("\nA porta foi pintada de: " + porta.cor);
        
        porta.pinta("amarelo");
        System.out.println("\nA porta foi pintada de: " + porta.cor);

        porta.pinta("azul");
        System.out.println(porta.cor + "\n\nA porta está atualmente pintada de: " + porta.cor);
        
        porta.dimensaoX = 1.8;
        porta.dimensaoY = 3.0;
        porta.dimensaoZ = 0.6;

        System.out.println("\nAs dimensões da porta são: " + porta.dimensaoX + " x " + porta.dimensaoY + " x " + porta.dimensaoZ);
    }

}
