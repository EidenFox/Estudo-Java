package DAO;
import Modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {
    public boolean inserir(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");
            return true;
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }


    public List<Produto> listarTodos(boolean estado) {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto WHERE state = ? ORDER BY id ASC";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, estado);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Produto p = new Produto();
                    p.setID(rs.getInt("id"));
                    p.setNome(rs.getString("nome"));
                    p.setPreco(rs.getDouble("preco"));
                    p.setQuantidade(rs.getInt("quantidade"));
                    produtos.add(p);
                }
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }

        return produtos;
    }


    public boolean atualizar(Produto produto){
        String sql = "UPDATE produto SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getID());
            stmt.executeUpdate();
            System.out.println("Produto Atualizado com sucesso!");
            return true;
        }catch (SQLException e){
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(int id){
        String sql = "UPDATE produto SET state = 0 WHERE id = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Produto inativado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
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
