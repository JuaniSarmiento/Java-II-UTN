package DaoImpl;

import Dao.AlumnoDAO;
import DaoImpl.GenericDAOImpl;
import Modelo.Alumno;
import DaoImpl.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAOImpl extends GenericDAOImpl<Alumno, Integer> implements AlumnoDAO {

    public AlumnoDAOImpl(Connection conn) {
        super(conn);
    }

    @Override
    public void guardar(Alumno alumno) {
        String sql = "INSERT INTO alumno (nombre, apellido, curso_id, promedio) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, alumno.getNombre());
            stmt.setString(2, alumno.getApellido());
            stmt.setInt(3, alumno.getCurso());
            stmt.setDouble(4, alumno.getPromedio());
            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    alumno.setId(rs.getInt(1));
                }
            }

            logger.info("Alumno guardado: {}", alumno);
        } catch (SQLException e) {
            logger.error("Error al guardar alumno", e);
            throw new DAOException("No se pudo guardar el alumno", e);
        }
    }

    @Override
    public Alumno buscarPorId(Integer id) {
        String sql = "SELECT * FROM alumno WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Alumno(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("curso_id"),
                            rs.getDouble("promedio")
                    );
                }
            }
        } catch (SQLException e) {
            logger.error("Error al buscar alumno por ID", e);
            throw new DAOException("No se pudo buscar el alumno", e);
        }
        return null;
    }

    @Override
    public List<Alumno> listarTodos() {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumno";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Alumno alumno = new Alumno(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("curso_id"),
                        rs.getDouble("promedio")
                );
                lista.add(alumno);
            }

        } catch (SQLException e) {
            logger.error("Error al listar alumnos", e);
            throw new DAOException("No se pudieron listar los alumnos", e);
        }
        return lista;
    }

    @Override
    public void actualizar(Alumno alumno) {
        String sql = "UPDATE alumno SET nombre = ?, apellido = ?, curso_id = ?, promedio = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, alumno.getNombre());
            stmt.setString(2, alumno.getApellido());
            stmt.setInt(3, alumno.getCurso());
            stmt.setDouble(4, alumno.getPromedio());
            stmt.setInt(5, alumno.getId());
            stmt.executeUpdate();
            logger.info("Alumno actualizado: {}", alumno);
        } catch (SQLException e) {
            logger.error("Error al actualizar alumno", e);
            throw new DAOException("No se pudo actualizar el alumno", e);
        }
    }

    @Override
    public void eliminar(Integer id) {
        String sql = "DELETE FROM alumno WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            logger.info("Alumno eliminado con ID: {}", id);
        } catch (SQLException e) {
            logger.error("Error al eliminar alumno", e);
            throw new DAOException("No se pudo eliminar el alumno", e);
        }
    }

    @Override
    public List<Alumno> buscarPorCurso(int cursoId) {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumno WHERE curso_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cursoId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Alumno a = new Alumno(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("curso_id"),
                            rs.getDouble("promedio")
                    );
                    lista.add(a);
                }
            }
        } catch (SQLException e) {
            logger.error("Error al buscar alumnos por curso", e);
            throw new DAOException("No se pudo buscar alumnos por curso", e);
        }
        return lista;
    }
}

