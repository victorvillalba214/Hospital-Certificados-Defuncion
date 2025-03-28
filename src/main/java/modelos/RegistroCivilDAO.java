package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;

public class RegistroCivilDAO {

    Connection conexion;

    public RegistroCivilDAO() {
        conexion = new MySQLConexion().getConnection();
    }

    /// # METHODS PARA INSERTAR EN LA BASE DE DATOS

    public boolean registrarRegistroCivil(RegistroCivil registro, int idFallecido) {
        // idFallecido es la FK de la tabla registro_civil que se conecta con la tabla fallecido
        String query = "INSERT INTO registro_civil (id_fallecido, numero, numero_libro, numero_acta, fecha_registro) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
            LocalDate fechaRegistro = LocalDate.of(registro.getAnioRegistro(), registro.getMesRegistro(), registro.getDiaRegistro());
            Date sqlFechaRegistro = Date.valueOf(fechaRegistro);

            // Establecer los parámetros en el preparedStatement
            preparedStatement.setInt(1, idFallecido);  // ID del fallecido (FK)
            preparedStatement.setString(2, registro.getNumero());
            preparedStatement.setString(3, registro.getNumeroLibro());
            preparedStatement.setString(4, registro.getNumeroActa());
            preparedStatement.setDate(5, sqlFechaRegistro);

            // Ejecutar la actualización
            int numRegistrosAfectados = preparedStatement.executeUpdate();

            // Retornar true si la inserción fue exitosa
            return numRegistrosAfectados > 0;
        } catch (SQLException e) {
            System.out.println(e);
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

    public boolean registrarRegistroCivilLugar(RegistroCivil registro, int idRegistroCivil) {
        // idRegistroCivil es la FK de la tabla registro_civil_lugar que se conecta con la tabla registro_civil
        String query = "INSERT INTO registro_civil_lugar (id_registro_civil, localidad, municipio_alcaldia, entidad_federativa) "
                + "VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
            // Establecer los parámetros en el preparedStatement
            preparedStatement.setInt(1, idRegistroCivil);  // ID del registro civil (FK)
            preparedStatement.setString(2, registro.getLocalidad());
            preparedStatement.setString(3, registro.getMunicipioAlcaldia());
            preparedStatement.setString(4, registro.getEntidadFederativa());

            // Ejecutar la actualización
            int numRegistrosAfectados = preparedStatement.executeUpdate();

            // Retornar true si la inserción fue exitosa
            return numRegistrosAfectados > 0;
        } catch (SQLException e) {
            System.out.println(e);
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

    /// # METHODS PARA OBTENER REGISTRO CIVIL

    public int getIdRegistroCivilByIdFallecido(int idFallecido) {
        int idRegistroCivil = -1;
        final String SELECT_QUERY = "SELECT id_registro_civil FROM registro_civil WHERE id_fallecido = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                idRegistroCivil = resultSet.getInt("id_registro_civil");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener id_registro_civil por id_fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return idRegistroCivil;
    }

    public RegistroCivil getRegistroCivilByIdFallecido(int idFallecido) {
        RegistroCivil registroCivil = null;
        final String SELECT_QUERY = "SELECT numero, numero_libro, numero_acta, fecha_registro "
                + "FROM registro_civil WHERE id_fallecido = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                registroCivil = new RegistroCivil();
                registroCivil.setNumero(resultSet.getString("numero"));
                registroCivil.setNumeroLibro(resultSet.getString("numero_libro"));
                registroCivil.setNumeroActa(resultSet.getString("numero_acta"));

                // Manejo de fecha de registro
                Date fechaRegistro = resultSet.getDate("fecha_registro");
                if (fechaRegistro != null) {
                    LocalDate localDate = fechaRegistro.toLocalDate();
                    registroCivil.setDiaRegistro(localDate.getDayOfMonth());
                    registroCivil.setMesRegistro(localDate.getMonthValue());
                    registroCivil.setAnioRegistro(localDate.getYear());
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener registro civil por id_fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return registroCivil;
    }

    public RegistroCivil getRegistroCivilLugarByIdRegistroCivil(int idRegistroCivil) {
        RegistroCivil registroCivil = null;
        final String SELECT_QUERY = "SELECT localidad, municipio_alcaldia, entidad_federativa "
                + "FROM registro_civil_lugar WHERE id_registro_civil = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idRegistroCivil);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                registroCivil = new RegistroCivil();
                registroCivil.setLocalidad(resultSet.getString("localidad"));
                registroCivil.setMunicipioAlcaldia(resultSet.getString("municipio_alcaldia"));
                registroCivil.setEntidadFederativa(resultSet.getString("entidad_federativa"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener lugar de registro civil por id_registro_civil: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return registroCivil;
    }
}
