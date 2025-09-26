package DAO;
import Modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDao {
    public  void inserir(Produto produto){
        String sql = "INSERT INTO produto (nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
