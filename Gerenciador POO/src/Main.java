import dao.LoginDao;
import model.Login;

import java.util.Scanner;

public class Main {

    static LoginDao loginDao = new LoginDao();

    public static void main(String[] args) {

        loginDao.cadastrar(new Login(1, "admin", "admin@admin.com", "admin", "18/08/2025", ""));

//        /*  //carga de sistema
        loginDao.cadastrar(new Login(2, "Daniel", "3rcafe@gmail.com", "senha123", "18/08/2025", ""));
        loginDao.cadastrar(new Login(3, "Alice", "alice@example.com", "senha123", "01/01/2025", ""));
        loginDao.cadastrar(new Login(5, "Bruno", "bruno@example.com", "123456", "15/02/2025", ""));
        loginDao.cadastrar(new Login(6, "Carla", "carla@example.com", "abc123", "20/03/2025", ""));
        loginDao.cadastrar(new Login(7, "Diego", "diego@example.com", "senhaSegura!", "05/04/2025", ""));
        loginDao.cadastrar(new Login(8, "Eva", "eva@example.com", "minhaSenha", "10/05/2025", ""));
        loginDao.cadastrar(new Login(9, "Fernando", "fernando@example.com", "senha123", "25/06/2025", ""));
        loginDao.cadastrar(new Login(10, "Giulia", "giulia@example.com", "senha456", "30/07/2025", ""));
        loginDao.cadastrar(new Login(11, "Henrique", "henrique@example.com", "pass789", "12/08/2025", ""));
        loginDao.cadastrar(new Login(12, "Isabela", "isabela@example.com", "senha321", "18/08/2025", ""));
        loginDao.cadastrar(new Login(13, "João", "joao@example.com", "joaoSenha", "18/08/2025", ""));
//        */

        boolean continuar = false;
        int op;
        Scanner scan = new Scanner(System.in);
        do{

        System.out.println("⌜----------------------⌝");
        System.out.println("|--------MENU----------|");
        System.out.println("⌞----------------------⌟");
        System.out.println("[1] Cadastro de Usuários.");
        System.out.println("[2] Listar Usuários.");
        System.out.println("[3] Buscar Usuário.");
        System.out.println("[4] Alterar Registro.");
        System.out.println("[0] Sair.");
        op = scan.nextInt();
        scan.nextLine();

        switch (op){
            case 1:
                Login login = new Login();
                System.out.println("Cadastro de Usuário.\n");
                do{
                    System.out.println("Informe o nome do usuário: ");
                    if(login.setNome(scan.nextLine())){
                        continuar = true;
                  }else System.out.println("Nome não pode ser vazio");
                }while(continuar != true);

                do{
                    continuar = false;
                    System.out.println("Informe o e-mail: ");
                    if(login.setEmail(scan.nextLine())){
                        continuar = true;
                    }else System.out.println("email não pode ser vazio e deve conter \"@\"");
                }while (continuar != true);

                do{
                    continuar = false;
                System.out.println("Informe a Senha");
                    if(login.setSenha(scan.nextLine())){
                        continuar = true;
                    }else System.out.println("Senha não pode ser vazia");
                }while (continuar != true);

                login.setStatus(true);
                login.setDataCadastro("10-08-2025");
                  login.setID(loginDao.returnID());
//                System.out.println(loginDao.returnID());
//                login.setID(5);

                loginDao.cadastrar(login);

                break;
            case 2:
                if(!loginDao.getLista().isEmpty()){

                System.out.println("Lista de Usuários.");

                for (Login l : loginDao.getLista()){
                    System.out.println("------------------------");
                    System.out.println("ID: "+ l.getID());
                    System.out.println("Nome: "+ l.getNome());
                    System.out.println("E-mail: "+ l.getEmail());
                    System.out.println("Senha: "+ l.getSenha());
                    System.out.println("Status: "+ l.isStatus());
                    System.out.println("Data Cadastro: "+ l.getDataCadastro());
                    System.out.println("Data da Ultima Atualização: "+ l.getDataAtualizacao());
                }
                }else System.out.println("\nNenhum Usuário Cadastrado\n.");

                break;
            case 3:
                System.out.println("Deseja buscar por ID ou NOME?");
                switch(scan.nextLine().toLowerCase()){
                    case "nome":
                        System.out.println("Digite o nome que deseja buscar: ");
                        login = loginDao.buscarPorNome(scan.nextLine().toLowerCase());
                        if (login != null) {
                            System.out.println("------------------------");
                            System.out.println("ID: " + login.getID());
                            System.out.println("Nome: " + login.getNome());
                            System.out.println("E-mail: " + login.getEmail());
                            System.out.println("Senha: " + login.getSenha());
                            System.out.println("Status: " + login.isStatus());
                            System.out.println("Data Cadastro: " + login.getDataCadastro());
                            System.out.println("Data da Ultima Atualização: " + login.getDataAtualizacao());
                            System.out.println("------------------------");
                        }
//                        System.out.println(login);
                        break;
                    case "id":
                        System.out.println("Digite o ID que deseja buscar: ");
                        login = loginDao.buscarPorId(scan.nextInt());
                        if (login != null) {
                            System.out.println("------------------------");
                            System.out.println("ID: " + login.getID());
                            System.out.println("Nome: " + login.getNome());
                            System.out.println("E-mail: " + login.getEmail());
                            System.out.println("Senha: " + login.getSenha());
                            System.out.println("Status: " + login.isStatus());
                            System.out.println("Data Cadastro: " + login.getDataCadastro());
                            System.out.println("Data da Ultima Atualização: " + login.getDataAtualizacao());
                            System.out.println("------------------------");
                        }
//                        System.out.println(login);
                        break;
                    default:
                        System.out.println("Opção Não Inválida, Tente Novamente!\n");
                        break;
                }
                break;
            case 4:
                System.out.println("Digite o ID do usuário que deseja alterar: ");
                login = loginDao.buscarPorId(scan.nextInt());
                if (login != null) {
                    System.out.println("------------------------");
                    System.out.println("ID: " + login.getID());
                    System.out.println("Nome: " + login.getNome());
                    System.out.println("E-mail: " + login.getEmail());
                    System.out.println("Senha: " + login.getSenha());
                    System.out.println("Status: " + login.isStatus());
                    System.out.println("Data Cadastro: " + login.getDataCadastro());
                    System.out.println("Data da Ultima Atualização: " + login.getDataAtualizacao());
                    System.out.println("------------------------");
                    System.out.println("Deseja prosseguir com a auteração: [Sim] / [Não]");
                    scan.nextLine();
                    String alterar = scan.nextLine().toLowerCase().trim();
                    if(alterar.equals("sim")){
                        do{
                            System.out.println("Informe o novo nome: ");
                            if(login.setNome(scan.nextLine())){
                                continuar = true;
                            }else System.out.println("Nome não pode ser vazio");
                        }while(continuar != true);

                        do{
                            continuar = false;
                            System.out.println("Informe o novo e-mail: ");
                            if(login.setEmail(scan.nextLine())){
                                continuar = true;
                            }else System.out.println("email não pode ser vazio e deve conter \"@\"");
                        }while (continuar != true);

                        do{
                            continuar = false;
                            System.out.println("Informe a nova senha");
                            if(login.setSenha(scan.nextLine())){
                                continuar = true;
                            }else System.out.println("Senha não pode ser vazia");
                        }while (continuar != true);
                        System.out.println("Digite a data de hoje: ");
                        login.setDataAtualizacao(scan.nextLine());

                        System.out.println("------------------------");
                        System.out.println("--Alterado-com-sucesso--");
                        System.out.println("------------------------");
                        System.out.println("ID: " + login.getID());
                        System.out.println("Nome: " + login.getNome());
                        System.out.println("E-mail: " + login.getEmail());
                        System.out.println("Senha: " + login.getSenha());
                        System.out.println("Status: " + login.isStatus());
                        System.out.println("Data Cadastro: " + login.getDataCadastro());
                        System.out.println("Data da Ultima Atualização: " + login.getDataAtualizacao());
                        System.out.println("------------------------\n");
                    }else System.out.println("Cancelando...\n\n");
                }
                break;
            case 0:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção Inválida, Tente Novamente!");
                break;
        }

        }while(op != 5);


    }
}