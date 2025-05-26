package DaoImpl;

import Dao.CursoDAO;
import DaoImpl.GenericDAOImpl;
import Modelo.Curso;
import DaoImpl.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoDAOImpl extends GenericDAOImpl<Curso, Integer> implements CursoDAO {

    public CursoDAOImpl(Connection conn) {
        super(conn);
    }

    @Override
    public void guardar(Curso curso) {
        String sql = "INSERT INTO curso (materia) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, curso.getMateria());
            stmt.executeUpdate();
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) curso.setId(rs.getInt(1));
            }
            logger.info("Curso guardado: {}", curso);
        } catch (SQLException e) {
            logger.error("Error al guardar curso", e);
            throw new DAOException("No se pudo guardar el curso", e);
        }
    }

    @Override
    public Curso buscarPorId(Integer id) {
        String sql = "SELECT * FROM curso WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Curso(
                            rs.getInt("id"),
                            rs.getString("materia"),
                            new ArrayList<>()
                    );
                }
            }
        } catch (SQLException e) {
            logger.error("Error al buscar curso por ID", e);
            throw new DAOException("No se pudo buscar el curso", e);
        }
        return null;
    }

    @Override
    public List<Curso> listarTodos() {
        List<Curso> lista = new ArrayList<>();
        String sql = "SELECT * FROM curso";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Curso c = new Curso(
                        rs.getInt("id"),
                        rs.getString("materia"),
                        new ArrayList<>()
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            logger.error("Error al listar cursos", e);
            throw new DAOException("No se pudieron listar los cursos", e);
        }
        return lista;
    }

    @Override
    public void actualizar(Curso curso) {
        String sql = "UPDATE curso SET materia = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, curso.getMateria());
            stmt.setInt(2, curso.getId());
            stmt.executeUpdate();
            logger.info("Curso actualizado: {}", curso);
        } catch (SQLException e) {
            logger.error("Error al actualizar curso", e);
            throw new DAOException("No se pudo actualizar el curso", e);
        }
    }

    @Override
    public void eliminar(Integer id) {
        String sql = "DELETE FROM curso WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            logger.info("Curso eliminado con ID: {}", id);
        } catch (SQLException e) {
            logger.error("Error al eliminar curso", e);
            throw new DAOException("No se pudo eliminar el curso", e);
        }
    }

    @Override
    public Curso buscarPorMateria(String materia) {
        String sql = "SELECT * FROM curso WHERE materia = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, materia);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Curso(
                            rs.getInt("id"),
                            rs.getString("materia"),
                            new ArrayList<>()
                    );
                }
            }
        } catch (SQLException e) {
            logger.error("Error al buscar curso por materia", e);
            throw new DAOException("No se pudo buscar el curso por materia", e);
        }
        return null;
    }
}

