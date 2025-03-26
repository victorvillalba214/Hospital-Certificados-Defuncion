package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;

public class FallecidoDAO {

    Connection conexion;
    String query;
    PreparedStatement preparedStatement;

    public FallecidoDAO() {
        conexion = new MySQLConexion().getConnection();
    }

    public boolean registrarFallecido(Fallecido fallecido, int idCertificante) {
        //el idCertificante es la FK de la tabla fallecido de la DB
        try {
            LocalDate fechaNacimiento = LocalDate.of(fallecido.getAnioNacimiento(), fallecido.getMesNacimiento(), fallecido.getDiaNacimiento());

            // Convertir LocalDate a java.sql.Date
            Date sqlDate = Date.valueOf(fechaNacimiento);
            Date sqlFechaCertificacion = Date.valueOf(LocalDate.now()); //agregar la fecha de hoy

            //Inserción de datos si se conoce a al persona y la nacionalidad es mexicana 
            if (!fallecido.isDesconocido() && (fallecido.getNacionalidad().equals("Mexicana") || fallecido.getNacionalidad().equals("Se ignora"))) {
                query = "INSERT INTO fallecido("
                        + "desconocido, nombre, apellido_paterno, apellido_materno, "
                        + "fecha_nacimiento, sexo, entidad_nacimiento, curp, nacionalidad, fecha_certificacion, id_certificante) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setBoolean(1, fallecido.isDesconocido());
                preparedStatement.setString(2, fallecido.getNombre());
                preparedStatement.setString(3, fallecido.getApellidoPaterno());
                preparedStatement.setString(4, fallecido.getApellidoMaterno());
                preparedStatement.setDate(5, sqlDate);
                preparedStatement.setString(6, fallecido.getSexo());
                preparedStatement.setString(7, fallecido.getEntidadNacimiento());
                preparedStatement.setString(8, fallecido.getCurp());
                preparedStatement.setString(9, fallecido.getNacionalidad());
                preparedStatement.setDate(10, sqlFechaCertificacion);
                preparedStatement.setInt(11, idCertificante);

                var numRegistrosAfectados = preparedStatement.executeUpdate();

                if (numRegistrosAfectados > 0) {
                    return true;
                }
            }
            //Inserción de datos si se conoce a al persona y la nacionalidad es otra
            if (!fallecido.isDesconocido() && fallecido.getNacionalidad().equals("Otra")) {
                query = "INSERT INTO fallecido("
                        + "desconocido, nombre, apellido_paterno, apellido_materno, "
                        + "fecha_nacimiento, sexo, entidad_nacimiento, curp, "
                        + "nacionalidad, especifique_nacionalidad, fecha_certificacion, id_certificante) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setBoolean(1, fallecido.isDesconocido());
                preparedStatement.setString(2, fallecido.getNombre());
                preparedStatement.setString(3, fallecido.getApellidoPaterno());
                preparedStatement.setString(4, fallecido.getApellidoMaterno());
                preparedStatement.setDate(5, sqlDate);
                preparedStatement.setString(6, fallecido.getSexo());
                preparedStatement.setString(7, fallecido.getEntidadNacimiento());
                preparedStatement.setString(8, fallecido.getCurp());
                preparedStatement.setString(9, fallecido.getNacionalidad());
                preparedStatement.setString(10, fallecido.getEspecifiqueNacionalidad());
                preparedStatement.setDate(11, sqlFechaCertificacion);
                preparedStatement.setInt(12, idCertificante);
                var numRegistrosAfectados = preparedStatement.executeUpdate();

                if (numRegistrosAfectados > 0) {
                    return true;
                }
            }

            //Inserción de datos si se desconoce a al persona y la nacionalidad es mexicana o seIgnora
            if (fallecido.isDesconocido() && (fallecido.getNacionalidad().equals("Mexicana") || fallecido.getNacionalidad().equals("Se ignora"))) {
                query = "INSERT INTO fallecido("
                        + "desconocido, fecha_nacimiento, sexo, entidad_nacimiento, "
                        + "curp, nacionalidad, fecha_certificacion, id_certificante) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setBoolean(1, fallecido.isDesconocido());
                preparedStatement.setDate(2, sqlDate);
                preparedStatement.setString(3, fallecido.getSexo());
                preparedStatement.setString(4, fallecido.getEntidadNacimiento());
                preparedStatement.setString(5, fallecido.getCurp());
                preparedStatement.setString(6, fallecido.getNacionalidad());
                preparedStatement.setDate(7, sqlFechaCertificacion);
                preparedStatement.setInt(8, idCertificante);
                var numRegistrosAfectados = preparedStatement.executeUpdate();

                if (numRegistrosAfectados > 0) {
                    return true;
                }
            }

            //Inserción de datos si se desconoce a al persona y la nacionalidad es otra y se debe especificar
            if (fallecido.isDesconocido() && fallecido.getNacionalidad().equals("Otra")) {
                query = "INSERT INTO fallecido("
                        + "desconocido, fecha_nacimiento, sexo, entidad_nacimiento, "
                        + "curp, nacionalidad, fecha_certificacion, id_certificante) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setBoolean(1, fallecido.isDesconocido());
                preparedStatement.setDate(2, sqlDate);
                preparedStatement.setString(3, fallecido.getSexo());
                preparedStatement.setString(4, fallecido.getEntidadNacimiento());
                preparedStatement.setString(5, fallecido.getCurp());
                preparedStatement.setString(6, fallecido.getNacionalidad());
                preparedStatement.setDate(7, sqlFechaCertificacion);
                preparedStatement.setInt(8, idCertificante);
                var numRegistrosAfectados = preparedStatement.executeUpdate();

                if (numRegistrosAfectados > 0) {
                    return true;
                }
            }
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

    public boolean registrarFallecidoEstadoCivil(Fallecido fallecido, int idFallecido) {
        //el idFallecido es la PK de la tabla fallecido de la DB
        try {
            query = "INSERT INTO fallecido_estado_civil(id_fallecido, situacion_conyugal) VALUES (?, ?)";

            preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setInt(1, idFallecido);
            preparedStatement.setString(2, fallecido.getSituacionConyugal());

            var numRegistrosAfectados = preparedStatement.executeUpdate();

            if (numRegistrosAfectados > 0) {
                return true;
            }

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

    public boolean registrarFallecidoIdentidadCultural(Fallecido fallecido, int idFallecido) {
        //el idFallecido es la PK de la tabla fallecido de la DB
        try {
            if (fallecido.getHablaIndigena().equals("Si")) {
                // Si habla lengua indígena, se especifica la lengua
                query = "INSERT INTO fallecido_identidad_cultural("
                        + "id_fallecido, afromexicano, indigena, habla_indigena, especifique_lengua_indigena) "
                        + "VALUES (?, ?, ?, ?, ?)";
                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setInt(1, idFallecido);
                preparedStatement.setString(2, fallecido.getAfromexicano());
                preparedStatement.setString(3, fallecido.getIndigena());
                preparedStatement.setString(4, fallecido.getHablaIndigena());
                preparedStatement.setString(5, fallecido.getEspecifiqueLenguaIndigena());

            } else {
                // Si no habla lengua indígena o se ignora, no se especifica la lengua
                query = "INSERT INTO fallecido_identidad_cultural("
                        + "id_fallecido, afromexicano, indigena, habla_indigena) "
                        + "VALUES (?, ?, ?, ?)";
                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setInt(1, idFallecido);
                preparedStatement.setString(2, fallecido.getAfromexicano());
                preparedStatement.setString(3, fallecido.getIndigena());
                preparedStatement.setString(4, fallecido.getHablaIndigena());
            }

            var numRegistrosAfectados = preparedStatement.executeUpdate();

            if (numRegistrosAfectados > 0) {
                return true;
            }

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

    public boolean registrarFallecidoEscolaridad(Fallecido fallecido, int idFallecido) {
        try {
            query = "INSERT INTO fallecido_escolaridad(id_fallecido, escolaridad, tipo_escolaridad) VALUES (?, ?, ?)";

            preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setInt(1, idFallecido);
            preparedStatement.setString(2, fallecido.getEscolaridad());
            preparedStatement.setString(3, fallecido.getTipoEscolaridad());

            int numRegistrosAfectados = preparedStatement.executeUpdate();

            if (numRegistrosAfectados > 0) {
                return true;
            }

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

    public boolean registrarFallecidoOcupacion(Fallecido fallecido, int idFallecido) {
        try {
            query = "INSERT INTO fallecido_ocupacion(id_fallecido, ocupacion_habitual, descripcion_ocupacion, trabajaba) VALUES (?, ?, ?, ?)";

            preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setInt(1, idFallecido);
            preparedStatement.setBoolean(2, fallecido.isOcupacionHabitual());
            preparedStatement.setString(3, fallecido.getDescripcionOcupacion());
            preparedStatement.setString(4, fallecido.getTrabajaba());

            int numRegistrosAfectados = preparedStatement.executeUpdate();

            if (numRegistrosAfectados > 0) {
                return true;
            }

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

    public boolean registrarFallecidoSeguridadSocial(Fallecido fallecido, int idFallecido) {
        try {
            // Si el afiliado ha seleccionado "Otra", se incluye "especifique_servicio_salud" en la consulta
            if (fallecido.getAfiliacionServicioSalud().equals("Otra")) {
                query = "INSERT INTO fallecido_seguridad_social(id_fallecido, afiliacion_servicio_salud, especifique_servicio_salud, numero_seguridad_social_afiliacion) "
                        + "VALUES (?, ?, ?, ?)";
                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setInt(1, idFallecido);
                preparedStatement.setString(2, fallecido.getAfiliacionServicioSalud());
                preparedStatement.setString(3, fallecido.getEspecifiqueServicioSalud());  // Agregar detalle si "Otra"
                preparedStatement.setString(4, fallecido.getNumeroSeguridadSocialAfiliacion());
            } else {
                // Si no es "Otra", solo insertamos los campos relacionados con el servicio de salud y el número de afiliación
                query = "INSERT INTO fallecido_seguridad_social(id_fallecido, afiliacion_servicio_salud, numero_seguridad_social_afiliacion) "
                        + "VALUES (?, ?, ?)";
                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setInt(1, idFallecido);
                preparedStatement.setString(2, fallecido.getAfiliacionServicioSalud());
                preparedStatement.setString(3, fallecido.getNumeroSeguridadSocialAfiliacion());
            }

            int numRegistrosAfectados = preparedStatement.executeUpdate();

            if (numRegistrosAfectados > 0) {
                return true;
            }

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

    public boolean registrarFallecidoResidenciaHabitual(Fallecido fallecido, int idFallecido) {
        try {
            query = "INSERT INTO fallecido_residencia_habitual(id_fallecido, tipo_vialidad, nombre_vialidad, numero_exterior, "
                    + "numero_interior, tipo_asentamiento_humano, nombre_asentamiento_humano, codigo_postal, localidad, "
                    + "municipio_alcaldia, entidad_federativa_pais) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setInt(1, idFallecido);
            preparedStatement.setString(2, fallecido.getTipoVialidad());
            preparedStatement.setString(3, fallecido.getNombreVialidad());
            preparedStatement.setString(4, fallecido.getNumeroExterior());
            preparedStatement.setString(5, fallecido.getNumeroInterior());
            preparedStatement.setString(6, fallecido.getTipoAsentamientoHumano());
            preparedStatement.setString(7, fallecido.getNombreAsentamientoHumano());
            preparedStatement.setString(8, fallecido.getCodigoPostal());
            preparedStatement.setString(9, fallecido.getLocalidad());
            preparedStatement.setString(10, fallecido.getMunicipioAlcaldia());
            preparedStatement.setString(11, fallecido.getEntidadFederativaPais());

            int numRegistrosAfectados = preparedStatement.executeUpdate();

            if (numRegistrosAfectados > 0) {
                return true;
            }

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

    public boolean registrarFallecidoEdad(Fallecido fallecido, int idFallecido) {
        try {
            // Verificamos si se ignora la edad
            if (fallecido.isSeIgnoraEdad()) {
                // Si se ignora la edad, solo insertamos el campo 'se_ignora' como 1
                query = "INSERT INTO fallecido_edad(id_fallecido, se_ignora) VALUES (?, ?)";
                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setInt(1, idFallecido);
                preparedStatement.setInt(2, 1);  // Se indica que la edad se ignora (1)

            } else {
                // Si no se ignora la edad, insertamos los valores de edad
                query = "INSERT INTO fallecido_edad(id_fallecido, se_ignora, minutos, horas, dias, meses, años_cumplidos) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?)";

                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setInt(1, idFallecido);
                preparedStatement.setInt(2, 0);  // No se ignora la edad, por lo tanto se establece como 0

                // Para cada valor, si es 0 (indicado como no proporcionado), se asigna NULL
                preparedStatement.setNull(3, java.sql.Types.INTEGER);
                if (fallecido.getEdadMinutos() != 0) {
                    preparedStatement.setInt(3, fallecido.getEdadMinutos());
                }

                preparedStatement.setNull(4, java.sql.Types.INTEGER);
                if (fallecido.getEdadHoras() != 0) {
                    preparedStatement.setInt(4, fallecido.getEdadHoras());
                }

                preparedStatement.setNull(5, java.sql.Types.INTEGER);
                if (fallecido.getEdadDias() != 0) {
                    preparedStatement.setInt(5, fallecido.getEdadDias());
                }

                preparedStatement.setNull(6, java.sql.Types.INTEGER);
                if (fallecido.getEdadMeses() != 0) {
                    preparedStatement.setInt(6, fallecido.getEdadMeses());
                }

                preparedStatement.setNull(7, java.sql.Types.INTEGER);
                if (fallecido.getEdadAnios() != 0) {
                    preparedStatement.setInt(7, fallecido.getEdadAnios());
                }
            }

            // Ejecutamos la consulta
            int numRegistrosAfectados = preparedStatement.executeUpdate();

            // Retornamos true si se insertaron registros correctamente
            if (numRegistrosAfectados > 0) {
                return true;
            }

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

    public boolean registrarFallecidoEdadMenor28Dias(Fallecido fallecido, int idFallecidoEdad) {

        try {
            // Verificar si alguno de los atributos de edad tiene un valor asignado y si edadDias es menor o igual a 28

            // Insertar datos en la tabla fallecido_edad_menor_28_dias
            query = "INSERT INTO fallecido_edad_menor_28_dias(id_fallecido_edad, folio_certificado_nacimiento, semanas_gestacion, peso_nacimiento) "
                    + "VALUES (?, ?, ?, ?)";
            preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setInt(1, idFallecidoEdad); // ID de la tabla fallecido_edad

            // Validar si el folioCertificadoNacimiento tiene valor
            if (fallecido.getFolioCertificadoNacimiento() != null && !fallecido.getFolioCertificadoNacimiento().isEmpty()) {
                preparedStatement.setString(2, fallecido.getFolioCertificadoNacimiento());
            } else {
                preparedStatement.setNull(2, java.sql.Types.VARCHAR); // Si el valor es null o vacío
            }

            // Validar si semanasGestacion tiene valor
            if ((fallecido.getEdadMinutos() > 0 || fallecido.getEdadHoras() > 0 || fallecido.getEdadDias() > 0) && fallecido.getEdadDias() <= 28) {
                preparedStatement.setInt(3, fallecido.getSemanasGestacion());
            } else {
                preparedStatement.setNull(3, java.sql.Types.INTEGER); // Si no, establecer null
            }

            // Validar si pesoNacimiento tiene valor
            if ((fallecido.getEdadMinutos() > 0 || fallecido.getEdadHoras() > 0 || fallecido.getEdadDias() > 0) && fallecido.getEdadDias() <= 28) {
                preparedStatement.setInt(4, fallecido.getPesoNacimiento()); // Cambiar a FLOAT si el campo es decimal
            } else {
                preparedStatement.setNull(4, java.sql.Types.INTEGER); // Cambiar a FLOAT si el campo es decimal
            }

            // Ejecutar la inserción en fallecido_edad_menor_28_dias
            int numRegistrosAfectados = preparedStatement.executeUpdate();

            return numRegistrosAfectados > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
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

    public Fallecido getFallecidoByIdFallecido(int idFallecido) {
        //Se eliminó id_certificante porque en la clase Fallecido no existe un atributo para ello
        Fallecido fallecido;
        final String SELECT_QUERY = "SELECT desconocido, nombre, apellido_paterno, apellido_materno, fecha_nacimiento, "
                + "sexo, entidad_nacimiento, curp, nacionalidad, especifique_nacionalidad, fecha_certificacion, id_certificante "
                + "FROM fallecido WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setDesconocido(resultSet.getBoolean("desconocido"));
                fallecido.setNombre(resultSet.getString("nombre"));
                fallecido.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                fallecido.setApellidoMaterno(resultSet.getString("apellido_materno"));

                // Manejo de fecha de nacimiento
                Date fechaNacimiento = resultSet.getDate("fecha_nacimiento");
                if (fechaNacimiento != null) {
                    LocalDate localDate = fechaNacimiento.toLocalDate();
                    fallecido.setDiaNacimiento(localDate.getDayOfMonth());
                    fallecido.setMesNacimiento(localDate.getMonthValue());
                    fallecido.setAnioNacimiento(localDate.getYear());
                }

                fallecido.setSexo(resultSet.getString("sexo"));
                fallecido.setEntidadNacimiento(resultSet.getString("entidad_nacimiento"));
                fallecido.setCurp(resultSet.getString("curp"));
                fallecido.setNacionalidad(resultSet.getString("nacionalidad"));
                fallecido.setEspecifiqueNacionalidad(resultSet.getString("especifique_nacionalidad"));

                // Manejo de fecha de certificación
                Date fechaCertificacion = resultSet.getDate("fecha_certificacion");
                if (fechaCertificacion != null) {
                    LocalDate localDate = fechaCertificacion.toLocalDate();
                    fallecido.setDiaCertificacion(localDate.getDayOfMonth());
                    fallecido.setMesCertificacion(localDate.getMonthValue());
                    fallecido.setAnioCertificacion(localDate.getYear());
                }

                return fallecido;
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener fallecido por id_fallecido: " + e.getMessage());
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

    public Fallecido getEstadoCivilByIdFallecido(int idFallecido) {
        Fallecido fallecido;
        final String SELECT_QUERY = "SELECT situacion_conyugal FROM fallecido_estado_civil WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setSituacionConyugal(resultSet.getString("situacion_conyugal"));
                return fallecido;
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el estado civil del fallecido: " + e.getMessage());
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

    public Fallecido getIdentidadCulturalByIdFallecido(int idFallecido) {
        Fallecido fallecido = null;
        final String SELECT_QUERY = "SELECT afromexicano, indigena, habla_indigena, especifique_lengua_indigena "
                + "FROM fallecido_identidad_cultural WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setAfromexicano(resultSet.getString("afromexicano"));
                fallecido.setIndigena(resultSet.getString("indigena"));
                fallecido.setHablaIndigena(resultSet.getString("habla_indigena"));
                fallecido.setEspecifiqueLenguaIndigena(resultSet.getString("especifique_lengua_indigena"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener identidad cultural del fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return fallecido;
    }

    public Fallecido getEscolaridadByIdFallecido(int idFallecido) {
        Fallecido fallecido = null;
        final String SELECT_QUERY = "SELECT escolaridad, tipo_escolaridad "
                + "FROM fallecido_escolaridad WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setEscolaridad(resultSet.getString("escolaridad"));
                fallecido.setTipoEscolaridad(resultSet.getString("tipo_escolaridad"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener escolaridad del fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return fallecido;
    }

    public Fallecido getOcupacionByIdFallecido(int idFallecido) {
        Fallecido fallecido = null;
        final String SELECT_QUERY = "SELECT ocupacion_habitual, descripcion_ocupacion, trabajaba "
                + "FROM fallecido_ocupacion WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setOcupacionHabitual(resultSet.getBoolean("ocupacion_habitual"));
                fallecido.setDescripcionOcupacion(resultSet.getString("descripcion_ocupacion"));
                fallecido.setTrabajaba(resultSet.getString("trabajaba"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ocupación del fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return fallecido;
    }

    public Fallecido getSeguridadSocialByIdFallecido(int idFallecido) {
        Fallecido fallecido = null;
        final String SELECT_QUERY = "SELECT afiliacion_servicio_salud, especifique_servicio_salud, numero_seguridad_social_afiliacion "
                + "FROM fallecido_seguridad_social WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setAfiliacionServicioSalud(resultSet.getString("afiliacion_servicio_salud"));
                fallecido.setEspecifiqueServicioSalud(resultSet.getString("especifique_servicio_salud"));
                fallecido.setNumeroSeguridadSocialAfiliacion(resultSet.getString("numero_seguridad_social_afiliacion"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la seguridad social del fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return fallecido;
    }

    public Fallecido getResidenciaHabitualByIdFallecido(int idFallecido) {
        Fallecido fallecido = null;
        final String SELECT_QUERY = "SELECT tipo_vialidad, nombre_vialidad, numero_exterior, numero_interior, "
                + "tipo_asentamiento_humano, nombre_asentamiento_humano, codigo_postal, localidad, municipio_alcaldia, "
                + "entidad_federativa_pais FROM fallecido_residencia_habitual WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setTipoVialidad(resultSet.getString("tipo_vialidad"));
                fallecido.setNombreVialidad(resultSet.getString("nombre_vialidad"));
                fallecido.setNumeroExterior(resultSet.getString("numero_exterior"));
                fallecido.setNumeroInterior(resultSet.getString("numero_interior"));
                fallecido.setTipoAsentamientoHumano(resultSet.getString("tipo_asentamiento_humano"));
                fallecido.setNombreAsentamientoHumano(resultSet.getString("nombre_asentamiento_humano"));
                fallecido.setCodigoPostal(resultSet.getString("codigo_postal"));
                fallecido.setLocalidad(resultSet.getString("localidad"));
                fallecido.setMunicipioAlcaldia(resultSet.getString("municipio_alcaldia"));
                fallecido.setEntidadFederativaPais(resultSet.getString("entidad_federativa_pais"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la residencia habitual del fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return fallecido;
    }

    public Fallecido getEdadByIdFallecido(int idFallecido) {
        Fallecido fallecido = null;
        final String SELECT_QUERY = "SELECT se_ignora, minutos, horas, dias, meses, años_cumplidos "
                + "FROM fallecido_edad WHERE id_fallecido = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setSeIgnoraEdad(resultSet.getBoolean("se_ignora"));
                fallecido.setEdadMinutos(resultSet.getInt("minutos"));
                fallecido.setEdadHoras(resultSet.getInt("horas"));
                fallecido.setEdadDias(resultSet.getInt("dias"));
                fallecido.setEdadMeses(resultSet.getInt("meses"));
                fallecido.setEdadAnios(resultSet.getInt("años_cumplidos"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la edad del fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return fallecido;
    }

    public Fallecido getEdadMenor28DiasByIdFallecido(int idFallecido) {
        Fallecido fallecido = null;
        final String SELECT_QUERY = "SELECT folio_certificado_nacimiento, semanas_gestacion, peso_nacimiento "
                + "FROM fallecido_edad_menor_28_dias WHERE id_fallecido_edad = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setInt(1, idFallecido);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                fallecido = new Fallecido();
                fallecido.setFolioCertificadoNacimiento(resultSet.getString("folio_certificado_nacimiento"));
                fallecido.setSemanasGestacion(resultSet.getInt("semanas_gestacion"));
                fallecido.setPesoNacimiento(resultSet.getInt("peso_nacimiento"));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la información de edad menor a 28 días del fallecido: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return fallecido;
    }
    
    
}
