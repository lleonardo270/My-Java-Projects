package Edu.lucas.segundasemana;
public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Lucas";
        String segundoNome = "Leonardo";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método "+ primeiroNome.concat(" ").concat(segundoNome);

    }
}
