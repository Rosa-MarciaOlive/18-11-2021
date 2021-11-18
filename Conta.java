abstract class Conta{
    //É uma classe de modelo que é obrigada escrever 
    //todos os metodos do método
    //Quem erdar não pode mudar o nome
    //herdar 2 abstrata? não pode.
    private double saldo;

    public double getSaldo() {
        return saldo;
    }public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    //1 linha, modelo do método
    public abstract void imprimeExtrato();
      
    public abstract int idade();

}