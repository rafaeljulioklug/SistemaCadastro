import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JLabel emailTextLabel;
    private JTextField emailLoginTextField;
    private JLabel senhaTextLabel;
    private JPasswordField senhaLoginPassField;
    private JButton loginButton;
    private JButton cadastroButton;
    private JPanel MainPainel;
    private JTextField emailCadastroTextField;
    private JPasswordField senhaCadastroPassField;

    private SistemaLogin sistema = new SistemaLogin();

    public Main() {
        setContentPane(MainPainel);
        setTitle("Sistema Cadastro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailLoginTextField.getText();
                String senha = new String(senhaLoginPassField.getPassword());

                if (sistema.autenticar(email, senha)) {
                    JOptionPane.showMessageDialog(Main.this, "✅ Login realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "❌ Email ou senha inválidos.");
                }
            }
        });

        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailCadastroTextField.getText();
                String senha = new String(senhaCadastroPassField.getPassword());

                if (sistema.cadastrarUsuario(email, senha)) {
                    JOptionPane.showMessageDialog(Main.this, "✅ Cadastro realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "❌ Cadastro falhou. Verifique os dados ou se o email já está cadastrado.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
