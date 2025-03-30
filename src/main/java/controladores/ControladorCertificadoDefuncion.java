package controladores;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import modelos.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ControladorCertificadoDefuncion {
    //    Certificante certificante;
//    Fallecido fallecido;
//    Defuncion defuncion;
//    Informante informante;
//    RegistroCivil registroCivil;
//    Situacion situacion;
    final String RUTA_PLANTILLA = "pdfs/plantilla-certificado-defuncion.pdf";
    String rutaSalidaPdf = "C:\\Users\\neto-\\Documents\\NetBeansProjects\\Hospital\\src\\main\\resources\\pdfs\\";

    public boolean GenerarCertificadoDefuncion(Certificante certificante, Fallecido fallecido, Defuncion defuncion,
                                               Informante informante, RegistroCivil registroCivil,
                                               Situacion situacion) {
        rutaSalidaPdf = rutaSalidaPdf + fallecido.getCurp() + ".pdf";

        String rutaFuente = "C:\\Windows\\Fonts\\arial.ttf"; // Asegúrate de que esta fuente existe
        try {
            // Abrir el PDF plantilla
            PdfDocument pdfDoc = new PdfDocument(new PdfReader(RUTA_PLANTILLA), new PdfWriter(rutaSalidaPdf));

            // Obtener los campos del formulario
            PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);
            Map<String, PdfFormField> fields = form.getFormFields();

//                     // Cargar una fuente compatible con acentos
//                    PdfFont font = PdfFontFactory.createFont(rutaFuente, "Identity-H", true);
//                     // Reemplazar la fuente en todos los campos del formulario
//                    for (Map.Entry<String, PdfFormField> entry : fields.entrySet()) {
//                        PdfFormField field = entry.getValue();
//                        field.setFont(font);
//                    }
            PdfFormField checkboxField;

            // Llenar los campos del formulario
            fields.get("folio").setValue("121012424240244242");

            // Información de la vista 1
            if (!fallecido.isDesconocido()) {
                fields.get("nombre").setValue(fallecido.getNombre());
                fields.get("primerApellido").setValue(fallecido.getApellidoPaterno());
                fields.get("segundoApellido").setValue(fallecido.getApellidoMaterno());
            } else {
                checkboxField = fields.get("personaDesconocida");
                checkboxField.setValue("on");
            }

            String[] fechas = getFechas(fallecido.getDiaNacimiento(), fallecido.getMesNacimiento(), fallecido.getAnioNacimiento());
            fields.get("diaUno").setValue(fechas[0]);
            fields.get("diaDos").setValue(fechas[1]);
            fields.get("mesUno").setValue(fechas[2]);
            fields.get("mesDos").setValue(fechas[3]);
            fields.get("yearUno").setValue(fechas[4]);
            fields.get("yearDos").setValue(fechas[5]);
            fields.get("yearTres").setValue(fechas[6]);
            fields.get("yearCuatro").setValue(fechas[7]);

            if (fallecido.getSexo().equals("Hombre")) {
                checkboxField = fields.get("sexoHombre");
                checkboxField.setValue("on");
            } else if (fallecido.getSexo().equals("Mujer")) {
                checkboxField = fields.get("sexoMujer");
                checkboxField.setValue("on");
            } else {
                checkboxField = fields.get("sexoSeIgnora");
                checkboxField.setValue("on");
            }

            // Información de la vista 2
            fields.get("entidadDeNacimiento").setValue(fallecido.getEntidadNacimiento());

            fields.get("curp1").setValue(Character.toString(fallecido.getCurp().charAt(0)));
            fields.get("curp2").setValue(Character.toString(fallecido.getCurp().charAt(1)));
            fields.get("curp3").setValue(Character.toString(fallecido.getCurp().charAt(2)));
            fields.get("curp4").setValue(Character.toString(fallecido.getCurp().charAt(3)));
            fields.get("curp5").setValue(Character.toString(fallecido.getCurp().charAt(4)));
            fields.get("curp6").setValue(Character.toString(fallecido.getCurp().charAt(5)));
            fields.get("curp7").setValue(Character.toString(fallecido.getCurp().charAt(6)));
            fields.get("curp8").setValue(Character.toString(fallecido.getCurp().charAt(7)));
            fields.get("curp9").setValue(Character.toString(fallecido.getCurp().charAt(8)));
            fields.get("curp10").setValue(Character.toString(fallecido.getCurp().charAt(9)));
            fields.get("curp11").setValue(Character.toString(fallecido.getCurp().charAt(10)));
            fields.get("curp12").setValue(Character.toString(fallecido.getCurp().charAt(11)));
            fields.get("curp13").setValue(Character.toString(fallecido.getCurp().charAt(12)));
            fields.get("curp14").setValue(Character.toString(fallecido.getCurp().charAt(13)));
            fields.get("curp15").setValue(Character.toString(fallecido.getCurp().charAt(14)));
            fields.get("curp16").setValue(Character.toString(fallecido.getCurp().charAt(15)));
            fields.get("curp17").setValue(Character.toString(fallecido.getCurp().charAt(16)));
            fields.get("curp18").setValue(Character.toString(fallecido.getCurp().charAt(17)));

            if (fallecido.getAfromexicano().equals("Si")) {
                checkboxField = fields.get("afromexicanaSi");
                checkboxField.setValue("on");
            } else if (fallecido.getAfromexicano().equals("No")) {
                checkboxField = fields.get("afromexicanaNo");
                checkboxField.setValue("on");
            } else {
                checkboxField = fields.get("afromexicanaSeIgnora");
                checkboxField.setValue("on");
            }

            if (fallecido.getIndigena().equals("Si")) {
                checkboxField = fields.get("indigenaSi");
                checkboxField.setValue("on");
            } else if (fallecido.getIndigena().equals("No")) {
                checkboxField = fields.get("indigenaNo");
                checkboxField.setValue("on");
            } else {
                checkboxField = fields.get("indigenaSeIgnora");
                checkboxField.setValue("on");
            }

            if (fallecido.getHablaIndigena().equals("Si")) {
                checkboxField = fields.get("lenguaIndigenaSi");
                checkboxField.setValue("on");
                fields.get("lenguaIndigenaEspecifique").setValue(fallecido.getEspecifiqueLenguaIndigena());
            } else if (fallecido.getHablaIndigena().equals("No")) {
                checkboxField = fields.get("lenguaIndigenaNo");
                checkboxField.setValue("on");
            } else {
                checkboxField = fields.get("lenguaIndigenaSeIgnora");
                checkboxField.setValue("on");
            }

            if (fallecido.getNacionalidad().equals("Mexicana")) {
                checkboxField = fields.get("nacionalidadMexicana");
                checkboxField.setValue("on");
            } else if (fallecido.getNacionalidad().equals("Se ignora")) {
                checkboxField = fields.get("nacionalidadSeIgnora");
                checkboxField.setValue("on");
            } else {
                checkboxField = fields.get("nacionalidadOtra");
                checkboxField.setValue("on");
                fields.get("nacionalidadEspecifique").setValue(fallecido.getEspecifiqueNacionalidad());
            }

            // Información de la vista 3
            boolean esMenor28Dias = false;
            if (!fallecido.isSeIgnoraEdad()) {
                if (fallecido.getEdadMinutos() != 0) { // Si la edad es en minutos
                    esMenor28Dias = true;
                    String minutosTexto = Integer.toString(fallecido.getEdadMinutos());
                    if (fallecido.getEdadMinutos() < 10) { // Si los minutos son menores a 10
                        minutosTexto = "0" + minutosTexto;
                    }
                    fields.get("edadMinutosUno").setValue(Character.toString(minutosTexto.charAt(0)));
                    fields.get("edadMinutosDos").setValue(Character.toString(minutosTexto.charAt(1)));
                } else if (fallecido.getEdadHoras() != 0) {
                    esMenor28Dias = true;
                    String horasTexto = Integer.toString(fallecido.getEdadHoras());
                    if (fallecido.getEdadHoras() < 10) { // Si las horas son menores a 10
                        horasTexto = "0" + horasTexto;
                    }
                    fields.get("edadHorasUno").setValue(Character.toString(horasTexto.charAt(0)));
                    fields.get("edadHorasDos").setValue(Character.toString(horasTexto.charAt(1)));
                } else if (fallecido.getEdadDias() != 0) {
                    String diasTexto = Integer.toString(fallecido.getEdadDias());
                    if (fallecido.getEdadDias() < 10) { // Si los días son menores a 10
                        diasTexto = "0" + diasTexto;
                    } else if (fallecido.getEdadDias() < 28) {
                        esMenor28Dias = true;
                    }
                    fields.get("edadDiasUno").setValue(Character.toString(diasTexto.charAt(0)));
                    fields.get("edadDiasDos").setValue(Character.toString(diasTexto.charAt(1)));
                } else if (fallecido.getEdadMeses() != 0) {
                    String mesesTexto = Integer.toString(fallecido.getEdadMeses());
                    if (fallecido.getEdadMeses() < 10) { // Si los meses son menores a 10
                        mesesTexto = "0" + mesesTexto;
                    }
                    fields.get("edadMesesUno").setValue(Character.toString(mesesTexto.charAt(0)));
                    fields.get("edadMesesDos").setValue(Character.toString(mesesTexto.charAt(1)));
                } else if (fallecido.getEdadAnios() != 0) {
                    String aniosTexto = Integer.toString(fallecido.getEdadAnios());
                    if (fallecido.getEdadAnios() < 10) { // Si los años son menores a 10
                        aniosTexto = "00" + aniosTexto;
                    } else if (fallecido.getEdadAnios() < 100 && fallecido.getEdadAnios() >= 10) { // Si los años son entre 10 y 99
                        aniosTexto = "0" + aniosTexto;
                    }
                    fields.get("edadYearUno").setValue(Character.toString(aniosTexto.charAt(0)));
                    fields.get("edadYearDos").setValue(Character.toString(aniosTexto.charAt(1)));
                    fields.get("edadYearTres").setValue(Character.toString(aniosTexto.charAt(2)));
                }
                if (esMenor28Dias) {
                    fields.get("folioCertificadoNacimiento1").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(0)));
                    fields.get("folioCertificadoNacimiento2").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(1)));
                    fields.get("folioCertificadoNacimiento3").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(2)));
                    fields.get("folioCertificadoNacimiento4").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(3)));
                    fields.get("folioCertificadoNacimiento5").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(4)));
                    fields.get("folioCertificadoNacimiento6").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(5)));
                    fields.get("folioCertificadoNacimiento7").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(6)));
                    fields.get("folioCertificadoNacimiento8").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(7)));
                    fields.get("folioCertificadoNacimiento9").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(8)));
                    fields.get("folioCertificadoNacimiento10").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(9)));
                    fields.get("folioCertificadoNacimiento11").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(10)));
                    fields.get("folioCertificadoNacimiento12").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(11)));
                    fields.get("folioCertificadoNacimiento13").setValue(Character.toString(fallecido.getFolioCertificadoNacimiento().charAt(12)));

                    String semanasGestacionTexto = Integer.toString(fallecido.getSemanasGestacion());
                    if (fallecido.getSemanasGestacion() < 10) { // Si las semanas de gestación son menores a 10
                        semanasGestacionTexto = "0" + semanasGestacionTexto;
                    }
                    fields.get("semanasGestacion1").setValue(Character.toString(semanasGestacionTexto.charAt(0)));
                    fields.get("semanasGestacion2").setValue(Character.toString(semanasGestacionTexto.charAt(1)));

                    String pesoTexto = Integer.toString(fallecido.getPesoNacimiento());
                    if (fallecido.getPesoNacimiento() < 10) { // Si el peso de nacimiento es menor a 10
                        pesoTexto = "000" + pesoTexto;
                    } else if (fallecido.getPesoNacimiento() < 100 && fallecido.getPesoNacimiento() >= 10) { // Si el peso de nacimiento es entre 10 y 99
                        pesoTexto = "00" + pesoTexto;
                    } else if (fallecido.getPesoNacimiento() < 1000 && fallecido.getPesoNacimiento() >= 100) { // Si el peso de nacimiento es entre 100 y 999
                        pesoTexto = "0" + pesoTexto;
                    }
                    fields.get("pesoAlNacer1").setValue(Character.toString(pesoTexto.charAt(0)));
                    fields.get("pesoAlNacer2").setValue(Character.toString(pesoTexto.charAt(1)));
                    fields.get("pesoAlNacer3").setValue(Character.toString(pesoTexto.charAt(2)));
                    fields.get("pesoAlNacer4").setValue(Character.toString(pesoTexto.charAt(3)));
                }
            } else {
                checkboxField = fields.get("edadSeIgnora");
                checkboxField.setValue("on");
            }

            switch (fallecido.getSituacionConyugal()) {
                case "Soltera/o" -> {
                    checkboxField = fields.get("situacionCoyugalSoltero");
                    checkboxField.setValue("on");
                }
                case "Separada/o" -> {
                    checkboxField = fields.get("situacionCoyugalSeparado");
                    checkboxField.setValue("on");
                }
                case "En unión libre" -> {
                    checkboxField = fields.get("situacionCoyugalUnionLibre");
                    checkboxField.setValue("on");
                }
                case "Divorciada/o" -> {
                    checkboxField = fields.get("situacionCoyugalDivorciado");
                    checkboxField.setValue("on");
                }
                case "Casada/o" -> {
                    checkboxField = fields.get("situacionCoyugalCasado");
                    checkboxField.setValue("on");
                }
                case "Viuda/o" -> {
                    checkboxField = fields.get("situacionCoyugalViudo");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    checkboxField = fields.get("situacionCoyugalSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            // Información de la vista 4
            fields.get("tipoDeVialidad3").setValue(fallecido.getTipoVialidad());
            fields.get("nombreDeLaVialidad").setValue(fallecido.getNombreVialidad());
            fields.get("numeroExterior").setValue(fallecido.getNumeroExterior());
            fields.get("numeroInterior").setValue(fallecido.getNumeroInterior());
            fields.get("tipoDeAsentamientoHumano3").setValue(fallecido.getTipoAsentamientoHumano());
            fields.get("nombreDelAsentamientoHumano").setValue(fallecido.getNombreAsentamientoHumano());
            fields.get("codigoPostal1").setValue(Character.toString(fallecido.getCodigoPostal().charAt(0)));
            fields.get("codigoPostal2").setValue(Character.toString(fallecido.getCodigoPostal().charAt(1)));
            fields.get("codigoPostal3").setValue(Character.toString(fallecido.getCodigoPostal().charAt(2)));
            fields.get("codigoPostal4").setValue(Character.toString(fallecido.getCodigoPostal().charAt(3)));
            fields.get("codigoPostal5").setValue(Character.toString(fallecido.getCodigoPostal().charAt(4)));
            fields.get("localidad5").setValue(fallecido.getLocalidad());
            fields.get("municipioAlcaldia4").setValue(fallecido.getMunicipioAlcaldia());
            fields.get("entidadFederativaPais3").setValue(fallecido.getEntidadFederativaPais());

            // Información de la vista 5
            boolean siEstudio = true;
            switch (fallecido.getEscolaridad()) {
                case "Ninguna" -> {
                    siEstudio = false;
                    checkboxField = fields.get("escolaridadNinguna");
                    checkboxField.setValue("on");
                }
                case "Primaria" -> {
                    checkboxField = fields.get("escolaridadPrimaria");
                    checkboxField.setValue("on");
                }
                case "Bachillerato o Preparatoria" -> {
                    checkboxField = fields.get("escolaridadBachillerato");
                    checkboxField.setValue("on");
                }
                case "Posgrado" -> {
                    checkboxField = fields.get("escolaridadPosgrado");
                    checkboxField.setValue("on");
                }
                case "Preescolar" -> {
                    checkboxField = fields.get("escolaridadPreescolar");
                    checkboxField.setValue("on");
                }
                case "Secundaria" -> {
                    checkboxField = fields.get("escolaridadSecundaria");
                    checkboxField.setValue("on");
                }
                case "Profesional" -> {
                    checkboxField = fields.get("escolaridadProfesional");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    siEstudio = false;
                    checkboxField = fields.get("escolaridadSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            // TODO - Verificar este nullpointer
            if (siEstudio) {
                if (fallecido.getTipoEscolaridad().equals("Completa")) {
                    checkboxField = fields.get("escolaridadCompleta");
                    checkboxField.setValue("on");
                } else if (fallecido.getTipoEscolaridad().equals("Incompleta")) {
                    checkboxField = fields.get("escolaridadIncompleta");
                    checkboxField.setValue("on");
                }
            }

            // TODO - Verificar si la ocupación habitual puede ser null
            if (fallecido.isOcupacionHabitual()) {
                fields.get("ocupacionHabitual").setValue(fallecido.getDescripcionOcupacion());
            } else {
                checkboxField = fields.get("ocupacionHabitualSeIgnora");
                checkboxField.setValue("on");
            }

            if (fallecido.getTrabajaba().equals("Si")) {
                checkboxField = fields.get("trabajabaSi");
                checkboxField.setValue("on");
            } else if (fallecido.getTrabajaba().equals("No")) {
                checkboxField = fields.get("trabajabaNo");
                checkboxField.setValue("on");
            } else {
                checkboxField = fields.get("trabajabaSeIgnora");
                checkboxField.setValue("on");
            }

            // Información de la vista 6
            boolean afiliado = true;
            boolean otroServicio = false;
            switch (fallecido.getAfiliacionServicioSalud()) {
                case "Ninguna" -> {
                    afiliado = false;
                    checkboxField = fields.get("afiliacionAServiciosDeSaludNinguna");
                    checkboxField.setValue("on");
                }
                case "IMSS" -> {
                    checkboxField = fields.get("afiliacionAServiciosDeSaludImss");
                    checkboxField.setValue("on");
                }
                case "ISSSTE" -> {
                    checkboxField = fields.get("afiliacionAServiciosDeSaludIssste");
                    checkboxField.setValue("on");
                }
                case "PEMEX" -> {
                    checkboxField = fields.get("afiliacionAServiciosDeSaludPemex");
                    checkboxField.setValue("on");
                }
                case "SEDENA" -> {
                    checkboxField = fields.get("afiliacionAServiciosDeSaludSedena");
                    checkboxField.setValue("on");
                }
                case "SEMAR" -> {
                    checkboxField = fields.get("afiliacionAServiciosDeSaludSemar");
                    checkboxField.setValue("on");
                }
                case "IMSS BIENESTAR" -> {
                    checkboxField = fields.get("afiliacionAServiciosDeSaludImssBienestar");
                    checkboxField.setValue("on");
                }
                case "ISSFAM" -> {
                    checkboxField = fields.get("afiliacionAServiciosDeSaludIssfam");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    afiliado = false;
                    checkboxField = fields.get("afiliacionAServiciosDeSaludSeIgnora");
                    checkboxField.setValue("on");
                }
                case "Otra" -> {
                    otroServicio = true;
                    checkboxField = fields.get("afiliacionAServiciosDeSaludOtra");
                    checkboxField.setValue("on");
                }
            }

            if (afiliado) {
                fields.get("numeroDeSeguridadSocial").setValue(fallecido.getNumeroSeguridadSocialAfiliacion());
            }
            if (otroServicio) {
                fields.get("afiliacionAServiciosDeSaludEspecifique").setValue(fallecido.getEspecifiqueServicioSalud());
            }

            fields.get("delInfNombre").setValue(informante.getNombre());
            fields.get("delInfPrimerApellido").setValue(informante.getApellidoPaterno());
            fields.get("delInfSegundoApellido").setValue(informante.getApellidoMaterno());

            // Información de la vista 7
            fields.get("parentescoConElFallecido").setValue(informante.getParentescoFallecido());

            if (defuncion.getSitio() != null) { // Esta validació es necesaria debido a que el sitio de defunción puede ser nulo
                switch (defuncion.getSitio()) {
                    case "Vía pública" -> {
                        checkboxField = fields.get("sucedioDefuncionViaPublica");
                        checkboxField.setValue("on");
                    }
                    case "Hogar" -> {
                        checkboxField = fields.get("sucedioDefuncionHogar");
                        checkboxField.setValue("on");
                    }
                    case "Otro lugar" -> {
                        checkboxField = fields.get("sucedioDefuncionOtroLugar");
                        checkboxField.setValue("on");
                    }
                    case "Se ignora" -> {
                        checkboxField = fields.get("sucedioDefuncionSeIgnora");
                        checkboxField.setValue("on");
                    }
                }
            } else if (defuncion.getUnidadMedica() != null) {
                switch (defuncion.getUnidadMedica()) {
                    case "Secretaría de Salud" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionSecretariaDeSalud");
                        checkboxField.setValue("on");
                    }
                    case "IMSS BIENESTAR" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionImssBienestar");
                        checkboxField.setValue("on");
                    }
                    case "IMSS" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionImss");
                        checkboxField.setValue("on");
                    }
                    case "ISSTE" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionIsste");
                        checkboxField.setValue("on");
                    }
                    case "PEMEX" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionPemex");
                        checkboxField.setValue("on");
                    }
                    case "SEDENA" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionSedena");
                        checkboxField.setValue("on");
                    }
                    case "SEMAR" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionSemar");
                        checkboxField.setValue("on");
                    }
                    case "Otra unidad médica pública" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionOtraUnidadMedicaPublica");
                        checkboxField.setValue("on");
                    }
                    case "Unidad médica privada" -> {
                        checkboxField = fields.get("sitioDondeSucedioLaDefuncionUnidadMedicaPrivada");
                        checkboxField.setValue("on");
                    }
                }

                fields.get("nombreUnidadMedica").setValue(defuncion.getNombreUnidadMedica());
                fields.get("clues1").setValue(Character.toString(defuncion.getClues().charAt(0)));
                fields.get("clues2").setValue(Character.toString(defuncion.getClues().charAt(1)));
                fields.get("clues3").setValue(Character.toString(defuncion.getClues().charAt(2)));
                fields.get("clues4").setValue(Character.toString(defuncion.getClues().charAt(3)));
                fields.get("clues5").setValue(Character.toString(defuncion.getClues().charAt(4)));
                fields.get("clues6").setValue(Character.toString(defuncion.getClues().charAt(5)));
                fields.get("clues7").setValue(Character.toString(defuncion.getClues().charAt(6)));
                fields.get("clues8").setValue(Character.toString(defuncion.getClues().charAt(7)));
                fields.get("clues9").setValue(Character.toString(defuncion.getClues().charAt(8)));
                fields.get("clues10").setValue(Character.toString(defuncion.getClues().charAt(9)));
                fields.get("clues11").setValue(Character.toString(defuncion.getClues().charAt(10)));
            }

            // Información de la vista 8
            fields.get("sucedioTipoVialidad3").setValue(defuncion.getTipoVialidad());
            fields.get("sucedioNombreVialidad").setValue(defuncion.getVialidadNombre());
            fields.get("sucedioNumeroExterior").setValue(defuncion.getNumeroExterior());
            fields.get("sucedioNumeroInterior").setValue(defuncion.getNumeroInterior());
            fields.get("sucedioAsentamiento3").setValue(defuncion.getTipoAsentamientoHumano());
            fields.get("sucedioNombreAsentamientoHumano").setValue(defuncion.getNombreAsentamientoHumano());
            fields.get("sucedioCP1").setValue(Character.toString(defuncion.getCodigoPostal().charAt(0)));
            fields.get("sucedioCP2").setValue(Character.toString(defuncion.getCodigoPostal().charAt(1)));
            fields.get("sucedioCP3").setValue(Character.toString(defuncion.getCodigoPostal().charAt(2)));
            fields.get("sucedioCP4").setValue(Character.toString(defuncion.getCodigoPostal().charAt(3)));
            fields.get("sucedioCP5").setValue(Character.toString(defuncion.getCodigoPostal().charAt(4)));
            fields.get("sucedioLocalidad5").setValue(defuncion.getLocalidad());
            fields.get("sucedioMunicipio3").setValue(defuncion.getMunicipioAlcaldia());
            fields.get("sucedioEntidad3").setValue(defuncion.getEntidadFederativa());

            // Información de la vista 9
            fechas = getFechas(defuncion.getDia(), defuncion.getMes(), defuncion.getAnio());
            fields.get("defuncionDia1").setValue(fechas[0]);
            fields.get("defuncionDia2").setValue(fechas[1]);
            fields.get("defuncionMes1").setValue(fechas[2]);
            fields.get("defuncionMes2").setValue(fechas[3]);
            fields.get("defuncionYear1").setValue(fechas[4]);
            fields.get("defuncionYear2").setValue(fechas[5]);
            fields.get("defuncionYear3").setValue(fechas[6]);
            fields.get("defuncionYear4").setValue(fechas[7]);

            String[] defuncionTime = getDefuncionTime(defuncion.getHoras(), defuncion.getMinutos());
            fields.get("defuncionHora1").setValue(defuncionTime[0]);
            fields.get("defuncionHora2").setValue(defuncionTime[1]);
            fields.get("defuncionMinutos1").setValue(defuncionTime[2]);
            fields.get("defuncionMinutos2").setValue(defuncionTime[3]);

            switch (defuncion.getCirugiaUltimas4Semanas()) {
                case "Si" -> {
                    checkboxField = fields.get("realizoCirugiaSi");
                    checkboxField.setValue("on");
                    fechas = getFechas(defuncion.getCirugiaDia(), defuncion.getMes(), defuncion.getAnio());
                    fields.get("fechaCirugia1").setValue(fechas[0]);
                    fields.get("fechaCirugia2").setValue(fechas[1]);
                    fields.get("fechaCirugia4").setValue(fechas[2]);
                    fields.get("fechaCirugia5").setValue(fechas[3]);
                    fields.get("fechaCirugia7").setValue(fechas[4]);
                    fields.get("fechaCirugia8").setValue(fechas[5]);
                    fields.get("fechaCirugia9").setValue(fechas[6]);
                    fields.get("fechaCirugia10").setValue(fechas[7]);

                    fields.get("motivoCirugiaParrafo").setValue(defuncion.getCirugiaMotivo());

                }
                case "No" -> {
                    checkboxField = fields.get("realizoCirugiaNo");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    checkboxField = fields.get("realizoCirugiaSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            switch (defuncion.getAtencionMedica()) {
                case "Si" -> {
                    checkboxField = fields.get("atencionMedicaSi");
                    checkboxField.setValue("on");
                }
                case "No" -> {
                    checkboxField = fields.get("atencionMedicaNo");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    checkboxField = fields.get("atencionMedicaSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            switch (defuncion.getAccidentalViolenta()) {
                case "Si" -> {
                    checkboxField = fields.get("accidentalViolentaSi");
                    checkboxField.setValue("on");
                }
                case "No" -> {
                    checkboxField = fields.get("accidentalViolentaNo");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    checkboxField = fields.get("accidentalViolentaSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            // Información de la vista 10
            switch (defuncion.getDefuncionTipo()) {
                case "Enfermedad" -> {
                    checkboxField = fields.get("tipoDefuncionEnfermedad");
                    checkboxField.setValue("on");
                }
                case "Accidente" -> {
                    checkboxField = fields.get("tipoDefuncionAccidente");
                    checkboxField.setValue("on");
                }
                case "Agresión" -> {
                    checkboxField = fields.get("tipoDefuncionAgresion");
                    checkboxField.setValue("on");
                }
                case "Lesiones autoinfligidas intencionalmente" -> {
                    checkboxField = fields.get("tipoDefuncionLesionesAutoinflingidas");
                    checkboxField.setValue("on");
                }
                case "Intervención legal" -> {
                    checkboxField = fields.get("tipoDefuncionIntervencionLegal");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    checkboxField = fields.get("tipoDefuncionSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            fields.get("causasDefuncionA").setValue(defuncion.getCausas()[0]);
            fields.get("causasDefuncionB").setValue(defuncion.getCausas()[1]);
            fields.get("causasDefuncionC").setValue(defuncion.getCausas()[2]);
            fields.get("causasDefuncionD").setValue(defuncion.getCausas()[3]);

            // Información de la vista 11
            fields.get("causasDefuncionIntervaloA").setValue(defuncion.getIntervaloTiempo()[0]);
            fields.get("causasDefuncionIntervaloB").setValue(defuncion.getIntervaloTiempo()[1]);
            fields.get("causasDefuncionIntervaloC").setValue(defuncion.getIntervaloTiempo()[2]);
            fields.get("causasDefuncionIntervaloD").setValue(defuncion.getIntervaloTiempo()[3]);

            fields.get("codigoCieA").setValue(defuncion.getCodigoCie()[0]);
            fields.get("codigoCieB").setValue(defuncion.getCodigoCie()[1]);
            fields.get("codigoCieC").setValue(defuncion.getCodigoCie()[2]);
            fields.get("codigoCieD").setValue(defuncion.getCodigoCie()[3]);

            fields.get("otrasCondiciones").setValue(defuncion.getCausas()[4]);
            fields.get("otrasCondicionesCie").setValue(defuncion.getCodigoCie()[4]);

            // Información de la vista 12
            switch (defuncion.getNecropsia()) {
                case "Si" -> {
                    checkboxField = fields.get("practicoNecrociaSi");
                    checkboxField.setValue("on");
                    if (defuncion.getHallazgosCertificacion().equals("Si")) {
                        checkboxField = fields.get("hallazgosCertificadoSi");
                        checkboxField.setValue("on");
                    } else if (defuncion.getHallazgosCertificacion().equals("No")) {
                        checkboxField = fields.get("hallazgosCertificadoNo");
                        checkboxField.setValue("on");
                    }
                }
                case "No" -> {
                    checkboxField = fields.get("practicoNecrociaNo");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    checkboxField = fields.get("practicoNecrociaSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            if (defuncion.getMuerteEncefalica().equals("Si")) {
                checkboxField = fields.get("muerteEncefalicaSi");
                checkboxField.setValue("on");
                if (defuncion.getDonadorOrganos().equals("Si")) {
                    checkboxField = fields.get("donadorDeOrganosSi");
                    checkboxField.setValue("on");
                } else if (defuncion.getDonadorOrganos().equals("No")) {
                    checkboxField = fields.get("donadorDeOrganosNo");
                    checkboxField.setValue("on");
                }
            } else if (defuncion.getMuerteEncefalica().equals("No")) {
                checkboxField = fields.get("muerteEncefalicaNo");
                checkboxField.setValue("on");
            }

            if (defuncion.getMuerteDurante() != null) {
                switch (defuncion.getMuerteDurante()) {
                    case "Embarazo" -> {
                        checkboxField = fields.get("muerteOcurrioDuranteElEmbarazo");
                        checkboxField.setValue("on");
                    }
                    case "Parto" -> {
                        checkboxField = fields.get("muerteOcurrioDuranteElParto");
                        checkboxField.setValue("on");
                    }
                    case "Puerperio" -> {
                        checkboxField = fields.get("muerteOcurrioDuranteElPuerperio");
                        checkboxField.setValue("on");
                    }
                    case "43 días a 11 meses después del parto o aborto" -> {
                        checkboxField = fields.get("muerteOcurrioDuranteDespuesDelParto");
                        checkboxField.setValue("on");
                    }
                    case "No embarazo últimos 11 meses previos a la defunción" -> {
                        checkboxField = fields.get("muerteOcurrioDuranteNoEstuvoEmbarazada");
                        checkboxField.setValue("on");
                    }
                }

                if (defuncion.getCausasComplicacionesPropiasEmbarazoPartoPuerperio().equals("Si")) {
                    checkboxField = fields.get("complicacionesPropiasSi");
                    checkboxField.setValue("on");
                } else if (defuncion.getCausasComplicacionesPropiasEmbarazoPartoPuerperio().equals("No")) {
                    checkboxField = fields.get("complicacionesPropiasNo");
                    checkboxField.setValue("on");
                }

                if (defuncion.getCausasComplicaronEmbarazoPartoPuerperio().equals("Si")) {
                    checkboxField = fields.get("causasAnotadasComplicaronSi");
                    checkboxField.setValue("on");
                } else if (defuncion.getCausasComplicaronEmbarazoPartoPuerperio().equals("No")) {
                    checkboxField = fields.get("causasAnotadasComplicaronNo");
                    checkboxField.setValue("on");
                }
            }

            // Información de la vista 13
            fields.get("causaBasicaDefuncion1").setValue(Character.toString(defuncion.getCausaBasica().charAt(0)));
            fields.get("causaBasicaDefuncion2").setValue(Character.toString(defuncion.getCausaBasica().charAt(1)));
            fields.get("causaBasicaDefuncion3").setValue(Character.toString(defuncion.getCausaBasica().charAt(2)));
            fields.get("causaBasicaDefuncion4").setValue(Character.toString(defuncion.getCausaBasica().charAt(3)));

            fields.get("codigoAdicional1").setValue(Character.toString(defuncion.getCodigoCieCausaBasica().charAt(0)));
            fields.get("codigoAdicional2").setValue(Character.toString(defuncion.getCodigoCieCausaBasica().charAt(1)));
            fields.get("codigoAdicional3").setValue(Character.toString(defuncion.getCodigoCieCausaBasica().charAt(2)));
            fields.get("codigoAdicional4").setValue(Character.toString(defuncion.getCodigoCieCausaBasica().charAt(3)));

            switch (situacion.getDuranteTrabajo()) {
                case "Si" -> {
                    checkboxField = fields.get("ocurrioDesempeñoSi");
                    checkboxField.setValue("on");
                }
                case "No" -> {
                    checkboxField = fields.get("ocurrioDesempeñoNo");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    checkboxField = fields.get("ocurrioDesempeñoSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            switch (situacion.getLugarLesion()) {
                case "Vivienda particular" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionVivenciaParticular");
                    checkboxField.setValue("on");
                }
                case "Vivienda Colectiva" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionVivenciaColectiva");
                    checkboxField.setValue("on");
                }
                case "Escuela u oficina pública" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionEscuela");
                    checkboxField.setValue("on");
                }
                case "Área deportiva" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionAreaDeportiva");
                    checkboxField.setValue("on");
                }
                case "Calle o carretera" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionCalle");
                    checkboxField.setValue("on");
                }
                case "Área comercial o de servicio" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionAreaComercial");
                    checkboxField.setValue("on");
                }
                case "Área industrial" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionAreaIndustrial");
                    checkboxField.setValue("on");
                }
                case "Granja" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionGranja");
                    checkboxField.setValue("on");
                }
                case "Otro" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionOtro");
                    checkboxField.setValue("on");
                }
                case "Se ignora" -> {
                    checkboxField = fields.get("lugarDondeOcurrioLesionSeIgnora");
                    checkboxField.setValue("on");
                }
            }

            fields.get("registradaMinisterioActa").setValue(situacion.getActaNumero());

            // Información de la vista 14
            fields.get("Text-rFpFJ7xHzT").setValue(situacion.getRelacionAgresorFallecido());
            fields.get("Paragraph-_2_solzsid").setValue(situacion.getDescripcionAgresion());

            if (situacion.getSituacionAgresion().equals("Investigación pendiente")) {
                checkboxField = fields.get("investigacionPendiente");
                checkboxField.setValue("on");
            } else if (situacion.getSituacionAgresion().equals("No puede determinarse")) {
                checkboxField = fields.get("NoPuedeDeterminarse");
                checkboxField.setValue("on");
            }

            // Información de la vista 15
            fields.get("domicilioLesionTipoVialidad3").setValue(situacion.getTipoVialidad());
            fields.get("domicilioLesionNombreVialidad").setValue(situacion.getVialidadNombre());
            fields.get("domicilioLesionNumExt").setValue(situacion.getNumeroExterior());
            fields.get("domicilioLesionNumInt").setValue(situacion.getNumeroInterior());
            fields.get("domicilioLesionTipoAsentamiento3").setValue(situacion.getTipoAsentamientoHumano());
            fields.get("domicilioLesionNombreAsentamiento").setValue(situacion.getNombreAsentamientoHumano());
            fields.get("domicilioLesionCP1").setValue(Character.toString(situacion.getCodigoPostal().charAt(0)));
            fields.get("domicilioLesionCP2").setValue(Character.toString(situacion.getCodigoPostal().charAt(1)));
            fields.get("domicilioLesionCP3").setValue(Character.toString(situacion.getCodigoPostal().charAt(2)));
            fields.get("domicilioLesionCP4").setValue(Character.toString(situacion.getCodigoPostal().charAt(3)));
            fields.get("domicilioLesionCP5").setValue(Character.toString(situacion.getCodigoPostal().charAt(4)));
            fields.get("domicilioLesionLocalidad5").setValue(situacion.getLocalidad());
            fields.get("domicilioMunicipio4").setValue(situacion.getMunicipioAlcaldia());
            fields.get("domicilioEntidad3").setValue(situacion.getEntidadFederativa());

            // Información de la vista 16
            boolean esMedico = false;
            switch (certificante.getCertificante()) {
                case "Médica/o tratante" -> {
                    esMedico = true;
                    checkboxField = fields.get("certificadaPorMedicoTratante");
                    checkboxField.setValue("on");
                }
                case "Médica/o legista" -> {
                    esMedico = true;
                    checkboxField = fields.get("certificadaPorMedicoLegista");
                    checkboxField.setValue("on");
                }
                case "Otra/o médica/o" -> {
                    esMedico = true;
                    checkboxField = fields.get("certificadaPorOtroMedico");
                    checkboxField.setValue("on");
                }
                case "Persona autorizada por la Secretaría de Salud" -> {
                    checkboxField = fields.get("certificadaPorSecretariaDeSalud");
                    checkboxField.setValue("on");
                }
                case "Autoridad Civil" -> {
                    checkboxField = fields.get("certificadaPorAutoridadCivil");
                    checkboxField.setValue("on");
                }
                case "Otro" -> {
                    checkboxField = fields.get("certificadaPorOtro");
                    checkboxField.setValue("on");
                    fields.get("certificadaPorEspecifique").setValue(certificante.getEspecifiqueCertificante());
                }
            }

            fields.get("certificanteNombre").setValue(certificante.getNombre());
            fields.get("certificantePrimerApellido").setValue(certificante.getApellidoPaterno());
            fields.get("certificanteSegundoApellido").setValue(certificante.getApellidoMaterno());

            if (esMedico) {
                fields.get("numeroCedulaProfesional").setValue(certificante.getNumeroCedulaProfesional());
            }

            // Información de la vista 17
            fields.get("certificanteDomicilioTipoVialidad3").setValue(certificante.getTipoVialidad());
            fields.get("certificanteDomicilioNombreVialidad").setValue(certificante.getVialidadNombre());
            fields.get("certificanteDomicilioNumExt").setValue(certificante.getNumeroExterior());
            fields.get("certificanteDomicilioNumInt").setValue(certificante.getNumeroInterior());
            fields.get("certificanteDomicilioTipoAsentamiento3").setValue(certificante.getTipoAsentamientoHumano());
            fields.get("certificanteDomicilioNombreAsentamiento").setValue(certificante.getNombreAsentamientoHumano());
            fields.get("certificanteDomicilioCP1").setValue(Character.toString(certificante.getCodigoPostal().charAt(0)));
            fields.get("certificanteDomicilioCP2").setValue(Character.toString(certificante.getCodigoPostal().charAt(1)));
            fields.get("certificanteDomicilioCP3").setValue(Character.toString(certificante.getCodigoPostal().charAt(2)));
            fields.get("certificanteDomicilioCP4").setValue(Character.toString(certificante.getCodigoPostal().charAt(3)));
            fields.get("certificanteDomicilioCP5").setValue(Character.toString(certificante.getCodigoPostal().charAt(4)));
            fields.get("certificanteDomicilioLocalidad5").setValue(certificante.getLocalidad());
            fields.get("certificanteDomicilioMunicipio3").setValue(certificante.getMunicipioAlcaldia());
            fields.get("certificanteDomicilioEntidad3").setValue(certificante.getEntidadFederativa());
            fields.get("certificanteTelefono1").setValue(Character.toString(certificante.getTelefono().charAt(0)));
            fields.get("certificanteTelefono2").setValue(Character.toString(certificante.getTelefono().charAt(1)));
            fields.get("certificanteTelefono3").setValue(Character.toString(certificante.getTelefono().charAt(2)));
            fields.get("certificanteTelefono4").setValue(Character.toString(certificante.getTelefono().charAt(3)));
            fields.get("certificanteTelefono5").setValue(Character.toString(certificante.getTelefono().charAt(4)));
            fields.get("certificanteTelefono6").setValue(Character.toString(certificante.getTelefono().charAt(5)));
            fields.get("certificanteTelefono7").setValue(Character.toString(certificante.getTelefono().charAt(6)));
            fields.get("certificanteTelefono8").setValue(Character.toString(certificante.getTelefono().charAt(7)));
            fields.get("certificanteTelefono9").setValue(Character.toString(certificante.getTelefono().charAt(8)));
            fields.get("certificanteTelefono10").setValue(Character.toString(certificante.getTelefono().charAt(9)));

            // Información de la vista 18
            fechas = getFechas(fallecido.getDiaCertificacion(), fallecido.getMesCertificacion(), fallecido.getAnioCertificacion());
            fields.get("certificanteFechaDia1").setValue(fechas[0]);
            fields.get("certificanteFechaDia2").setValue(fechas[1]);
            fields.get("certificanteFechaMes1").setValue(fechas[2]);
            fields.get("certificanteFechaMes2").setValue(fechas[3]);
            fields.get("certificanteFechaYear1").setValue(fechas[4]);
            fields.get("certificanteFechaYear2").setValue(fechas[5]);
            fields.get("certificanteFechaYear3").setValue(fechas[6]);
            fields.get("certificanteFechaYear4").setValue(fechas[7]);

            fields.get("registroNum").setValue(registroCivil.getNumero());
            fields.get("registroNumLibro").setValue(registroCivil.getNumeroLibro());
            fields.get("registroNumActa").setValue(registroCivil.getNumeroActa());

            fields.get("lugarRegistroLocalidad").setValue(registroCivil.getLocalidad());
            fields.get("lugarRegistroMunicipio").setValue(registroCivil.getMunicipioAlcaldia());
            fields.get("lugarRegistroEntidad").setValue(registroCivil.getEntidadFederativa());

            fechas = getFechas(registroCivil.getDiaRegistro(), registroCivil.getMesRegistro(), registroCivil.getAnioRegistro());
            fields.get("fechaRegistroDia1").setValue(fechas[0]);
            fields.get("fechaRegistroDia2").setValue(fechas[1]);
            fields.get("fechaRegistroMes1").setValue(fechas[2]);
            fields.get("fechaRegistroMes2").setValue(fechas[3]);
            fields.get("fechaRegistroYear1").setValue(fechas[4]);
            fields.get("fechaRegistroYear2").setValue(fechas[5]);
            fields.get("fechaRegistroYear3").setValue(fechas[6]);
            fields.get("fechaRegistroYear4").setValue(fechas[7]);

// Asegurar que los cambios se reflejen en el PDF
            form.flattenFields();

            // Guardar y cerrar el documento
            pdfDoc.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private String[] getFechas(int dia, int mes, int year) {
        String[] fechas = new String[8];
        String diaText = Integer.toString(dia);
        String mesText = Integer.toString(mes);
        String yearText = Integer.toString(year);

        if (dia < 10) {
            diaText = "0" + diaText;
        }
        fechas[0] = Character.toString(diaText.charAt(0));
        fechas[1] = Character.toString(diaText.charAt(1));
        if (mes < 10) {
            mesText = "0" + mesText;
        }
        fechas[2] = Character.toString(mesText.charAt(0));
        fechas[3] = Character.toString(mesText.charAt(1));

        fechas[4] = Character.toString(yearText.charAt(0));
        fechas[5] = Character.toString(yearText.charAt(1));
        fechas[6] = Character.toString(yearText.charAt(2));
        fechas[7] = Character.toString(yearText.charAt(3));
        return fechas;

    }

    private String[] getDefuncionTime(int horas, int minutos) {
        String[] defuncionTime = new String[4];
        String horasText = Integer.toString(horas);
        String minutosText = Integer.toString(minutos);

        if (horas < 10) {
            horasText = "0" + horasText;
        }
        defuncionTime[0] = Character.toString(horasText.charAt(0));
        defuncionTime[1] = Character.toString(horasText.charAt(1));
        if (minutos < 10) {
            minutosText = "0" + minutosText;
        }
        defuncionTime[2] = Character.toString(minutosText.charAt(0));
        defuncionTime[3] = Character.toString(minutosText.charAt(1));

        return defuncionTime;
    }

}
