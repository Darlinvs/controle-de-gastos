import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double salario;
        double gasto;
        double debito;
        int opcao = 1;

        Scanner leitor = new Scanner(System.in);

        while (opcao == 1){
            System.out.println("Informe o seu salário:");
            salario = leitor.nextDouble();

            System.out.println("Informe seus gastos do mês:");
            gasto = leitor.nextDouble();
            
            debito = gasto - salario;

            if(gasto > salario){
                System.out.println("Seu gasto foi de $" +gasto+ " . Conta no vermelho! Você gastou demais e" +
                        " possui uma dívida de:" +debito+ ".");
            }else{
                System.out.println("Seu gasto foi de $" +gasto+ " . Mas tudo ok por aqui! Os gastos não ultrapassaram o salário!");
            }
            System.out.println("Deseja continuar? Digite [1] para sim ou [2] para não");
            opcao = leitor.nextInt();
        }
        

    }
}