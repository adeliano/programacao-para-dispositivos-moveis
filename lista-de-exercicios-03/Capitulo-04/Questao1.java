public class Questao1 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        f1.nome = "Programador Java";
        f1.departamento = "TI";
        f1.dataEntrada = "21/12/2012";
        f1.RG = "123456789-0";
        f1.salario = 2000;
        f1.mostra();
        
        System.out.println("\nApós fazer o curso Java Progressivo, o funcionário obteve bonificação de mil reais.");
        System.out.println("Os novos dados, após o aumento, são:\n");
        f1.bonifica(1000);
        f1.mostra();
        
        //Vamos agorar preencher os dados de f2
        f2.nome = "Programador Java";
        f2.departamento = "TI";
        f2.dataEntrada = "21/12/2012";
        f2.RG = "123456789-0";
        f2.salario = 2000;
        f2.bonifica(1000);
        
        if(f1 == f2){
            System.out.println("\nFuncionários 1 e 2 são iguais");
        } else {
            System.out.println("\nFuncionários 1 e 2 são diferentes");
        }
        
        Funcionario f3 = f1;
        if(f1 == f3){
            System.out.println("Funcionários 1 e 3 são iguais");
        } else {
            System.out.println("Funcionários 1 e 3 são diferentes");
        }
        
    }

}