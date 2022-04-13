public class NovaConta {
    int numero = 1;
    double saldo;
    public NovaConta (double saldo) {
        setnumero();
        setsaldo(saldo);
    }
    public NovaConta(){
    }
    public int getnumero() {
        return numero;
    }
    public void setnumero() {
        this.numero = this.numero + 1;
    }
    public Double getsaldo() {
	    return saldo;
    }
    public void setsaldo(double saldo) {
	    this.saldo = saldo;
    }
    void credito(double valor) {
        this.saldo = this.saldo + valor;
    }
    void debito(double valor) {
        this.saldo = this.saldo - valor;
    }       
    public void exibedados() {
        System.out.println("Conta: " + getnumero());
        System.out.printf("Saldo: R$ %.2f\n", getsaldo());
    }     
}
