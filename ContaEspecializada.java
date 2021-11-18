public class ContaEspecializada extends Conta{

    @Override//<-- metodo de sobreescreve(Tem o mesmo nome)
    public void imprimeExtrato(){
        System.out.println("Seu saldo é: "+getSaldo());
    }

    @Override
    public int idade(){
    int maioridade=18;
    return 0;
}
}
