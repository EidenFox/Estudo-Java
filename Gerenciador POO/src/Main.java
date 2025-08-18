import dao.LoginDao;
import model.Login;

import java.util.Scanner;

public class Main {

    static LoginDao loginDao = new LoginDao();

    public static void main(String[] args) {

        loginDao.cadastrar(new Login("Daniel", "3rcafe@gmail.com", "senha123", "18/08/2025", ""));
        loginDao.cadastrar(new Login("Alice", "alice@example.com", "senha123", "01/01/2025", ""));
        loginDao.cadastrar(new Login("Bruno", "bruno@example.com", "123456", "15/02/2025", ""));
        loginDao.cadastrar(new Login("Carla", "carla@example.com", "abc123", "20/03/2025", ""));
        loginDao.cadastrar(new Login("Diego", "diego@example.com", "senhaSegura!", "05/04/2025", ""));
        loginDao.cadastrar(new Login("Eva", "eva@example.com", "minhaSenha", "10/05/2025", ""));
        loginDao.cadastrar(new Login("Fernando", "fernando@example.com", "senha123", "25/06/2025", ""));
        loginDao.cadastrar(new Login("Giulia", "giulia@example.com", "senha456", "30/07/2025", ""));
        loginDao.cadastrar(new Login("Henrique", "henrique@example.com", "pass789", "12/08/2025", ""));
        loginDao.cadastrar(new Login("Isabela", "isabela@example.com", "senha321", "18/08/2025", ""));
        loginDao.cadastrar(new Login("João", "joao@example.com", "joaoSenha", "18/08/2025", ""));


        boolean sair = false;
        int op;
        Scanner scan = new Scanner(System.in);
        do{

        System.out.println("⌜----------------------⌝");
        System.out.println("|--------MENU----------|");
        System.out.println("⌞----------------------⌟");
        System.out.println("[1] Cadastro de Usuários.");
        System.out.println("[2] Listar Usuários.");
        System.out.println("[3] .");
        System.out.println("[4] .");
        System.out.println("[5] Sair.");
        op = scan.nextInt();
        scan.nextLine();

        switch (op){
            case 1:
                Login login = new Login();
                System.out.println("Cadastro de Usuário.\n");
                System.out.println("Informe o nome do usuário: ");
                login.setNome(scan.nextLine());

                System.out.println("Informe o e-mail: ");
                login.setEmail(scan.nextLine());

                System.out.println("Informe a Senha");
                login.setSenha(scan.nextLine());

                login.setStatus(true);
                login.setDataCadastro("10-08-2025");

                loginDao.cadastrar(login);

                break;
            case 2:
                System.out.println("Lista de Usuários.");

                for (Login l : loginDao.getLista()){
                    System.out.println("------------------------");
                    System.out.println("Nome: "+l.getNome());
                    System.out.println("E-mail: "+ l.getEmail());
                    System.out.println("Senha: "+ l.getSenha());
                    System.out.println("Status: "+ l.isStatus());
                    System.out.println("Data Cadastro: "+ l.getDataCadastro());
                    System.out.println("Data da Ultima Atualização: "+ l.getDataAtualizacao());
                }

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Saindo");
                sair = true;
                break;
            default:
                System.out.println("Opção Inválida, Tente Novamente!");
                break;
        }

        }while(!sair);

    }
}