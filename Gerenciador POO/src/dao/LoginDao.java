package dao;

import model.Login;

import java.util.ArrayList;

public class LoginDao {

    public ArrayList<Login> lista;

    public LoginDao(){
        lista = new ArrayList<>();
    }

    public ArrayList<Login> getLista() {
        return lista;
    }
    public void cadastrar(Login login) {
        lista.add(login);
    }
    public void listar(){
    }
    public void buscarPorId(int id) {
    }
    public void autalizar(Login login) {
    }
    public void autalizarStatus(Login login, boolean status) {
    }

}
