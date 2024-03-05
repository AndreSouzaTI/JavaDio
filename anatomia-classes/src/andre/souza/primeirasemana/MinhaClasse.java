package andre.souza.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Criando Classes");

        final String BR = "Brasil";
        final double PI = 3.14;
        final int ESTADOS_BRASILEIRO = 27;
        final int ANO_2024 = 2024;
        int idade = 36;
        double altura = 1.77;
        String meuNome = "André";
        boolean verdadeiro = false;
        String primeiroNome = "André";
        String segundoNome = "Souza";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome) + "!";
        
    }

}
