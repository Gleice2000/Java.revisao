package Banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Carlos Eduardo", "Comercial", 1500.00, "01/01/2019", "1959938901", true);

    funcionario1.mostra();
   

        funcionario1.bonifica(200.00);
        System.out.println("O novo salário após o aumento é de: R$ " + funcionario1.getSalario());

        funcionario1.demite();
        System.out.println("Ativo na empresa após demissão?" + funcionario1.isAtivo());
        
    Cliente cliente1 = new Cliente("Marcelo", "13698976134", "Rua Jose da Silva");
        cliente1.mostrarDados();
    
    }

}
