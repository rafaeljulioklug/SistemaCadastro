public class ValidadorSenha {
    public static boolean validar(String senha) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        return senha.matches(regex);
    }
}
