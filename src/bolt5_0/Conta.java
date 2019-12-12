package bolt5_0;

/**
 * @author agonzalezacevedo
 */
public class Conta {

    private String nome;
    private String nConta;
    private double saldoC;

    public Conta() {

    }

    public Conta(String nome, String nConta, double saldoC) {
        this.nome = nome;
        this.nConta = nConta;
        this.saldoC = saldoC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldoC() {
        return saldoC;
    }

    public void setSaldoC(double saldoC) {
        this.saldoC = saldoC;
    }

    public void ingresar(double ingreso) {
        if (ingreso < 0) {
            System.out.println("No puedes introducir numeros negativos");
            System.out.println("false");
        } else {
            saldoC = saldoC + ingreso;
            System.out.println("True");
        }
    }

    public void reintegrar(double reintegro) {
        if (reintegro < 0) {
            System.out.println("No puedes introducir numeros negativos");
            System.out.println("False");
        } else {
            if (saldoC > reintegro) {
                saldoC = saldoC - reintegro;
                System.out.println("true");
            } else {
                System.out.println("Non tes suficiente saldo na conta para retirar");
                System.out.println("False");
            }
        }
    }

    public void transferencia(Conta conta2, double importe) {
        this.saldoC = saldoC - importe;
        conta2.ingresar(importe);
    }

    public void amosar() {
        System.out.println(nome + " " + nConta + " " + saldoC);
    }
}
