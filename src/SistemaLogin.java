import java.util.HashMap;
import java.util.Map;

public class SistemaLogin {
    private final Map<String, Usuario> usuarios = new HashMap<>();

    public boolean cadastrarUsuario(String email, String senha) {
        if (!ValidadorEmail.validar(email) || !ValidadorSenha.validar(senha)) {
            return false;
        }
        if (usuarios.containsKey(email)) {
            return false; // já existe
        }
        usuarios.put(email, new Usuario(email, senha));
        return true;
    }

    public boolean autenticar(String email, String senha) {
        Usuario usuario = usuarios.get(email);
        return usuario != null && usuario.getSenha().equals(senha);
    }
}
