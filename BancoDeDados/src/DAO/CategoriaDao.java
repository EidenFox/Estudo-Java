package DAO;

import Modelo.Categoria;
import Modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDao {
    public boolean inserir(Categoria categoria){
        String sql = "insert into categoria (nomeCategoria, descricaoCategoria) values (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getDescicao());
            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");
            return true;
        }catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }


    public boolean alterarEstado(int id, boolean estado){
        if(!estado){
            String sql = "UPDATE categoria SET estadoCategoria = 0 WHERE id = ?";
            try(Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                System.out.println("Categoria desativada com sucesso!");
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }else{
            String sql = "UPDATE categoria SET estadoCategoria = 1 WHERE id = ?";
            try(Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                System.out.println("Categoria reativada com sucesso!");
                return true;
            } catch (Exception e) {
                System.out.println("Erro: "+ e.getMessage());
                e.printStackTrace();
            }
        }
        return false;
    }



    public List<Categoria> categoriaList(Boolean estado){
        List<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria WHERE estadoCategoria = ? ORDER BY id ASC";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, estado);
            try(ResultSet rs = stmt.executeQuery()){
                while (rs.next()){
                    Categoria c = new Categoria();
                    c.setNome(rs.getString("nomeCategoria"));
                    c.setID(rs.getInt("id"));
                    c.setDescicao(rs.getString("descricaoCategoria"));
                    c.setState(rs.getBoolean("estadoCategoria"));
                    categorias.add(c);
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }

        return categorias;
    }



    public boolean atualizar(Categoria categoria){
        String sql = "UPDATE categoria SET nomeCategoria = ?, descricaoCategoria = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getDescicao());
            stmt.setInt(3, categoria.getID());
            stmt.executeUpdate();
            System.out.println("Categoria Atualizado com sucesso!");
            return true;
        }catch (SQLException e){
            System.out.println("Erro: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }



}
