import dao.ListaTarefasDao;
import dao.LoginDao;
import model.Login;

public class Main {


    public static void main(String[] args) {
        LoginDao loginDao;
        loginDao = new LoginDao();
        ListaTarefasDao listaTarefasDao;
        listaTarefasDao = new ListaTarefasDao();

        FormLogin formLogin = new FormLogin(loginDao, listaTarefasDao);
        formLogin.setVisible(true);


    }
}