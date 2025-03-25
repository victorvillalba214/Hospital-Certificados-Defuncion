package controladores;

import javax.swing.JOptionPane;

import modelos.*;
import vistas.VistaFormularioCertificadoDefuncion;

import java.time.LocalDate;
import java.time.Period;

public class ControladorFormularioCertificadoDefuncion {

    // Instancia de la vista para generar el certificado de defunción
    public static VistaFormularioCertificadoDefuncion vistaFormularioCertificadoDefuncion = new VistaFormularioCertificadoDefuncion();

    // Instancia de la clase Fallecido para almacenar datos del fallecido
    private static Fallecido fallecido;

    // Instancia de la clase Informante para almacenar datos del informante
    private static Informante informante;

    // Instancia de la clase Defuncion para gestionar los datos de la defunción
    private static Defuncion defuncion;

    // Instancia de la clase Situacion para manejar datos adicionales relacionados
    private static Situacion situacion;

    // Instancia de la clase Certificante para gestionar los datos del certificante
    private static Certificante certificante;

    // Instancia de la clase RegistroCivil para manejar los datos del registro civil
    private static RegistroCivil registroCivil;

    // Bandera para validar si se aplica la condición de mujer entre 10 y 54 años
    private static boolean isMujer1054 = false;

    public static void mostrar() {
        vistaFormularioCertificadoDefuncion.setVisible(true);
        vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setUI(null);
        vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(0);
    }

    /// # METHODS PARA RECOPILAR INFORMACIÓN DE LAS VISTAS

    public static void recopilarInformacionVista1() {
//        Se crea una instancia de Fallecido para aignarle los datos
        fallecido = new Fallecido();
//        Stringbuilder para gestionar los errores de validación
        var errores = new StringBuilder();

//        Condición que valida si el fallecido NO es desconocido, en caso de cumplirse
//        se validan los campos referentes al nombre del fallecido
        if (!vistaFormularioCertificadoDefuncion.getRdbtnPersonaDesconocida().isSelected()) {
            fallecido.setDesconocido(false);
//            Se validan que los Jtextfield no sean vacíos, en caso de no cumplirse
//            se agrega un String al Stringbuilder con el error de validación
            if (!vistaFormularioCertificadoDefuncion.getTxtNombre().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtNombre().getText().isBlank()) {
                fallecido.setNombre(vistaFormularioCertificadoDefuncion.getTxtNombre().getText().trim());
            } else {
                errores.append("El campo Nombre no debe ser vacío\n");
            }
            if (!vistaFormularioCertificadoDefuncion.getTxtApellidoPaterno().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtApellidoPaterno().getText().isBlank()) {
                fallecido.setApellidoPaterno(vistaFormularioCertificadoDefuncion.getTxtApellidoPaterno().getText().trim());
            } else {
                errores.append("El campo Apellido Paterno no debe ser vacío\n");
            }
            if (!vistaFormularioCertificadoDefuncion.getTxtApellidoMaterno().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtApellidoMaterno().getText().isBlank()) {
                fallecido.setApellidoMaterno(vistaFormularioCertificadoDefuncion.getTxtApellidoMaterno().getText().trim());
            } else {
                errores.append("El campo Apellido Materno no debe ser vacío\n");
            }
        } else {
            fallecido.setDesconocido(true);
        }
//        Bloque try para manejar las excepciones que puedan surgir por el parseo al pasar los valores de las fechas
//        de String a Integer
        try {
            String diaTexto = vistaFormularioCertificadoDefuncion.getTxtDiaNacimiento().getText().trim();
            String mesTexto = vistaFormularioCertificadoDefuncion.getTxtMesNacimiento().getText().trim();
            String anioTexto = vistaFormularioCertificadoDefuncion.getTxtAñoNacimiento().getText().trim();

//            Condicion para validar que los JtextField de la edad no sean vacíos
            if (!diaTexto.isEmpty() && !mesTexto.isEmpty() && !anioTexto.isEmpty()) {
//                String para juntar los valores de las fechas y crear el formato dd/mm/aaaa
                String fechaCompleta = diaTexto + "/" + mesTexto + "/" + anioTexto;

//                Condición que utiliza un regex para validar que los valores ingresados sean números
//                y se respete el formato dd/mm/aaaa
                if (fechaCompleta.matches("^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}$")) {
//                    Parseo de String a Integer
                    int dia = Integer.parseInt(diaTexto);
                    int mes = Integer.parseInt(mesTexto);
                    int anio = Integer.parseInt(anioTexto);

//                    Condición que evalua los valores de día, mes y año
                    if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && anio > 0) {
                        fallecido.setDiaNacimiento(dia);
                        fallecido.setMesNacimiento(mes);
                        fallecido.setAnioNacimiento(anio);

//                        Validacion adicional de fecha por calendario
                        java.time.LocalDate.of(anio, mes, dia);
                    } else {
                        errores.append("La fecha ingresada es inválida. Verifica el día, mes y año.\n");
                    }
                } else {
                    errores.append("La fecha debe estar en el formato dd/mm/yyyy.\n");
                }
            } else {
                if (diaTexto.equals("")) errores.append("El campo Día de Nacimiento no debe ser vacío\n");
                if (mesTexto.equals("")) errores.append("El campo Mes de Nacimiento no debe ser vacío\n");
                if (anioTexto.equals("")) errores.append("El campo Año de Nacimiento no debe ser vacío\n");
            }
//            Atrapa las excepciones que puedan surgir por un parseo de texto que no sea numérico a Integer
//            o una fecha que no sea válida
        } catch (NumberFormatException | java.time.DateTimeException e) {
            errores.append("Solo puedes ingresar números válidos en los campos de Fecha de Nacimiento. Verifica que la fecha sea válida.\n");
        }


        if (vistaFormularioCertificadoDefuncion.getRdbtnHombre().isSelected()) {
            fallecido.setSexo("Hombre");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnMujer().isSelected()) {
            fallecido.setSexo("Mujer");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraSexo().isSelected()) {
            fallecido.setSexo("Se ignora");
        } else {
            errores.append("El campo Sexo no debe ser vacío");
        }

//        Condición que valida si se agregaron Strings al Stringbuilder, en caso cumplirse se muestran
//        los errores de validación, en caso contrario avanza a la siguiente pestaña del formulario
        if (errores.length() > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
//            Muestra la siguiente pestaña del formulario
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(1);
        }
    }

    public static void recopilarInformacionVista2() {
        // Construye un StringBuilder para almacenar mensajes de error
        var errores = new StringBuilder();

        // Valida si el campo "Entidad Nacimiento" no está vacío
        if (!vistaFormularioCertificadoDefuncion.getTxtEntidadNacimiento().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtEntidadNacimiento().getText().isBlank()) {
            fallecido.setEntidadNacimiento(vistaFormularioCertificadoDefuncion.getTxtEntidadNacimiento().getText().trim());
        } else {
            errores.append("El campo Entidad Nacimiento no debe ser vacío\n");
        }

        // Valida si el campo "CURP" no está vacío
        if (!vistaFormularioCertificadoDefuncion.getTxtCurp().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtCurp().getText().isBlank()) {
            fallecido.setCurp(vistaFormularioCertificadoDefuncion.getTxtCurp().getText().trim());
        } else {
            errores.append("El campo Curp no debe ser vacío\n");
        }

        // Valida la opción seleccionada para "Afromexicano"
        if (vistaFormularioCertificadoDefuncion.getRdbtnSiAfromexicano().isSelected()) {
            fallecido.setAfromexicano("Si");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoAfromexicano().isSelected()) {
            fallecido.setAfromexicano("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraAfromexicano().isSelected()) {
            fallecido.setAfromexicano("Se ignora");
        } else {
            errores.append("El campo Afromexicano no debe ser vacío\n");
        }

        // Valida la opción seleccionada para "Indígena"
        if (vistaFormularioCertificadoDefuncion.getRdbtnSiIndigena().isSelected()) {
            fallecido.setIndigena("Si");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoIndigena().isSelected()) {
            fallecido.setIndigena("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraIndigena().isSelected()) {
            fallecido.setIndigena("Se ignora");
        } else {
            errores.append("El campo Indigena no debe ser vacío\n");
        }

        // Validación para "Habla Lengua Indígena" y campo adicional en caso de respuesta afirmativa
        if (vistaFormularioCertificadoDefuncion.getRdbtnSiLenguaIndigena().isSelected()) {
            fallecido.setHablaIndigena("Si");
            if (!vistaFormularioCertificadoDefuncion.getTxtEspecifiqueLenguaIndigena().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtEspecifiqueLenguaIndigena().getText().isBlank()) {
                fallecido.setEspecifiqueLenguaIndigena(vistaFormularioCertificadoDefuncion.getTxtEspecifiqueLenguaIndigena().getText().trim());
            } else {
                errores.append("El campo Especifique Lengua Indigena no debe ser vacío\n");
            }
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoLenguaIndigena().isSelected()) {
            fallecido.setHablaIndigena("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraLenguaIndigena().isSelected()) {
            fallecido.setHablaIndigena("Se ignora");
        } else {
            errores.append("El campo Habla Indigena no debe ser vacío\n");
        }

        // Valida la opción seleccionada para "Nacionalidad"
        if (vistaFormularioCertificadoDefuncion.getRdbtnNacionalidadMex().isSelected()) {
            fallecido.setNacionalidad("Mexicana");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnOtraNacionalidad().isSelected()) {
            fallecido.setNacionalidad("Otra");
            // Si la nacionalidad es "Otra", se valida el campo adicional
            if (!vistaFormularioCertificadoDefuncion.getTxtEspecifiqueNacionalidad().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtEspecifiqueNacionalidad().getText().isBlank()) {
                fallecido.setEspecifiqueNacionalidad(vistaFormularioCertificadoDefuncion.getTxtEspecifiqueNacionalidad().getText().trim());
            } else {
                errores.append("El campo Especifique Nacionalidad no debe ser vacío\n");
            }
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraNacionalidad().isSelected()) {
            fallecido.setNacionalidad("Se ignora");
        } else {
            errores.append("El campo Nacionalidad no debe ser vacío");
        }

        // Si existen errores, muestra un cuadro de diálogo con los mensajes de error
        if (errores.length() > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Si no hay errores, avanza a la siguiente pestaña del formulario
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(2);
        }
    }

    public static void recopilarInformacionVista3() {
        // Construye un StringBuilder para acumular mensajes de error
        var errores = new StringBuilder();

        // Verifica si la edad no está marcada como "Se ignora"
        if (!vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraEdad().isSelected()) {
            fallecido.setSeIgnoraEdad(false);
            try {
                // Valida si el campo de tiempo de edad no está vacío
                if (!vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText().isEmpty()
                        && !vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText().isBlank()) {
                    // Asigna la edad según la unidad seleccionada en el ComboBox
                    if (vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Minutos")) {
                        fallecido.setEdadMinutos(Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText().trim()));
                    } else if (vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Horas")) {
                        fallecido.setEdadHoras(Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText().trim()));
                    } else if (vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Días")) {
                        fallecido.setEdadDias(Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText().trim()));
                    } else if (vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Meses")) {
                        fallecido.setEdadMeses(Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText().trim()));
                    } else if (vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Años cumplidos")) {
                        fallecido.setEdadAnios(Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText().trim()));
                    }
                } else {
                    errores.append("El campo Edad Cumplida no debe ser vacío\n");
                }
            } catch (NumberFormatException e) {
                // Agrega mensaje de error si el valor no es numérico
                errores.append("El campo Edad Cumplida debe ser un valor numérico\n");
            }

            // Valida información adicional si la edad es menor a 28 días o está en menor unidad de tiempo
            if ((vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Días")
                    && Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText()) < 28)
                    || vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Minutos")
                    || vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Horas")) {
                try {
                    // Valida y asigna el folio del certificado de nacimiento
                    if (!vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().getText().isEmpty()
                            && !vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().getText().isBlank()) {
                        fallecido.setFolioCertificadoNacimiento(vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().getText().trim());
                    } else {
                        errores.append("El campo Folio Certificado de Nacimiento no debe ser vacío\n");
                    }
                    // Valida y asigna las semanas de gestación
                    if (!vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().getText().isEmpty()
                            && !vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().getText().isBlank()) {
                        fallecido.setSemanasGestacion(Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().getText().trim()));
                    } else {
                        errores.append("El campo Semanas de Gestación no debe ser vacío\n");
                    }
                    // Valida y asigna el peso al nacer
                    if (!vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().getText().isEmpty()
                            && !vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().getText().isBlank()) {
                        fallecido.setPesoNacimiento(Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().getText().trim()));
                    } else {
                        errores.append("El campo Peso en Gramos no debe ser vacío\n");
                    }
                } catch (NumberFormatException e) {
                    // Agrega mensaje de error si los valores no son numéricos
                    errores.append("Los valores en el campo Semanas Gestación y Peso al Nacer deben ser numéricos\n");
                }
            }
        } else {
            // Marca la edad como "Se ignora"
            fallecido.setSeIgnoraEdad(true);
        }

// Valida la situación conyugal seleccionada
        if (vistaFormularioCertificadoDefuncion.getRdbtnSoltero().isSelected()) {
            fallecido.setSituacionConyugal("Soltera/o");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeparado().isSelected()) {
            fallecido.setSituacionConyugal("Separada/o");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnUnionLibre().isSelected()) {
            fallecido.setSituacionConyugal("En unión libre");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnDivorciado().isSelected()) {
            fallecido.setSituacionConyugal("Divorciada/o");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnCasado().isSelected()) {
            fallecido.setSituacionConyugal("Casada/o");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnViudo().isSelected()) {
            fallecido.setSituacionConyugal("Viuda/o");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraSituacionConyugal().isSelected()) {
            fallecido.setSituacionConyugal("Se ignora");
        } else {
            // Agrega mensaje de error si no se seleccionó ninguna opción
            errores.append("El campo Situación Conyugal no debe ser vacío");
        }

// Muestra un cuadro de diálogo si existen errores de validación
        if (errores.length() > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanza a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(3);
        }

    }

    public static void recopilarInformacionVista4() {
        // Crear un acumulador para mensajes de error
        var errores = new StringBuilder();

        // Validar y asignar el campo "Tipo Vialidad"
        if (!vistaFormularioCertificadoDefuncion.getTxtTipoVialidad().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTipoVialidad().getText().isBlank()) {
            fallecido.setTipoVialidad(vistaFormularioCertificadoDefuncion.getTxtTipoVialidad().getText().trim());
        } else {
            errores.append("El campo Tipo Vialidad no debe ser vacío\n");
        }

        // Validar y asignar el campo "Nombre Vialidad"
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreVialidad().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreVialidad().getText().isBlank()) {
            fallecido.setNombreVialidad(vistaFormularioCertificadoDefuncion.getTxtNombreVialidad().getText().trim());
        } else {
            errores.append("El campo Nombre Vialidad no debe ser vacío\n");
        }

        // Validar y asignar el campo "Número Exterior"
        if (!vistaFormularioCertificadoDefuncion.getTxtNumExt().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumExt().getText().isBlank()) {
            fallecido.setNumeroExterior(vistaFormularioCertificadoDefuncion.getTxtNumExt().getText().trim());
        } else {
            errores.append("El campo Número Exterior no debe ser vacío\n");
        }

        // Validar y asignar el campo "Número Interior"
        if (!vistaFormularioCertificadoDefuncion.getTxtNumInt().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumInt().getText().isBlank()) {
            fallecido.setNumeroInterior(vistaFormularioCertificadoDefuncion.getTxtNumInt().getText().trim());
        } else {
            errores.append("El campo Número Interior no debe ser vacío\n");
        }

        // Validar y asignar el campo "Tipo Asentamiento Humano"
        if (!vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumano().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumano().getText().isBlank()) {
            fallecido.setTipoAsentamientoHumano(vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumano().getText().trim());
        } else {
            errores.append("El campo Tipo Asentamiento Humano no debe ser vacío\n");
        }

        // Validar y asignar el campo "Nombre Asentamiento Humano"
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumano().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumano().getText().isBlank()) {
            fallecido.setNombreAsentamientoHumano(vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumano().getText().trim());
        } else {
            errores.append("El campo Nombre Asentamiento Humano no debe ser vacío\n");
        }

        // Validar y asignar el campo "Código Postal"
        if (!vistaFormularioCertificadoDefuncion.getTxtCodigoPostal().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtCodigoPostal().getText().isBlank()) {
            if (vistaFormularioCertificadoDefuncion.getTxtCodigoPostal().getText().trim().length() == 5) {
                fallecido.setCodigoPostal(vistaFormularioCertificadoDefuncion.getTxtCodigoPostal().getText().trim());
            } else {
                errores.append("El campo Código Postal debe ser de 5 caracteres\n");
            }
        } else {
            errores.append("El campo Código Postal no debe ser vacío\n");
        }

        // Validar y asignar el campo "Localidad"
        if (!vistaFormularioCertificadoDefuncion.getTxtLocalidad().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtLocalidad().getText().isBlank()) {
            fallecido.setLocalidad(vistaFormularioCertificadoDefuncion.getTxtLocalidad().getText().trim());
        } else {
            errores.append("El campo Localidad no debe ser vacío\n");
        }

        // Validar y asignar el campo "Municipio/Alcaldía"
        if (!vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldia().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldia().getText().isBlank()) {
            fallecido.setMunicipioAlcaldia(vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldia().getText().trim());
        } else {
            errores.append("El campo Municipio/Alcaldía no debe ser vacío\n");
        }

        // Validar y asignar el campo "Entidad Federativa/País"
        if (!vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaPais().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaPais().getText().isBlank()) {
            fallecido.setEntidadFederativaPais(vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaPais().getText().trim());
        } else {
            errores.append("El campo Entidad Federativa/País no debe ser vacío\n");
        }

        // Mostrar mensajes de error si los hay
        if (errores.length() > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(4);
        }
    }

    public static void recopilarInformacionVista5() {
        // Crear un acumulador para mensajes de error
        var errores = new StringBuilder();

        // Validar el campo "Escolaridad"
        if (!vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadSeIgnora().isSelected()) {
            if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadNinguna().isSelected()) {
                fallecido.setEscolaridad("Ninguna");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadPrimaria().isSelected()) {
                fallecido.setEscolaridad("Primaria");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadBachilleratoPreparatoria().isSelected()) {
                fallecido.setEscolaridad("Bachillerato o Preparatoria");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadPosgrado().isSelected()) {
                fallecido.setEscolaridad("Posgrado");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadPreescolar().isSelected()) {
                fallecido.setEscolaridad("Preescolar");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadSecundaria().isSelected()) {
                fallecido.setEscolaridad("Secundaria");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadProfesional().isSelected()) {
                fallecido.setEscolaridad("Profesional");
            } else {
                // Si no se seleccionó ninguna opción válida, agregar un mensaje de error
                errores.append("El campo Escolaridad no debe ser vacío\n");
            }
        } else {
            // Si se ignora la escolaridad, asignar "Se ignora"
            fallecido.setEscolaridad("Se ignora");
        }

        // Validar el campo "Tipo Escolaridad" si la escolaridad no es "Ninguna" o "Se ignora"
        if (!vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadNinguna().isSelected()
                && !vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadSeIgnora().isSelected()) {
            if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadCompleta().isSelected()) {
                fallecido.setTipoEscolaridad("Completa");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadIncompleta().isSelected()) {
                fallecido.setTipoEscolaridad("Incompleta");
            } else {
                // Si no se seleccionó ninguna opción válida, agregar un mensaje de error
                errores.append("El campo Tipo Escolaridad no debe ser vacío\n");
            }
        }

        // Validar el campo "Ocupación Habitual"
        if (!vistaFormularioCertificadoDefuncion.getRdbtnOcupacionHabitualSeIgnora().isSelected()) {
            fallecido.setOcupacionHabitual(true);
            if (!vistaFormularioCertificadoDefuncion.getTxtOcupacionHabitual().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtOcupacionHabitual().getText().isBlank()) {
                // Asignar el texto del campo de descripción de ocupación
                fallecido.setDescripcionOcupacion(vistaFormularioCertificadoDefuncion.getTxtOcupacionHabitual().getText().trim());
            } else {
                // Si el campo de descripción está vacío, agregar un mensaje de error
                errores.append("El campo Ocupacion Habitual no debe ser vacío\n");
            }
        } else {
            // Si la ocupación habitual se ignora, marcarlo como falso
            fallecido.setOcupacionHabitual(false);
        }

        // Validar el campo "Trabajaba"
        if (vistaFormularioCertificadoDefuncion.getRdbtnSiTrabajaba().isSelected()) {
            fallecido.setTrabajaba("Si");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoTrabajaba().isSelected()) {
            fallecido.setTrabajaba("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraTrabajaba().isSelected()) {
            fallecido.setTrabajaba("Se ignora");
        } else {
            // Si no se seleccionó ninguna opción válida, agregar un mensaje de error
            errores.append("El campo Trabajaba no debe ser vacío");
        }

        // Mostrar los mensajes de error si existen
        if (errores.length() > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Si no hay errores, avanzar a la siguiente pestaña del formulario
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(5);
        }
    }

    public static void recopilarInformacionVista6() {
        // Inicializar un nuevo objeto para recopilar datos del informante
        informante = new Informante();
        var errores = new StringBuilder();

        // Validar y asignar la afiliación al servicio de salud
        if (!vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludNinguna().isSelected()
                && !vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludSeIgnora().isSelected()) {
            // Verificar qué servicio de salud está seleccionado y asignarlo
            if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludIMSS().isSelected()) {
                fallecido.setAfiliacionServicioSalud("IMSS");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludISSSTE().isSelected()) {
                fallecido.setAfiliacionServicioSalud("ISSSTE");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludPEMEX().isSelected()) {
                fallecido.setAfiliacionServicioSalud("PEMEX");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludSEDENA().isSelected()) {
                fallecido.setAfiliacionServicioSalud("SEDENA");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludSEMAR().isSelected()) {
                fallecido.setAfiliacionServicioSalud("SEMAR");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludIMSSBIENESTAR().isSelected()) {
                fallecido.setAfiliacionServicioSalud("IMSS BIENESTAR");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludISSFAM().isSelected()) {
                fallecido.setAfiliacionServicioSalud("ISSFAM");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludOtra().isSelected()) {
                // Si es "Otra", validar y asignar el campo adicional para especificar
                fallecido.setAfiliacionServicioSalud("Otra");
                if (!vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().getText().isEmpty()
                        && !vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().getText().isBlank()) {
                    fallecido.setEspecifiqueServicioSalud(vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().getText().trim());
                } else {
                    // Generar un error si el campo para especificar está vacío
                    errores.append("El campo Específique Servicio de Salud no debe ser vacío\n");
                }
            } else {
                // Generar un error si no se seleccionó ningún servicio de salud válido
                errores.append("El campo Servicio de Salud no debe ser vacío\n");
            }

            // Validar y asignar el número de seguridad social
            if (!vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().getText().isBlank()) {
                fallecido.setNumeroSeguridadSocialAfiliacion(vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().getText().trim());
            } else {
                // Generar un error si el campo está vacío
                errores.append("El campo Número de Seguridad Social no debe ser vacío\n");
            }
        }

// Validar y asignar el nombre del informante
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreInf().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreInf().getText().isBlank()) {
            informante.setNombre(vistaFormularioCertificadoDefuncion.getTxtNombreInf().getText().trim());
        } else {
            // Generar un error si el campo está vacío
            errores.append("El campo Nombre del Informante no debe ser vacío\n");
        }

// Validar y asignar el apellido paterno del informante
        if (!vistaFormularioCertificadoDefuncion.getTxtApellidoPaternoInf().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtApellidoPaternoInf().getText().isBlank()) {
            informante.setApellidoPaterno(vistaFormularioCertificadoDefuncion.getTxtApellidoPaternoInf().getText().trim());
        } else {
            // Generar un error si el campo está vacío
            errores.append("El campo Apellido Paterno del Informante no debe ser vacío\n");
        }

// Validar y asignar el apellido materno del informante
        if (!vistaFormularioCertificadoDefuncion.getTxtApellidoMaternoInf().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtApellidoMaternoInf().getText().isBlank()) {
            informante.setApellidoMaterno(vistaFormularioCertificadoDefuncion.getTxtApellidoMaternoInf().getText().trim());
        } else {
            // Generar un error si el campo está vacío
            errores.append("El campo Apellido Materno del Informante no debe ser vacío");
        }

// Verificar si hay errores de validación
        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(6);
        }
    }

    public static void recopilarInformacionVista7() {
        defuncion = new Defuncion();
        var errores = new StringBuilder();

        if (!vistaFormularioCertificadoDefuncion.getTxtParentescoFamiliar().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtParentescoFamiliar().getText().isBlank()) {
            informante.setParentescoFallecido(vistaFormularioCertificadoDefuncion.getTxtParentescoFamiliar().getText().trim());
        } else {
            errores.append("El campo Parentesco con el Fallecido no debe ser vacío\n");
        }


        if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionViaPublica().isSelected()) {
            defuncion.setSitio("Vía pública");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionHogar().isSelected()) {
            defuncion.setSitio("Hogar");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionOtroLugar().isSelected()) {
            defuncion.setSitio("Otro lugar");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionSeIgnora().isSelected()) {
            defuncion.setSitio("Se ignora");
        } else {
            if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionSecretariaSalud().isSelected()) {
                defuncion.setUnidadMedica("Secretaría de Salud");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionIssste().isSelected()) {
                defuncion.setUnidadMedica("ISSTE");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionSemar().isSelected()) {
                defuncion.setUnidadMedica("SEMAR");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionImssBienestar().isSelected()) {
                defuncion.setUnidadMedica("IMSS BIENESTAR");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionPemex().isSelected()) {
                defuncion.setUnidadMedica("PEMEX");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionOtraUnidadMedica().isSelected()) {
                defuncion.setUnidadMedica("Otra unidad médica pública");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionImss().isSelected()) {
                defuncion.setUnidadMedica("IMSS");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionSedena().isSelected()) {
                defuncion.setUnidadMedica("SEDENA");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionUnidadMedicaPrivada().isSelected()) {
                defuncion.setUnidadMedica("Unidad médica privada");
            } else {
                errores.append("El campo Sitio donde sucedió la defunción no debe ser vacío\n");
            }

            if (!vistaFormularioCertificadoDefuncion.getTxtDefuncionNombreUnidadMedica().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtDefuncionNombreUnidadMedica().getText().isBlank()) {
                defuncion.setNombreUnidadMedica(vistaFormularioCertificadoDefuncion.getTxtDefuncionNombreUnidadMedica().getText().trim());
            } else {
                errores.append("El campo Nombre Unidad Medica no debe ser vacío\n");
            }
            if (!vistaFormularioCertificadoDefuncion.getTxtDefuncionClaveUnicaEstablecimientos().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtDefuncionClaveUnicaEstablecimientos().getText().isBlank()) {
                defuncion.setClues(vistaFormularioCertificadoDefuncion.getTxtDefuncionClaveUnicaEstablecimientos().getText().trim());
            } else {
                errores.append("El campo Clave Unica Establecimientos no debe ser vacío");
            }
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(7);
        }
    }

    public static void recopilarInformacionVista8() {
        var errores = new StringBuilder();

        if (!vistaFormularioCertificadoDefuncion.getTxtTipoVialidadDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTipoVialidadDefuncion().getText().isBlank()) {
            defuncion.setTipoVialidad(vistaFormularioCertificadoDefuncion.getTxtTipoVialidadDefuncion().getText().trim());
        } else {
            errores.append("El campo Tipo de Vialidad no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreVialidadDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreVialidadDefuncion().getText().isBlank()) {
            defuncion.setVialidadNombre(vistaFormularioCertificadoDefuncion.getTxtNombreVialidadDefuncion().getText().trim());
        } else {
            errores.append("El campo Nombre de Vialidad no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNumExtDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumExtDefuncion().getText().isBlank()) {
            defuncion.setNumeroExterior(vistaFormularioCertificadoDefuncion.getTxtNumExtDefuncion().getText().trim());
        } else {
            errores.append("El campo Número Exterior no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNumIntDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumIntDefuncion().getText().isBlank()) {
            defuncion.setNumeroInterior(vistaFormularioCertificadoDefuncion.getTxtNumIntDefuncion().getText().trim());
        } else {
            errores.append("El campo Número Interior no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtCodigoPostalDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtCodigoPostalDefuncion().getText().isBlank()) {
            if (vistaFormularioCertificadoDefuncion.getTxtCodigoPostalDefuncion().getText().trim().length() == 5) {
                defuncion.setCodigoPostal(vistaFormularioCertificadoDefuncion.getTxtCodigoPostalDefuncion().getText().trim());
            } else {
                errores.append("El campo Código Postal debe ser de 5 caracteres\n");
            }
        } else {
            errores.append("El campo Código Postal no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoDefuncion().getText().isBlank()) {
            defuncion.setTipoAsentamientoHumano(vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoDefuncion().getText().trim());
        } else {
            errores.append("El campo Tipo de Asentamiento Humano no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoDefuncion().getText().isBlank()) {
            defuncion.setNombreAsentamientoHumano(vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoDefuncion().getText().trim());
        } else {
            errores.append("El campo Nombre de Asentamiento Humano no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtLocalidadDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtLocalidadDefuncion().getText().isBlank()) {
            defuncion.setLocalidad(vistaFormularioCertificadoDefuncion.getTxtLocalidadDefuncion().getText().trim());
        } else {
            errores.append("El campo Localidad no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtMunicipioDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtMunicipioDefuncion().getText().isBlank()) {
            defuncion.setMunicipioAlcaldia(vistaFormularioCertificadoDefuncion.getTxtMunicipioDefuncion().getText().trim());
        } else {
            errores.append("El campo Municipio o Alcaldía no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaDefuncion().getText().isBlank()) {
            defuncion.setEntidadFederativa(vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaDefuncion().getText().trim());
        } else {
            errores.append("El campo Entidad Federativa no debe ser vacío");
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(8);
        }
    }

    public static void recopilarInformacionVista9() {
        var errores = new StringBuilder();

//        Validar que los campos no esten vacios
        if ((!vistaFormularioCertificadoDefuncion.getTxtDiaDefuncion().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtDiaDefuncion().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtMesDefuncion().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtMesDefuncion().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtAñoDefuncion().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtAñoDefuncion().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtHorasDefuncion().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtHorasDefuncion().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtMinutosDefuncion().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtMinutosDefuncion().getText().isBlank())) {
//            Validar que los datos ingresados sean numericos y esten en el formato correcto
            try {
                String diaText = vistaFormularioCertificadoDefuncion.getTxtDiaDefuncion().getText().trim();
                String mesText = vistaFormularioCertificadoDefuncion.getTxtMesDefuncion().getText().trim();
                String anioText = vistaFormularioCertificadoDefuncion.getTxtAñoDefuncion().getText().trim();
                int dia = Integer.parseInt(diaText);
                int mes = Integer.parseInt(mesText);
                int anio = Integer.parseInt(anioText);

                String fechaDefuncion = diaText + "/" + mesText + "/" + anioText;

//                Condición que evalua los valores de día, mes y año
                if (fechaDefuncion.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                    java.time.LocalDate.of(anio, mes, dia);
                    defuncion.setDia(dia);
                    defuncion.setMes(mes);
                    defuncion.setAnio(anio);
                } else {
                    errores.append("El formato de la fecha debe ser dd/mm/aaaa\n");
                }


            } catch (NumberFormatException e) {
                errores.append("Los datos ingresados en la fecha de defunción deben ser numéricos\n");
            } catch (java.time.DateTimeException e) {
                errores.append("La fecha de defunción ingresada no es válida\n");
            }

            try {
                int horas = Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtHorasDefuncion().getText().trim());
                int minutos = Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtMinutosDefuncion().getText().trim());
                if (horas > 0 && horas <= 23 && minutos > 0 && minutos <= 59) {
                    defuncion.setHoras(horas);
                    defuncion.setMinutos(minutos);
                } else {
                    errores.append("Formato de hora inválido\n");
                }
            } catch (NumberFormatException e) {
                errores.append("Los datos ingresados en la hora de defunción deben ser numéricos\n");
            }

        } else {
            errores.append("El campo Fecha y Hora de la Defunción no debe ser vacío\n");
        }

        if (vistaFormularioCertificadoDefuncion.getRdbtnSiRealizoCirugia().isSelected()) {
            defuncion.setCirugiaUltimas4Semanas("Si");
            if ((!vistaFormularioCertificadoDefuncion.getTxtDiaRealizoCirugia().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtDiaRealizoCirugia().getText().isBlank())
                    && (!vistaFormularioCertificadoDefuncion.getTxtMesRealizoCirugia().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtMesRealizoCirugia().getText().isBlank())
                    && (!vistaFormularioCertificadoDefuncion.getTxtAñoRealizoCirugia().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtAñoRealizoCirugia().getText().isBlank())) {
//            Validar que los datos ingresados sean numericos y esten en el formato correcto
                try {
                    String diaText = vistaFormularioCertificadoDefuncion.getTxtDiaRealizoCirugia().getText().trim();
                    String mesText = vistaFormularioCertificadoDefuncion.getTxtMesRealizoCirugia().getText().trim();
                    String anioText = vistaFormularioCertificadoDefuncion.getTxtAñoRealizoCirugia().getText().trim();
                    int dia = Integer.parseInt(diaText);
                    int mes = Integer.parseInt(mesText);
                    int anio = Integer.parseInt(anioText);

                    String fechaCirugia = diaText + "/" + mesText + "/" + anioText;

//                Condición que evalua los valores de día, mes y año
                    if (fechaCirugia.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                        java.time.LocalDate.of(anio, mes, dia);
                        defuncion.setCirugiaDia(dia);
                        defuncion.setCirugiaMes(mes);
                        defuncion.setCirugiaAnio(anio);
                    } else {
                        errores.append("El formato de la fecha debe ser dd/mm/aaaa\n");
                    }


                } catch (NumberFormatException e) {
                    errores.append("Los datos ingresados en la fecha de cirugía deben ser numéricos\n");
                } catch (java.time.DateTimeException e) {
                    errores.append("La fecha ingresada en cirugía no es válida\n");
                }
            } else {
                errores.append("El campo Fecha y Hora de la Cirugía no debe ser vacío\n");
            }

            if (!vistaFormularioCertificadoDefuncion.getTxtMotivoCirugia().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtMotivoCirugia().getText().isBlank()) {
                defuncion.setCirugiaMotivo(vistaFormularioCertificadoDefuncion.getTxtMotivoCirugia().getText().trim());
            } else {
                errores.append("El campo Motivo Cirugia no debe ser vacío\n");
            }
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoRealizoCirugia().isSelected()) {
            defuncion.setCirugiaUltimas4Semanas("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraRealizoCirugia().isSelected()) {
            defuncion.setCirugiaUltimas4Semanas("Se ignora");
        } else {
            errores.append("El campo Cirugía no debe ser vacío\n");
        }

        if (vistaFormularioCertificadoDefuncion.getRdbtnSiAtencionMedica().isSelected()) {
            defuncion.setAtencionMedica("Si");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoAtencionMedica().isSelected()) {
            defuncion.setAtencionMedica("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraAtencionMedica().isSelected()) {
            defuncion.setAtencionMedica("Se ignora");
        } else {
            errores.append("El campo Atención Médica no debe ser vacío\n");
        }

        if (vistaFormularioCertificadoDefuncion.getRdbtnSiDefuncionAccidentalViolenta().isSelected()) {
            defuncion.setAccidentalViolenta("Si");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoDefuncionAccidentalViolenta().isSelected()) {
            defuncion.setAccidentalViolenta("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraDefuncionAccidentalViolenta().isSelected()) {
            defuncion.setAccidentalViolenta("Se ignora");
        } else {
            errores.append("El campo Accidental o Violenta no debe ser vacío");
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(9);
        }
    }

    public static void recopilarInformacionVista10() {
        var errores = new StringBuilder();

        if (vistaFormularioCertificadoDefuncion.getRdbtnTipoDefuncionEnfermedad().isSelected()) {
            defuncion.setDefuncionTipo("Enfermedad");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnTipoDefuncionAccidente().isSelected()) {
            defuncion.setDefuncionTipo("Accidente");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnTipoDefuncionAgresion().isSelected()) {
            defuncion.setDefuncionTipo("Agresión");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnTipoDefuncionIntencionalmente().isSelected()) {
            defuncion.setDefuncionTipo("Lesiones autoinfligidas intencionalmente");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnTipoDefuncionIntervencionLegal().isSelected()) {
            defuncion.setDefuncionTipo("Intervención legal");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnTipoDefuncionSeIgnora().isSelected()) {
            defuncion.setDefuncionTipo("Se ignora");
        } else {
            errores.append("El campo Tipo de Defunción no debe ser vacío\n");
        }

        if ((!vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionA().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionA().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionB().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionB().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionC().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionC().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionD().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionD().getText().isBlank())) {
            defuncion.getCausas()[0] = vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionA().getText().trim();
            defuncion.getCausas()[1] = vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionB().getText().trim();
            defuncion.getCausas()[2] = vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionC().getText().trim();
            defuncion.getCausas()[3] = vistaFormularioCertificadoDefuncion.getTxtCausaDefuncionD().getText().trim();

        } else {
            errores.append("Las causas de defunción no deben ser vacías\n");
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(10);
        }
    }

    public static void recopilarInformacionVista11() {
        var errores = new StringBuilder();

        if ((!vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionA().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionA().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionB().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionB().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionC().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionC().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionD().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionD().getText().isBlank())) {
            defuncion.getIntervaloTiempo()[0] = vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionA().getText().trim();
            defuncion.getIntervaloTiempo()[1] = vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionB().getText().trim();
            defuncion.getIntervaloTiempo()[2] = vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionC().getText().trim();
            defuncion.getIntervaloTiempo()[3] = vistaFormularioCertificadoDefuncion.getTxtIntervaloEnfermedadDefuncionD().getText().trim();
        } else {
            errores.append("Los campos de intervalo de tiempo no deben ser vacíos\n");
        }

        if ((!vistaFormularioCertificadoDefuncion.getTxtCodigoCieA().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCodigoCieA().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtCodigoCieB().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCodigoCieB().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtCodigoCieC().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCodigoCieC().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtCodigoCieD().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCodigoCieD().getText().isBlank())) {
            defuncion.getCodigoCie()[0] = vistaFormularioCertificadoDefuncion.getTxtCodigoCieA().getText().trim();
            defuncion.getCodigoCie()[1] = vistaFormularioCertificadoDefuncion.getTxtCodigoCieB().getText().trim();
            defuncion.getCodigoCie()[2] = vistaFormularioCertificadoDefuncion.getTxtCodigoCieC().getText().trim();
            defuncion.getCodigoCie()[3] = vistaFormularioCertificadoDefuncion.getTxtCodigoCieD().getText().trim();
        } else {
            errores.append("Los campos códigos CIE no deben ser vacíos\n");
        }

        if ((!vistaFormularioCertificadoDefuncion.getTxtOtrasCondiciones().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtOtrasCondiciones().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtCodigoCieIntervaloTiempo().getText().isEmpty() && !vistaFormularioCertificadoDefuncion.getTxtCodigoCieIntervaloTiempo().getText().isBlank())) {
            defuncion.getCausas()[4] = vistaFormularioCertificadoDefuncion.getTxtOtrasCondiciones().getText().trim();
            defuncion.getCodigoCie()[4] = vistaFormularioCertificadoDefuncion.getTxtCodigoCieIntervaloTiempo().getText().trim();
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(11);

            //Funcion extra para la siguiente vista, para las mujeres entre 10 y 54 años
//            if(fallecido.getEdadAnios() >= 10 && fallecido.getEdadAnios() <= 54){
//                habilitarCamposMujer();
//            }
            int edadFallecido = calcularEdad(fallecido.getDiaNacimiento(), fallecido.getMesNacimiento(), fallecido.getAnioNacimiento());
            if ((fallecido.getSexo().equals("Mujer")) && (edadFallecido >= 10 && edadFallecido <= 54)) {
                isMujer1054 = true;
                habilitarCamposMujer();
            }
        }
    }

    public static void recopilarInformacionVista12() {
        var errores = new StringBuilder();

        if (vistaFormularioCertificadoDefuncion.getRdbtnSiPracticoNecropsia().isSelected()) {
            defuncion.setNecropsia("Si");
            if (vistaFormularioCertificadoDefuncion.getRdbtnSiUtilizaronHallazgos().isSelected()) {
                defuncion.setHallazgosCertificacion("Si");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoUtilizaronHallazgos().isSelected()) {
                defuncion.setHallazgosCertificacion("No");
            } else {
                errores.append("El campo se utilizaron hallazgos no debe ser vacío\n");
            }
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoPracticoNecropsia().isSelected()) {
            defuncion.setNecropsia("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraPracticoNecropsia().isSelected()) {
            defuncion.setNecropsia("Se ignora");
        } else {
            errores.append("El campo Necropsia no debe ser vacío\n");
        }

        if (vistaFormularioCertificadoDefuncion.getRdbtnSiMuerteEncefalica().isSelected()) {
            defuncion.setMuerteEncefalica("Si");
            if (vistaFormularioCertificadoDefuncion.getRdbtnSiDonadorOrganos().isSelected()) {
                defuncion.setDonadorOrganos("Si");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoDonadorOrganos().isSelected()) {
                defuncion.setDonadorOrganos("No");
            } else {
                errores.append("El campo donador de órganos no debe ser vacío\n");
            }
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoMuerteEncefalica().isSelected()) {
            defuncion.setMuerteEncefalica("No");
        } else {
            errores.append("El campo muerte encéfalica no debe ser vacío\n");
        }

        if (isMujer1054) {
            if (vistaFormularioCertificadoDefuncion.getRdbtnMuerteDuranteEmbarazo().isSelected()) {
                defuncion.setMuerteDurante("Embarazo");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnMuerteDuranteParto().isSelected()) {
                defuncion.setMuerteDurante("Parto");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnMuerteDurantePuerperio().isSelected()) {
                defuncion.setMuerteDurante("Puerperio");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnMuerteDespuesPartoAborto().isSelected()) {
                defuncion.setMuerteDurante("43 días a 11 meses después del parto o aborto");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoEstuvoEmbarazadaPreviamente().isSelected()) {
                defuncion.setMuerteDurante("No embarazo últimos 11 meses previos a la defunción");
            } else {
                errores.append("El campo Específique la muerte no debe ser vacío\n");
            }

            if (vistaFormularioCertificadoDefuncion.getRdbtnSiComplicacionesPropias().isSelected()) {
                defuncion.setCausasComplicacionesPropiasEmbarazoPartoPuerperio("Si");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoComplicacionesPropias().isSelected()) {
                defuncion.setCausasComplicacionesPropiasEmbarazoPartoPuerperio("No");
            } else {
                errores.append("Debe seleccionar una opción en las causas de muerte\n");
            }

            if (vistaFormularioCertificadoDefuncion.getRdbtnSiComplicaciones().isSelected()) {
                defuncion.setCausasComplicaronEmbarazoPartoPuerperio("Si");
            } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoComplicaciones().isSelected()) {
                defuncion.setCausasComplicaronEmbarazoPartoPuerperio("No");
            } else {
                errores.append("Debe seleccionar una opción en las causas de muerte\n");
            }
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(12);
        }
    }

    public static void recopilarInformacionVista13() {
        situacion = new Situacion();

        var errores = new StringBuilder();

        if (!vistaFormularioCertificadoDefuncion.getTxtCausaBasicaDefuncion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtCausaBasicaDefuncion().getText().isBlank()) {
            if (vistaFormularioCertificadoDefuncion.getTxtCausaBasicaDefuncion().getText().trim().length() == 4) {
                defuncion.setCausaBasica(vistaFormularioCertificadoDefuncion.getTxtCausaBasicaDefuncion().getText().trim());
            } else {
                errores.append("El El campo Causa Básica de Defunción debe ser de 4 caracteres\n");
            }
        } else {
            errores.append("El campo Causa Básica de Defunción no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtCodigoAdicional().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtCodigoAdicional().getText().isBlank()) {
            if (vistaFormularioCertificadoDefuncion.getTxtCodigoAdicional().getText().trim().length() == 4) {
                defuncion.setCodigoCieCausaBasica(vistaFormularioCertificadoDefuncion.getTxtCodigoAdicional().getText().trim());
            } else {
                errores.append("El El campo Código Adicional debe ser de 4 caracteres\n");
            }
        } else {
            errores.append("El campo Código Adicional no debe ser vacío\n");
        }

        if (vistaFormularioCertificadoDefuncion.getRdbtnSiOcurrioDesempeñoTrabajo().isSelected()) {
            situacion.setDuranteTrabajo("Si");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoOcurrioDesempeñoTrabajo().isSelected()) {
            situacion.setDuranteTrabajo("No");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraOcurrioDesempeñoTrabajo().isSelected()) {
            situacion.setDuranteTrabajo("Se ignora");
        } else {
            errores.append("Seleccione un opcion Ocurrió en el Desempeño Trabajo\n");
        }

        if (vistaFormularioCertificadoDefuncion.getRdbtnViviendaParticular().isSelected()) {
            situacion.setLugarLesion("Vivienda particular");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnEscuelauOficinaPublica().isSelected()) {
            situacion.setLugarLesion("Escuela u oficina pública");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnViviendaColectiva().isSelected()) {
            situacion.setLugarLesion("Vivienda Colectiva");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnAreaDeportiva().isSelected()) {
            situacion.setLugarLesion("Área deportiva");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnCalleoCarretera().isSelected()) {
            situacion.setLugarLesion("Calle o carretera");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnAreaComercialoServicio().isSelected()) {
            situacion.setLugarLesion("Área comercial o de servicio");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnAreaIndustrial().isSelected()) {
            situacion.setLugarLesion("Área industrial");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnGranja().isSelected()) {
            situacion.setLugarLesion("Granja");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnOtroLugar().isSelected()) {
            situacion.setLugarLesion("Otro");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraLugar().isSelected()) {
            situacion.setLugarLesion("Se ignora");
        } else {
            errores.append("El campo Lugar no debe ser vacío\n");
        }

        if (!vistaFormularioCertificadoDefuncion.getTxtNumeroActa().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumeroActa().getText().isBlank()) {
            situacion.setActaNumero(vistaFormularioCertificadoDefuncion.getTxtNumeroActa().getText().trim());
        } else {
            errores.append("El campo Número de Acta no debe ser vacío");
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(13);
        }
    }

    public static void recopilarInformacionVista14() {
        var errores = new StringBuilder();

        if (!vistaFormularioCertificadoDefuncion.getTxtRelacionAgresorFallecido().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtRelacionAgresorFallecido().getText().isBlank()) {
            situacion.setRelacionAgresorFallecido(vistaFormularioCertificadoDefuncion.getTxtRelacionAgresorFallecido().getText().trim());
        } else {
            errores.append("El campo Relación del Agresor no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtDescripcionSituacion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtDescripcionSituacion().getText().isBlank()) {
            situacion.setDescripcionAgresion(vistaFormularioCertificadoDefuncion.getTxtDescripcionSituacion().getText().trim());
        } else {
            errores.append("El campo Descripción no debe ser vacío\n");
        }
        if (vistaFormularioCertificadoDefuncion.getRdbtnInvestigacionPendiente().isSelected()) {
            situacion.setSituacionAgresion("Investigación pendiente");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoPuedeDeterminarse().isSelected()) {
            situacion.setSituacionAgresion("No puede determinarse");
        } else {
            errores.append("El campo de Investigación no puede ser vacío");
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(14);
        }
    }

    public static void recopilarInformacionVista15() {
        var errores = new StringBuilder();

        if (!vistaFormularioCertificadoDefuncion.getTxtTipoVialidadLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTipoVialidadLesion().getText().isBlank()) {
            situacion.setTipoVialidad(vistaFormularioCertificadoDefuncion.getTxtTipoVialidadLesion().getText().trim());
        } else {
            errores.append("El campo Tipo Vialidad no puede ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreVialidadLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreVialidadLesion().getText().isBlank()) {
            situacion.setVialidadNombre(vistaFormularioCertificadoDefuncion.getTxtNombreVialidadLesion().getText().trim());
        } else {
            errores.append("El campo Nombre Vialidad no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNumExtLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumExtLesion().getText().isBlank()) {
            situacion.setNumeroExterior(vistaFormularioCertificadoDefuncion.getTxtNumExtLesion().getText().trim());
        } else {
            errores.append("El campo Número Exterior no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNumIntLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumIntLesion().getText().isBlank()) {
            situacion.setNumeroInterior(vistaFormularioCertificadoDefuncion.getTxtNumIntLesion().getText().trim());
        } else {
            errores.append("El campo Número Interior no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoLesion().getText().isBlank()) {
            situacion.setTipoAsentamientoHumano(vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoLesion().getText().trim());
        } else {
            errores.append("El campo Tipo Asentamiento Humano no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoLesion().getText().isBlank()) {
            situacion.setNombreAsentamientoHumano(vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoLesion().getText().trim());
        } else {
            errores.append("El campo Nombre Asentamiento Humano no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtCodigoPostalLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtCodigoPostalLesion().getText().isBlank()) {
            if (vistaFormularioCertificadoDefuncion.getTxtCodigoPostalLesion().getText().trim().length() == 5) {
                situacion.setCodigoPostal(vistaFormularioCertificadoDefuncion.getTxtCodigoPostalLesion().getText().trim());
            } else {
                errores.append("El campo Código Postal debe ser de 5 caracteres\n");
            }
        } else {
            errores.append("El campo Código Postal no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtLocalidadLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtLocalidadLesion().getText().isBlank()) {
            situacion.setLocalidad(vistaFormularioCertificadoDefuncion.getTxtLocalidadLesion().getText().trim());
        } else {
            errores.append("El campo Localidad no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldiaLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldiaLesion().getText().isBlank()) {
            situacion.setMunicipioAlcaldia(vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldiaLesion().getText().trim());
        } else {
            errores.append("El campo Municipio o Alcaldía no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaLesion().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaLesion().getText().isBlank()) {
            situacion.setEntidadFederativa(vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaLesion().getText().trim());
        } else {
            errores.append("El campo Entidad Federativa no debe ser vacío");
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(15);
        }
    }

    public static void recopilarInformacionVista16() {
        certificante = new Certificante();
        var errores = new StringBuilder();

        if (vistaFormularioCertificadoDefuncion.getRdbtnMedicoTratante().isSelected()) {
            certificante.setCertificante("Médica/o tratante");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnMedicoLegista().isSelected()) {
            certificante.setCertificante("Médica/o legista");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnOtroMedico().isSelected()) {
            certificante.setCertificante("Otra/o médica/o");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnPersonaAutorizada().isSelected()) {
            certificante.setCertificante("Persona autorizada por la Secretaría de Salud");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnAutoridadCivil().isSelected()) {
            certificante.setCertificante("Autoridad Civil");
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnOtro().isSelected()) {
            certificante.setCertificante("Otro");
            if (!vistaFormularioCertificadoDefuncion.getTxtEspecifiqueOtraAutoridad1().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtEspecifiqueOtraAutoridad1().getText().isBlank()) {
                certificante.setEspecifiqueCertificante(vistaFormularioCertificadoDefuncion.getTxtEspecifiqueOtraAutoridad1().getText().trim());
            } else {
                errores.append("El campo Específique no debe ser vacío\n");
            }
        } else {
            errores.append("El campo Certificante no debe ser vacío\n");
        }

        if (vistaFormularioCertificadoDefuncion.getRdbtnMedicoTratante().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnMedicoLegista().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnOtroMedico().isSelected()) {
            if (!vistaFormularioCertificadoDefuncion.getTxtNumCedProfesional().getText().isEmpty()
                    && !vistaFormularioCertificadoDefuncion.getTxtNumCedProfesional().getText().isBlank()) {
                certificante.setNumeroCedulaProfesional(vistaFormularioCertificadoDefuncion.getTxtNumCedProfesional().getText().trim());
            } else {
                errores.append("El campo Número Cédula Profesional no debe ser vacío");
            }
        }

        if (!vistaFormularioCertificadoDefuncion.getTxtNombreCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreCertificante().getText().isBlank()) {
            certificante.setNombre(vistaFormularioCertificadoDefuncion.getTxtNombreCertificante().getText().trim());
        } else {
            errores.append("El campo Nombre no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtApellidoPCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtApellidoPCertificante().getText().isBlank()) {
            certificante.setApellidoPaterno(vistaFormularioCertificadoDefuncion.getTxtApellidoPCertificante().getText().trim());
        } else {
            errores.append("El campo Apellido Paterno no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtApellidoMCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtApellidoMCertificante().getText().isBlank()) {
            certificante.setApellidoMaterno(vistaFormularioCertificadoDefuncion.getTxtApellidoMCertificante().getText().trim());
        } else {
            errores.append("El campo Apellido Materno no debe ser vacío\n");
        }


        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(16);
        }
    }

    public static void recopilarInformacionVista17() {
        var errores = new StringBuilder();

        if (!vistaFormularioCertificadoDefuncion.getTxtTipoVialidadCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTipoVialidadCertificante().getText().isBlank()) {
            certificante.setTipoVialidad(vistaFormularioCertificadoDefuncion.getTxtTipoVialidadCertificante().getText().trim());
        } else {
            errores.append("El campo Tipo Vialidad no puede ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreVialidadCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreVialidadCertificante().getText().isBlank()) {
            certificante.setVialidadNombre(vistaFormularioCertificadoDefuncion.getTxtNombreVialidadCertificante().getText().trim());
        } else {
            errores.append("El campo Nombre Vialidad no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNumExtCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumExtCertificante().getText().isBlank()) {
            certificante.setNumeroExterior(vistaFormularioCertificadoDefuncion.getTxtNumExtCertificante().getText().trim());
        } else {
            errores.append("El campo Número Exterior no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNumIntCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumIntCertificante().getText().isBlank()) {
            certificante.setNumeroInterior(vistaFormularioCertificadoDefuncion.getTxtNumIntCertificante().getText().trim());
        } else {
            errores.append("El campo Número Interior no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoCertificante().getText().isBlank()) {
            certificante.setTipoAsentamientoHumano(vistaFormularioCertificadoDefuncion.getTxtTipoAsentamientoHumanoCertificante().getText().trim());
        } else {
            errores.append("El campo Tipo Asentamiento Humano no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoCertificante().getText().isBlank()) {
            certificante.setNombreAsentamientoHumano(vistaFormularioCertificadoDefuncion.getTxtNombreAsentamientoHumanoCertificante().getText().trim());
        } else {
            errores.append("El campo Nombre Asentamiento Humano no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtCodigoPostalCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtCodigoPostalCertificante().getText().isBlank()) {
            if (vistaFormularioCertificadoDefuncion.getTxtCodigoPostalCertificante().getText().trim().length() == 5) {
                certificante.setCodigoPostal(vistaFormularioCertificadoDefuncion.getTxtCodigoPostalCertificante().getText().trim());
            } else {
                errores.append("El campo Código Postal debe ser de 5 caracteres vacío\n");
            }
        } else {
            errores.append("El campo Código Postal no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtLocalidadCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtLocalidadCertificante().getText().isBlank()) {
            certificante.setLocalidad(vistaFormularioCertificadoDefuncion.getTxtLocalidadCertificante().getText().trim());
        } else {
            errores.append("El campo Localidad no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldiaCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldiaCertificante().getText().isBlank()) {
            certificante.setMunicipioAlcaldia(vistaFormularioCertificadoDefuncion.getTxtMunicipioAlcaldiaCertificante().getText().trim());
        } else {
            errores.append("El campo Municipio o Alcaldía no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaCertificante().getText().isBlank()) {
            certificante.setEntidadFederativa(vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaCertificante().getText().trim());
        } else {
            errores.append("El campo Entidad Federativa no debe ser vacío");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtTelefonoCertificante().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtTelefonoCertificante().getText().isBlank()) {
            certificante.setTelefono(vistaFormularioCertificadoDefuncion.getTxtTelefonoCertificante().getText().trim());
        } else {
            errores.append("El campo Teléfono no debe ser vacío");
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            vistaFormularioCertificadoDefuncion.getTabbedPaneCertificadoDefuncion().setSelectedIndex(17);
        }
    }

    public static void recopilarInformacionVista18() {
        registroCivil = new RegistroCivil();
        var errores = new StringBuilder();

        if ((!vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionDia().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionDia().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionMes().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionMes().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionAño().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionAño().getText().isBlank())) {
            //            Validar que los datos ingresados sean numericos y esten en el formato correcto
            try {
                String diaText = vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionDia().getText().trim();
                String mesText = vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionMes().getText().trim();
                String anioText = vistaFormularioCertificadoDefuncion.getTxtFechaCertificacionAño().getText().trim();
                int dia = Integer.parseInt(diaText);
                int mes = Integer.parseInt(mesText);
                int anio = Integer.parseInt(anioText);

                String fechaCertificacion = diaText + "/" + mesText + "/" + anioText;

//                Condición que evalua los valores de día, mes y año
                if (fechaCertificacion.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                    java.time.LocalDate.of(anio, mes, dia);
                    fallecido.setDiaCertificacion(dia);
                    fallecido.setMesCertificacion(mes);
                    fallecido.setAnioCertificacion(anio);
                } else {
                    errores.append("El formato de la fecha debe ser dd/mm/aaaa\n");
                }


            } catch (NumberFormatException e) {
                errores.append("Los datos ingresados en la fecha de defunción deben ser numéricos\n");
            } catch (java.time.DateTimeException e) {
                errores.append("La fecha de defunción ingresada no es válida\n");
            }
        } else {
            errores.append("El campo Fecha Certificación no debe ser vacío\n");
        }

        if (!vistaFormularioCertificadoDefuncion.getTxtNumFiscalia().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumFiscalia().getText().isBlank()) {
            registroCivil.setNumero(vistaFormularioCertificadoDefuncion.getTxtNumFiscalia().getText().trim());
        } else {
            errores.append("El campo Número Fiscalía no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNumLibroFiscalia().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumLibroFiscalia().getText().isBlank()) {
            registroCivil.setNumeroLibro(vistaFormularioCertificadoDefuncion.getTxtNumLibroFiscalia().getText().trim());
        } else {
            errores.append("El campo Número Libro Fiscalía no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtNumActaFiscalia().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtNumActaFiscalia().getText().isBlank()) {
            registroCivil.setNumeroActa(vistaFormularioCertificadoDefuncion.getTxtNumActaFiscalia().getText().trim());
        } else {
            errores.append("El campo Número Acta Fiscalía no debe ser vacío\n");
        }

        if (!vistaFormularioCertificadoDefuncion.getTxtLocalidadRegistro().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtLocalidadRegistro().getText().isBlank()) {
            registroCivil.setLocalidad(vistaFormularioCertificadoDefuncion.getTxtLocalidadRegistro().getText().trim());
        } else {
            errores.append("El campo Localidad no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtMunicipioRegistro().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtMunicipioRegistro().getText().isBlank()) {
            registroCivil.setMunicipioAlcaldia(vistaFormularioCertificadoDefuncion.getTxtMunicipioRegistro().getText().trim());
        } else {
            errores.append("El campo Municipio o Alcaldía no debe ser vacío\n");
        }
        if (!vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaRegistro().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaRegistro().getText().isBlank()) {
            registroCivil.setEntidadFederativa(vistaFormularioCertificadoDefuncion.getTxtEntidadFederativaRegistro().getText().trim());
        } else {
            errores.append("El campo Entidad Federativa no debe ser vacío\n");
        }

        if ((!vistaFormularioCertificadoDefuncion.getTxtDiaRegistro().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtDiaRegistro().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtMesRegistro().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtMesRegistro().getText().isBlank())
                && (!vistaFormularioCertificadoDefuncion.getTxtAñoRegistro().getText().isEmpty()
                && !vistaFormularioCertificadoDefuncion.getTxtAñoRegistro().getText().isBlank())) {
            try {
                String diaText = vistaFormularioCertificadoDefuncion.getTxtDiaRegistro().getText().trim();
                String mesText = vistaFormularioCertificadoDefuncion.getTxtMesRegistro().getText().trim();
                String anioText = vistaFormularioCertificadoDefuncion.getTxtAñoRegistro().getText().trim();
                int dia = Integer.parseInt(diaText);
                int mes = Integer.parseInt(mesText);
                int anio = Integer.parseInt(anioText);

                String fechaRegistro = diaText + "/" + mesText + "/" + anioText;

//                Condición que evalua los valores de día, mes y año
                if (fechaRegistro.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                    java.time.LocalDate.of(anio, mes, dia);
                    registroCivil.setDiaRegistro(dia);
                    registroCivil.setMesRegistro(mes);
                    registroCivil.setAnioRegistro(anio);
                } else {
                    errores.append("El formato de la fecha debe ser dd/mm/aaaa\n");
                }
            } catch (NumberFormatException e) {
                errores.append("Los datos ingresados en la fecha de defunción deben ser numéricos\n");
            } catch (java.time.DateTimeException e) {
                errores.append("La fecha de defunción ingresada no es válida\n");
            }
        } else {
            errores.append("El campo Fecha Registro no debe ser vacío\n");
        }

        if (errores.length() > 0) {
            // Mostrar mensaje con los errores encontrados
            JOptionPane.showMessageDialog(
                    null,
                    errores.toString(),
                    "Errores de validación",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Avanzar a la siguiente pestaña del formulario si no hay errores
            //generarActa();
        }
    }

    /// # METHODS PARA INSERTAR LA INFORMACIÓN EN LA BASE DE DATOS

    // TODO - Método para insertar en la BD TODA la información necesaria para generar el Certificado de Defuncion
    public static void insertarInformacionCertificadoDefuncion() {
        if (insertarInformacionCertificante()) {
            if (insertarInformacionFallecido()) {
                if (insertarInformacionDefuncion()) {
                    if (insertarInformacionSituacion()) {
                        if (insertarInformacionRegistroCivil()) {
                            if (insertarInformacionInformante()) {
                                System.out.println("Información insertada correctamente!");
                            } else {
                                System.err.println("Error al insertar información del certificante");
                            }
                        } else {
                            System.err.println("Error al insertar información del informante");
                        }
                    } else {
                        System.err.println("Error al insertar información del registro civil");
                    }
                } else {
                    System.err.println("Error al insertar información de la situación");
                }
            } else {
                System.err.println("Error al insertar información de la defunción");
            }
        } else {
            System.err.println("Error al insertar información del fallecido");
        }
    }

    // Method para insertar la información del certificante en la BD
    private static boolean insertarInformacionCertificante() {
        if (new CertificanteDAO().registrarCertificante(certificante)) {
            int idCertificante = new CertificanteDAO().getIdCertificante(certificante.getNombre());
            if (idCertificante != -1) {
                if (new CertificanteDAO().registrarCertificanteDomicilio(certificante, idCertificante)) {
                    System.out.println("Información del certificante ingresada correctamente!");
                    return true;
                } else {
                    System.err.println("Error al insertar datos en la tabla certificante_domicilio");
                    return false;
                }
            } else {
                System.err.println("Error al obtener el idCertificante");
                return false;
            }

        } else {
            System.err.println("Error al insertar datos en la tabla certificante");
            return false;
        }

    }

    // TODO - Método para insertar la información del fallecido en la BD
    private static boolean insertarInformacionFallecido() {
        return false;
    }

    // TODO - Método para insertar la información de la defunción en la BD
    private static boolean insertarInformacionDefuncion() {
        return false;
    }

    // TODO - Método para insertar la información de la situación en la BD
    private static boolean insertarInformacionSituacion() {
        return false;
    }

    // TODO - Método para insertar la información del registro civil en la BD
    private static boolean insertarInformacionRegistroCivil() {
        return false;
    }

    // TODO - Método para insertar la información del informante en la BD
    private static boolean insertarInformacionInformante() {
        return false;
    }

    /// # METHODS AUXILIARES QUE MANIPULAN LA VISTA

    public static void deshabilitarHabilitarCamposEdadCumplida() {
        // Verifica y habilita o deshabilita los campos según la selección de la edad cumplida
        try {
            if (vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraEdad().isSelected()) {
                // Si la edad es "Se ignora", deshabilita todos los campos relacionados
                vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().setEditable(false);
                vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().setEnabled(false);
                vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().setEditable(false);
                vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().setEnabled(false);
                vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().setEditable(false);
                vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().setEnabled(false);
                vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().setEditable(false);
                vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().setEnabled(false);
                vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().setEnabled(false);
            } else {
                vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().setEditable(true);
                vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().setEnabled(true);
                vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().setEnabled(true);
                if ((vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Días")
                        && Integer.parseInt(vistaFormularioCertificadoDefuncion.getTxtEdadTiempo().getText()) < 28)
                        || vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Minutos")
                        || vistaFormularioCertificadoDefuncion.getjComboBoxTiempo().getSelectedItem().equals("Horas")) {

                    // Si la edad está en días, minutos u horas y es menor a 28 días, habilita todos los campos relacionados
                    vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().setEditable(true);
                    vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().setEnabled(true);
                    vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().setEditable(true);
                    vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().setEnabled(true);
                    vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().setEditable(true);
                    vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().setEnabled(true);
                } else {
                    // Para todos los demás casos, deshabilita los campos relacionados
                    vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().setEditable(false);
                    vistaFormularioCertificadoDefuncion.getTxtFolioCertificadoNacimiento().setEnabled(false);
                    vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().setEditable(false);
                    vistaFormularioCertificadoDefuncion.getTxtSemanasGestacion().setEnabled(false);
                    vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().setEditable(false);
                    vistaFormularioCertificadoDefuncion.getTxtPesoAlNacer().setEnabled(false);
                }
            }
        } catch (NumberFormatException e) {
            // Captura y maneja errores de formato numérico si se ingresa un valor inválido
        }
    }

    public static void deshabilitarHabilitarTextFieldNombre() {
        // Habilita o deshabilita los campos de texto del nombre según si la persona es desconocida
        if (vistaFormularioCertificadoDefuncion.getRdbtnPersonaDesconocida().isSelected()) {
            // Si la persona es desconocida, deshabilita los campos de nombre y apellidos
            vistaFormularioCertificadoDefuncion.getTxtNombre().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtNombre().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtApellidoPaterno().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtApellidoPaterno().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtApellidoMaterno().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtApellidoMaterno().setEditable(false);
        } else {
            // Si la persona no es desconocida, habilita los campos de nombre y apellidos
            vistaFormularioCertificadoDefuncion.getTxtNombre().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtNombre().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtApellidoPaterno().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtApellidoPaterno().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtApellidoMaterno().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtApellidoMaterno().setEditable(true);
        }
    }

    public static void deshabilitarHabilitarOcupacionDescripcion() {
        // Habilita o deshabilita el campo de descripción de ocupación habitual según la selección
        if (vistaFormularioCertificadoDefuncion.getRdbtnOcupacionHabitualSeIgnora().isSelected()) {
            // Si se ignora la ocupación habitual, deshabilita y limpia el campo
            vistaFormularioCertificadoDefuncion.getTxtOcupacionHabitual().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtOcupacionHabitual().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtOcupacionHabitual().setText("");
        } else if (!vistaFormularioCertificadoDefuncion.getRdbtnOcupacionHabitualSeIgnora().isSelected()) {
            // Si no se ignora, habilita el campo
            vistaFormularioCertificadoDefuncion.getTxtOcupacionHabitual().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtOcupacionHabitual().setEditable(true);
        }
    }

    public static void deshabilitarHabilitarTipoEscolaridad() {
        // Habilita o deshabilita las opciones de tipo de escolaridad según la selección de nivel educativo
        if (vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadSeIgnora().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadNinguna().isSelected()) {
            // Si se ignora la escolaridad o no tiene escolaridad, deshabilita las opciones
            vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadCompleta().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadIncompleta().setEnabled(false);
        } else {
            // Si tiene algún nivel educativo, habilita las opciones
            vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadCompleta().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getRdbtnEscolaridadIncompleta().setEnabled(true);
        }
    }

    public static void deshabilitarHabilitarCamposServicioSalud() {
        // Habilita o deshabilita los campos relacionados con servicios de salud según la selección
        if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludSeIgnora().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludNinguna().isSelected()) {
            // Si se ignoran o no tienen servicios de salud, deshabilita los campos relacionados
            vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().setEditable(false);
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnServiciosDeSaludOtra().isSelected()) {
            // Si el servicio es "Otro", habilita los campos para especificar
            vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().setEnabled(true);
        } else {
            // En los demás casos, habilita solo el número de seguridad social
            vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtServiciosDeSaludEspecifique().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtNumeroSeguridadSocial().setEnabled(true);
        }
    }

    public static void deshabilitarHabilitarEspecifiqueLenguaIndigena() {
        if (vistaFormularioCertificadoDefuncion.getRdbtnSiLenguaIndigena().isSelected()) {
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueLenguaIndigena().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueLenguaIndigena().setEditable(true);
        } else {
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueLenguaIndigena().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueLenguaIndigena().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueLenguaIndigena().setText("");
        }
    }

    public static void deshabilitarHabilitarEspecifiqueNacionalidad() {
        if (vistaFormularioCertificadoDefuncion.getRdbtnOtraNacionalidad().isSelected()) {
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueNacionalidad().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueNacionalidad().setEditable(true);
        } else {
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueNacionalidad().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueNacionalidad().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueNacionalidad().setText("");
        }
    }

    public static void deshabilitarHabilitarCamposSitioDefuncion() {
        if (vistaFormularioCertificadoDefuncion.getRdbtnDefuncionViaPublica().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnDefuncionHogar().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnDefuncionOtroLugar().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnDefuncionSeIgnora().isSelected()) {

            vistaFormularioCertificadoDefuncion.getTxtDefuncionNombreUnidadMedica().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtDefuncionNombreUnidadMedica().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtDefuncionClaveUnicaEstablecimientos().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtDefuncionClaveUnicaEstablecimientos().setEditable(false);
        } else {
            vistaFormularioCertificadoDefuncion.getTxtDefuncionNombreUnidadMedica().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtDefuncionNombreUnidadMedica().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtDefuncionClaveUnicaEstablecimientos().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtDefuncionClaveUnicaEstablecimientos().setEditable(true);
        }
    }

    public static void deshabilitarHabilitarCamposCirugia() {
        if (vistaFormularioCertificadoDefuncion.getRdbtnSiRealizoCirugia().isSelected()) {
            vistaFormularioCertificadoDefuncion.getTxtDiaRealizoCirugia().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtDiaRealizoCirugia().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtMesRealizoCirugia().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtMesRealizoCirugia().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtAñoRealizoCirugia().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtAñoRealizoCirugia().setEditable(true);
            vistaFormularioCertificadoDefuncion.getTxtMotivoCirugia().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtMotivoCirugia().setEditable(true);
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoRealizoCirugia().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraRealizoCirugia().isSelected()) {
            vistaFormularioCertificadoDefuncion.getTxtDiaRealizoCirugia().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtDiaRealizoCirugia().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtMesRealizoCirugia().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtMesRealizoCirugia().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtAñoRealizoCirugia().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtAñoRealizoCirugia().setEditable(false);
            vistaFormularioCertificadoDefuncion.getTxtMotivoCirugia().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtMotivoCirugia().setEditable(false);
        }
    }

    public static void deshabilitarHabilitarCamposNecropsia() {
        if (vistaFormularioCertificadoDefuncion.getRdbtnSiPracticoNecropsia().isSelected()) {
            vistaFormularioCertificadoDefuncion.getRdbtnSiUtilizaronHallazgos().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getRdbtnNoUtilizaronHallazgos().setEnabled(true);
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoPracticoNecropsia().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnSeIgnoraPracticoNecropsia().isSelected()) {
            vistaFormularioCertificadoDefuncion.getRdbtnSiUtilizaronHallazgos().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getRdbtnNoUtilizaronHallazgos().setEnabled(false);
        }
    }

    public static void deshabilitarHabilitarCamposEncefalica() {
        if (vistaFormularioCertificadoDefuncion.getRdbtnSiMuerteEncefalica().isSelected()) {
            vistaFormularioCertificadoDefuncion.getRdbtnSiDonadorOrganos().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getRdbtnNoDonadorOrganos().setEnabled(true);
        } else if (vistaFormularioCertificadoDefuncion.getRdbtnNoMuerteEncefalica().isSelected()) {
            vistaFormularioCertificadoDefuncion.getRdbtnSiDonadorOrganos().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getRdbtnNoDonadorOrganos().setEnabled(false);
        }
    }

    /**
     * Calculates the age based on the given day, month, and year.
     *
     * @param day   The day of birth.
     * @param month The month of birth.
     * @param year  The year of birth.
     * @return The calculated age as an integer.
     * @throws IllegalArgumentException If the birthdate is invalid or in the future.
     */
    public static int calcularEdad(int day, int month, int year) {
        // Create a LocalDate object from the provided day, month, and year
        LocalDate birthDate = LocalDate.of(year, month, day);

        // Validate the input
        if (birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birth date cannot be in the future.");
        }

        // Calculate the period (difference) between the birthdate and today
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void habilitarCamposMujer() {
        vistaFormularioCertificadoDefuncion.getRdbtnMuerteDuranteEmbarazo().setEnabled(true);
        vistaFormularioCertificadoDefuncion.getRdbtnMuerteDuranteParto().setEnabled(true);
        vistaFormularioCertificadoDefuncion.getRdbtnMuerteDurantePuerperio().setEnabled(true);
        vistaFormularioCertificadoDefuncion.getRdbtnMuerteDespuesPartoAborto().setEnabled(true);
        vistaFormularioCertificadoDefuncion.getRdbtnNoEstuvoEmbarazadaPreviamente().setEnabled(true);
        vistaFormularioCertificadoDefuncion.getRdbtnSiComplicacionesPropias().setEnabled(true);
        vistaFormularioCertificadoDefuncion.getRdbtnNoComplicacionesPropias().setEnabled(true);
        vistaFormularioCertificadoDefuncion.getRdbtnSiComplicaciones().setEnabled(true);
        vistaFormularioCertificadoDefuncion.getRdbtnNoComplicaciones().setEnabled(true);
    }

    public static void deshabilitarHabilitarCedulaMedico() {
        if (vistaFormularioCertificadoDefuncion.getRdbtnMedicoTratante().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnMedicoLegista().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnOtroMedico().isSelected()) {
            vistaFormularioCertificadoDefuncion.getTxtNumCedProfesional().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtNumCedProfesional().setEditable(true);
        } else {
            vistaFormularioCertificadoDefuncion.getTxtNumCedProfesional().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtNumCedProfesional().setEditable(false);
        }
    }

    public static void deshabilitarHabilitarEspecifiqueCertificante() {
        if (vistaFormularioCertificadoDefuncion.getRdbtnOtro().isSelected()
                || vistaFormularioCertificadoDefuncion.getRdbtnOtroMedico().isSelected()) {
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueOtraAutoridad1().setEnabled(true);
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueOtraAutoridad1().setEditable(true);
        } else {
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueOtraAutoridad1().setEnabled(false);
            vistaFormularioCertificadoDefuncion.getTxtEspecifiqueOtraAutoridad1().setEditable(false);
        }
    }
}
