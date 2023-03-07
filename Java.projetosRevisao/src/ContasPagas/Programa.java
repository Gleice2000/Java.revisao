
package ContasPagas;

public class Programa {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Igor da Silva", "193.664.713-71");
        Cliente cli2 = new Cliente("Mariana de Souza", "754.436.411-16");
        Cliente cli3 = new Cliente("Fernando Pereira", "546.725.649-97");

        Produto pro1 = new Produto("PC gammer", 4499.99);
        Produto pro2 = new Produto("Celular IPHONE 14", 9899.99);
        Produto pro3 = new Produto("Camera digital", 999.99);

        Conta c1 = new Conta(1, "10/03/2023", "05/03/2023", pro1, cli1);
        Conta c2 = new Conta(2, "15/02/2022", "10/02/2022", pro2, cli2);
        Conta c3 = new Conta(3, "29/11/2021", "26/10/2021", pro3, cli3);


        c1.visualizarConta();
        c2.visualizarConta();
        c3.visualizarConta();
    }
}