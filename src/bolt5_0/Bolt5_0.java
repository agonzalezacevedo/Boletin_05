package bolt5_0;

/**
 * @author agonzalezacevedo
 */
public class Bolt5_0 {

    public static void main(String[] args) {
        Conta co = new Conta("Manuel", "43875525", 1200);
        co.amosar();
        co.reintegrar(100);
        co.amosar();
        co.ingresar(-150);
        co.amosar();
        Conta co2 = new Conta("Samuel", "47876989", 300);
        co.transferencia(co2, 60);
        co.amosar();
        co2.amosar();
    }

}
