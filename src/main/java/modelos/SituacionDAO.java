package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class SituacionDAO {

    Connection conexion;

    public SituacionDAO() {
        conexion = new MySQLConexion().getConnection();
    }

    /// # METHODS PARA INSERTAR EN TABLAS DE SITUACION

    public boolean registrarSituacion(Situacion situacion, int idFallecido) {
        final String INSERT_QUERY = "INSERT INTO situacion(id_fallecido, durante_trabajo, lugar_lesion, "
                + "acta_numero, relacion_agresor_fallecido) "
                + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setInt(1, idFallecido); // Establece el id_fallecido
            setPreparedStatementValor(preparedStatement, 2, situacion.getDuranteTrabajo());
            setPreparedStatementValor(preparedStatement, 3, situacion.getLugarLesion());
            setPreparedStatementValor(preparedStatement, 4, situacion.getActaNumero());
            setPreparedStatementValor(preparedStatement, 5, situacion.getRelacionAgresorFallecido());

            // Ejecutar query y retornar resultado
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al registrar en la tabla situacion: " + e.getMessage());
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

    public boolean registrarSituacionAgresion(Situacion situacion, int idSituacion) {
        final String INSERT_QUERY = "INSERT INTO situacion_agresion(id_situacion, situacion_agresion, descripcion_agresion) "
                + "VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setInt(1, idSituacion); // Usar el id_situacion
            setPreparedStatementValor(preparedStatement, 2, situacion.getSituacionAgresion());
            setPreparedStatementValor(preparedStatement, 3, situacion.getDescripcionAgresion());

            // Ejecutar query y retornar resultado
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al registrar en la tabla situacion_agresion: " + e.getMessage());
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

    // Méthod para insertar datos en la tabla situacion_domicilio
    public boolean registrarSituacionDomicilio(Situacion situacion, int idSituacion) {
        final String INSERT_QUERY = "INSERT INTO situacion_domicilio(id_situacion, tipo_vialidad, vialidad_nombre, "
                + "numero_exterior, numero_interior, tipo_asentamiento_humano, nombre_asentamiento_humano, "
                + "codigo_postal, localidad, municipio_alcaldia, entidad_federativa) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setInt(1, idSituacion); // Usar el id_situacion
            setPreparedStatementValor(preparedStatement, 2, situacion.getTipoVialidad());
            setPreparedStatementValor(preparedStatement, 3, situacion.getVialidadNombre());
            setPreparedStatementValor(preparedStatement, 4, situacion.getNumeroExterior());
            setPreparedStatementValor(preparedStatement, 5, situacion.getNumeroInterior());
            setPreparedStatementValor(preparedStatement, 6, situacion.getTipoAsentamientoHumano());
            setPreparedStatementValor(preparedStatement, 7, situacion.getNombreAsentamientoHumano());
            setPreparedStatementValor(preparedStatement, 8, situacion.getCodigoPostal());
            setPreparedStatementValor(preparedStatement, 9, situacion.getLocalidad());
            setPreparedStatementValor(preparedStatement, 10, situacion.getMunicipioAlcaldia());
            setPreparedStatementValor(preparedStatement, 11, situacion.getEntidadFederativa());

            // Ejecutar query y retornar resultado
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al registrar en la tabla situacion_domicilio: " + e.getMessage());
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

    /// # METHODS PARA OBTENER DATOS DE TABLAS DE SITUACION

    public int getIdSituacionByIdFallecido(int idFallecido) {
        int idSituacion = -1;
        final String SELECT_QUERY = "SELECT id_situacion FROM situacion WHERE id_fallecido = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                idSituacion = resultSet.getInt("id_situacion");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener id_situacion por id_fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return idSituacion;
    }

    public Situacion getSituacionByIdFallecido(int idFallecido) {
        Situacion situacion = null;
        final String SELECT_QUERY = "SELECT durante_trabajo, lugar_lesion, acta_numero, relacion_agresor_fallecido "
                + "FROM situacion WHERE id_fallecido = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                situacion = new Situacion();
                situacion.setDuranteTrabajo(resultSet.getString("durante_trabajo"));
                situacion.setLugarLesion(resultSet.getString("lugar_lesion"));
                situacion.setActaNumero(resultSet.getString("acta_numero"));
                situacion.setRelacionAgresorFallecido(resultSet.getString("relacion_agresor_fallecido"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener situación por id_fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return situacion;
    }

    public Situacion getSituacionAgresionByIdSituacion(int idSituacion) {
        Situacion situacion = null;
        final String SELECT_QUERY = "SELECT situacion_agresion, descripcion_agresion "
                + "FROM situacion_agresion WHERE id_situacion = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idSituacion);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                situacion = new Situacion();
                situacion.setSituacionAgresion(resultSet.getString("situacion_agresion"));
                situacion.setDescripcionAgresion(resultSet.getString("descripcion_agresion"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener situación de agresión por id_situacion: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return situacion;
    }

    public Situacion getSituacionDomicilioByIdSituacion(int idSituacion) {
        Situacion situacion = null;
        final String SELECT_QUERY = "SELECT tipo_vialidad, vialidad_nombre, numero_exterior, numero_interior, "
                + "tipo_asentamiento_humano, nombre_asentamiento_humano, codigo_postal, localidad, municipio_alcaldia, entidad_federativa "
                + "FROM situacion_domicilio WHERE id_situacion = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idSituacion);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                situacion = new Situacion();
                situacion.setTipoVialidad(resultSet.getString("tipo_vialidad"));
                situacion.setVialidadNombre(resultSet.getString("vialidad_nombre"));
                situacion.setNumeroExterior(resultSet.getString("numero_exterior"));
                situacion.setNumeroInterior(resultSet.getString("numero_interior"));
                situacion.setTipoAsentamientoHumano(resultSet.getString("tipo_asentamiento_humano"));
                situacion.setNombreAsentamientoHumano(resultSet.getString("nombre_asentamiento_humano"));
                situacion.setCodigoPostal(resultSet.getString("codigo_postal"));
                situacion.setLocalidad(resultSet.getString("localidad"));
                situacion.setMunicipioAlcaldia(resultSet.getString("municipio_alcaldia"));
                situacion.setEntidadFederativa(resultSet.getString("entidad_federativa"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener domicilio de situación por id_situacion: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return situacion;
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
