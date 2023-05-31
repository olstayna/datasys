package datasys;

public class Datasys {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new TelaLogin().setVisible(true);
            
            if(UserSession.getInstance().isLoggedIn()) {
                TelaMenu telamenu = new TelaMenu();
                String username = UserSession.getInstance().getLoggedInUser();
                TelaMenu.nome_usuario.setText("RA: "+username);
                telamenu.setVisible(true);
                TelaGerenciamento.nome_usuario.setText("RA: "+username);
            }
        }
    });
    }
}
