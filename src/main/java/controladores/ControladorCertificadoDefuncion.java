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
    Certificante certificante;
    Fallecido fallecido;
    Defuncion defuncion;
    Informante informante;
    RegistroCivil registroCivil;
    Situacion situacion;
    final String RUTA_PLANTILLA = "pdfs/plantilla-certificado-defuncion.pdf";
    String rutaSalidaPdf = "pdfs/";

    public void GenerarCertificadoDefuncion(Certificante certificante, Fallecido fallecido, Defuncion defuncion,
                                            Informante informante, RegistroCivil registroCivil,
                                            Situacion situacion) {
        // TODO implement here
        rutaSalidaPdf = rutaSalidaPdf + fallecido.getCurp();

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
            fields.get("entidadNacimiento").setValue(fallecido.getEntidadNacimiento());

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

            if (fallecido.getSituacionConyugal().equals("Soltera/o")) {
                checkboxField = fields.get("situacionCoyugalSoltero");
                checkboxField.setValue("on");
            } else if (fallecido.getSituacionConyugal().equals("Separada/o")) {
                checkboxField = fields.get("situacionCoyugalSeparado");
                checkboxField.setValue("on");
            } else if (fallecido.getSituacionConyugal().equals("En unión libre")) {
                checkboxField = fields.get("situacionCoyugalUnionLibre");
                checkboxField.setValue("on");
            } else if (fallecido.getSituacionConyugal().equals("Divorciada/o")) {
                checkboxField = fields.get("situacionCoyugalDivorciado");
                checkboxField.setValue("on");
            } else if (fallecido.getSituacionConyugal().equals("Casada/o")) {
                checkboxField = fields.get("situacionCoyugalCasado");
                checkboxField.setValue("on");
            } else if (fallecido.getSituacionConyugal().equals("Viuda/o")) {
                checkboxField = fields.get("situacionCoyugalViudo");
                checkboxField.setValue("on");
            } else if (fallecido.getSituacionConyugal().equals("Se ignora")) {
                checkboxField = fields.get("situacionCoyugalSeIgnora");
                checkboxField.setValue("on");
            }

            // TODO Información de la vista 4

            // IDK!!!
            fields.get("motivoCirugiaParrafo").setValue("El diseño gráfico permite comunicar ideas de forma visual, creativa y efectiva, logrando un gran impacto.");//113 caracteres


// Asegurar que los cambios se reflejen en el PDF
            form.flattenFields();

            // Guardar y cerrar el documento
            pdfDoc.close();
            System.out.println("PDF generado correctamente en: " + new File(rutaSalidaPdf).getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }

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

}
