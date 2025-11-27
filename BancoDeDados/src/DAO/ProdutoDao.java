package DAO;
import Modelo.Categoria;
import Modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {
    public boolean inserir(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco, quantidade, categoria) VALUES (?, ?, ?, ?)";


        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCategoria().getID());
            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso :>!");
            return true;
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }


    public List<Produto> listarTodos(boolean estado) {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto, categoria WHERE produto.state = ? AND produto.categoria = categoria.id ORDER BY produto.id ASC";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, estado);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Categoria c = new Categoria();
                    Produto p = new Produto();
                    p.setID(rs.getInt("id"));
                    p.setNome(rs.getString("nome"));
                    p.setPreco(rs.getDouble("preco"));
                    p.setQuantidade(rs.getInt("quantidade"));

                    c.setID(rs.getInt("id"));
                    c.setNome(rs.getString("nomeCategoria"));

                    p.setCategoria(c);
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
        String sql = "UPDATE produto SET nome = ?, preco = ?, quantidade = ?, categoria = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCategoria().getID());
            stmt.setInt(5, produto.getID());
            stmt.executeUpdate();
            System.out.println("Produto Atualizado com sucesso >w<!");
            return true;
        }catch (SQLException e){
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(int id){
        //Soft delete, não exclui, só deixa inativo
        String sql = "UPDATE produto SET state = 0 WHERE id = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Produto inativado com sucesso OwO!");
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
            System.out.println("Produto ativado com sucesso WoW!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
        }
    }

}
