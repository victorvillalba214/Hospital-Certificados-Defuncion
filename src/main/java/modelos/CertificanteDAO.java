package modelos;

import java.sql.*;

public class CertificanteDAO {
    Connection conexion;

    public CertificanteDAO() {
        conexion = new MySQLConexion().getConnection();
    }

    // Method para insertar datos en la tabla certificante
    public boolean registrarCertificante(Certificante certificante) {
        final String INSERT_QUERY = "INSERT INTO certificante(certificante, especifique_certificante, nombre, " +
                "apellido_paterno, apellido_materno, numero_cedula_profesional) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_QUERY)) {
            setPreparedStatementValor(preparedStatement, 1, certificante.getCertificante());
            setPreparedStatementValor(preparedStatement, 2, certificante.getEspecifiqueCertificante());
            setPreparedStatementValor(preparedStatement, 3, certificante.getNombre());
            setPreparedStatementValor(preparedStatement, 4, certificante.getApellidoPaterno());
            setPreparedStatementValor(preparedStatement, 5, certificante.getApellidoMaterno());
            setPreparedStatementValor(preparedStatement, 6, certificante.getNumeroCedulaProfesional());

            // Ejecutar query y retornar resultado
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar datos en la tabla certificante: " + e.getMessage());
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

    //Method para insertar datos en la tabla certificante_domicilio
    public boolean registrarCertificanteDomicilio(Certificante certificante, int idCertificante) {
        final String INSERT_QUERY = "INSERT INTO certificante_domicilio(id_certificante, tipo_vialidad, vialidad_nombre, " +
                "numero_exterior, numero_interior, tipo_asentamiento_humano, nombre_asentamiento_humano, codigo_postal, " +
                "localidad, municipio_alcaldia, entidad_federativa, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setInt(1, idCertificante);
            setPreparedStatementValor(preparedStatement, 2, certificante.getTipoVialidad());
            setPreparedStatementValor(preparedStatement, 3, certificante.getVialidadNombre());
            setPreparedStatementValor(preparedStatement, 4, certificante.getNumeroExterior());
            setPreparedStatementValor(preparedStatement, 5, certificante.getNumeroInterior());
            setPreparedStatementValor(preparedStatement, 6, certificante.getTipoAsentamientoHumano());
            setPreparedStatementValor(preparedStatement, 7, certificante.getNombreAsentamientoHumano());
            setPreparedStatementValor(preparedStatement, 8, certificante.getCodigoPostal());
            setPreparedStatementValor(preparedStatement, 9, certificante.getLocalidad());
            setPreparedStatementValor(preparedStatement, 10, certificante.getMunicipioAlcaldia());
            setPreparedStatementValor(preparedStatement, 11, certificante.getEntidadFederativa());
            setPreparedStatementValor(preparedStatement, 12, certificante.getTelefono());

            // Ejecutar query y retornar resultado
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar datos en la tabla certificante_domicilio: " + e.getMessage());
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

    //TODO revisar si retornar el id solo por verificar el nombre es correcto
    // Method para retornar el id del Certificante
    public int getIdCertificante(Certificante certificante) {
        final String INSERT_QUERY = "SELECT id_certificante FROM certificante "
                + "WHERE nombre = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, certificante.getNombre());
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                return resultset.getInt("id_certificante");
            }
        } catch (SQLException e) {
            System.err.println("Error al recuperar el id del Certificante: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al intentar cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return -1;
    }

    // Méthod auxiliar para establecer valores en el PreparedStatement
    private void setPreparedStatementValor(PreparedStatement ps, int indice, String valor) throws SQLException {
        if (valor != null) {
            ps.setString(indice, valor);
        } else {
            ps.setNull(indice, Types.VARCHAR);
        }
    }
}
