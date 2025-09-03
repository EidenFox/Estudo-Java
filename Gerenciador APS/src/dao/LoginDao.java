package dao;

import model.Login;

import java.util.ArrayList;

public class LoginDao {
    public ArrayList<Login> lista;


    public LoginDao(){
        lista = new ArrayList<>();
        lista.add(new Login("Admin", "admin@admin.com", "admin123", "26/08/2025", "", "Administrador", 0));
        lista.add(new Login("Daniel", "3rcafe@gmail.com", "12345", "26/08/2025", "", "Administrador", 1));
    }

    public ArrayList<Login> getLista() {
        return lista;
    }

    public boolean inserirLogin(Login login) {
        return lista.add(login);
    }

    public void listar(){

    }
    public void buscarPorId(int id) {
    }
    public void autalizar(Login login) {
    }
    public void autalizarStatus(Login login, boolean status) {
    }
    public int returnID(){
        return lista.getLast().getID();
    }

    public boolean validarLogin(String email, String senha){
        for (int i=0; i < this.getLista().size(); i++){
            if (email.equals(this.getLista().get(i).getEmail()) && senha.equals(this.getLista().get(i).getSenha())){
                return true;
            }
        }
        return false;
    }

}
