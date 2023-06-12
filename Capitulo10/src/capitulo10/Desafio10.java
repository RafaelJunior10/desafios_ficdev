import java.sql.*;

public class Desafio10 {
    private static final String URL = "jdbc:postgresql://localhost:5432/ficdatabase";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "123456";

    public static void main(String[] args) {
        // Testando as operações CRUD
        criarEscola("Escola A", "Endereço A");
        criarEscola("Escola B", "Endereço B");

        System.out.println("=== Escolas cadastradas ===");
        listarEscolas();

        atualizarEscola(1, "Escola A Atualizada", "Novo Endereço A");

        System.out.println("=== Escolas atualizadas ===");
        listarEscolas();

        excluirEscola(2);

        System.out.println("=== Escolas após exclusão ===");
        listarEscolas();
    }

    public static void criarEscola(String nome, String endereco) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO escolas (nome, endereco) VALUES (?, ?)")) {
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.executeUpdate();
            System.out.println("Escola criada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar escola: " + e.getMessage());
        }
    }

    public static void listarEscolas() {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM escolas")) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                System.out.println("ID: " + id + ", Nome: " + nome + ", Endereço: " + endereco);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar escolas: " + e.getMessage());
        }
    }

    public static void atualizarEscola(int id, String nome, String endereco) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("UPDATE escolas SET nome = ?, endereco = ? WHERE id = ?")) {
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Escola atualizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar escola: " + e.getMessage());
        }
    }

    public static void excluirEscola(int id) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM escolas WHERE id = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Escola excluída com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir escola: " + e.getMessage());
        }
    }
}
