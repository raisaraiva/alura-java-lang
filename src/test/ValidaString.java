package test;

public class ValidaString {

    public static void test() {

        String vazio = "     Alura    ";
        String outroVazio = vazio.trim();

        System.out.println(vazio.contains("Alu"));
        System.out.println(outroVazio);

        String nome = "Alura";

        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}
