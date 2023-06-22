/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo14;

/**
 *
 * @author ficdev
 */
public class StudentDaoImpl implements StudentDao {
    private DataSource ds;

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public Student findById(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ds.getConnection();
            ps = con.prepareStatement("SELECT * FROM estudante WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Student stud = new Student();
                stud.setId(rs.getInt("id"));
                stud.setName(rs.getString("nome_estudante"));
                stud.setCity(rs.getString("cidade"));
                return stud;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

}
      @Override
    public void save(Student stud) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ds.getConnection();
            ps = con.prepareStatement("INSERT INTO estudante (nome_estudante, cidade) VALUES (?, ?)");
            ps.setString(1, stud.getName());
            ps.setString(2, stud.getCity());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void update(Student stud) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ds.getConnection();
            ps = con.prepareStatement("UPDATE estudante SET nome_estudante = ?, cidade = ? WHERE id = ?");
            ps.setString(1, stud.getName());
            ps.setString(2, stud.getCity());
            ps.setInt(3, stud.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
}
}
