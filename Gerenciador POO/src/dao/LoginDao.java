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
    public Login buscarPorNome(String nome){
        for (Login l : lista){
            if (nome.equals(l.getNome())){
                return l;
            }
        }
        return null;
    }
    public Login buscarPorId(int id) {
        for (Login l : lista){
            if (id == l.getID()){
                return l;
            }
        }
        return null;
    }
    public void autalizar(Login login) {
    }
    public void autalizarStatus(Login login, boolean status) {
    }

    public int returnID(){
        return lista.getLast().getID()+1;
    }

}
