package modelos;

import java.sql.*;

public class InformanteDAO {
    Connection conexion;

    InformanteDAO() {
        conexion = new MySQLConexion().getConnection();
    }

    /// # METHODS PARA INSERTAR DATOS EN LA BASE DE DATOS

    // Method para insertar datos en la tabla informante
    public boolean registrarInformante(Informante informante, int idFallecido) {
        final String INSERT_QUERY = "INSERT INTO informante(id_fallecido, nombre, apellido_paterno, apellido_materno, " +
                "parentesco_fallecido) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            setPreparedStatementValor(preparedStatement, 2, informante.getNombre());
            setPreparedStatementValor(preparedStatement, 3, informante.getApellidoPaterno());
            setPreparedStatementValor(preparedStatement, 4, informante.getApellidoMaterno());
            setPreparedStatementValor(preparedStatement, 5, informante.getParentescoFallecido());

            // Ejecutar query y retornar valor
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar datos en la tabla informante: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return false;
    }

    /// # METHODS PARA OBTENER INFORMACION DE LA BASE DE DATOS

    // Method para obtener datos de la tabla informante por idFallecido
    public Informante getInformante(int idFallecido) {
        Informante informante;
        final String SELECT_QUERY = "SELECT nombre, apellido_paterno, apellido_materno, parentesco_fallecido " +
                "FROM informante WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                informante = new Informante();
                informante.setNombre(resultSet.getString("nombre"));
                informante.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                informante.setApellidoMaterno(resultSet.getString("apellido_materno"));
                informante.setParentescoFallecido(resultSet.getString("parentesco_fallecido"));
                return informante;
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener datos de la tabla informante: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return null;
    }

    /// # METHODS AUXILIARES

    // Méthod auxiliar para establecer valores en el PreparedStatement
    private void setPreparedStatementValor(PreparedStatement ps, int indice, String valor) throws SQLException {
        if (valor != null) {
            ps.setString(indice, valor);
        } else {
            ps.setNull(indice, Types.VARCHAR);
        }
    }
}
