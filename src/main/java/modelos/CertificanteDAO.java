package modelos;

import java.sql.*;

public class CertificanteDAO {
    Connection conexion;

    public CertificanteDAO() {
        conexion = new MySQLConexion().getConnection();
    }

    /// # METHODS PARA INSERTAR DATOS EN LA BASE DE DATOS

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

    /// # METHODS PARA OBTENER DATOS DE LA BASE DE DATOS

    //TODO revisar si retornar el id solo por verificar el nombre es correcto
    // Method para retornar el id del Certificante por nombre del certificante
    public int getIdCertificante(String nombreCertificante) {
        final String INSERT_QUERY = "SELECT id_certificante FROM certificante "
                + "WHERE nombre = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, nombreCertificante);
            ResultSet resultset = preparedStatement.executeQuery();
            if (resultset.next()){
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

    //TODO revisar si retornar los datos solo por verificar el nombre es correcto
    // Method para obtener datos de la tabla certificante por nombre del certificante
    public Certificante getCertificante(int idCertificante) {
        Certificante certificante;
        final String SELECT_QUERY = "SELECT certificante, especifique_certificante, nombre, apellido_paterno, " +
                "apellido_materno, numero_cedula_profesional FROM certificante WHERE id_certificante = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idCertificante);
            ResultSet resultset = preparedStatement.executeQuery();
            if (resultset.next()) {
                certificante = new Certificante();
                certificante.setCertificante(resultset.getString("certificante"));
                certificante.setEspecifiqueCertificante(resultset.getString("especifique_certificante"));
                certificante.setNombre(resultset.getString("nombre"));
                certificante.setApellidoPaterno(resultset.getString("apellido_paterno"));
                certificante.setApellidoMaterno(resultset.getString("apellido_materno"));
                certificante.setNumeroCedulaProfesional(resultset.getString("numero_cedula_profesional"));
                return certificante;
            }
        } catch (SQLException e) {
            System.err.println("Error al recuperar los datos de la tabla certificante: " + e.getMessage());
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

    // Method para obtener datos de la tabla certificante_domicilio
    public Certificante getCertificanteDomicilio(int idCertificante) {
        Certificante certificante;
        final String SELECT_QUERY = "SELECT tipo_vialidad, vialidad_nombre, numero_exterior, numero_interior, " +
                "tipo_asentamiento_humano, nombre_asentamiento_humano, codigo_postal, localidad, municipio_alcaldia, " +
                "entidad_federativa, telefono FROM certificante_domicilio WHERE id_certificante = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idCertificante);
            ResultSet resultset = preparedStatement.executeQuery();
            if (resultset.next()) {
                certificante = new Certificante();
                certificante.setTipoVialidad(resultset.getString("tipo_vialidad"));
                certificante.setVialidadNombre(resultset.getString("vialidad_nombre"));
                certificante.setNumeroExterior(resultset.getString("numero_exterior"));
                certificante.setNumeroInterior(resultset.getString("numero_interior"));
                certificante.setTipoAsentamientoHumano(resultset.getString("tipo_asentamiento_humano"));
                certificante.setNombreAsentamientoHumano(resultset.getString("nombre_asentamiento_humano"));
                certificante.setCodigoPostal(resultset.getString("codigo_postal"));
                certificante.setLocalidad(resultset.getString("localidad"));
                certificante.setMunicipioAlcaldia(resultset.getString("municipio_alcaldia"));
                certificante.setEntidadFederativa(resultset.getString("entidad_federativa"));
                certificante.setTelefono(resultset.getString("telefono"));
                return certificante;
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la información de la tabla certificante_domicilio: " + e.getMessage());
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
