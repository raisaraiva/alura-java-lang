import test.ValidaConta;
import test.ValidaString;
import test.ValidaTributavel;

public class Program {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("ValidaString");
        System.out.println("--------------------------------");
        ValidaString.test();
        System.out.println("--------------------------------");
        System.out.println("ValidaConta");
        System.out.println("--------------------------------");
        ValidaConta.test();
        System.out.println("--------------------------------");
        System.out.println("ValidaTributavel");
        System.out.println("--------------------------------");
        ValidaTributavel.test();
    }
}
