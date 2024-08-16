public class AccountValidation {

    public static void validationMoneyAccount(Account destinyAccount, double value) {
        if(destinyAccount.getBalance() < value){
            throw new RuntimeException("Dinheiro em conta insuficiente");
        }
    }

    public static void validationSpecialCheck(Current destinyAccount, double value) {
        if ((destinyAccount.getSpecialCheck()+destinyAccount.getBalance()) < value){
            throw new RuntimeException("Valor indisponivel no cheque especial");
        }
    }

    // Todos os metodos dessa classe precisam de exception ou runtimeExceptions
    // Nenhum metodo aqui precisa de retorno (ou seja, todos void)

    //validacao se possui saldo na conta para transferencias e saques
    // validacao se tem saldo em cheque especial para transferencias sem saldo (apenas para contas corrente)

}
