public class Cuenta
{
    private double numCuenta;
    private double saldo;

    public Cuenta(double numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public double getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(double numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirarDinero(double cantRetirar) throws SaldoInsuficienteException
    {
        if(cantRetirar > this.saldo)
        {
            throw new SaldoInsuficienteException("Error, saldo INSUFICIENTE");
        }
        else
        {
            this.saldo -= cantRetirar;
        }

    }
}
