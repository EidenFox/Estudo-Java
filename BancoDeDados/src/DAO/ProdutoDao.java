package DAO;
import Modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {
    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
        }
    }


    public List<Produto> listarTodos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "Select * from produto WHERE state = 1 order by id ASC";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Produto p = new Produto();
                p.setID(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getDouble("preco"));
                p.setQuantidade(rs.getInt("quantidade"));
                produtos.add(p);
            }
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
        }

        return produtos;
    }

    public void atualizar(Produto produto){
        String sql = "UPDATE produto SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getID());
            stmt.executeUpdate();
            System.out.println("Produto Atualizado com sucesso!");

        }catch (SQLException e){
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public void excluir(int id){
        String sql = "UPDATE produto SET state = 0 WHERE id = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Produto inativado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public void reativar(int id){
        String sql = "UPDATE produto SET state = 1 WHERE id = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Produto ativado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
        }
    }

}
