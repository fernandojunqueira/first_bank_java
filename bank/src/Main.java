import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = "Fernando Junqueira";
        String typeAccount = "Conta Corrente";
        double amount = 2500.0;

        String account = String.format("""
                *********************************************
                Nome:            %s
                Tipo conta:      %s
                Saldo inicial:   R$ %.2f
                **********************************************
                """,name, typeAccount, amount );

        String options = """
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        System.out.println(account);
        int out = 0;
        while (out != 4){
            System.out.println(options);
            out = read.nextInt();

            switch (out) {
                case 1:
                    System.out.println(String.format("O saldo atual é R$ %.2f\n", amount));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:\n");
                    double valueReceived = read.nextDouble();
                    amount += valueReceived;
                    System.out.println(String.format("Saldo atualizado R$ %.2f\n", amount));
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:\n");
                    double valueTransfer = read.nextDouble();
                    if (valueTransfer <= amount){
                        amount -= valueTransfer;
                    }else {
                        System.out.println("Saldo insuficiente\n");
                    }
                    System.out.println(String.format("Saldo atualizado R$ %.2f\n", amount));
                    break;
                default:
                    System.out.println("Opção inválida\n");
                    break;
            }
        }

    }
}