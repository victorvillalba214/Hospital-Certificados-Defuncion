/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControladorFormularioCertificadoDefuncion;
import java.awt.Image;
import java.io.File;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Keyla Flores
 */
public class VistaFormularioCertificadoDefuncion extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;

    /**
     * Creates new form VistaGeneraCertificado
     */
    public VistaFormularioCertificadoDefuncion() {
        initComponents();
        this.setLocationRelativeTo(null);
        cambiarIcono();
    }

    private void cambiarIcono() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/logoHospital.jpg"));
        Image imagen = icono.getImage();

        this.setIconImage(imagen);
    }

    public JTextField getTxtEntidadNacimiento() {
        return txtEntidadNacimiento;
    }

    public JRadioButton getRdbtnNoAfromexicano() {
        return rdbtnNoAfromexicano;
    }

    public JTextField getTxtFolioCertificadoNacimiento() {
        return txtFolioCertificadoNacimiento;
    }

    public JTextField getTxtPesoAlNacer() {
        return txtPesoAlNacer;
    }

    public JTextField getTxtSemanasGestacion() {
        return txtSemanasGestacion;
    }

    public JRadioButton getRdbtnSeIgnoraAfromexicano() {
        return rdbtnSeIgnoraAfromexicano;
    }

    public JRadioButton getRdbtnSiAfromexicano() {
        return rdbtnSiAfromexicano;
    }

    public JRadioButton getRdbtnNacionalidadMex() {
        return rdbtnNacionalidadMex;
    }

    public JRadioButton getRdbtnOtraNacionalidad() {
        return rdbtnOtraNacionalidad;
    }

    public JRadioButton getRdbtnSeIgnoraNacionalidad() {
        return rdbtnSeIgnoraNacionalidad;
    }

    public JTextField getTxtEspecifiqueNacionalidad() {
        return txtEspecifiqueNacionalidad;
    }

    public JRadioButton getRdbtnNoLenguaIndigena() {
        return rdbtnNoLenguaIndigena;
    }

    public JRadioButton getRdbtnSeIgnoraLenguaIndigena() {
        return rdbtnSeIgnoraLenguaIndigena;
    }

    public JRadioButton getRdbtnSiLenguaIndigena() {
        return rdbtnSiLenguaIndigena;
    }

    public JTextField getTxtEspecifiqueLenguaIndigena() {
        return txtEspecifiqueLenguaIndigena;
    }

    public JRadioButton getRdbtnNoTrabajaba() {
        return rdbtnNoTrabajaba;
    }

    public JRadioButton getRdbtnSeIgnoraTrabajaba() {
        return rdbtnSeIgnoraTrabajaba;
    }

    public JRadioButton getRdbtnSiTrabajaba() {
        return rdbtnSiTrabajaba;
    }

    public JRadioButton getRdbtnOcupacionHabitualSeIgnora() {
        return rdbtnOcupacionHabitualSeIgnora;
    }

    public JTextField getTxtOcupacionHabitual() {
        return txtOcupacionHabitual;
    }

    public JRadioButton getRdbtnEscolaridadBachilleratoPreparatoria() {
        return rdbtnEscolaridadBachilleratoPreparatoria;
    }

    public JRadioButton getRdbtnEscolaridadCompleta() {
        return rdbtnEscolaridadCompleta;
    }

    public JRadioButton getRdbtnEscolaridadIncompleta() {
        return rdbtnEscolaridadIncompleta;
    }

    public JRadioButton getRdbtnEscolaridadNinguna() {
        return rdbtnEscolaridadNinguna;
    }

    public JRadioButton getRdbtnEscolaridadPosgrado() {
        return rdbtnEscolaridadPosgrado;
    }

    public JRadioButton getRdbtnEscolaridadPreescolar() {
        return rdbtnEscolaridadPreescolar;
    }

    public JTextField getTxtDefuncionClaveUnicaEstablecimientos() {
        return txtDefuncionClaveUnicaEstablecimientos;
    }

    public JTextField getTxtDefuncionNombreUnidadMedica() {
        return txtDefuncionNombreUnidadMedica;
    }

    public JRadioButton getRdbtnEscolaridadPrimaria() {
        return rdbtnEscolaridadPrimaria;
    }

    public JRadioButton getRdbtnEscolaridadProfesional() {
        return rdbtnEscolaridadProfesional;
    }

    public JRadioButton getRdbtnEscolaridadSeIgnora() {
        return rdbtnEscolaridadSeIgnora;
    }

    public JRadioButton getRdbtnEscolaridadSecundaria() {
        return rdbtnEscolaridadSecundaria;
    }

    public JRadioButton getRdbtnNoIndigena() {
        return rdbtnNoIndigena;
    }

    public void setRdbtnNoIndigena(JRadioButton rdbtnNoIndigena) {
        this.rdbtnNoIndigena = rdbtnNoIndigena;
    }

    public JRadioButton getRdbtnSeIgnoraIndigena() {
        return rdbtnSeIgnoraIndigena;
    }

    public void setRdbtnSeIgnoraIndigena(JRadioButton rdbtnSeIgnoraIndigena) {
        this.rdbtnSeIgnoraIndigena = rdbtnSeIgnoraIndigena;
    }

    public JRadioButton getRdbtnSiIndigena() {
        return rdbtnSiIndigena;
    }

    public void setRdbtnSiIndigena(JRadioButton rdbtnSiIndigena) {
        this.rdbtnSiIndigena = rdbtnSiIndigena;
    }

    public JTextField getTxtCurp() {
        return txtCurp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAfromexicano = new javax.swing.ButtonGroup();
        buttonGroupConsiderabaIndigena = new javax.swing.ButtonGroup();
        buttonGroupHablabaLenguaIndigena = new javax.swing.ButtonGroup();
        buttonGroupNacionalidad = new javax.swing.ButtonGroup();
        buttonGroupSituacionConyugal = new javax.swing.ButtonGroup();
        buttonGroupEscolaridad = new javax.swing.ButtonGroup();
        buttonGroupEscolaridadSeleccionada = new javax.swing.ButtonGroup();
        buttonGroupTrabajaba = new javax.swing.ButtonGroup();
        buttonGroupAfiliacionServiciosSalud = new javax.swing.ButtonGroup();
        buttonGroupSitioDefuncion = new javax.swing.ButtonGroup();
        buttonGroupRealizoCirugia = new javax.swing.ButtonGroup();
        buttonGroupAtencionMedicaDuranteEnfermedad = new javax.swing.ButtonGroup();
        buttonGroupDefuncionAccidental = new javax.swing.ButtonGroup();
        buttonGroupTipoDefuncion = new javax.swing.ButtonGroup();
        buttonGroupPracticoNecropsia = new javax.swing.ButtonGroup();
        buttonGroupHallazgosEnCertificacion = new javax.swing.ButtonGroup();
        buttonGroupMuerteEncefalica = new javax.swing.ButtonGroup();
        buttonGroupDonadorOrganos = new javax.swing.ButtonGroup();
        buttonGroupMuerteDurante = new javax.swing.ButtonGroup();
        buttonGroupComplicacionesPropias = new javax.swing.ButtonGroup();
        buttonGroupCausasQueComplicacion = new javax.swing.ButtonGroup();
        buttonGroupAccidentalViolenta = new javax.swing.ButtonGroup();
        buttonGroupLugarOcurrioLesion = new javax.swing.ButtonGroup();
        buttonGroupInvestigacion = new javax.swing.ButtonGroup();
        buttonGroupDelCertificante = new javax.swing.ButtonGroup();
        buttonGroupSexo = new javax.swing.ButtonGroup();
        tabbedPaneCertificadoDefuncion = new javax.swing.JTabbedPane();
        jPanelVista1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        rdbtnPersonaDesconocida = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAñoNacimiento = new javax.swing.JTextField();
        txtDiaNacimiento = new javax.swing.JTextField();
        txtMesNacimiento = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rdbtnHombre = new javax.swing.JRadioButton();
        rdbtnMujer = new javax.swing.JRadioButton();
        rdbtnSeIgnoraSexo = new javax.swing.JRadioButton();
        btnSiguienteVista1 = new javax.swing.JButton();
        jPanelVista2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtEntidadNacimiento = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        rdbtnSiAfromexicano = new javax.swing.JRadioButton();
        rdbtnNoAfromexicano = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        rdbtnSeIgnoraAfromexicano = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        rdbtnSiIndigena = new javax.swing.JRadioButton();
        rdbtnNoIndigena = new javax.swing.JRadioButton();
        rdbtnSeIgnoraIndigena = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        rdbtnSiLenguaIndigena = new javax.swing.JRadioButton();
        rdbtnNoLenguaIndigena = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        rdbtnSeIgnoraLenguaIndigena = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txtEspecifiqueLenguaIndigena = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        rdbtnNacionalidadMex = new javax.swing.JRadioButton();
        rdbtnOtraNacionalidad = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        rdbtnSeIgnoraNacionalidad = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        txtEspecifiqueNacionalidad = new javax.swing.JTextField();
        btnSiguienteVista2 = new javax.swing.JButton();
        btnRegresarVista2 = new javax.swing.JButton();
        jPanelVista3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxTiempo = new javax.swing.JComboBox<>();
        txtEdadTiempo = new javax.swing.JTextField();
        rdbtnSeIgnoraEdad = new javax.swing.JRadioButton();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtFolioCertificadoNacimiento = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPesoAlNacer = new javax.swing.JTextField();
        txtSemanasGestacion = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        rdbtnSoltero = new javax.swing.JRadioButton();
        rdbtnUnionLibre = new javax.swing.JRadioButton();
        rdbtnCasado = new javax.swing.JRadioButton();
        rdbtnSeparado = new javax.swing.JRadioButton();
        rdbtnDivorciado = new javax.swing.JRadioButton();
        rdbtnViudo = new javax.swing.JRadioButton();
        rdbtnSeIgnoraSituacionConyugal = new javax.swing.JRadioButton();
        btnSiguienteVista3 = new javax.swing.JButton();
        btnRegresarVista3 = new javax.swing.JButton();
        jPanelVista4 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtTipoVialidad = new javax.swing.JTextField();
        txtNombreVialidad = new javax.swing.JTextField();
        txtNumExt = new javax.swing.JTextField();
        txtNumInt = new javax.swing.JTextField();
        txtTipoAsentamientoHumano = new javax.swing.JTextField();
        txtNombreAsentamientoHumano = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtMunicipioAlcaldia = new javax.swing.JTextField();
        txtEntidadFederativaPais = new javax.swing.JTextField();
        btnSiguienteVista4 = new javax.swing.JButton();
        btnRegresarVista4 = new javax.swing.JButton();
        jPanelVista5 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        rdbtnEscolaridadNinguna = new javax.swing.JRadioButton();
        rdbtnEscolaridadPrimaria = new javax.swing.JRadioButton();
        rdbtnEscolaridadProfesional = new javax.swing.JRadioButton();
        rdbtnEscolaridadSeIgnora = new javax.swing.JRadioButton();
        rdbtnEscolaridadPreescolar = new javax.swing.JRadioButton();
        rdbtnEscolaridadSecundaria = new javax.swing.JRadioButton();
        rdbtnEscolaridadBachilleratoPreparatoria = new javax.swing.JRadioButton();
        rdbtnEscolaridadPosgrado = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        rdbtnEscolaridadIncompleta = new javax.swing.JRadioButton();
        rdbtnEscolaridadCompleta = new javax.swing.JRadioButton();
        jSeparator22 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        rdbtnOcupacionHabitualSeIgnora = new javax.swing.JRadioButton();
        txtOcupacionHabitual = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        rdbtnSiTrabajaba = new javax.swing.JRadioButton();
        rdbtnSeIgnoraTrabajaba = new javax.swing.JRadioButton();
        rdbtnNoTrabajaba = new javax.swing.JRadioButton();
        jSeparator24 = new javax.swing.JSeparator();
        btnSiguienteVista5 = new javax.swing.JButton();
        btnRegresarVista5 = new javax.swing.JButton();
        jPanelVista6 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        rdbtnServiciosDeSaludNinguna = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludIMSS = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludISSSTE = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludPEMEX = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludSEDENA = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludSEMAR = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludIMSSBIENESTAR = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludISSFAM = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludSeIgnora = new javax.swing.JRadioButton();
        rdbtnServiciosDeSaludOtra = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        txtServiciosDeSaludEspecifique = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtNumeroSeguridadSocial = new javax.swing.JTextField();
        btnSiguienteVista6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtNombreInf = new javax.swing.JTextField();
        txtApellidoMaternoInf = new javax.swing.JTextField();
        txtApellidoPaternoInf = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        btnRegresarVista6 = new javax.swing.JButton();
        jPanelVista7 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        txtFirmaInformante = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtParentescoFamiliar = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        rdbtnDefuncionSecretariaSalud = new javax.swing.JRadioButton();
        rdbtnDefuncionImssBienestar = new javax.swing.JRadioButton();
        rdbtnDefuncionImss = new javax.swing.JRadioButton();
        rdbtnDefuncionIssste = new javax.swing.JRadioButton();
        rdbtnDefuncionPemex = new javax.swing.JRadioButton();
        rdbtnDefuncionSedena = new javax.swing.JRadioButton();
        rdbtnDefuncionSemar = new javax.swing.JRadioButton();
        rdbtnDefuncionOtraUnidadMedica = new javax.swing.JRadioButton();
        rdbtnDefuncionUnidadMedicaPrivada = new javax.swing.JRadioButton();
        txtDefuncionNombreUnidadMedica = new javax.swing.JTextField();
        txtDefuncionClaveUnicaEstablecimientos = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        rdbtnDefuncionViaPublica = new javax.swing.JRadioButton();
        rdbtnDefuncionHogar = new javax.swing.JRadioButton();
        rdbtnDefuncionOtroLugar = new javax.swing.JRadioButton();
        rdbtnDefuncionSeIgnora = new javax.swing.JRadioButton();
        jLabel62 = new javax.swing.JLabel();
        btnSiguienteVista7 = new javax.swing.JButton();
        btnRegresarVista7 = new javax.swing.JButton();
        jPanelVista8 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        txtNombreVialidadDefuncion = new javax.swing.JTextField();
        txtNumExtDefuncion = new javax.swing.JTextField();
        txtTipoVialidadDefuncion = new javax.swing.JTextField();
        txtCodigoPostalDefuncion = new javax.swing.JTextField();
        txtTipoAsentamientoHumanoDefuncion = new javax.swing.JTextField();
        txtNombreAsentamientoHumanoDefuncion = new javax.swing.JTextField();
        txtLocalidadDefuncion = new javax.swing.JTextField();
        txtMunicipioDefuncion = new javax.swing.JTextField();
        txtEntidadFederativaDefuncion = new javax.swing.JTextField();
        txtNumIntDefuncion = new javax.swing.JTextField();
        btnSiguienteVista8 = new javax.swing.JButton();
        btnRegresarVista8 = new javax.swing.JButton();
        jPanelVista9 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtDiaDefuncion = new javax.swing.JTextField();
        txtMesDefuncion = new javax.swing.JTextField();
        txtAñoDefuncion = new javax.swing.JTextField();
        txtHorasDefuncion = new javax.swing.JTextField();
        txtMinutosDefuncion = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        rdbtnSiAtencionMedica = new javax.swing.JRadioButton();
        rdbtnNoAtencionMedica = new javax.swing.JRadioButton();
        rdbtnSeIgnoraAtencionMedica = new javax.swing.JRadioButton();
        jLabel82 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        rdbtnSiRealizoCirugia = new javax.swing.JRadioButton();
        rdbtnNoRealizoCirugia = new javax.swing.JRadioButton();
        rdbtnSeIgnoraRealizoCirugia = new javax.swing.JRadioButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtMesRealizoCirugia = new javax.swing.JTextField();
        txtAñoRealizoCirugia = new javax.swing.JTextField();
        txtDiaRealizoCirugia = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txtMotivoCirugia = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        rdbtnSiDefuncionAccidentalViolenta = new javax.swing.JRadioButton();
        rdbtnNoDefuncionAccidentalViolenta = new javax.swing.JRadioButton();
        rdbtnSeIgnoraDefuncionAccidentalViolenta = new javax.swing.JRadioButton();
        btnSiguienteVista9 = new javax.swing.JButton();
        btnRegresarVista9 = new javax.swing.JButton();
        jPanelVista10 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        rdbtnTipoDefuncionEnfermedad = new javax.swing.JRadioButton();
        rdbtnTipoDefuncionAccidente = new javax.swing.JRadioButton();
        rdbtnTipoDefuncionAgresion = new javax.swing.JRadioButton();
        rdbtnTipoDefuncionIntencionalmente = new javax.swing.JRadioButton();
        rdbtnTipoDefuncionIntervencionLegal = new javax.swing.JRadioButton();
        rdbtnTipoDefuncionSeIgnora = new javax.swing.JRadioButton();
        jLabel90 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        txtCausaDefuncionA = new javax.swing.JTextField();
        txtCausaDefuncionB = new javax.swing.JTextField();
        txtCausaDefuncionC = new javax.swing.JTextField();
        txtCausaDefuncionD = new javax.swing.JTextField();
        btnSiguienteVista10 = new javax.swing.JButton();
        btnRegresarVista10 = new javax.swing.JButton();
        jPanelVista11 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        txtIntervaloEnfermedadDefuncionB = new javax.swing.JTextField();
        txtIntervaloEnfermedadDefuncionA = new javax.swing.JTextField();
        txtIntervaloEnfermedadDefuncionC = new javax.swing.JTextField();
        jSeparator56 = new javax.swing.JSeparator();
        jLabel111 = new javax.swing.JLabel();
        txtCodigoCieC = new javax.swing.JTextField();
        txtCodigoCieA = new javax.swing.JTextField();
        txtCodigoCieB = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txtIntervaloEnfermedadDefuncionD = new javax.swing.JTextField();
        txtCodigoCieD = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        txtOtrasCondiciones = new javax.swing.JTextField();
        txtCodigoCieIntervaloTiempo = new javax.swing.JTextField();
        btnSiguienteVista11 = new javax.swing.JButton();
        btnRegresarVista11 = new javax.swing.JButton();
        jPanelVista12 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        rdbtnSiPracticoNecropsia = new javax.swing.JRadioButton();
        rdbtnSiUtilizaronHallazgos = new javax.swing.JRadioButton();
        rdbtnNoUtilizaronHallazgos = new javax.swing.JRadioButton();
        jLabel119 = new javax.swing.JLabel();
        rdbtnNoPracticoNecropsia = new javax.swing.JRadioButton();
        rdbtnSeIgnoraPracticoNecropsia = new javax.swing.JRadioButton();
        jLabel125 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        rdbtnMuerteDuranteEmbarazo = new javax.swing.JRadioButton();
        rdbtnMuerteDuranteParto = new javax.swing.JRadioButton();
        rdbtnMuerteDurantePuerperio = new javax.swing.JRadioButton();
        rdbtnMuerteDespuesPartoAborto = new javax.swing.JRadioButton();
        rdbtnNoEstuvoEmbarazadaPreviamente = new javax.swing.JRadioButton();
        jSeparator64 = new javax.swing.JSeparator();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        rdbtnSiComplicaciones = new javax.swing.JRadioButton();
        rdbtnNoComplicaciones = new javax.swing.JRadioButton();
        jSeparator65 = new javax.swing.JSeparator();
        jLabel124 = new javax.swing.JLabel();
        rdbtnSiComplicacionesPropias = new javax.swing.JRadioButton();
        rdbtnNoComplicacionesPropias = new javax.swing.JRadioButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        rdbtnSiMuerteEncefalica = new javax.swing.JRadioButton();
        rdbtnNoDonadorOrganos = new javax.swing.JRadioButton();
        jLabel127 = new javax.swing.JLabel();
        rdbtnSiDonadorOrganos = new javax.swing.JRadioButton();
        rdbtnNoMuerteEncefalica = new javax.swing.JRadioButton();
        btnSiguienteVista12 = new javax.swing.JButton();
        btnRegresarVista12 = new javax.swing.JButton();
        jPanelVista13 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        txtCausaBasicaDefuncion = new javax.swing.JTextField();
        txtCodigoAdicional = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        rdbtnSiOcurrioDesempeñoTrabajo = new javax.swing.JRadioButton();
        rdbtnNoOcurrioDesempeñoTrabajo = new javax.swing.JRadioButton();
        rdbtnSeIgnoraOcurrioDesempeñoTrabajo = new javax.swing.JRadioButton();
        jLabel132 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        rdbtnViviendaParticular = new javax.swing.JRadioButton();
        rdbtnViviendaColectiva = new javax.swing.JRadioButton();
        rdbtnEscuelauOficinaPublica = new javax.swing.JRadioButton();
        rdbtnAreaDeportiva = new javax.swing.JRadioButton();
        rdbtnCalleoCarretera = new javax.swing.JRadioButton();
        rdbtnAreaComercialoServicio = new javax.swing.JRadioButton();
        rdbtnAreaIndustrial = new javax.swing.JRadioButton();
        rdbtnGranja = new javax.swing.JRadioButton();
        rdbtnSeIgnoraLugar = new javax.swing.JRadioButton();
        rdbtnOtroLugar = new javax.swing.JRadioButton();
        jPanel47 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        txtNumeroActa = new javax.swing.JTextField();
        btnSiguienteVista13 = new javax.swing.JButton();
        btnRegresarVista13 = new javax.swing.JButton();
        jPanelVista14 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        txtRelacionAgresorFallecido = new javax.swing.JTextField();
        jPanel57 = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        rdbtnInvestigacionPendiente = new javax.swing.JRadioButton();
        rdbtnNoPuedeDeterminarse = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionSituacion = new javax.swing.JTextArea();
        btnSiguienteVista14 = new javax.swing.JButton();
        btnRegresarVista14 = new javax.swing.JButton();
        jPanelVista15 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        txtTipoVialidadLesion = new javax.swing.JTextField();
        txtNombreVialidadLesion = new javax.swing.JTextField();
        txtNumExtLesion = new javax.swing.JTextField();
        txtNumIntLesion = new javax.swing.JTextField();
        txtTipoAsentamientoHumanoLesion = new javax.swing.JTextField();
        txtNombreAsentamientoHumanoLesion = new javax.swing.JTextField();
        txtCodigoPostalLesion = new javax.swing.JTextField();
        txtLocalidadLesion = new javax.swing.JTextField();
        txtMunicipioAlcaldiaLesion = new javax.swing.JTextField();
        txtEntidadFederativaLesion = new javax.swing.JTextField();
        btnSiguienteVista15 = new javax.swing.JButton();
        btnRegresarVista15 = new javax.swing.JButton();
        jPanelVista16 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        rdbtnMedicoTratante = new javax.swing.JRadioButton();
        rdbtnMedicoLegista = new javax.swing.JRadioButton();
        rdbtnOtroMedico = new javax.swing.JRadioButton();
        rdbtnPersonaAutorizada = new javax.swing.JRadioButton();
        rdbtnAutoridadCivil = new javax.swing.JRadioButton();
        rdbtnOtro = new javax.swing.JRadioButton();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        txtEspecifiqueOtraAutoridad1 = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        txtNombreCertificante = new javax.swing.JTextField();
        txtApellidoPCertificante = new javax.swing.JTextField();
        txtApellidoMCertificante = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jSeparator83 = new javax.swing.JSeparator();
        jLabel163 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        txtFirmaCertificante = new javax.swing.JTextField();
        txtNumCedProfesional = new javax.swing.JTextField();
        btnSiguienteVista16 = new javax.swing.JButton();
        btnRegresarVista16 = new javax.swing.JButton();
        jPanelVista17 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        txtTipoVialidadCertificante = new javax.swing.JTextField();
        txtNombreVialidadCertificante = new javax.swing.JTextField();
        txtNumExtCertificante = new javax.swing.JTextField();
        txtNumIntCertificante = new javax.swing.JTextField();
        txtTipoAsentamientoHumanoCertificante = new javax.swing.JTextField();
        txtNombreAsentamientoHumanoCertificante = new javax.swing.JTextField();
        txtCodigoPostalCertificante = new javax.swing.JTextField();
        txtLocalidadCertificante = new javax.swing.JTextField();
        txtMunicipioAlcaldiaCertificante = new javax.swing.JTextField();
        txtTelefonoCertificante = new javax.swing.JTextField();
        jLabel180 = new javax.swing.JLabel();
        txtEntidadFederativaCertificante = new javax.swing.JTextField();
        btnSiguienteVista17 = new javax.swing.JButton();
        btnRegresarVista17 = new javax.swing.JButton();
        jPanelVista18 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jLabel167 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel173 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        txtFechaCertificacionDia = new javax.swing.JTextField();
        txtFechaCertificacionMes = new javax.swing.JTextField();
        txtFechaCertificacionAño = new javax.swing.JTextField();
        jPanel66 = new javax.swing.JPanel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        txtNumFiscalia = new javax.swing.JTextField();
        txtNumLibroFiscalia = new javax.swing.JTextField();
        jLabel188 = new javax.swing.JLabel();
        txtNumActaFiscalia = new javax.swing.JTextField();
        jPanel67 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        txtEntidadFederativaRegistro = new javax.swing.JTextField();
        txtLocalidadRegistro = new javax.swing.JTextField();
        txtMunicipioRegistro = new javax.swing.JTextField();
        jPanel68 = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        txtDiaRegistro = new javax.swing.JTextField();
        txtMesRegistro = new javax.swing.JTextField();
        txtAñoRegistro = new javax.swing.JTextField();
        btnEnviarFormulario = new javax.swing.JButton();
        btnRegresarVista18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tabbedPaneCertificadoDefuncion.setEnabled(false);

        jPanelVista1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBackground(new java.awt.Color(183, 225, 248));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(183, 225, 248));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel2.setText("1. Nombre del (la) fallecido (a):");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Nombre (s)");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Apellido Paterno");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Apellido Materno");

        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rdbtnPersonaDesconocida.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnPersonaDesconocida.setText("Persona desconocida");
        rdbtnPersonaDesconocida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnPersonaDesconocidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbtnPersonaDesconocida)
                .addGap(95, 95, 95))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel3)
                .addGap(196, 196, 196)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(119, 119, 119))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(rdbtnPersonaDesconocida))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(183, 225, 248));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel6.setText("2. Fecha de nacimiento");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Día");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel8.setText("Mes");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel9.setText("Año");

        txtAñoNacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDiaNacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMesNacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(txtMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(txtAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(185, 185, 185)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(172, 172, 172))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAñoNacimiento, txtDiaNacimiento, txtMesNacimiento});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28))
        );

        jPanel5.setBackground(new java.awt.Color(183, 225, 248));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel10.setText("3. Sexo");

        buttonGroupSexo.add(rdbtnHombre);
        rdbtnHombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnHombre.setText("Hombre");
        rdbtnHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnHombreActionPerformed(evt);
            }
        });

        buttonGroupSexo.add(rdbtnMujer);
        rdbtnMujer.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        rdbtnMujer.setText("Mujer");
        rdbtnMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMujerActionPerformed(evt);
            }
        });

        buttonGroupSexo.add(rdbtnSeIgnoraSexo);
        rdbtnSeIgnoraSexo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSeIgnoraSexo.setText("Se ignora");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rdbtnHombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(rdbtnMujer)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(rdbtnSeIgnoraSexo))
                        .addContainerGap(127, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnHombre)
                    .addComponent(rdbtnMujer))
                .addGap(18, 18, 18)
                .addComponent(rdbtnSeIgnoraSexo)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnSiguienteVista1.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista1.setText("Siguiente");
        btnSiguienteVista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista1Layout = new javax.swing.GroupLayout(jPanelVista1);
        jPanelVista1.setLayout(jPanelVista1Layout);
        jPanelVista1Layout.setHorizontalGroup(
            jPanelVista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista1Layout.createSequentialGroup()
                .addGroup(jPanelVista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanelVista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSiguienteVista1)
                            .addGroup(jPanelVista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelVista1Layout.createSequentialGroup()
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelVista1Layout.setVerticalGroup(
            jPanelVista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanelVista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSiguienteVista1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab1", jPanelVista1);

        jPanelVista2.setBackground(new java.awt.Color(0, 51, 102));

        jPanel7.setBackground(new java.awt.Color(183, 225, 248));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(183, 225, 248));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel12.setText("4. Entidad de nacimiento");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel13.setText("Entidad federativa o país, si nació en el extranjero");

        txtEntidadNacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel12))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEntidadNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEntidadNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(183, 225, 248));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel14.setText("5. CURP");

        txtCurp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel14)
                .addGap(74, 74, 74)
                .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(16, 16, 16))
        );

        jPanel10.setBackground(new java.awt.Color(183, 225, 248));

        buttonGroupAfromexicano.add(rdbtnSiAfromexicano);
        rdbtnSiAfromexicano.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSiAfromexicano.setText("Si");

        buttonGroupAfromexicano.add(rdbtnNoAfromexicano);
        rdbtnNoAfromexicano.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnNoAfromexicano.setText("No");
        rdbtnNoAfromexicano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoAfromexicanoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel15.setText("6. ¿Se le conocía como afromexicana/o?");

        buttonGroupAfromexicano.add(rdbtnSeIgnoraAfromexicano);
        rdbtnSeIgnoraAfromexicano.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraAfromexicano.setText("Se ignora");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rdbtnSiAfromexicano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbtnNoAfromexicano)
                .addGap(87, 87, 87)
                .addComponent(rdbtnSeIgnoraAfromexicano)
                .addGap(37, 37, 37))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSiAfromexicano)
                    .addComponent(rdbtnNoAfromexicano)
                    .addComponent(rdbtnSeIgnoraAfromexicano))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(183, 225, 248));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel16.setText("7. ¿Se consideraba indígena?");

        buttonGroupConsiderabaIndigena.add(rdbtnSiIndigena);
        rdbtnSiIndigena.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSiIndigena.setText("Si");

        buttonGroupConsiderabaIndigena.add(rdbtnNoIndigena);
        rdbtnNoIndigena.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnNoIndigena.setText("No");
        rdbtnNoIndigena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoIndigenaActionPerformed(evt);
            }
        });

        buttonGroupConsiderabaIndigena.add(rdbtnSeIgnoraIndigena);
        rdbtnSeIgnoraIndigena.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraIndigena.setText("Se ignora");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(90, 90, 90))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rdbtnSiIndigena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbtnNoIndigena)
                .addGap(53, 53, 53)
                .addComponent(rdbtnSeIgnoraIndigena)
                .addGap(29, 29, 29))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSiIndigena)
                    .addComponent(rdbtnNoIndigena)
                    .addComponent(rdbtnSeIgnoraIndigena))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(183, 225, 248));

        buttonGroupHablabaLenguaIndigena.add(rdbtnSiLenguaIndigena);
        rdbtnSiLenguaIndigena.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSiLenguaIndigena.setText("Si");
        rdbtnSiLenguaIndigena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiLenguaIndigenaActionPerformed(evt);
            }
        });

        buttonGroupHablabaLenguaIndigena.add(rdbtnNoLenguaIndigena);
        rdbtnNoLenguaIndigena.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnNoLenguaIndigena.setText("No");
        rdbtnNoLenguaIndigena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoLenguaIndigenaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel17.setText("8. ¿Hablaba alguna lengua indígena?");

        buttonGroupHablabaLenguaIndigena.add(rdbtnSeIgnoraLenguaIndigena);
        rdbtnSeIgnoraLenguaIndigena.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraLenguaIndigena.setText("Se ignora");
        rdbtnSeIgnoraLenguaIndigena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSeIgnoraLenguaIndigenaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel18.setText("Especifique:");

        txtEspecifiqueLenguaIndigena.setEditable(false);
        txtEspecifiqueLenguaIndigena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEspecifiqueLenguaIndigena.setEnabled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnNoLenguaIndigena)
                    .addComponent(rdbtnSiLenguaIndigena))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel17))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnSeIgnoraLenguaIndigena)
                            .addComponent(txtEspecifiqueLenguaIndigena, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnSiLenguaIndigena)
                            .addComponent(jLabel18)
                            .addComponent(txtEspecifiqueLenguaIndigena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnNoLenguaIndigena)
                    .addComponent(rdbtnSeIgnoraLenguaIndigena)))
        );

        jPanel13.setBackground(new java.awt.Color(183, 225, 248));

        buttonGroupNacionalidad.add(rdbtnNacionalidadMex);
        rdbtnNacionalidadMex.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnNacionalidadMex.setText("Mexicana");
        rdbtnNacionalidadMex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNacionalidadMexActionPerformed(evt);
            }
        });

        buttonGroupNacionalidad.add(rdbtnOtraNacionalidad);
        rdbtnOtraNacionalidad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnOtraNacionalidad.setText("Otra");
        rdbtnOtraNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnOtraNacionalidadActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel19.setText("9. Nacionalidad");

        buttonGroupNacionalidad.add(rdbtnSeIgnoraNacionalidad);
        rdbtnSeIgnoraNacionalidad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraNacionalidad.setText("Se ignora");
        rdbtnSeIgnoraNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSeIgnoraNacionalidadActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel20.setText("Especifique:");

        txtEspecifiqueNacionalidad.setEditable(false);
        txtEspecifiqueNacionalidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEspecifiqueNacionalidad.setEnabled(false);
        txtEspecifiqueNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecifiqueNacionalidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel19))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(rdbtnNacionalidadMex)
                                .addGap(130, 130, 130)
                                .addComponent(rdbtnSeIgnoraNacionalidad))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(rdbtnOtraNacionalidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtEspecifiqueNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnNacionalidadMex)
                    .addComponent(rdbtnSeIgnoraNacionalidad))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rdbtnOtraNacionalidad))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEspecifiqueNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))))
        );

        btnSiguienteVista2.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista2.setText("Siguiente");
        btnSiguienteVista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista2ActionPerformed(evt);
            }
        });

        btnRegresarVista2.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista2.setText("Regresar");
        btnRegresarVista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista2Layout = new javax.swing.GroupLayout(jPanelVista2);
        jPanelVista2.setLayout(jPanelVista2Layout);
        jPanelVista2Layout.setHorizontalGroup(
            jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista2Layout.createSequentialGroup()
                .addGroup(jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelVista2Layout.createSequentialGroup()
                                .addGroup(jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelVista2Layout.createSequentialGroup()
                                .addComponent(btnRegresarVista2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguienteVista2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelVista2Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanelVista2Layout.setVerticalGroup(
            jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista2)
                    .addComponent(btnRegresarVista2))
                .addGap(9, 9, 9))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab2", jPanelVista2);

        jPanelVista3.setBackground(new java.awt.Color(0, 51, 102));

        jPanel15.setBackground(new java.awt.Color(183, 225, 248));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel21)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(183, 225, 248));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel22.setText("10. Edad cumplida");

        jComboBoxTiempo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jComboBoxTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "Horas", "Días", "Meses", "Años cumplidos" }));
        jComboBoxTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTiempoActionPerformed(evt);
            }
        });

        txtEdadTiempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEdadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadTiempoActionPerformed(evt);
            }
        });

        rdbtnSeIgnoraEdad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraEdad.setText("Se ignora");
        rdbtnSeIgnoraEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSeIgnoraEdadActionPerformed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel23.setText("Para menores de 28 días de nacido/a anote:");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel24.setText("Folio del certificado de nacimiento");

        txtFolioCertificadoNacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel25.setText("Peso al nacer (gramos)");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel26.setText("Semanas de gestación");

        txtPesoAlNacer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtSemanasGestacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtEdadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(rdbtnSeIgnoraEdad)))
                .addGap(44, 44, 44)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel23))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(txtFolioCertificadoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSemanasGestacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesoAlNacer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(rdbtnSeIgnoraEdad)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFolioCertificadoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26)
                                        .addComponent(txtSemanasGestacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel25)
                                    .addComponent(txtPesoAlNacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 25, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(183, 225, 248));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel27.setText("11. Situación conyugal");

        buttonGroupSituacionConyugal.add(rdbtnSoltero);
        rdbtnSoltero.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnSoltero.setText("Soltero/a");
        rdbtnSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSolteroActionPerformed(evt);
            }
        });

        buttonGroupSituacionConyugal.add(rdbtnUnionLibre);
        rdbtnUnionLibre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnUnionLibre.setText("En unión libre");
        rdbtnUnionLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnUnionLibreActionPerformed(evt);
            }
        });

        buttonGroupSituacionConyugal.add(rdbtnCasado);
        rdbtnCasado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnCasado.setText("Casado/a");

        buttonGroupSituacionConyugal.add(rdbtnSeparado);
        rdbtnSeparado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnSeparado.setText("Separado/a");

        buttonGroupSituacionConyugal.add(rdbtnDivorciado);
        rdbtnDivorciado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDivorciado.setText("Divorciado/a");

        buttonGroupSituacionConyugal.add(rdbtnViudo);
        rdbtnViudo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnViudo.setText("Viudo/a");

        buttonGroupSituacionConyugal.add(rdbtnSeIgnoraSituacionConyugal);
        rdbtnSeIgnoraSituacionConyugal.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnSeIgnoraSituacionConyugal.setText("Se ignora");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rdbtnSoltero)
                .addGap(133, 133, 133)
                .addComponent(rdbtnUnionLibre)
                .addGap(148, 148, 148)
                .addComponent(rdbtnCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(rdbtnSeparado)
                .addGap(52, 52, 52))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(rdbtnDivorciado)
                .addGap(149, 149, 149)
                .addComponent(rdbtnViudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbtnSeIgnoraSituacionConyugal)
                .addGap(164, 164, 164))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel27)
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSoltero)
                    .addComponent(rdbtnUnionLibre)
                    .addComponent(rdbtnCasado)
                    .addComponent(rdbtnSeparado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnDivorciado)
                    .addComponent(rdbtnViudo)
                    .addComponent(rdbtnSeIgnoraSituacionConyugal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSiguienteVista3.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista3.setText("Siguiente");
        btnSiguienteVista3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista3ActionPerformed(evt);
            }
        });

        btnRegresarVista3.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista3.setText("Regresar");
        btnRegresarVista3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista3Layout = new javax.swing.GroupLayout(jPanelVista3);
        jPanelVista3.setLayout(jPanelVista3Layout);
        jPanelVista3Layout.setHorizontalGroup(
            jPanelVista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(jPanelVista3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelVista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelVista3Layout.createSequentialGroup()
                            .addComponent(btnRegresarVista3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSiguienteVista3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanelVista3Layout.setVerticalGroup(
            jPanelVista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista3)
                    .addComponent(btnRegresarVista3))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab3", jPanelVista3);

        jPanelVista4.setBackground(new java.awt.Color(0, 51, 102));

        jPanel19.setBackground(new java.awt.Color(183, 225, 248));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel28)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel28)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(183, 225, 248));

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel29.setText("12. Residencia habitual");

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel30.setText("Anote el domicilio permanente donde vivía la (el) fallecida/o ");

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel31.setText("Tipo de vialidad");

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel32.setText("Nombre de la vialidad");

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel33.setText("Num. Ext.");

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel34.setText("Num. Int.");

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel35.setText("Tipo de asentamiento humano");

        jLabel36.setText("Código Postal");

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel37.setText("Nombre del asentamiento humano");

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel38.setText("Localidad");

        jLabel39.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel39.setText("Municipio o alcaldía");

        jLabel40.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel40.setText("Entidad federativa o país (si residía en el extranjero) ");

        jLabel41.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel41.setText("Código Postal");

        txtTipoVialidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreVialidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumExt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumInt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTipoAsentamientoHumano.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreAsentamientoHumano.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoPostal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtLocalidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMunicipioAlcaldia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEntidadFederativaPais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(964, 964, 964)
                        .addComponent(jLabel36))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel35)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel37))
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(txtTipoVialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(txtNombreVialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(txtNumExt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTipoAsentamientoHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLocalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombreAsentamientoHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMunicipioAlcaldia, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(113, 113, 113)))
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel31)
                                    .addGap(129, 129, 129)
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33)
                                    .addGap(43, 43, 43)))
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumInt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(jLabel41))
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                            .addGap(91, 91, 91)
                                            .addComponent(jLabel34)))
                                    .addGap(46, 46, 46))))
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGap(282, 282, 282)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEntidadFederativaPais, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel38)
                        .addGap(196, 196, 196)
                        .addComponent(jLabel39)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel40))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel30)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoVialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreVialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(29, 29, 29)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoAsentamientoHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreAsentamientoHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37)
                    .addComponent(jLabel41))
                .addGap(15, 15, 15)
                .addComponent(jLabel36)
                .addGap(8, 8, 8)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipioAlcaldia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntidadFederativaPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btnSiguienteVista4.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista4.setText("Siguiente");
        btnSiguienteVista4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista4ActionPerformed(evt);
            }
        });

        btnRegresarVista4.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista4.setText("Regresar");
        btnRegresarVista4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista4Layout = new javax.swing.GroupLayout(jPanelVista4);
        jPanelVista4.setLayout(jPanelVista4Layout);
        jPanelVista4Layout.setHorizontalGroup(
            jPanelVista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista4Layout.createSequentialGroup()
                .addGroup(jPanelVista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista4Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanelVista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelVista4Layout.createSequentialGroup()
                                .addComponent(btnRegresarVista4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguienteVista4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanelVista4Layout.setVerticalGroup(
            jPanelVista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanelVista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista4)
                    .addComponent(btnRegresarVista4))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab4", jPanelVista4);

        jPanelVista5.setBackground(new java.awt.Color(0, 51, 102));

        jPanel21.setBackground(new java.awt.Color(183, 225, 248));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel42)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel42)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(183, 225, 248));

        jLabel43.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel43.setText("La escolaridad seleccionada es: ");

        buttonGroupEscolaridad.add(rdbtnEscolaridadNinguna);
        rdbtnEscolaridadNinguna.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadNinguna.setText("Ninguna");
        rdbtnEscolaridadNinguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadNingunaActionPerformed(evt);
            }
        });

        buttonGroupEscolaridad.add(rdbtnEscolaridadPrimaria);
        rdbtnEscolaridadPrimaria.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadPrimaria.setText("Primaria");
        rdbtnEscolaridadPrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadPrimariaActionPerformed(evt);
            }
        });

        buttonGroupEscolaridad.add(rdbtnEscolaridadProfesional);
        rdbtnEscolaridadProfesional.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadProfesional.setText("Profesional");
        rdbtnEscolaridadProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadProfesionalActionPerformed(evt);
            }
        });

        buttonGroupEscolaridad.add(rdbtnEscolaridadSeIgnora);
        rdbtnEscolaridadSeIgnora.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadSeIgnora.setText("Se ignora");
        rdbtnEscolaridadSeIgnora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadSeIgnoraActionPerformed(evt);
            }
        });

        buttonGroupEscolaridad.add(rdbtnEscolaridadPreescolar);
        rdbtnEscolaridadPreescolar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadPreescolar.setText("Preescolar");
        rdbtnEscolaridadPreescolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadPreescolarActionPerformed(evt);
            }
        });

        buttonGroupEscolaridad.add(rdbtnEscolaridadSecundaria);
        rdbtnEscolaridadSecundaria.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadSecundaria.setText("Secundaria");
        rdbtnEscolaridadSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadSecundariaActionPerformed(evt);
            }
        });

        buttonGroupEscolaridad.add(rdbtnEscolaridadBachilleratoPreparatoria);
        rdbtnEscolaridadBachilleratoPreparatoria.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadBachilleratoPreparatoria.setText("Bachillerato o preparatoria");
        rdbtnEscolaridadBachilleratoPreparatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadBachilleratoPreparatoriaActionPerformed(evt);
            }
        });

        buttonGroupEscolaridad.add(rdbtnEscolaridadPosgrado);
        rdbtnEscolaridadPosgrado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadPosgrado.setText("Posgrado");
        rdbtnEscolaridadPosgrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadPosgradoActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel44.setText("13. Escolaridad");

        buttonGroupEscolaridadSeleccionada.add(rdbtnEscolaridadIncompleta);
        rdbtnEscolaridadIncompleta.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadIncompleta.setText("Incompleta");
        rdbtnEscolaridadIncompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadIncompletaActionPerformed(evt);
            }
        });

        buttonGroupEscolaridadSeleccionada.add(rdbtnEscolaridadCompleta);
        rdbtnEscolaridadCompleta.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnEscolaridadCompleta.setText("Completa");
        rdbtnEscolaridadCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEscolaridadCompletaActionPerformed(evt);
            }
        });

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnEscolaridadNinguna)
                    .addComponent(rdbtnEscolaridadPreescolar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(rdbtnEscolaridadPrimaria)
                        .addGap(119, 119, 119))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(rdbtnEscolaridadSecundaria)
                        .addGap(103, 103, 103)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnEscolaridadBachilleratoPreparatoria)
                    .addComponent(rdbtnEscolaridadProfesional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnEscolaridadSeIgnora)
                    .addComponent(rdbtnEscolaridadPosgrado))
                .addGap(67, 67, 67))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel43)
                .addGap(81, 81, 81)
                .addComponent(rdbtnEscolaridadCompleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(rdbtnEscolaridadIncompleta)
                .addGap(194, 194, 194))
            .addComponent(jSeparator22, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel44)
                .addGap(12, 12, 12)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnEscolaridadNinguna)
                    .addComponent(rdbtnEscolaridadPrimaria)
                    .addComponent(rdbtnEscolaridadBachilleratoPreparatoria)
                    .addComponent(rdbtnEscolaridadPosgrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnEscolaridadPreescolar)
                    .addComponent(rdbtnEscolaridadSecundaria)
                    .addComponent(rdbtnEscolaridadProfesional)
                    .addComponent(rdbtnEscolaridadSeIgnora))
                .addGap(12, 12, 12)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(rdbtnEscolaridadIncompleta)
                    .addComponent(rdbtnEscolaridadCompleta))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(183, 225, 248));

        jLabel45.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel45.setText("14. Ocupación habitual");

        rdbtnOcupacionHabitualSeIgnora.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnOcupacionHabitualSeIgnora.setText("Se ignora");
        rdbtnOcupacionHabitualSeIgnora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnOcupacionHabitualSeIgnoraActionPerformed(evt);
            }
        });

        txtOcupacionHabitual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel46.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel46.setText("Trabajaba");

        buttonGroupTrabajaba.add(rdbtnSiTrabajaba);
        rdbtnSiTrabajaba.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnSiTrabajaba.setText("Si");
        rdbtnSiTrabajaba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiTrabajabaActionPerformed(evt);
            }
        });

        buttonGroupTrabajaba.add(rdbtnSeIgnoraTrabajaba);
        rdbtnSeIgnoraTrabajaba.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnSeIgnoraTrabajaba.setText("Se ignora");

        buttonGroupTrabajaba.add(rdbtnNoTrabajaba);
        rdbtnNoTrabajaba.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnNoTrabajaba.setText("No");

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(txtOcupacionHabitual, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbtnOcupacionHabitualSeIgnora)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(rdbtnSiTrabajaba)
                        .addGap(162, 162, 162)
                        .addComponent(rdbtnNoTrabajaba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                        .addComponent(rdbtnSeIgnoraTrabajaba)))
                .addGap(152, 152, 152))
            .addComponent(jSeparator24)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOcupacionHabitual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbtnOcupacionHabitualSeIgnora))
                .addGap(26, 26, 26)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(rdbtnSiTrabajaba)
                    .addComponent(rdbtnNoTrabajaba)
                    .addComponent(rdbtnSeIgnoraTrabajaba))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnSiguienteVista5.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista5.setText("Siguiente");
        btnSiguienteVista5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista5ActionPerformed(evt);
            }
        });

        btnRegresarVista5.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista5.setText("Regresar");
        btnRegresarVista5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista5Layout = new javax.swing.GroupLayout(jPanelVista5);
        jPanelVista5.setLayout(jPanelVista5Layout);
        jPanelVista5Layout.setHorizontalGroup(
            jPanelVista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(jPanelVista5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanelVista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVista5Layout.createSequentialGroup()
                        .addComponent(btnRegresarVista5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(670, 670, 670)
                        .addComponent(btnSiguienteVista5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanelVista5Layout.setVerticalGroup(
            jPanelVista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista5)
                    .addComponent(btnRegresarVista5))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab5", jPanelVista5);

        jPanelVista6.setBackground(new java.awt.Color(0, 51, 102));

        jPanel22.setBackground(new java.awt.Color(183, 225, 248));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel47)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel47)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(183, 225, 248));

        jLabel48.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel48.setText("15. Afliliación a Servicios de Salud");

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludNinguna);
        rdbtnServiciosDeSaludNinguna.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludNinguna.setText("Ninguna");
        rdbtnServiciosDeSaludNinguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludNingunaActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludIMSS);
        rdbtnServiciosDeSaludIMSS.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludIMSS.setText("IMSS");
        rdbtnServiciosDeSaludIMSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludIMSSActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludISSSTE);
        rdbtnServiciosDeSaludISSSTE.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludISSSTE.setText("ISSSTE");
        rdbtnServiciosDeSaludISSSTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludISSSTEActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludPEMEX);
        rdbtnServiciosDeSaludPEMEX.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludPEMEX.setText("PEMEX");
        rdbtnServiciosDeSaludPEMEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludPEMEXActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludSEDENA);
        rdbtnServiciosDeSaludSEDENA.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludSEDENA.setText("SEDENA");
        rdbtnServiciosDeSaludSEDENA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludSEDENAActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludSEMAR);
        rdbtnServiciosDeSaludSEMAR.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludSEMAR.setText("SEMAR");
        rdbtnServiciosDeSaludSEMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludSEMARActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludIMSSBIENESTAR);
        rdbtnServiciosDeSaludIMSSBIENESTAR.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludIMSSBIENESTAR.setText("IMSS BIENESTAR");
        rdbtnServiciosDeSaludIMSSBIENESTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludIMSSBIENESTARActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludISSFAM);
        rdbtnServiciosDeSaludISSFAM.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludISSFAM.setText("ISSFAM");
        rdbtnServiciosDeSaludISSFAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludISSFAMActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludSeIgnora);
        rdbtnServiciosDeSaludSeIgnora.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludSeIgnora.setText("Se ignora");
        rdbtnServiciosDeSaludSeIgnora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludSeIgnoraActionPerformed(evt);
            }
        });

        buttonGroupAfiliacionServiciosSalud.add(rdbtnServiciosDeSaludOtra);
        rdbtnServiciosDeSaludOtra.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnServiciosDeSaludOtra.setText("Otra");
        rdbtnServiciosDeSaludOtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnServiciosDeSaludOtraActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel49.setText("Especifique:");

        txtServiciosDeSaludEspecifique.setEditable(false);
        txtServiciosDeSaludEspecifique.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtServiciosDeSaludEspecifique.setEnabled(false);

        jLabel50.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel50.setText("Número de seguridad social o afiliación:");

        txtNumeroSeguridadSocial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel48))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnServiciosDeSaludNinguna)
                            .addComponent(rdbtnServiciosDeSaludIMSS))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnServiciosDeSaludISSSTE)
                            .addComponent(rdbtnServiciosDeSaludPEMEX))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdbtnServiciosDeSaludSEDENA)
                            .addComponent(rdbtnServiciosDeSaludSEMAR))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnServiciosDeSaludISSFAM)
                            .addComponent(rdbtnServiciosDeSaludIMSSBIENESTAR))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(rdbtnServiciosDeSaludOtra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(txtServiciosDeSaludEspecifique, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(rdbtnServiciosDeSaludSeIgnora)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(64, 64, 64))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroSeguridadSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnServiciosDeSaludNinguna)
                    .addComponent(rdbtnServiciosDeSaludISSSTE)
                    .addComponent(rdbtnServiciosDeSaludSEDENA)
                    .addComponent(rdbtnServiciosDeSaludIMSSBIENESTAR)
                    .addComponent(rdbtnServiciosDeSaludSeIgnora))
                .addGap(9, 9, 9)
                .addComponent(jLabel49)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnServiciosDeSaludIMSS)
                    .addComponent(rdbtnServiciosDeSaludPEMEX)
                    .addComponent(rdbtnServiciosDeSaludSEMAR)
                    .addComponent(rdbtnServiciosDeSaludISSFAM)
                    .addComponent(rdbtnServiciosDeSaludOtra)
                    .addComponent(txtServiciosDeSaludEspecifique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtNumeroSeguridadSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnSiguienteVista6.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista6.setText("Siguiente");
        btnSiguienteVista6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista6ActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(183, 225, 248));

        jLabel52.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel52.setText("Nombre (s)");

        jLabel53.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel53.setText("Apellido Paterno");

        jLabel54.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel54.setText("Apellido Materno");

        txtNombreInf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApellidoMaternoInf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApellidoPaternoInf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel55.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel55.setText("DEL INF");

        jLabel197.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel197.setText("16. Nombre");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(txtNombreInf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(txtApellidoPaternoInf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(txtApellidoMaternoInf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addGap(323, 323, 323)
                .addComponent(jLabel197)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGap(183, 183, 183)
                .addComponent(jLabel54)
                .addGap(135, 135, 135))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel197))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreInf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoPaternoInf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoMaternoInf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel52)
                        .addGap(36, 36, 36))))
        );

        btnRegresarVista6.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista6.setText("Regresar");
        btnRegresarVista6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista6Layout = new javax.swing.GroupLayout(jPanelVista6);
        jPanelVista6.setLayout(jPanelVista6Layout);
        jPanelVista6Layout.setHorizontalGroup(
            jPanelVista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista6Layout.createSequentialGroup()
                .addGroup(jPanelVista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista6Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanelVista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelVista6Layout.createSequentialGroup()
                                .addComponent(btnRegresarVista6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguienteVista6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanelVista6Layout.setVerticalGroup(
            jPanelVista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanelVista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista6)
                    .addComponent(btnRegresarVista6))
                .addGap(16, 16, 16))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab6", jPanelVista6);

        jPanelVista7.setBackground(new java.awt.Color(0, 51, 102));

        jPanel24.setBackground(new java.awt.Color(183, 225, 248));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel51)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel51)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(183, 225, 248));

        jLabel56.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel56.setText("18. Firma de la (el) informante");

        txtFirmaInformante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel57.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel57.setText("17. Parentesco con la (el) fallecida/o");

        txtParentescoFamiliar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel56)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(txtParentescoFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFirmaInformante, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirmaInformante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParentescoFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jPanel26.setBackground(new java.awt.Color(183, 225, 248));

        jLabel58.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel58.setText("DE LA DEFUNCIÓN ");

        buttonGroupSitioDefuncion.add(rdbtnDefuncionSecretariaSalud);
        rdbtnDefuncionSecretariaSalud.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionSecretariaSalud.setText("Secretaría de Salud");
        rdbtnDefuncionSecretariaSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionSecretariaSaludActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionImssBienestar);
        rdbtnDefuncionImssBienestar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionImssBienestar.setText("IMSS BIENESTAR");
        rdbtnDefuncionImssBienestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionImssBienestarActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionImss);
        rdbtnDefuncionImss.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionImss.setText("IMSS");
        rdbtnDefuncionImss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionImssActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionIssste);
        rdbtnDefuncionIssste.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionIssste.setText("ISSSTE");
        rdbtnDefuncionIssste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionIsssteActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionPemex);
        rdbtnDefuncionPemex.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionPemex.setText("PEMEX");
        rdbtnDefuncionPemex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionPemexActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionSedena);
        rdbtnDefuncionSedena.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionSedena.setText("SEDENA");
        rdbtnDefuncionSedena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionSedenaActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionSemar);
        rdbtnDefuncionSemar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionSemar.setText("SEMAR");
        rdbtnDefuncionSemar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionSemarActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionOtraUnidadMedica);
        rdbtnDefuncionOtraUnidadMedica.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionOtraUnidadMedica.setText("Otra unidad médica pública");
        rdbtnDefuncionOtraUnidadMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionOtraUnidadMedicaActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionUnidadMedicaPrivada);
        rdbtnDefuncionUnidadMedicaPrivada.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionUnidadMedicaPrivada.setText("Unidad médica privada");
        rdbtnDefuncionUnidadMedicaPrivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionUnidadMedicaPrivadaActionPerformed(evt);
            }
        });

        txtDefuncionNombreUnidadMedica.setEditable(false);
        txtDefuncionNombreUnidadMedica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDefuncionNombreUnidadMedica.setEnabled(false);

        txtDefuncionClaveUnicaEstablecimientos.setEditable(false);
        txtDefuncionClaveUnicaEstablecimientos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDefuncionClaveUnicaEstablecimientos.setEnabled(false);
        txtDefuncionClaveUnicaEstablecimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDefuncionClaveUnicaEstablecimientosActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel59.setText("Nombre de la unidad médica");

        jLabel60.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel60.setText("Clave Unica de Establecimientos de Salud");

        jSeparator33.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator33.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator33.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonGroupSitioDefuncion.add(rdbtnDefuncionViaPublica);
        rdbtnDefuncionViaPublica.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionViaPublica.setText("Vía Pública");
        rdbtnDefuncionViaPublica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionViaPublicaActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionHogar);
        rdbtnDefuncionHogar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionHogar.setText("Hogar");
        rdbtnDefuncionHogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionHogarActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionOtroLugar);
        rdbtnDefuncionOtroLugar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionOtroLugar.setText("Otro lugar");
        rdbtnDefuncionOtroLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionOtroLugarActionPerformed(evt);
            }
        });

        buttonGroupSitioDefuncion.add(rdbtnDefuncionSeIgnora);
        rdbtnDefuncionSeIgnora.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnDefuncionSeIgnora.setText("Se ignora");
        rdbtnDefuncionSeIgnora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDefuncionSeIgnoraActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel62.setText("19. Sitio donde sucedió la defunción");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnDefuncionSecretariaSalud)
                            .addComponent(rdbtnDefuncionImssBienestar)
                            .addComponent(rdbtnDefuncionImss))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbtnDefuncionIssste)
                                    .addComponent(rdbtnDefuncionPemex)
                                    .addComponent(rdbtnDefuncionSedena))
                                .addGap(126, 126, 126)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbtnDefuncionOtraUnidadMedica)
                                    .addComponent(rdbtnDefuncionSemar)
                                    .addComponent(rdbtnDefuncionUnidadMedicaPrivada)))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txtDefuncionClaveUnicaEstablecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel58)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel62))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel59))
                        .addGap(28, 28, 28)
                        .addComponent(txtDefuncionNombreUnidadMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnDefuncionViaPublica)
                    .addComponent(rdbtnDefuncionHogar)
                    .addComponent(rdbtnDefuncionOtroLugar)
                    .addComponent(rdbtnDefuncionSeIgnora))
                .addGap(79, 79, 79))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnDefuncionSecretariaSalud)
                            .addComponent(rdbtnDefuncionIssste)
                            .addComponent(rdbtnDefuncionSemar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnDefuncionImssBienestar)
                            .addComponent(rdbtnDefuncionPemex)
                            .addComponent(rdbtnDefuncionOtraUnidadMedica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnDefuncionImss)
                            .addComponent(rdbtnDefuncionSedena)
                            .addComponent(rdbtnDefuncionUnidadMedicaPrivada))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(txtDefuncionNombreUnidadMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDefuncionClaveUnicaEstablecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator33)))
                .addContainerGap())
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(rdbtnDefuncionViaPublica)
                .addGap(29, 29, 29)
                .addComponent(rdbtnDefuncionHogar)
                .addGap(26, 26, 26)
                .addComponent(rdbtnDefuncionOtroLugar)
                .addGap(26, 26, 26)
                .addComponent(rdbtnDefuncionSeIgnora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSiguienteVista7.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista7.setText("Siguiente");
        btnSiguienteVista7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista7ActionPerformed(evt);
            }
        });

        btnRegresarVista7.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista7.setText("Regresar");
        btnRegresarVista7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista7Layout = new javax.swing.GroupLayout(jPanelVista7);
        jPanelVista7.setLayout(jPanelVista7Layout);
        jPanelVista7Layout.setHorizontalGroup(
            jPanelVista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(jPanelVista7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelVista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista7Layout.createSequentialGroup()
                        .addComponent(btnRegresarVista7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguienteVista7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanelVista7Layout.createSequentialGroup()
                        .addGroup(jPanelVista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        jPanelVista7Layout.setVerticalGroup(
            jPanelVista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista7)
                    .addComponent(btnRegresarVista7))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab7", jPanelVista7);

        jPanelVista8.setBackground(new java.awt.Color(0, 51, 102));

        jPanel27.setBackground(new java.awt.Color(183, 225, 248));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel61)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel61)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(183, 225, 248));

        jLabel63.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel63.setText("20. Domicilio donde sucedió la defunción");

        jLabel64.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel64.setText("Tipo de vialidad");

        jLabel65.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel65.setText("Nombre de la vialidad");

        jLabel66.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel66.setText("Num. Ext");

        jLabel67.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel67.setText("Num.Int");

        jLabel68.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel68.setText("Código Postal");

        jLabel69.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel69.setText("Tipo de asentamiento humano");

        jLabel70.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel70.setText("Nombre del asentamiento humano");

        jLabel71.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel71.setText("Localidad");

        jLabel72.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel72.setText("Municipio o alcaldía");

        jLabel73.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel73.setText("Entidad federativa");

        txtNombreVialidadDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombreVialidadDefuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVialidadDefuncionActionPerformed(evt);
            }
        });

        txtNumExtDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTipoVialidadDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoPostalDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTipoAsentamientoHumanoDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreAsentamientoHumanoDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtLocalidadDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMunicipioDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEntidadFederativaDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumIntDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel64)
                .addGap(126, 126, 126)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtNumExtDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(txtNumIntDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel66)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel68)
                        .addGap(82, 82, 82))))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoAsentamientoHumanoDefuncion)
                    .addComponent(txtTipoVialidadDefuncion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(txtNombreAsentamientoHumanoDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(txtLocalidadDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreVialidadDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(txtMunicipioDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEntidadFederativaDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoPostalDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel70)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel71)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel73)
                        .addGap(71, 71, 71))))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel63)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addGap(72, 72, 72)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPostalDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumIntDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumExtDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreVialidadDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoVialidadDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68))
                .addGap(43, 43, 43)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoAsentamientoHumanoDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreAsentamientoHumanoDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipioDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntidadFederativaDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalidadDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        btnSiguienteVista8.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista8.setText("Siguiente");
        btnSiguienteVista8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista8ActionPerformed(evt);
            }
        });

        btnRegresarVista8.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista8.setText("Regresar");
        btnRegresarVista8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista8Layout = new javax.swing.GroupLayout(jPanelVista8);
        jPanelVista8.setLayout(jPanelVista8Layout);
        jPanelVista8Layout.setHorizontalGroup(
            jPanelVista8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelVista8Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnRegresarVista8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguienteVista8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanelVista8Layout.setVerticalGroup(
            jPanelVista8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVista8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista8)
                    .addComponent(btnRegresarVista8))
                .addGap(40, 40, 40))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab8", jPanelVista8);

        jPanelVista9.setBackground(new java.awt.Color(0, 51, 102));

        jPanel29.setBackground(new java.awt.Color(183, 225, 248));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel74.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel74)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel74)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(183, 225, 248));

        jLabel75.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel75.setText("21. Fecha y hora de la defunción");

        jLabel76.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel76.setText("Día");

        jLabel77.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel77.setText("Mes");

        jLabel78.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel78.setText("Año");

        jLabel79.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel79.setText("Horas");

        jLabel80.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel80.setText("Minutos");

        txtDiaDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDiaDefuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaDefuncionActionPerformed(evt);
            }
        });

        txtMesDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAñoDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtHorasDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMinutosDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMinutosDefuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutosDefuncionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtDiaDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(txtMesDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(txtAñoDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(txtHorasDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel78)
                    .addComponent(txtMinutosDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel75)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel75)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMesDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAñoDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorasDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinutosDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80))
                .addGap(28, 28, 28))
        );

        jPanel31.setBackground(new java.awt.Color(183, 225, 248));

        jLabel81.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel81.setText("22. ¿Tuvo atención médica durante la");

        buttonGroupAtencionMedicaDuranteEnfermedad.add(rdbtnSiAtencionMedica);
        rdbtnSiAtencionMedica.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSiAtencionMedica.setText("Si");

        buttonGroupAtencionMedicaDuranteEnfermedad.add(rdbtnNoAtencionMedica);
        rdbtnNoAtencionMedica.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnNoAtencionMedica.setText("No");
        rdbtnNoAtencionMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoAtencionMedicaActionPerformed(evt);
            }
        });

        buttonGroupAtencionMedicaDuranteEnfermedad.add(rdbtnSeIgnoraAtencionMedica);
        rdbtnSeIgnoraAtencionMedica.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraAtencionMedica.setText("Se ignora");

        jLabel82.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel82.setText("enfermedad o lesión antes de la muerte? ");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(rdbtnSiAtencionMedica)
                        .addGap(80, 80, 80)
                        .addComponent(rdbtnNoAtencionMedica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbtnSeIgnoraAtencionMedica)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel81)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addGap(29, 29, 29)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSiAtencionMedica)
                    .addComponent(rdbtnNoAtencionMedica)
                    .addComponent(rdbtnSeIgnoraAtencionMedica))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(183, 225, 248));

        jLabel83.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel83.setText("23. ¿Se realizó una cirugía en las últimas cuatro semanas?");

        buttonGroupRealizoCirugia.add(rdbtnSiRealizoCirugia);
        rdbtnSiRealizoCirugia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSiRealizoCirugia.setText("Si");
        rdbtnSiRealizoCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiRealizoCirugiaActionPerformed(evt);
            }
        });

        buttonGroupRealizoCirugia.add(rdbtnNoRealizoCirugia);
        rdbtnNoRealizoCirugia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnNoRealizoCirugia.setText("No");
        rdbtnNoRealizoCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoRealizoCirugiaActionPerformed(evt);
            }
        });

        buttonGroupRealizoCirugia.add(rdbtnSeIgnoraRealizoCirugia);
        rdbtnSeIgnoraRealizoCirugia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraRealizoCirugia.setText("Se ignora");
        rdbtnSeIgnoraRealizoCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSeIgnoraRealizoCirugiaActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel84.setText("Día");

        jLabel85.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel85.setText("Mes");

        jLabel86.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel86.setText("Año");

        txtMesRealizoCirugia.setEditable(false);
        txtMesRealizoCirugia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMesRealizoCirugia.setEnabled(false);
        txtMesRealizoCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesRealizoCirugiaActionPerformed(evt);
            }
        });

        txtAñoRealizoCirugia.setEditable(false);
        txtAñoRealizoCirugia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAñoRealizoCirugia.setEnabled(false);
        txtAñoRealizoCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoRealizoCirugiaActionPerformed(evt);
            }
        });

        txtDiaRealizoCirugia.setEditable(false);
        txtDiaRealizoCirugia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDiaRealizoCirugia.setEnabled(false);
        txtDiaRealizoCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaRealizoCirugiaActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel87.setText("Motivo de la cirugía");

        txtMotivoCirugia.setEditable(false);
        txtMotivoCirugia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMotivoCirugia.setEnabled(false);
        txtMotivoCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoCirugiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel32Layout.createSequentialGroup()
                            .addComponent(rdbtnSeIgnoraRealizoCirugia)
                            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel32Layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(txtMotivoCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel32Layout.createSequentialGroup()
                                    .addGap(123, 123, 123)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rdbtnSiRealizoCirugia)
                                .addComponent(rdbtnNoRealizoCirugia))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel32Layout.createSequentialGroup()
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82)
                                    .addComponent(jLabel85)
                                    .addGap(127, 127, 127)
                                    .addComponent(jLabel86)
                                    .addGap(30, 30, 30))
                                .addGroup(jPanel32Layout.createSequentialGroup()
                                    .addComponent(txtDiaRealizoCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMesRealizoCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtAñoRealizoCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel83))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(rdbtnSiRealizoCirugia)
                                .addGap(0, 0, 0)
                                .addComponent(rdbtnNoRealizoCirugia))
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(txtAñoRealizoCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel86)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMesRealizoCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaRealizoCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85))
                        .addGap(23, 23, 23)))
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(rdbtnSeIgnoraRealizoCirugia)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtMotivoCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel87)
                        .addGap(16, 16, 16))))
        );

        jPanel33.setBackground(new java.awt.Color(183, 225, 248));

        jLabel88.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel88.setText("24. ¿Fué defunción accidental o violenta?");

        buttonGroupDefuncionAccidental.add(rdbtnSiDefuncionAccidentalViolenta);
        rdbtnSiDefuncionAccidentalViolenta.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSiDefuncionAccidentalViolenta.setText("Si");

        buttonGroupDefuncionAccidental.add(rdbtnNoDefuncionAccidentalViolenta);
        rdbtnNoDefuncionAccidentalViolenta.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnNoDefuncionAccidentalViolenta.setText("No");
        rdbtnNoDefuncionAccidentalViolenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoDefuncionAccidentalViolentaActionPerformed(evt);
            }
        });

        buttonGroupDefuncionAccidental.add(rdbtnSeIgnoraDefuncionAccidentalViolenta);
        rdbtnSeIgnoraDefuncionAccidentalViolenta.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraDefuncionAccidentalViolenta.setText("Se ignora");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(rdbtnSiDefuncionAccidentalViolenta)
                        .addGap(80, 80, 80)
                        .addComponent(rdbtnNoDefuncionAccidentalViolenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(rdbtnSeIgnoraDefuncionAccidentalViolenta)
                        .addGap(31, 31, 31))))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel88)
                .addGap(60, 60, 60)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSiDefuncionAccidentalViolenta)
                    .addComponent(rdbtnNoDefuncionAccidentalViolenta)
                    .addComponent(rdbtnSeIgnoraDefuncionAccidentalViolenta))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSiguienteVista9.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista9.setText("Siguiente");
        btnSiguienteVista9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista9ActionPerformed(evt);
            }
        });

        btnRegresarVista9.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista9.setText("Regresar");
        btnRegresarVista9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista9Layout = new javax.swing.GroupLayout(jPanelVista9);
        jPanelVista9.setLayout(jPanelVista9Layout);
        jPanelVista9Layout.setHorizontalGroup(
            jPanelVista9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelVista9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresarVista9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanelVista9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguienteVista9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanelVista9Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVista9Layout.setVerticalGroup(
            jPanelVista9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVista9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVista9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVista9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista9)
                    .addComponent(btnRegresarVista9))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab9", jPanelVista9);

        jPanelVista10.setBackground(new java.awt.Color(0, 51, 102));

        jPanel34.setBackground(new java.awt.Color(183, 225, 248));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel89.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel89)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel89)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(183, 225, 248));

        buttonGroupTipoDefuncion.add(rdbtnTipoDefuncionEnfermedad);
        rdbtnTipoDefuncionEnfermedad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnTipoDefuncionEnfermedad.setText("Enfermedad");
        rdbtnTipoDefuncionEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTipoDefuncionEnfermedadActionPerformed(evt);
            }
        });

        buttonGroupTipoDefuncion.add(rdbtnTipoDefuncionAccidente);
        rdbtnTipoDefuncionAccidente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnTipoDefuncionAccidente.setText("Accidente");
        rdbtnTipoDefuncionAccidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTipoDefuncionAccidenteActionPerformed(evt);
            }
        });

        buttonGroupTipoDefuncion.add(rdbtnTipoDefuncionAgresion);
        rdbtnTipoDefuncionAgresion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnTipoDefuncionAgresion.setText("Agresión");

        buttonGroupTipoDefuncion.add(rdbtnTipoDefuncionIntencionalmente);
        rdbtnTipoDefuncionIntencionalmente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnTipoDefuncionIntencionalmente.setText("Lesiones autoinflijidas intencionalmente");

        buttonGroupTipoDefuncion.add(rdbtnTipoDefuncionIntervencionLegal);
        rdbtnTipoDefuncionIntervencionLegal.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnTipoDefuncionIntervencionLegal.setText("Intervención legal");
        rdbtnTipoDefuncionIntervencionLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTipoDefuncionIntervencionLegalActionPerformed(evt);
            }
        });

        buttonGroupTipoDefuncion.add(rdbtnTipoDefuncionSeIgnora);
        rdbtnTipoDefuncionSeIgnora.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnTipoDefuncionSeIgnora.setText("Se ignora");
        rdbtnTipoDefuncionSeIgnora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTipoDefuncionSeIgnoraActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel90.setText("25. Tipo de defunción");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnTipoDefuncionEnfermedad)
                .addGap(79, 79, 79)
                .addComponent(rdbtnTipoDefuncionAccidente)
                .addGap(78, 78, 78)
                .addComponent(rdbtnTipoDefuncionAgresion)
                .addGap(60, 60, 60)
                .addComponent(rdbtnTipoDefuncionIntencionalmente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbtnTipoDefuncionIntervencionLegal)
                .addGap(50, 50, 50)
                .addComponent(rdbtnTipoDefuncionSeIgnora)
                .addGap(22, 22, 22))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLabel90)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnTipoDefuncionEnfermedad)
                    .addComponent(rdbtnTipoDefuncionAccidente)
                    .addComponent(rdbtnTipoDefuncionAgresion)
                    .addComponent(rdbtnTipoDefuncionIntencionalmente)
                    .addComponent(rdbtnTipoDefuncionIntervencionLegal)
                    .addComponent(rdbtnTipoDefuncionSeIgnora))
                .addGap(16, 16, 16))
        );

        jPanel35.setBackground(new java.awt.Color(183, 225, 248));

        jLabel91.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel91.setText("26. Causas de la defunción (Anote una sola causa en cada renglón. Evite señalar modos de morir -Ejemplo: paro cardiaco, astenia, etc)");

        jLabel92.setText("PARTE I");

        jLabel93.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel93.setText("Reporte la enfermedad o condición");

        jLabel94.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel94.setText("causante directamente de defunción ");

        jLabel95.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel95.setText("en línea a)");

        jLabel96.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel96.setText("Debido a (o como consecuencia de)");

        jLabel97.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel97.setText("a)");

        jLabel98.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel98.setText("eventos en debido orden (si aplica). ");

        jLabel99.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel99.setText("Reporte la cadena de afecciones o ");

        jLabel100.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel100.setText("línea utilizada.");

        jLabel101.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel101.setText("Anote la causa básica en la última ");

        jLabel102.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel102.setText("Debido a (o como consecuencia de)");

        jLabel103.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel103.setText("Debido a (o como consecuencia de)");

        jLabel104.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel104.setText("b)");

        jLabel105.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel105.setText("c)");

        jLabel106.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel106.setText("d)");

        txtCausaDefuncionA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCausaDefuncionB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCausaDefuncionC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCausaDefuncionD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCausaDefuncionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCausaDefuncionDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(224, 224, 224)
                                .addComponent(txtCausaDefuncionD))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCausaDefuncionC)
                                    .addComponent(txtCausaDefuncionB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel92))
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(jLabel91))
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addGap(375, 375, 375)
                            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(56, 56, 56)
                            .addComponent(jLabel96)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCausaDefuncionA, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel92)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel93))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCausaDefuncionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96)
                            .addComponent(jLabel97))))
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel95))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCausaDefuncionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102)
                            .addComponent(jLabel104))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel99))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(jLabel105)
                            .addComponent(txtCausaDefuncionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(txtCausaDefuncionD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGap(4, 4, 4)
                .addComponent(jLabel100)
                .addContainerGap())
        );

        btnSiguienteVista10.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista10.setText("Siguiente");
        btnSiguienteVista10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista10ActionPerformed(evt);
            }
        });

        btnRegresarVista10.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista10.setText("Regresar");
        btnRegresarVista10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista10Layout = new javax.swing.GroupLayout(jPanelVista10);
        jPanelVista10.setLayout(jPanelVista10Layout);
        jPanelVista10Layout.setHorizontalGroup(
            jPanelVista10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVista10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnRegresarVista10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguienteVista10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanelVista10Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVista10Layout.setVerticalGroup(
            jPanelVista10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVista10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista10)
                    .addComponent(btnRegresarVista10))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab10", jPanelVista10);

        jPanelVista11.setBackground(new java.awt.Color(0, 51, 102));

        jPanel39.setBackground(new java.awt.Color(183, 225, 248));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel107.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel107)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel107)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(183, 225, 248));

        jLabel110.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel110.setText("Intervalo aproximado entre en inicio de la enfermedad y la defunción");

        txtIntervaloEnfermedadDefuncionB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtIntervaloEnfermedadDefuncionA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtIntervaloEnfermedadDefuncionC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator56.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator56.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator56.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel111.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel111.setText("Uso exclusivo del personal codificador");

        txtCodigoCieC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoCieA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoCieB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel112.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel112.setText("Código CIE");

        txtIntervaloEnfermedadDefuncionD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoCieD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel110)
                    .addComponent(txtIntervaloEnfermedadDefuncionC, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntervaloEnfermedadDefuncionD, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntervaloEnfermedadDefuncionB, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntervaloEnfermedadDefuncionA, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoCieC, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCieD, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCieB, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCieA, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel112)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel112)
                        .addGap(16, 16, 16)
                        .addComponent(txtCodigoCieA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txtCodigoCieB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txtCodigoCieC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtCodigoCieD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addGap(33, 33, 33)
                        .addComponent(txtIntervaloEnfermedadDefuncionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIntervaloEnfermedadDefuncionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIntervaloEnfermedadDefuncionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(txtIntervaloEnfermedadDefuncionD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator56)
        );

        jPanel37.setBackground(new java.awt.Color(183, 225, 248));

        jLabel113.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel113.setText("Otras condiciones o estados patológicos");

        jLabel114.setText("PARTE II.");

        jLabel115.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel115.setText("significativos que no pertenecen a la parte I,");

        jLabel116.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel116.setText("pero que su presencia contribuyó a la defunción  ");

        jLabel117.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel117.setText("(el intervalo de tiempo puede incluirse después del estado patológico) ");

        txtOtrasCondiciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoCieIntervaloTiempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel114)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(jLabel113))
                        .addGap(78, 78, 78)
                        .addComponent(txtOtrasCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtCodigoCieIntervaloTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel116)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel117)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel116))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOtrasCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCieIntervaloTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnSiguienteVista11.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista11.setText("Siguiente");
        btnSiguienteVista11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista11ActionPerformed(evt);
            }
        });

        btnRegresarVista11.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista11.setText("Regresar");
        btnRegresarVista11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista11Layout = new javax.swing.GroupLayout(jPanelVista11);
        jPanelVista11.setLayout(jPanelVista11Layout);
        jPanelVista11Layout.setHorizontalGroup(
            jPanelVista11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista11Layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista11Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnRegresarVista11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguienteVista11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanelVista11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelVista11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVista11Layout.setVerticalGroup(
            jPanelVista11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVista11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista11)
                    .addComponent(btnRegresarVista11))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab11", jPanelVista11);

        jPanelVista12.setBackground(new java.awt.Color(0, 51, 102));

        jPanel40.setBackground(new java.awt.Color(183, 225, 248));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel108.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel108)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel108)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(183, 225, 248));

        buttonGroupPracticoNecropsia.add(rdbtnSiPracticoNecropsia);
        rdbtnSiPracticoNecropsia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSiPracticoNecropsia.setText("Si");
        rdbtnSiPracticoNecropsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiPracticoNecropsiaActionPerformed(evt);
            }
        });

        buttonGroupHallazgosEnCertificacion.add(rdbtnSiUtilizaronHallazgos);
        rdbtnSiUtilizaronHallazgos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSiUtilizaronHallazgos.setText("Si");
        rdbtnSiUtilizaronHallazgos.setEnabled(false);
        rdbtnSiUtilizaronHallazgos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiUtilizaronHallazgosActionPerformed(evt);
            }
        });

        buttonGroupHallazgosEnCertificacion.add(rdbtnNoUtilizaronHallazgos);
        rdbtnNoUtilizaronHallazgos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnNoUtilizaronHallazgos.setText("No");
        rdbtnNoUtilizaronHallazgos.setEnabled(false);
        rdbtnNoUtilizaronHallazgos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoUtilizaronHallazgosActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel119.setText("¿Los hallazgos se utilizaron en la certificación?");

        buttonGroupPracticoNecropsia.add(rdbtnNoPracticoNecropsia);
        rdbtnNoPracticoNecropsia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnNoPracticoNecropsia.setText("No");
        rdbtnNoPracticoNecropsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoPracticoNecropsiaActionPerformed(evt);
            }
        });

        buttonGroupPracticoNecropsia.add(rdbtnSeIgnoraPracticoNecropsia);
        rdbtnSeIgnoraPracticoNecropsia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSeIgnoraPracticoNecropsia.setText("Se ignora");
        rdbtnSeIgnoraPracticoNecropsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSeIgnoraPracticoNecropsiaActionPerformed(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel125.setText("27. ¿Se practicó necropsia?");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addComponent(rdbtnSiPracticoNecropsia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbtnSiUtilizaronHallazgos)
                        .addGap(50, 50, 50)
                        .addComponent(rdbtnNoUtilizaronHallazgos)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnNoPracticoNecropsia)
                            .addComponent(rdbtnSeIgnoraPracticoNecropsia))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel125)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel125)
                .addGap(18, 18, 18)
                .addComponent(jLabel119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnSiUtilizaronHallazgos)
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbtnNoUtilizaronHallazgos)
                        .addComponent(rdbtnSiPracticoNecropsia)))
                .addGap(18, 18, 18)
                .addComponent(rdbtnNoPracticoNecropsia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbtnSeIgnoraPracticoNecropsia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel42.setBackground(new java.awt.Color(183, 225, 248));
        jPanel42.setEnabled(false);

        jLabel120.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel120.setText("28. Si la defunción corresponde a una mujer de 10 a 54 años ");

        jLabel121.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel121.setText("Especifique si la muerte ocurrió durante:");

        buttonGroupMuerteDurante.add(rdbtnMuerteDuranteEmbarazo);
        rdbtnMuerteDuranteEmbarazo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnMuerteDuranteEmbarazo.setText("El embarazo");
        rdbtnMuerteDuranteEmbarazo.setEnabled(false);

        buttonGroupMuerteDurante.add(rdbtnMuerteDuranteParto);
        rdbtnMuerteDuranteParto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnMuerteDuranteParto.setText("El parto");
        rdbtnMuerteDuranteParto.setEnabled(false);

        buttonGroupMuerteDurante.add(rdbtnMuerteDurantePuerperio);
        rdbtnMuerteDurantePuerperio.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnMuerteDurantePuerperio.setText("El puerperio");
        rdbtnMuerteDurantePuerperio.setEnabled(false);

        buttonGroupMuerteDurante.add(rdbtnMuerteDespuesPartoAborto);
        rdbtnMuerteDespuesPartoAborto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnMuerteDespuesPartoAborto.setText("43 días a 11 meses después del parto o aborto");
        rdbtnMuerteDespuesPartoAborto.setEnabled(false);
        rdbtnMuerteDespuesPartoAborto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMuerteDespuesPartoAbortoActionPerformed(evt);
            }
        });

        buttonGroupMuerteDurante.add(rdbtnNoEstuvoEmbarazadaPreviamente);
        rdbtnNoEstuvoEmbarazadaPreviamente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnNoEstuvoEmbarazadaPreviamente.setText("No estuvo embarazada en los últimos 11 meses previos a la defunción");
        rdbtnNoEstuvoEmbarazadaPreviamente.setEnabled(false);

        jSeparator64.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator64.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator64.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel122.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel122.setText("¿Las causas anotadas fueron complicaciones");

        jLabel123.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel123.setText("propias del embarazo, parto o puerperio?");

        buttonGroupCausasQueComplicacion.add(rdbtnSiComplicaciones);
        rdbtnSiComplicaciones.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSiComplicaciones.setText("Si");
        rdbtnSiComplicaciones.setEnabled(false);
        rdbtnSiComplicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiComplicacionesActionPerformed(evt);
            }
        });

        buttonGroupCausasQueComplicacion.add(rdbtnNoComplicaciones);
        rdbtnNoComplicaciones.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnNoComplicaciones.setText("No");
        rdbtnNoComplicaciones.setEnabled(false);

        jSeparator65.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator65.setForeground(new java.awt.Color(0, 0, 0));

        jLabel124.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel124.setText("Las causas anotadas complicaron el embarazo, parto o puerperio?");

        buttonGroupComplicacionesPropias.add(rdbtnSiComplicacionesPropias);
        rdbtnSiComplicacionesPropias.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSiComplicacionesPropias.setText("Si");
        rdbtnSiComplicacionesPropias.setEnabled(false);
        rdbtnSiComplicacionesPropias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiComplicacionesPropiasActionPerformed(evt);
            }
        });

        buttonGroupComplicacionesPropias.add(rdbtnNoComplicacionesPropias);
        rdbtnNoComplicacionesPropias.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnNoComplicacionesPropias.setText("No");
        rdbtnNoComplicacionesPropias.setEnabled(false);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jSeparator65, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel121))
                            .addComponent(rdbtnMuerteDurantePuerperio)
                            .addComponent(rdbtnMuerteDespuesPartoAborto)
                            .addComponent(rdbtnMuerteDuranteParto)
                            .addComponent(rdbtnNoEstuvoEmbarazadaPreviamente)
                            .addComponent(rdbtnMuerteDuranteEmbarazo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator64, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel122)
                                    .addComponent(jLabel123))
                                .addContainerGap(12, Short.MAX_VALUE))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(rdbtnSiComplicacionesPropias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdbtnNoComplicacionesPropias)
                                .addGap(42, 42, 42))))))
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel124))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(rdbtnSiComplicaciones)
                        .addGap(132, 132, 132)
                        .addComponent(rdbtnNoComplicaciones))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel120)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel120)
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addGap(24, 24, 24)
                        .addComponent(rdbtnMuerteDuranteEmbarazo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnMuerteDuranteParto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnMuerteDurantePuerperio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnMuerteDespuesPartoAborto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnNoEstuvoEmbarazadaPreviamente))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel123)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnSiComplicacionesPropias)
                            .addComponent(rdbtnNoComplicacionesPropias)))
                    .addComponent(jSeparator64, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator65, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel124)
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSiComplicaciones)
                    .addComponent(rdbtnNoComplicaciones))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel43.setBackground(new java.awt.Color(183, 225, 248));

        jLabel118.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel118.setText("muerte encefálica?");

        jLabel126.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel126.setText("29. ¿La (el) fallecido presentó");

        buttonGroupMuerteEncefalica.add(rdbtnSiMuerteEncefalica);
        rdbtnSiMuerteEncefalica.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSiMuerteEncefalica.setText("Si");
        rdbtnSiMuerteEncefalica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiMuerteEncefalicaActionPerformed(evt);
            }
        });

        buttonGroupDonadorOrganos.add(rdbtnNoDonadorOrganos);
        rdbtnNoDonadorOrganos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnNoDonadorOrganos.setText("No");
        rdbtnNoDonadorOrganos.setEnabled(false);
        rdbtnNoDonadorOrganos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoDonadorOrganosActionPerformed(evt);
            }
        });

        jLabel127.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel127.setText("¿Fué donador de órganos?");

        buttonGroupDonadorOrganos.add(rdbtnSiDonadorOrganos);
        rdbtnSiDonadorOrganos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSiDonadorOrganos.setText("Si");
        rdbtnSiDonadorOrganos.setEnabled(false);
        rdbtnSiDonadorOrganos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSiDonadorOrganosActionPerformed(evt);
            }
        });

        buttonGroupMuerteEncefalica.add(rdbtnNoMuerteEncefalica);
        rdbtnNoMuerteEncefalica.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnNoMuerteEncefalica.setText("No");
        rdbtnNoMuerteEncefalica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoMuerteEncefalicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(rdbtnSiMuerteEncefalica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbtnNoMuerteEncefalica)
                .addGap(82, 82, 82))
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(rdbtnSiDonadorOrganos)
                                .addGap(57, 57, 57)
                                .addComponent(rdbtnNoDonadorOrganos))
                            .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSiMuerteEncefalica)
                    .addComponent(rdbtnNoMuerteEncefalica))
                .addGap(18, 18, 18)
                .addComponent(jLabel127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSiDonadorOrganos)
                    .addComponent(rdbtnNoDonadorOrganos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSiguienteVista12.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista12.setText("Siguiente");
        btnSiguienteVista12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista12ActionPerformed(evt);
            }
        });

        btnRegresarVista12.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista12.setText("Regresar");
        btnRegresarVista12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista12Layout = new javax.swing.GroupLayout(jPanelVista12);
        jPanelVista12.setLayout(jPanelVista12Layout);
        jPanelVista12Layout.setHorizontalGroup(
            jPanelVista12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista12Layout.createSequentialGroup()
                .addGroup(jPanelVista12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelVista12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista12Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnRegresarVista12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguienteVista12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanelVista12Layout.setVerticalGroup(
            jPanelVista12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVista12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelVista12Layout.createSequentialGroup()
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVista12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista12)
                    .addComponent(btnRegresarVista12))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab12", jPanelVista12);

        jPanelVista13.setBackground(new java.awt.Color(0, 51, 102));

        jPanel41.setBackground(new java.awt.Color(183, 225, 248));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel109.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel109)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel109)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel44.setBackground(new java.awt.Color(183, 225, 248));

        jLabel128.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel128.setText("30. Causa básica de defunción");

        jLabel129.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel129.setText("Código CIE");

        jLabel130.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel130.setText("Código adicional");

        txtCausaBasicaDefuncion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoAdicional.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel129)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel128))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel130)
                            .addComponent(txtCausaBasicaDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCausaBasicaDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel45.setBackground(new java.awt.Color(183, 225, 248));

        jLabel131.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel131.setText("31. ¿Ocurrió en el desempeño");

        buttonGroupAccidentalViolenta.add(rdbtnSiOcurrioDesempeñoTrabajo);
        rdbtnSiOcurrioDesempeñoTrabajo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSiOcurrioDesempeñoTrabajo.setText("Si");

        buttonGroupAccidentalViolenta.add(rdbtnNoOcurrioDesempeñoTrabajo);
        rdbtnNoOcurrioDesempeñoTrabajo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnNoOcurrioDesempeñoTrabajo.setText("No");
        rdbtnNoOcurrioDesempeñoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoOcurrioDesempeñoTrabajoActionPerformed(evt);
            }
        });

        buttonGroupAccidentalViolenta.add(rdbtnSeIgnoraOcurrioDesempeñoTrabajo);
        rdbtnSeIgnoraOcurrioDesempeñoTrabajo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        rdbtnSeIgnoraOcurrioDesempeñoTrabajo.setText("Se ignora");

        jLabel132.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel132.setText("de su trabajo?");

        jLabel136.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel136.setText("ACCIDENTAL O VIOLENTA");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel136))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel132))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(rdbtnSiOcurrioDesempeñoTrabajo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdbtnNoOcurrioDesempeñoTrabajo)
                                .addGap(13, 13, 13))
                            .addComponent(jLabel131)))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(rdbtnSeIgnoraOcurrioDesempeñoTrabajo)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(jLabel136)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel132)
                .addGap(2, 2, 2)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSiOcurrioDesempeñoTrabajo)
                    .addComponent(rdbtnNoOcurrioDesempeñoTrabajo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbtnSeIgnoraOcurrioDesempeñoTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jPanel46.setBackground(new java.awt.Color(183, 225, 248));

        jLabel133.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel133.setText("32. Lugar donde ocurrió la lesión (accidental o violenta)");

        buttonGroupLugarOcurrioLesion.add(rdbtnViviendaParticular);
        rdbtnViviendaParticular.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnViviendaParticular.setText("Vivienda particular");

        buttonGroupLugarOcurrioLesion.add(rdbtnViviendaColectiva);
        rdbtnViviendaColectiva.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnViviendaColectiva.setText("Vivienda colectiva (asilo, orfanato, etc)");

        buttonGroupLugarOcurrioLesion.add(rdbtnEscuelauOficinaPublica);
        rdbtnEscuelauOficinaPublica.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnEscuelauOficinaPublica.setText("Escuela u oficina pública");

        buttonGroupLugarOcurrioLesion.add(rdbtnAreaDeportiva);
        rdbtnAreaDeportiva.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnAreaDeportiva.setText("Área deportiva");
        rdbtnAreaDeportiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnAreaDeportivaActionPerformed(evt);
            }
        });

        buttonGroupLugarOcurrioLesion.add(rdbtnCalleoCarretera);
        rdbtnCalleoCarretera.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnCalleoCarretera.setText("Calle o carretera (vía pública)");

        buttonGroupLugarOcurrioLesion.add(rdbtnAreaComercialoServicio);
        rdbtnAreaComercialoServicio.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnAreaComercialoServicio.setText("Área comercial o de servicio");

        buttonGroupLugarOcurrioLesion.add(rdbtnAreaIndustrial);
        rdbtnAreaIndustrial.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnAreaIndustrial.setText("Área industrial (taller, fábrica u obra)");

        buttonGroupLugarOcurrioLesion.add(rdbtnGranja);
        rdbtnGranja.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnGranja.setText("Granja (rancho o parcela)");

        buttonGroupLugarOcurrioLesion.add(rdbtnSeIgnoraLugar);
        rdbtnSeIgnoraLugar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnSeIgnoraLugar.setText("Se ignora");

        buttonGroupLugarOcurrioLesion.add(rdbtnOtroLugar);
        rdbtnOtroLugar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnOtroLugar.setText("Otro");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdbtnAreaDeportiva, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnCalleoCarretera, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(221, 221, 221)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnOtroLugar)
                            .addComponent(rdbtnSeIgnoraLugar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnViviendaParticular)
                            .addComponent(rdbtnViviendaColectiva)
                            .addComponent(rdbtnEscuelauOficinaPublica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnGranja)
                            .addComponent(rdbtnAreaComercialoServicio)
                            .addComponent(rdbtnAreaIndustrial))
                        .addGap(60, 60, 60))))
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel133)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(jLabel133)
                .addGap(18, 18, 18)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnViviendaParticular)
                    .addComponent(rdbtnAreaComercialoServicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnEscuelauOficinaPublica)
                    .addComponent(rdbtnAreaIndustrial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnViviendaColectiva)
                    .addComponent(rdbtnGranja))
                .addGap(14, 14, 14)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnAreaDeportiva)
                    .addComponent(rdbtnOtroLugar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnCalleoCarretera)
                    .addComponent(rdbtnSeIgnoraLugar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel47.setBackground(new java.awt.Color(183, 225, 248));

        jLabel134.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel134.setText("con el acta número");

        jLabel135.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel135.setText("33. La defunción fué registrada en el ministerio público ");

        txtNumeroActa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addComponent(jLabel135)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addComponent(jLabel134)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addComponent(txtNumeroActa, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel135)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumeroActa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        btnSiguienteVista13.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista13.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista13.setText("Siguiente");
        btnSiguienteVista13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista13ActionPerformed(evt);
            }
        });

        btnRegresarVista13.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista13.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista13.setText("Regresar");
        btnRegresarVista13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista13Layout = new javax.swing.GroupLayout(jPanelVista13);
        jPanelVista13.setLayout(jPanelVista13Layout);
        jPanelVista13Layout.setHorizontalGroup(
            jPanelVista13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista13Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanelVista13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista13Layout.createSequentialGroup()
                        .addGroup(jPanelVista13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSiguienteVista13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelVista13Layout.createSequentialGroup()
                                .addGroup(jPanelVista13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegresarVista13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelVista13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista13Layout.createSequentialGroup()
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))))
        );
        jPanelVista13Layout.setVerticalGroup(
            jPanelVista13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVista13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista13Layout.createSequentialGroup()
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista13Layout.createSequentialGroup()
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVista13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista13)
                    .addComponent(btnRegresarVista13))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab13", jPanelVista13);

        jPanelVista14.setBackground(new java.awt.Color(0, 51, 102));

        jPanel52.setBackground(new java.awt.Color(183, 225, 248));

        jLabel137.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel137.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel137)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel137)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel56.setBackground(new java.awt.Color(183, 225, 248));

        jLabel141.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel141.setText("34. Relación del/la presunto/a agresor/a con el/la fallecido/a");

        txtRelacionAgresorFallecido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel141))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(txtRelacionAgresorFallecido, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel141)
                .addGap(18, 18, 18)
                .addComponent(txtRelacionAgresorFallecido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel57.setBackground(new java.awt.Color(183, 225, 248));

        jLabel142.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel142.setText("35. Describa brevemente la situación, circunstancia o motivos en que se produjo la lesión ");

        jLabel143.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel143.setText("Accidental, violenta o si es intoxicación, especifique el agente tóxico");

        buttonGroupInvestigacion.add(rdbtnInvestigacionPendiente);
        rdbtnInvestigacionPendiente.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnInvestigacionPendiente.setText("Investigación pendiente");

        buttonGroupInvestigacion.add(rdbtnNoPuedeDeterminarse);
        rdbtnNoPuedeDeterminarse.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rdbtnNoPuedeDeterminarse.setText("No puede determinarse");

        txtDescripcionSituacion.setColumns(20);
        txtDescripcionSituacion.setRows(5);
        txtDescripcionSituacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtDescripcionSituacion);

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel143))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel142)))
                .addGap(44, 44, 44)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnInvestigacionPendiente)
                    .addComponent(rdbtnNoPuedeDeterminarse))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142)
                    .addComponent(rdbtnInvestigacionPendiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143)
                    .addComponent(rdbtnNoPuedeDeterminarse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        btnSiguienteVista14.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista14.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista14.setText("Siguiente");
        btnSiguienteVista14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista14ActionPerformed(evt);
            }
        });

        btnRegresarVista14.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista14.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista14.setText("Regresar");
        btnRegresarVista14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista14Layout = new javax.swing.GroupLayout(jPanelVista14);
        jPanelVista14.setLayout(jPanelVista14Layout);
        jPanelVista14Layout.setHorizontalGroup(
            jPanelVista14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista14Layout.createSequentialGroup()
                .addGroup(jPanelVista14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista14Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista14Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelVista14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelVista14Layout.createSequentialGroup()
                                .addComponent(btnRegresarVista14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguienteVista14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelVista14Layout.setVerticalGroup(
            jPanelVista14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVista14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista14)
                    .addComponent(btnRegresarVista14))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab14", jPanelVista14);

        jPanelVista15.setBackground(new java.awt.Color(0, 51, 102));

        jPanel53.setBackground(new java.awt.Color(183, 225, 248));

        jLabel138.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel138.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel138)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel138)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel58.setBackground(new java.awt.Color(183, 225, 248));

        jLabel144.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel144.setText("36. Domicilio donde ocurrió la lesión");

        jLabel145.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel145.setText("accidental o violenta");

        jLabel146.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel146.setText("Tipo de vialidad");

        jLabel147.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel147.setText("Nombre de la vialidad");

        jLabel148.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel148.setText("Num. Ext.");

        jLabel149.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel149.setText("Num. Int.");

        jLabel150.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel150.setText("Tipo de asentamiento humano");

        jLabel152.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel152.setText("Nombre del asentamiento humano");

        jLabel153.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel153.setText("Localidad");

        jLabel154.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel154.setText("Municipio o alcaldía");

        jLabel155.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel155.setText("Entidad federativa");

        jLabel156.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel156.setText("Código Postal");

        txtTipoVialidadLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreVialidadLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumExtLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumIntLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTipoAsentamientoHumanoLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreAsentamientoHumanoLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoPostalLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtLocalidadLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMunicipioAlcaldiaLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEntidadFederativaLesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel153)
                .addGap(207, 207, 207)
                .addComponent(jLabel154)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel155)
                .addGap(96, 96, 96))
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel150)
                .addGap(115, 115, 115)
                .addComponent(jLabel152)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel156)
                .addGap(108, 108, 108))
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel145))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel58Layout.createSequentialGroup()
                                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtLocalidadLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTipoAsentamientoHumanoLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreAsentamientoHumanoLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMunicipioAlcaldiaLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel58Layout.createSequentialGroup()
                                        .addComponent(txtTipoVialidadLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtNombreVialidadLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel58Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel146)
                                .addGap(175, 175, 175)))
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(txtEntidadFederativaLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigoPostalLesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumIntLesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                        .addComponent(jLabel147)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel148)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel149)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                        .addComponent(jLabel144)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                        .addComponent(txtNumExtLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel144)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtTipoVialidadLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel145)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumExtLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumIntLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreVialidadLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel149)
                            .addComponent(jLabel148))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoAsentamientoHumanoLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreAsentamientoHumanoLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoPostalLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel152)
                            .addComponent(jLabel156)
                            .addComponent(jLabel150))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocalidadLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntidadFederativaLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMunicipioAlcaldiaLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel155)
                            .addComponent(jLabel153)
                            .addComponent(jLabel154)))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel146)
                            .addComponent(jLabel147))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnSiguienteVista15.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista15.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista15.setText("Siguiente");
        btnSiguienteVista15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista15ActionPerformed(evt);
            }
        });

        btnRegresarVista15.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista15.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista15.setText("Regresar");
        btnRegresarVista15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista15Layout = new javax.swing.GroupLayout(jPanelVista15);
        jPanelVista15.setLayout(jPanelVista15Layout);
        jPanelVista15Layout.setHorizontalGroup(
            jPanelVista15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista15Layout.createSequentialGroup()
                .addGroup(jPanelVista15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista15Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista15Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanelVista15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelVista15Layout.createSequentialGroup()
                                .addComponent(btnRegresarVista15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguienteVista15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanelVista15Layout.setVerticalGroup(
            jPanelVista15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista15Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVista15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista15)
                    .addComponent(btnRegresarVista15))
                .addGap(31, 31, 31))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab15", jPanelVista15);

        jPanelVista16.setBackground(new java.awt.Color(0, 51, 102));

        jPanel55.setBackground(new java.awt.Color(183, 225, 248));

        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel140.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel140)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel140)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel60.setBackground(new java.awt.Color(183, 225, 248));

        buttonGroupDelCertificante.add(rdbtnMedicoTratante);
        rdbtnMedicoTratante.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnMedicoTratante.setText("Médica/o tratante");
        rdbtnMedicoTratante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMedicoTratanteActionPerformed(evt);
            }
        });

        buttonGroupDelCertificante.add(rdbtnMedicoLegista);
        rdbtnMedicoLegista.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnMedicoLegista.setText("Médica/o legista");
        rdbtnMedicoLegista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMedicoLegistaActionPerformed(evt);
            }
        });

        buttonGroupDelCertificante.add(rdbtnOtroMedico);
        rdbtnOtroMedico.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnOtroMedico.setText("Otro médico");
        rdbtnOtroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnOtroMedicoActionPerformed(evt);
            }
        });

        buttonGroupDelCertificante.add(rdbtnPersonaAutorizada);
        rdbtnPersonaAutorizada.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnPersonaAutorizada.setText("Persona autorizada por la Secretaría de Salud");
        rdbtnPersonaAutorizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnPersonaAutorizadaActionPerformed(evt);
            }
        });

        buttonGroupDelCertificante.add(rdbtnAutoridadCivil);
        rdbtnAutoridadCivil.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnAutoridadCivil.setText("Autoridad civil");
        rdbtnAutoridadCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnAutoridadCivilActionPerformed(evt);
            }
        });

        buttonGroupDelCertificante.add(rdbtnOtro);
        rdbtnOtro.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        rdbtnOtro.setText("Otro");
        rdbtnOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnOtroActionPerformed(evt);
            }
        });

        jLabel160.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel160.setText("Especifique:");
        jLabel160.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel160ComponentHidden(evt);
            }
        });

        jLabel161.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel161.setText("37. Certificada por ");

        txtEspecifiqueOtraAutoridad1.setEditable(false);
        txtEspecifiqueOtraAutoridad1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEspecifiqueOtraAutoridad1.setEnabled(false);

        jLabel179.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel179.setText("DE LA/DEL CERTIFICANTE");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(rdbtnMedicoTratante)
                        .addGap(83, 83, 83)
                        .addComponent(rdbtnMedicoLegista))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(rdbtnAutoridadCivil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(rdbtnOtroMedico)
                        .addGap(67, 67, 67)
                        .addComponent(rdbtnPersonaAutorizada))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(rdbtnOtro)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel160)
                        .addGap(18, 18, 18)
                        .addComponent(txtEspecifiqueOtraAutoridad1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel179)
                .addGap(179, 179, 179)
                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jLabel179)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                        .addComponent(jLabel161)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnMedicoTratante)
                    .addComponent(rdbtnMedicoLegista)
                    .addComponent(rdbtnPersonaAutorizada)
                    .addComponent(rdbtnOtroMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnOtro)
                            .addComponent(rdbtnAutoridadCivil))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEspecifiqueOtraAutoridad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel160))
                        .addGap(16, 16, 16))))
        );

        jPanel59.setBackground(new java.awt.Color(183, 225, 248));

        txtNombreCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApellidoPCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApellidoMCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoMCertificante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMCertificanteActionPerformed(evt);
            }
        });

        jLabel157.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel157.setText("Nombre(s)");

        jLabel158.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel158.setText("Apellido Paterno");

        jLabel162.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel162.setText("Apellido Materno");

        jLabel164.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel164.setText("38. Nombre");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtNombreCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel164))
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel59Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel158))
                                    .addComponent(txtApellidoPCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel157)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoMCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel162)))
                .addGap(36, 36, 36))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel164)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoMCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoPCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157)
                    .addComponent(jLabel158)
                    .addComponent(jLabel162))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel61.setBackground(new java.awt.Color(183, 225, 248));

        jSeparator83.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator83.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator83.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel163.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel163.setText("39. Si el certificante es médico");

        jLabel159.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel159.setText("40. Firma del certificante");

        jLabel165.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel165.setText("Número de cédula profesional ");
        jLabel165.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel165ComponentHidden(evt);
            }
        });

        txtFirmaCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumCedProfesional.setEditable(false);
        txtNumCedProfesional.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumCedProfesional.setEnabled(false);

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel165)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel163)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumCedProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtFirmaCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel159)))
                .addGap(69, 69, 69))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel163)
                            .addComponent(jLabel159))
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel61Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(txtNumCedProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel165)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel61Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFirmaCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator83))
                .addContainerGap())
        );

        btnSiguienteVista16.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista16.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista16.setText("Siguiente");
        btnSiguienteVista16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista16ActionPerformed(evt);
            }
        });

        btnRegresarVista16.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista16.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista16.setText("Regresar");
        btnRegresarVista16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista16Layout = new javax.swing.GroupLayout(jPanelVista16);
        jPanelVista16.setLayout(jPanelVista16Layout);
        jPanelVista16Layout.setHorizontalGroup(
            jPanelVista16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
            .addGroup(jPanelVista16Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelVista16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVista16Layout.createSequentialGroup()
                        .addComponent(btnRegresarVista16, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(686, 686, 686)
                        .addComponent(btnSiguienteVista16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelVista16Layout.createSequentialGroup()
                            .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanelVista16Layout.setVerticalGroup(
            jPanelVista16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelVista16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVista16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresarVista16)
                    .addComponent(btnSiguienteVista16))
                .addGap(74, 74, 74))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab16", jPanelVista16);

        jPanelVista17.setBackground(new java.awt.Color(0, 51, 102));

        jPanel54.setBackground(new java.awt.Color(183, 225, 248));

        jLabel139.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel139.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel139)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel139)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel62.setBackground(new java.awt.Color(183, 225, 248));

        jLabel166.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel166.setText("41. Domicilio y teléfono");

        jLabel168.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel168.setText("Tipo de vialidad");

        jLabel169.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel169.setText("Nombre de la vialidad");

        jLabel170.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel170.setText("Num. Ext.");

        jLabel171.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel171.setText("Num. Int.");

        jLabel172.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel172.setText("Tipo de asentamiento humano");

        jLabel174.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel174.setText("Nombre del asentamiento humano");

        jLabel175.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel175.setText("Localidad");

        jLabel176.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel176.setText("Municipio o alcaldía");

        jLabel177.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel177.setText("Entidad federativa");

        jLabel178.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel178.setText("Código Postal");

        txtTipoVialidadCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreVialidadCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumExtCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumIntCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTipoAsentamientoHumanoCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreAsentamientoHumanoCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoPostalCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtLocalidadCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMunicipioAlcaldiaCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMunicipioAlcaldiaCertificante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMunicipioAlcaldiaCertificanteActionPerformed(evt);
            }
        });

        txtTelefonoCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefonoCertificante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCertificanteActionPerformed(evt);
            }
        });

        jLabel180.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel180.setText("Teléfono");

        txtEntidadFederativaCertificante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel175)
                .addGap(160, 160, 160)
                .addComponent(jLabel176)
                .addGap(100, 100, 100)
                .addComponent(jLabel177)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel180)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel170)
                .addGap(122, 122, 122)
                .addComponent(jLabel171)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel172)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel174)
                .addGap(153, 153, 153)
                .addComponent(jLabel178)
                .addGap(72, 72, 72))
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(txtLocalidadCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txtMunicipioAlcaldiaCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEntidadFederativaCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonoCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                                .addComponent(txtTipoVialidadCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreVialidadCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(txtNumExtCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(txtNumIntCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel62Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel168)
                                        .addGap(161, 161, 161)
                                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel169)
                                            .addComponent(txtNombreAsentamientoHumanoCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtTipoAsentamientoHumanoCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addComponent(txtCodigoPostalCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel166)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel166)
                .addGap(42, 42, 42)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumExtCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreVialidadCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumIntCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoVialidadCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(jLabel170)
                    .addComponent(jLabel169)
                    .addComponent(jLabel168))
                .addGap(55, 55, 55)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoAsentamientoHumanoCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreAsentamientoHumanoCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoPostalCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel174)
                    .addComponent(jLabel178)
                    .addComponent(jLabel172))
                .addGap(46, 46, 46)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalidadCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipioAlcaldiaCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntidadFederativaCertificante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel175)
                    .addComponent(jLabel176)
                    .addComponent(jLabel177)
                    .addComponent(jLabel180))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnSiguienteVista17.setBackground(new java.awt.Color(183, 225, 248));
        btnSiguienteVista17.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnSiguienteVista17.setText("Siguiente");
        btnSiguienteVista17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVista17ActionPerformed(evt);
            }
        });

        btnRegresarVista17.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista17.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista17.setText("Regresar");
        btnRegresarVista17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista17Layout = new javax.swing.GroupLayout(jPanelVista17);
        jPanelVista17.setLayout(jPanelVista17Layout);
        jPanelVista17Layout.setHorizontalGroup(
            jPanelVista17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista17Layout.createSequentialGroup()
                .addGroup(jPanelVista17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista17Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista17Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanelVista17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVista17Layout.createSequentialGroup()
                                .addComponent(btnRegresarVista17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(605, 605, 605)
                                .addComponent(btnSiguienteVista17, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanelVista17Layout.setVerticalGroup(
            jPanelVista17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista17Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVista17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteVista17)
                    .addComponent(btnRegresarVista17))
                .addGap(31, 31, 31))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab17", jPanelVista17);

        jPanelVista18.setBackground(new java.awt.Color(0, 51, 102));

        jPanel64.setBackground(new java.awt.Color(183, 225, 248));

        jLabel167.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel167.setText("SECRETARÍA DE SALUD CERTIFICADO DE DEFUNCIÓN");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel167)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel167)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel65.setBackground(new java.awt.Color(183, 225, 248));

        jLabel173.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel173.setText("42. Fecha de certificación");

        jLabel181.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel181.setText("DÍA");
        jLabel181.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel181ComponentHidden(evt);
            }
        });

        jLabel182.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel182.setText("MES");
        jLabel182.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel182ComponentHidden(evt);
            }
        });

        jLabel183.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel183.setText("AÑO");
        jLabel183.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel183ComponentHidden(evt);
            }
        });

        txtFechaCertificacionDia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFechaCertificacionMes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFechaCertificacionAño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtFechaCertificacionDia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtFechaCertificacionMes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtFechaCertificacionAño, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel181)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel182)
                .addGap(96, 96, 96)
                .addComponent(jLabel183)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel173)
                .addGap(99, 99, 99))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel173)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaCertificacionDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCertificacionMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCertificacionAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel182)
                    .addComponent(jLabel183)
                    .addComponent(jLabel181))
                .addGap(18, 18, 18))
        );

        jPanel66.setBackground(new java.awt.Color(183, 225, 248));

        jLabel184.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel184.setText("43. La defunción fue inscrita por la fiscalía o juzgado");

        jLabel185.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel185.setText("Num.");
        jLabel185.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel185ComponentHidden(evt);
            }
        });

        jLabel186.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel186.setText("Num. Libro");
        jLabel186.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel186ComponentHidden(evt);
            }
        });

        jLabel187.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel187.setText("Num. acta");
        jLabel187.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel187ComponentHidden(evt);
            }
        });

        txtNumFiscalia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumLibroFiscalia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel188.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel188.setText("DEL REG. CIVIL");

        txtNumActaFiscalia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel66Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumFiscalia, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumLibroFiscalia, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNumActaFiscalia, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel185)
                    .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel187)
                        .addComponent(jLabel186)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel184)
                .addGap(54, 54, 54))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel184)
                    .addComponent(jLabel188))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumFiscalia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel185))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumLibroFiscalia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel186))
                .addGap(15, 15, 15)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumActaFiscalia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel187))
                .addGap(21, 21, 21))
        );

        jPanel67.setBackground(new java.awt.Color(183, 225, 248));

        jLabel189.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel189.setText("44. Lugar de registro");

        jLabel190.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel190.setText("Localidad");

        jLabel191.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel191.setText("Municipio o alcaldía");

        jLabel192.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel192.setText("Entidad federativa");

        txtEntidadFederativaRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtLocalidadRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMunicipioRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addComponent(jLabel192)
                                .addGap(32, 32, 32)
                                .addComponent(txtEntidadFederativaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel191)
                                    .addComponent(jLabel190))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLocalidadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMunicipioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel189)))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addComponent(jLabel189)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel190)
                    .addComponent(txtLocalidadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel191)
                    .addComponent(txtMunicipioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel192)
                    .addComponent(txtEntidadFederativaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel68.setBackground(new java.awt.Color(183, 225, 248));

        jLabel193.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel193.setText("45. Fecha de registro ");

        jLabel194.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel194.setText("DÍA");
        jLabel194.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel194ComponentHidden(evt);
            }
        });

        jLabel195.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel195.setText("MES");
        jLabel195.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel195ComponentHidden(evt);
            }
        });

        jLabel196.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel196.setText("AÑO");
        jLabel196.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel196ComponentHidden(evt);
            }
        });

        txtDiaRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMesRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAñoRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel194)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel195)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel196))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtDiaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtMesRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAñoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel193)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel193)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAñoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel196)
                    .addComponent(jLabel195)
                    .addComponent(jLabel194))
                .addGap(12, 12, 12))
        );

        btnEnviarFormulario.setBackground(new java.awt.Color(183, 225, 248));
        btnEnviarFormulario.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnEnviarFormulario.setText("Enviar");
        btnEnviarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarFormularioActionPerformed(evt);
            }
        });

        btnRegresarVista18.setBackground(new java.awt.Color(183, 225, 248));
        btnRegresarVista18.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnRegresarVista18.setText("Regresar");
        btnRegresarVista18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVista18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVista18Layout = new javax.swing.GroupLayout(jPanelVista18);
        jPanelVista18.setLayout(jPanelVista18Layout);
        jPanelVista18Layout.setHorizontalGroup(
            jPanelVista18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(jPanelVista18Layout.createSequentialGroup()
                .addGroup(jPanelVista18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista18Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelVista18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelVista18Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanelVista18Layout.createSequentialGroup()
                                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelVista18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelVista18Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVista18Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(btnEnviarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))))))
                    .addGroup(jPanelVista18Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnRegresarVista18, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanelVista18Layout.setVerticalGroup(
            jPanelVista18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVista18Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVista18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVista18Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelVista18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVista18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVista18Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviarFormulario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresarVista18)
                .addGap(16, 16, 16))
        );

        tabbedPaneCertificadoDefuncion.addTab("tab18", jPanelVista18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCertificadoDefuncion)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCertificadoDefuncion)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnMujerActionPerformed

    private void rdbtnHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnHombreActionPerformed

    private void rdbtnNoAfromexicanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoAfromexicanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnNoAfromexicanoActionPerformed

    private void rdbtnNoIndigenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoIndigenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnNoIndigenaActionPerformed

    private void rdbtnNoLenguaIndigenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoLenguaIndigenaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueLenguaIndigena();
    }//GEN-LAST:event_rdbtnNoLenguaIndigenaActionPerformed

    private void rdbtnNacionalidadMexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNacionalidadMexActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueNacionalidad();
    }//GEN-LAST:event_rdbtnNacionalidadMexActionPerformed

    private void rdbtnOtraNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnOtraNacionalidadActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueNacionalidad();
    }//GEN-LAST:event_rdbtnOtraNacionalidadActionPerformed

    private void txtEspecifiqueNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecifiqueNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecifiqueNacionalidadActionPerformed

    private void rdbtnSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnSolteroActionPerformed

    private void rdbtnUnionLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnUnionLibreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnUnionLibreActionPerformed

    private void rdbtnEscolaridadNingunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadNingunaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTipoEscolaridad();
    }//GEN-LAST:event_rdbtnEscolaridadNingunaActionPerformed

    private void rdbtnEscolaridadPrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadPrimariaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTipoEscolaridad();
    }//GEN-LAST:event_rdbtnEscolaridadPrimariaActionPerformed

    private void rdbtnEscolaridadProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadProfesionalActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTipoEscolaridad();
    }//GEN-LAST:event_rdbtnEscolaridadProfesionalActionPerformed

    private void rdbtnEscolaridadIncompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadIncompletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnEscolaridadIncompletaActionPerformed

    private void rdbtnEscolaridadCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadCompletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnEscolaridadCompletaActionPerformed

    private void rdbtnSiTrabajabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiTrabajabaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnSiTrabajabaActionPerformed

    private void rdbtnServiciosDeSaludIMSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludIMSSActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludIMSSActionPerformed

    private void rdbtnServiciosDeSaludIMSSBIENESTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludIMSSBIENESTARActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludIMSSBIENESTARActionPerformed

    private void txtDefuncionClaveUnicaEstablecimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDefuncionClaveUnicaEstablecimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDefuncionClaveUnicaEstablecimientosActionPerformed

    private void rdbtnDefuncionImssBienestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionImssBienestarActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionImssBienestarActionPerformed

    private void rdbtnDefuncionHogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionHogarActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionHogarActionPerformed

    private void rdbtnDefuncionOtroLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionOtroLugarActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionOtroLugarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void rdbtnPersonaDesconocidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnPersonaDesconocidaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTextFieldNombre();
    }//GEN-LAST:event_rdbtnPersonaDesconocidaActionPerformed

    private void btnSiguienteVista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista1ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista1();
    }//GEN-LAST:event_btnSiguienteVista1ActionPerformed

    private void btnSiguienteVista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista2ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista2();
    }//GEN-LAST:event_btnSiguienteVista2ActionPerformed

    private void btnSiguienteVista3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista3ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista3();
    }//GEN-LAST:event_btnSiguienteVista3ActionPerformed

    private void jComboBoxTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTiempoActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposEdadCumplida();
    }//GEN-LAST:event_jComboBoxTiempoActionPerformed

    private void txtEdadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadTiempoActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposEdadCumplida();
    }//GEN-LAST:event_txtEdadTiempoActionPerformed

    private void rdbtnSeIgnoraEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSeIgnoraEdadActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposEdadCumplida();
    }//GEN-LAST:event_rdbtnSeIgnoraEdadActionPerformed

    private void btnSiguienteVista4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista4ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista4();
    }//GEN-LAST:event_btnSiguienteVista4ActionPerformed

    private void rdbtnOcupacionHabitualSeIgnoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnOcupacionHabitualSeIgnoraActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarOcupacionDescripcion();
    }//GEN-LAST:event_rdbtnOcupacionHabitualSeIgnoraActionPerformed

    private void btnSiguienteVista5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista5ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista5();
    }//GEN-LAST:event_btnSiguienteVista5ActionPerformed

    private void btnSiguienteVista6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista6ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista6();
    }//GEN-LAST:event_btnSiguienteVista6ActionPerformed

    private void txtDiaDefuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaDefuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaDefuncionActionPerformed

    private void txtMinutosDefuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutosDefuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutosDefuncionActionPerformed

    private void rdbtnNoAtencionMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoAtencionMedicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnNoAtencionMedicaActionPerformed

    private void rdbtnNoRealizoCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoRealizoCirugiaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposCirugia();
    }//GEN-LAST:event_rdbtnNoRealizoCirugiaActionPerformed

    private void txtMesRealizoCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesRealizoCirugiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesRealizoCirugiaActionPerformed

    private void txtAñoRealizoCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoRealizoCirugiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoRealizoCirugiaActionPerformed

    private void txtDiaRealizoCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaRealizoCirugiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaRealizoCirugiaActionPerformed

    private void txtMotivoCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoCirugiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoCirugiaActionPerformed

    private void rdbtnNoDefuncionAccidentalViolentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoDefuncionAccidentalViolentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnNoDefuncionAccidentalViolentaActionPerformed

    private void rdbtnTipoDefuncionEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTipoDefuncionEnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTipoDefuncionEnfermedadActionPerformed

    private void rdbtnTipoDefuncionAccidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTipoDefuncionAccidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTipoDefuncionAccidenteActionPerformed

    private void rdbtnTipoDefuncionIntervencionLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTipoDefuncionIntervencionLegalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTipoDefuncionIntervencionLegalActionPerformed

    private void rdbtnTipoDefuncionSeIgnoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTipoDefuncionSeIgnoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTipoDefuncionSeIgnoraActionPerformed

    private void txtCausaDefuncionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCausaDefuncionDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCausaDefuncionDActionPerformed

    private void rdbtnSiUtilizaronHallazgosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiUtilizaronHallazgosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnSiUtilizaronHallazgosActionPerformed

    private void rdbtnNoUtilizaronHallazgosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoUtilizaronHallazgosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnNoUtilizaronHallazgosActionPerformed

    private void rdbtnMuerteDespuesPartoAbortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnMuerteDespuesPartoAbortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnMuerteDespuesPartoAbortoActionPerformed

    private void rdbtnSiComplicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiComplicacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnSiComplicacionesActionPerformed

    private void rdbtnSiComplicacionesPropiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiComplicacionesPropiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnSiComplicacionesPropiasActionPerformed

    private void rdbtnSiMuerteEncefalicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiMuerteEncefalicaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposEncefalica();
    }//GEN-LAST:event_rdbtnSiMuerteEncefalicaActionPerformed

    private void rdbtnNoDonadorOrganosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoDonadorOrganosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnNoDonadorOrganosActionPerformed

    private void rdbtnSiDonadorOrganosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiDonadorOrganosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnSiDonadorOrganosActionPerformed

    private void rdbtnNoMuerteEncefalicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoMuerteEncefalicaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposEncefalica();
    }//GEN-LAST:event_rdbtnNoMuerteEncefalicaActionPerformed

    private void rdbtnNoOcurrioDesempeñoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoOcurrioDesempeñoTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnNoOcurrioDesempeñoTrabajoActionPerformed

    private void rdbtnAreaDeportivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnAreaDeportivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnAreaDeportivaActionPerformed

    private void rdbtnAutoridadCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnAutoridadCivilActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCedulaMedico();
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueCertificante();
    }//GEN-LAST:event_rdbtnAutoridadCivilActionPerformed

    private void rdbtnOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnOtroActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCedulaMedico();
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueCertificante();
    }//GEN-LAST:event_rdbtnOtroActionPerformed

    private void jLabel160ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel160ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel160ComponentHidden

    private void txtApellidoMCertificanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMCertificanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMCertificanteActionPerformed

    private void jLabel165ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel165ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel165ComponentHidden

    private void txtMunicipioAlcaldiaCertificanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMunicipioAlcaldiaCertificanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMunicipioAlcaldiaCertificanteActionPerformed

    private void txtTelefonoCertificanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCertificanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoCertificanteActionPerformed

    private void jLabel181ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel181ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel181ComponentHidden

    private void jLabel182ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel182ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel182ComponentHidden

    private void jLabel183ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel183ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel183ComponentHidden

    private void jLabel185ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel185ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel185ComponentHidden

    private void jLabel186ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel186ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel186ComponentHidden

    private void jLabel187ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel187ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel187ComponentHidden

    private void jLabel194ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel194ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel194ComponentHidden

    private void jLabel195ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel195ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel195ComponentHidden

    private void jLabel196ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel196ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel196ComponentHidden

    private void txtNombreVialidadDefuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVialidadDefuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVialidadDefuncionActionPerformed

    private void rdbtnEscolaridadBachilleratoPreparatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadBachilleratoPreparatoriaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTipoEscolaridad();
    }//GEN-LAST:event_rdbtnEscolaridadBachilleratoPreparatoriaActionPerformed

    private void rdbtnEscolaridadPosgradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadPosgradoActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTipoEscolaridad();
    }//GEN-LAST:event_rdbtnEscolaridadPosgradoActionPerformed

    private void rdbtnEscolaridadPreescolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadPreescolarActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTipoEscolaridad();
    }//GEN-LAST:event_rdbtnEscolaridadPreescolarActionPerformed

    private void rdbtnEscolaridadSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadSecundariaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTipoEscolaridad();
    }//GEN-LAST:event_rdbtnEscolaridadSecundariaActionPerformed

    private void rdbtnEscolaridadSeIgnoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEscolaridadSeIgnoraActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarTipoEscolaridad();
    }//GEN-LAST:event_rdbtnEscolaridadSeIgnoraActionPerformed

    private void rdbtnServiciosDeSaludNingunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludNingunaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludNingunaActionPerformed

    private void rdbtnServiciosDeSaludISSSTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludISSSTEActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludISSSTEActionPerformed

    private void rdbtnServiciosDeSaludSEDENAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludSEDENAActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludSEDENAActionPerformed

    private void rdbtnServiciosDeSaludSeIgnoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludSeIgnoraActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludSeIgnoraActionPerformed

    private void rdbtnServiciosDeSaludPEMEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludPEMEXActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludPEMEXActionPerformed

    private void rdbtnServiciosDeSaludSEMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludSEMARActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludSEMARActionPerformed

    private void rdbtnServiciosDeSaludISSFAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludISSFAMActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludISSFAMActionPerformed

    private void rdbtnServiciosDeSaludOtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnServiciosDeSaludOtraActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposServicioSalud();
    }//GEN-LAST:event_rdbtnServiciosDeSaludOtraActionPerformed

    private void rdbtnSiLenguaIndigenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiLenguaIndigenaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueLenguaIndigena();
    }//GEN-LAST:event_rdbtnSiLenguaIndigenaActionPerformed

    private void rdbtnSeIgnoraLenguaIndigenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSeIgnoraLenguaIndigenaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueLenguaIndigena();
    }//GEN-LAST:event_rdbtnSeIgnoraLenguaIndigenaActionPerformed

    private void rdbtnSeIgnoraNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSeIgnoraNacionalidadActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueNacionalidad();
    }//GEN-LAST:event_rdbtnSeIgnoraNacionalidadActionPerformed

    private void rdbtnDefuncionSecretariaSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionSecretariaSaludActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionSecretariaSaludActionPerformed

    private void rdbtnDefuncionIsssteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionIsssteActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionIsssteActionPerformed

    private void rdbtnDefuncionSemarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionSemarActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionSemarActionPerformed

    private void rdbtnDefuncionPemexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionPemexActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionPemexActionPerformed

    private void rdbtnDefuncionOtraUnidadMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionOtraUnidadMedicaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionOtraUnidadMedicaActionPerformed

    private void rdbtnDefuncionImssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionImssActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionImssActionPerformed

    private void rdbtnDefuncionSedenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionSedenaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionSedenaActionPerformed

    private void rdbtnDefuncionUnidadMedicaPrivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionUnidadMedicaPrivadaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionUnidadMedicaPrivadaActionPerformed

    private void rdbtnDefuncionViaPublicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionViaPublicaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionViaPublicaActionPerformed

    private void rdbtnDefuncionSeIgnoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDefuncionSeIgnoraActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposSitioDefuncion();
    }//GEN-LAST:event_rdbtnDefuncionSeIgnoraActionPerformed

    private void btnSiguienteVista7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista7ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista7();
    }//GEN-LAST:event_btnSiguienteVista7ActionPerformed

    private void btnSiguienteVista8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista8ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista8();
    }//GEN-LAST:event_btnSiguienteVista8ActionPerformed

    private void btnSiguienteVista9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista9ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista9();
    }//GEN-LAST:event_btnSiguienteVista9ActionPerformed

    private void rdbtnSiRealizoCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiRealizoCirugiaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposCirugia();
    }//GEN-LAST:event_rdbtnSiRealizoCirugiaActionPerformed

    private void rdbtnSeIgnoraRealizoCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSeIgnoraRealizoCirugiaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposCirugia();
    }//GEN-LAST:event_rdbtnSeIgnoraRealizoCirugiaActionPerformed

    private void btnSiguienteVista10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista10ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista10();
    }//GEN-LAST:event_btnSiguienteVista10ActionPerformed

    private void btnSiguienteVista11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista11ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista11();
    }//GEN-LAST:event_btnSiguienteVista11ActionPerformed

    private void rdbtnSiPracticoNecropsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSiPracticoNecropsiaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposNecropsia();
    }//GEN-LAST:event_rdbtnSiPracticoNecropsiaActionPerformed

    private void rdbtnNoPracticoNecropsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoPracticoNecropsiaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposNecropsia();
    }//GEN-LAST:event_rdbtnNoPracticoNecropsiaActionPerformed

    private void rdbtnSeIgnoraPracticoNecropsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSeIgnoraPracticoNecropsiaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCamposNecropsia();
    }//GEN-LAST:event_rdbtnSeIgnoraPracticoNecropsiaActionPerformed

    private void btnSiguienteVista12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista12ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista12();
    }//GEN-LAST:event_btnSiguienteVista12ActionPerformed

    private void btnSiguienteVista13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista13ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista13();
    }//GEN-LAST:event_btnSiguienteVista13ActionPerformed

    private void btnSiguienteVista14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista14ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista14();
    }//GEN-LAST:event_btnSiguienteVista14ActionPerformed

    private void btnSiguienteVista15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista15ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista15();
    }//GEN-LAST:event_btnSiguienteVista15ActionPerformed

    private void rdbtnMedicoTratanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnMedicoTratanteActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCedulaMedico();
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueCertificante();
    }//GEN-LAST:event_rdbtnMedicoTratanteActionPerformed

    private void rdbtnMedicoLegistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnMedicoLegistaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCedulaMedico();
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueCertificante();
    }//GEN-LAST:event_rdbtnMedicoLegistaActionPerformed

    private void rdbtnOtroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnOtroMedicoActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCedulaMedico();
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueCertificante();
    }//GEN-LAST:event_rdbtnOtroMedicoActionPerformed

    private void rdbtnPersonaAutorizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnPersonaAutorizadaActionPerformed
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarCedulaMedico();
        ControladorFormularioCertificadoDefuncion.deshabilitarHabilitarEspecifiqueCertificante();
    }//GEN-LAST:event_rdbtnPersonaAutorizadaActionPerformed

    private void btnSiguienteVista16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista16ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista16();
    }//GEN-LAST:event_btnSiguienteVista16ActionPerformed

    private void btnSiguienteVista17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVista17ActionPerformed
        ControladorFormularioCertificadoDefuncion.recopilarInformacionVista17();
    }//GEN-LAST:event_btnSiguienteVista17ActionPerformed

    private void btnEnviarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarFormularioActionPerformed
        //Con JFileChooser.APPROVE_OPTION Permite desplegar un menú de examinar para guardar el pdf
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile(); //ruta donde se guarda el archivo

            // Convertir la ruta del archivo a una cadena (String)
            String rutaArchivo = archivo.getAbsolutePath();

            ControladorFormularioCertificadoDefuncion.recopilarInformacionVista18(rutaArchivo);

        }


    }//GEN-LAST:event_btnEnviarFormularioActionPerformed

    private void btnRegresarVista3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista3ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista3ActionPerformed

    private void btnRegresarVista5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista5ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista5ActionPerformed

    private void btnRegresarVista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista2ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista2ActionPerformed

    private void btnRegresarVista4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista4ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista4ActionPerformed

    private void btnRegresarVista6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista6ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista6ActionPerformed

    private void btnRegresarVista7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista7ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista7ActionPerformed

    private void btnRegresarVista8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista8ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista8ActionPerformed

    private void btnRegresarVista9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista9ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista9ActionPerformed

    private void btnRegresarVista10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista10ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista10ActionPerformed

    private void btnRegresarVista11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista11ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista11ActionPerformed

    private void btnRegresarVista12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista12ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista12ActionPerformed

    private void btnRegresarVista13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista13ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista13ActionPerformed

    private void btnRegresarVista14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista14ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista14ActionPerformed

    private void btnRegresarVista15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista15ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista15ActionPerformed

    private void btnRegresarVista17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista17ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista17ActionPerformed

    private void btnRegresarVista16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista16ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista16ActionPerformed

    private void btnRegresarVista18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVista18ActionPerformed
        ControladorFormularioCertificadoDefuncion.regresarUnaVista();
    }//GEN-LAST:event_btnRegresarVista18ActionPerformed

    public JRadioButton getRdbtnNoOcurrioDesempeñoTrabajo() {
        return rdbtnNoOcurrioDesempeñoTrabajo;
    }

    public JRadioButton getRdbtnSeIgnoraOcurrioDesempeñoTrabajo() {
        return rdbtnSeIgnoraOcurrioDesempeñoTrabajo;
    }

    public JRadioButton getRdbtnSiOcurrioDesempeñoTrabajo() {
        return rdbtnSiOcurrioDesempeñoTrabajo;
    }
    private static final Logger LOG = Logger.getLogger(VistaFormularioCertificadoDefuncion.class.getName());

    public JRadioButton getRdbtnMuerteDespuesPartoAborto() {
        return rdbtnMuerteDespuesPartoAborto;
    }

    public JRadioButton getRdbtnMuerteDuranteEmbarazo() {
        return rdbtnMuerteDuranteEmbarazo;
    }

    public JRadioButton getRdbtnMuerteDuranteParto() {
        return rdbtnMuerteDuranteParto;
    }

    public JRadioButton getRdbtnMuerteDurantePuerperio() {
        return rdbtnMuerteDurantePuerperio;
    }

    public JRadioButton getRdbtnNoAtencionMedica() {
        return rdbtnNoAtencionMedica;
    }

    public JRadioButton getRdbtnNoComplicaciones() {
        return rdbtnNoComplicaciones;
    }

    public JRadioButton getRdbtnNoComplicacionesPropias() {
        return rdbtnNoComplicacionesPropias;
    }

    public JRadioButton getRdbtnNoDefuncionAccidentalViolenta() {
        return rdbtnNoDefuncionAccidentalViolenta;
    }

    public JRadioButton getRdbtnNoDonadorOrganos() {
        return rdbtnNoDonadorOrganos;
    }

    public JRadioButton getRdbtnNoEstuvoEmbarazadaPreviamente() {
        return rdbtnNoEstuvoEmbarazadaPreviamente;
    }

    public JRadioButton getRdbtnNoMuerteEncefalica() {
        return rdbtnNoMuerteEncefalica;
    }

    public JRadioButton getRdbtnNoPracticoNecropsia() {
        return rdbtnNoPracticoNecropsia;
    }

    public JRadioButton getRdbtnNoPuedeDeterminarse() {
        return rdbtnNoPuedeDeterminarse;
    }

    public JRadioButton getRdbtnNoRealizoCirugia() {
        return rdbtnNoRealizoCirugia;
    }

    public JRadioButton getRdbtnNoUtilizaronHallazgos() {
        return rdbtnNoUtilizaronHallazgos;
    }

    public JRadioButton getRdbtnOtro() {
        return rdbtnOtro;
    }

    public JRadioButton getRdbtnOtroLugar() {
        return rdbtnOtroLugar;
    }

    public JRadioButton getRdbtnOtroMedico() {
        return rdbtnOtroMedico;
    }

    public JRadioButton getRdbtnPersonaAutorizada() {
        return rdbtnPersonaAutorizada;
    }

    public JRadioButton getRdbtnSeIgnoraAtencionMedica() {
        return rdbtnSeIgnoraAtencionMedica;
    }

    public JRadioButton getRdbtnSeIgnoraDefuncionAccidentalViolenta() {
        return rdbtnSeIgnoraDefuncionAccidentalViolenta;
    }

    public JRadioButton getRdbtnSeIgnoraLugar() {
        return rdbtnSeIgnoraLugar;
    }

    public JRadioButton getRdbtnSeIgnoraPracticoNecropsia() {
        return rdbtnSeIgnoraPracticoNecropsia;
    }

    public JRadioButton getRdbtnSeIgnoraRealizoCirugia() {
        return rdbtnSeIgnoraRealizoCirugia;
    }

    public JRadioButton getRdbtnSiAtencionMedica() {
        return rdbtnSiAtencionMedica;
    }

    public JRadioButton getRdbtnSiComplicaciones() {
        return rdbtnSiComplicaciones;
    }

    public JRadioButton getRdbtnSiComplicacionesPropias() {
        return rdbtnSiComplicacionesPropias;
    }

    public JRadioButton getRdbtnSiDefuncionAccidentalViolenta() {
        return rdbtnSiDefuncionAccidentalViolenta;
    }

    public JRadioButton getRdbtnSiDonadorOrganos() {
        return rdbtnSiDonadorOrganos;
    }

    public JRadioButton getRdbtnSiMuerteEncefalica() {
        return rdbtnSiMuerteEncefalica;
    }

    public JRadioButton getRdbtnSiPracticoNecropsia() {
        return rdbtnSiPracticoNecropsia;
    }

    public JRadioButton getRdbtnSiRealizoCirugia() {
        return rdbtnSiRealizoCirugia;
    }

    public JRadioButton getRdbtnSiUtilizaronHallazgos() {
        return rdbtnSiUtilizaronHallazgos;
    }

    public JRadioButton getRdbtnTipoDefuncionAccidente() {
        return rdbtnTipoDefuncionAccidente;
    }

    public JRadioButton getRdbtnTipoDefuncionAgresion() {
        return rdbtnTipoDefuncionAgresion;
    }

    public JRadioButton getRdbtnTipoDefuncionEnfermedad() {
        return rdbtnTipoDefuncionEnfermedad;
    }

    public JRadioButton getRdbtnTipoDefuncionIntencionalmente() {
        return rdbtnTipoDefuncionIntencionalmente;
    }

    public JRadioButton getRdbtnTipoDefuncionIntervencionLegal() {
        return rdbtnTipoDefuncionIntervencionLegal;
    }

    public JRadioButton getRdbtnTipoDefuncionSeIgnora() {
        return rdbtnTipoDefuncionSeIgnora;
    }

    public JRadioButton getRdbtnViviendaColectiva() {
        return rdbtnViviendaColectiva;
    }

    public JRadioButton getRdbtnViviendaParticular() {
        return rdbtnViviendaParticular;
    }

    public JTextField getTxtApellidoMCertificante() {
        return txtApellidoMCertificante;
    }

    public JTextField getTxtApellidoMaternoInf() {
        return txtApellidoMaternoInf;
    }

    public JTextField getTxtApellidoPCertificante() {
        return txtApellidoPCertificante;
    }

    public JTextField getTxtApellidoPaternoInf() {
        return txtApellidoPaternoInf;
    }

    public JTextField getTxtAñoDefuncion() {
        return txtAñoDefuncion;
    }

    public JTextField getTxtAñoRealizoCirugia() {
        return txtAñoRealizoCirugia;
    }

    public JTextField getTxtAñoRegistro() {
        return txtAñoRegistro;
    }

    public JTextField getTxtCausaBasicaDefuncion() {
        return txtCausaBasicaDefuncion;
    }

    public JTextField getTxtCausaDefuncionA() {
        return txtCausaDefuncionA;
    }

    public JTextField getTxtCausaDefuncionB() {
        return txtCausaDefuncionB;
    }

    public JTextField getTxtCausaDefuncionC() {
        return txtCausaDefuncionC;
    }

    public JTextField getTxtCausaDefuncionD() {
        return txtCausaDefuncionD;
    }

    public JTextField getTxtCodigoAdicional() {
        return txtCodigoAdicional;
    }

    public JTextField getTxtCodigoCieA() {
        return txtCodigoCieA;
    }

    public JTextField getTxtCodigoCieB() {
        return txtCodigoCieB;
    }

    public JTextField getTxtCodigoCieC() {
        return txtCodigoCieC;
    }

    public JTextField getTxtCodigoCieD() {
        return txtCodigoCieD;
    }

    public JTextField getTxtCodigoCieIntervaloTiempo() {
        return txtCodigoCieIntervaloTiempo;
    }

    public JTextField getTxtCodigoPostalCertificante() {
        return txtCodigoPostalCertificante;
    }

    public JTextField getTxtCodigoPostalDefuncion() {
        return txtCodigoPostalDefuncion;
    }

    public JTextField getTxtCodigoPostalLesion() {
        return txtCodigoPostalLesion;
    }

    public JTextArea getTxtDescripcionSituacion() {
        return txtDescripcionSituacion;
    }

    public JTextField getTxtDiaDefuncion() {
        return txtDiaDefuncion;
    }

    public JTextField getTxtDiaRealizoCirugia() {
        return txtDiaRealizoCirugia;
    }

    public JTextField getTxtDiaRegistro() {
        return txtDiaRegistro;
    }

    public JTextField getTxtEntidadFederativaCertificante() {
        return txtEntidadFederativaCertificante;
    }

    public JTextField getTxtEntidadFederativaDefuncion() {
        return txtEntidadFederativaDefuncion;
    }

    public JTextField getTxtEntidadFederativaLesion() {
        return txtEntidadFederativaLesion;
    }

    public JTextField getTxtEntidadFederativaRegistro() {
        return txtEntidadFederativaRegistro;
    }

    public JTextField getTxtEspecifiqueOtraAutoridad1() {
        return txtEspecifiqueOtraAutoridad1;
    }

    public JTextField getTxtFechaCertificacionAño() {
        return txtFechaCertificacionAño;
    }

    public JTextField getTxtFechaCertificacionDia() {
        return txtFechaCertificacionDia;
    }

    public JTextField getTxtFechaCertificacionMes() {
        return txtFechaCertificacionMes;
    }

    public JTextField getTxtFirmaCertificante() {
        return txtFirmaCertificante;
    }

    public JTextField getTxtFirmaInformante() {
        return txtFirmaInformante;
    }

    public JTextField getTxtHorasDefuncion() {
        return txtHorasDefuncion;
    }

    public JTextField getTxtIntervaloEnfermedadDefuncionA() {
        return txtIntervaloEnfermedadDefuncionA;
    }

    public JTextField getTxtIntervaloEnfermedadDefuncionB() {
        return txtIntervaloEnfermedadDefuncionB;
    }

    public JTextField getTxtIntervaloEnfermedadDefuncionC() {
        return txtIntervaloEnfermedadDefuncionC;
    }

    public JTextField getTxtIntervaloEnfermedadDefuncionD() {
        return txtIntervaloEnfermedadDefuncionD;
    }

    public JTextField getTxtLocalidadCertificante() {
        return txtLocalidadCertificante;
    }

    public JTextField getTxtLocalidadDefuncion() {
        return txtLocalidadDefuncion;
    }

    public JTextField getTxtLocalidadLesion() {
        return txtLocalidadLesion;
    }

    public JTextField getTxtLocalidadRegistro() {
        return txtLocalidadRegistro;
    }

    public JTextField getTxtMesDefuncion() {
        return txtMesDefuncion;
    }

    public JTextField getTxtMesRealizoCirugia() {
        return txtMesRealizoCirugia;
    }

    public JTextField getTxtMesRegistro() {
        return txtMesRegistro;
    }

    public JTextField getTxtMinutosDefuncion() {
        return txtMinutosDefuncion;
    }

    public JTextField getTxtMotivoCirugia() {
        return txtMotivoCirugia;
    }

    public JTextField getTxtMunicipioAlcaldiaCertificante() {
        return txtMunicipioAlcaldiaCertificante;
    }

    public JTextField getTxtMunicipioAlcaldiaLesion() {
        return txtMunicipioAlcaldiaLesion;
    }

    public JTextField getTxtMunicipioDefuncion() {
        return txtMunicipioDefuncion;
    }

    public JTextField getTxtMunicipioRegistro() {
        return txtMunicipioRegistro;
    }

    public JRadioButton getTxtNoOcurrioDesempeñoTrabajo() {
        return rdbtnNoOcurrioDesempeñoTrabajo;
    }

    public JTextField getTxtNombreAsentamientoHumanoCertificante() {
        return txtNombreAsentamientoHumanoCertificante;
    }

    public JTextField getTxtNombreAsentamientoHumanoDefuncion() {
        return txtNombreAsentamientoHumanoDefuncion;
    }

    public JTextField getTxtNombreAsentamientoHumanoLesion() {
        return txtNombreAsentamientoHumanoLesion;
    }

    public JTextField getTxtNombreCertificante() {
        return txtNombreCertificante;
    }

    public JTextField getTxtNombreInf() {
        return txtNombreInf;
    }

    public JTextField getTxtNombreVialidadCertificante() {
        return txtNombreVialidadCertificante;
    }

    public JTextField getTxtNombreVialidadDefuncion() {
        return txtNombreVialidadDefuncion;
    }

    public JTextField getTxtNombreVialidadLesion() {
        return txtNombreVialidadLesion;
    }

    public JTextField getTxtNumActaFiscalia() {
        return txtNumActaFiscalia;
    }

    public JTextField getTxtNumCedProfesional() {
        return txtNumCedProfesional;
    }

    public JTextField getTxtNumExtCertificante() {
        return txtNumExtCertificante;
    }

    public JTextField getTxtNumExtDefuncion() {
        return txtNumExtDefuncion;
    }

    public JTextField getTxtNumExtLesion() {
        return txtNumExtLesion;
    }

    public JTextField getTxtNumFiscalia() {
        return txtNumFiscalia;
    }

    public JTextField getTxtNumIntCertificante() {
        return txtNumIntCertificante;
    }

    public JTextField getTxtNumIntDefuncion() {
        return txtNumIntDefuncion;
    }

    public JTextField getTxtNumIntLesion() {
        return txtNumIntLesion;
    }

    public JTextField getTxtNumLibroFiscalia() {
        return txtNumLibroFiscalia;
    }

    public JTextField getTxtNumeroActa() {
        return txtNumeroActa;
    }

    public JTextField getTxtOtrasCondiciones() {
        return txtOtrasCondiciones;
    }

    public JTextField getTxtParentescoFamiliar() {
        return txtParentescoFamiliar;
    }

    public JTextField getTxtRelacionAgresorFallecido() {
        return txtRelacionAgresorFallecido;
    }

    public JRadioButton getTxtSeIgnoraOcurrioDesempeñoTrabajo() {
        return rdbtnSeIgnoraOcurrioDesempeñoTrabajo;
    }

    public JRadioButton getTxtSiOcurrioDesempeñoTrabajo() {
        return rdbtnSiOcurrioDesempeñoTrabajo;
    }

    public JTextField getTxtTelefonoCertificante() {
        return txtTelefonoCertificante;
    }

    public JTextField getTxtTipoAsentamientoHumanoCertificante() {
        return txtTipoAsentamientoHumanoCertificante;
    }

    public JTextField getTxtTipoAsentamientoHumanoDefuncion() {
        return txtTipoAsentamientoHumanoDefuncion;
    }

    public JTextField getTxtTipoAsentamientoHumanoLesion() {
        return txtTipoAsentamientoHumanoLesion;
    }

    public JTextField getTxtTipoVialidadCertificante() {
        return txtTipoVialidadCertificante;
    }

    public JTextField getTxtTipoVialidadDefuncion() {
        return txtTipoVialidadDefuncion;
    }

    public JTextField getTxtTipoVialidadLesion() {
        return txtTipoVialidadLesion;
    }

    public JTextField getRdbtnDefuncionNombreUnidadMedica() {
        return txtDefuncionNombreUnidadMedica;
    }

    public JRadioButton getRdbtnDefuncionOtraUnidadMedica() {
        return rdbtnDefuncionOtraUnidadMedica;
    }

    public JRadioButton getRdbtnDefuncionOtroLugar() {
        return rdbtnDefuncionOtroLugar;
    }

    public JRadioButton getRdbtnDefuncionPemex() {
        return rdbtnDefuncionPemex;
    }

    public JRadioButton getRdbtnDefuncionSeIgnora() {
        return rdbtnDefuncionSeIgnora;
    }

    public JRadioButton getRdbtnDefuncionSecretariaSalud() {
        return rdbtnDefuncionSecretariaSalud;
    }

    public JRadioButton getRdbtnDefuncionSedena() {
        return rdbtnDefuncionSedena;
    }

    public JRadioButton getRdbtnDefuncionSemar() {
        return rdbtnDefuncionSemar;
    }

    public JRadioButton getRdbtnDefuncionUnidadMedicaPrivada() {
        return rdbtnDefuncionUnidadMedicaPrivada;
    }

    public JRadioButton getRdbtnDefuncionViaPublica() {
        return rdbtnDefuncionViaPublica;
    }

    public JRadioButton getRdbtnEscuelauOficinaPublica() {
        return rdbtnEscuelauOficinaPublica;
    }

    public JRadioButton getRdbtnGranja() {
        return rdbtnGranja;
    }

    public JRadioButton getRdbtnInvestigacionPendiente() {
        return rdbtnInvestigacionPendiente;
    }

    public JRadioButton getRdbtnMedicoLegista() {
        return rdbtnMedicoLegista;
    }

    public JRadioButton getRdbtnMedicoTratante() {
        return rdbtnMedicoTratante;
    }

    public JRadioButton getRdbtnServiciosDeSaludIMSS() {
        return rdbtnServiciosDeSaludIMSS;
    }

    public JRadioButton getRdbtnServiciosDeSaludIMSSBIENESTAR() {
        return rdbtnServiciosDeSaludIMSSBIENESTAR;
    }

    public JRadioButton getRdbtnServiciosDeSaludISSFAM() {
        return rdbtnServiciosDeSaludISSFAM;
    }

    public JRadioButton getRdbtnServiciosDeSaludISSSTE() {
        return rdbtnServiciosDeSaludISSSTE;
    }

    public JRadioButton getRdbtnServiciosDeSaludNinguna() {
        return rdbtnServiciosDeSaludNinguna;
    }

    public JRadioButton getRdbtnServiciosDeSaludOtra() {
        return rdbtnServiciosDeSaludOtra;
    }

    public JRadioButton getRdbtnServiciosDeSaludPEMEX() {
        return rdbtnServiciosDeSaludPEMEX;
    }

    public JRadioButton getRdbtnServiciosDeSaludSEDENA() {
        return rdbtnServiciosDeSaludSEDENA;
    }

    public JRadioButton getRdbtnServiciosDeSaludSEMAR() {
        return rdbtnServiciosDeSaludSEMAR;
    }

    public JRadioButton getRdbtnServiciosDeSaludSeIgnora() {
        return rdbtnServiciosDeSaludSeIgnora;
    }

    public JTextField getTxtNumeroSeguridadSocial() {
        return txtNumeroSeguridadSocial;
    }

    public JTextField getTxtServiciosDeSaludEspecifique() {
        return txtServiciosDeSaludEspecifique;
    }

    public JTextField getTxtCodigoPostal() {
        return txtCodigoPostal;
    }

    public JTextField getTxtEntidadFederativaPais() {
        return txtEntidadFederativaPais;
    }

    public JTextField getTxtLocalidad() {
        return txtLocalidad;
    }

    public JTextField getTxtMunicipioAlcaldia() {
        return txtMunicipioAlcaldia;
    }

    public JTextField getTxtNombreAsentamientoHumano() {
        return txtNombreAsentamientoHumano;
    }

    public JTextField getTxtNombreVialidad() {
        return txtNombreVialidad;
    }

    public JTextField getTxtNumExt() {
        return txtNumExt;
    }

    public JTextField getTxtNumInt() {
        return txtNumInt;
    }

    public JTextField getTxtTipoAsentamientoHumano() {
        return txtTipoAsentamientoHumano;
    }

    public JTextField getTxtTipoVialidad() {
        return txtTipoVialidad;
    }

    public JComboBox<String> getjComboBoxTiempo() {
        return jComboBoxTiempo;
    }

    public JRadioButton getRdbtnCasado() {
        return rdbtnCasado;
    }

    public JRadioButton getRdbtnSeIgnoraSituacionConyugal() {
        return rdbtnSeIgnoraSituacionConyugal;
    }

    public JRadioButton getRdbtnSeparado() {
        return rdbtnSeparado;
    }

    public JRadioButton getRdbtnDivorciado() {
        return rdbtnDivorciado;
    }

    public JRadioButton getRdbtnSoltero() {
        return rdbtnSoltero;
    }

    public JRadioButton getRdbtnUnionLibre() {
        return rdbtnUnionLibre;
    }

    public JRadioButton getRdbtnViudo() {
        return rdbtnViudo;
    }

    public JRadioButton getRdbtnSeIgnoraEdad() {
        return rdbtnSeIgnoraEdad;
    }

    public JTextField getTxtEdadTiempo() {
        return txtEdadTiempo;
    }

    public JTabbedPane getTabbedPaneCertificadoDefuncion() {
        return tabbedPaneCertificadoDefuncion;
    }

    public JRadioButton getRdbtnAreaComercialoServicio() {
        return rdbtnAreaComercialoServicio;
    }

    public JRadioButton getRdbtnAreaDeportiva() {
        return rdbtnAreaDeportiva;
    }

    public JRadioButton getRdbtnAreaIndustrial() {
        return rdbtnAreaIndustrial;
    }

    public JRadioButton getRdbtnAutoridadCivil() {
        return rdbtnAutoridadCivil;
    }

    public JRadioButton getRdbtnCalleoCarretera() {
        return rdbtnCalleoCarretera;
    }

    public JTextField getRdbtnDefuncionClaveUnicaEstablecimientos() {
        return txtDefuncionClaveUnicaEstablecimientos;
    }

    public JRadioButton getRdbtnDefuncionHogar() {
        return rdbtnDefuncionHogar;
    }

    public JRadioButton getRdbtnDefuncionImss() {
        return rdbtnDefuncionImss;
    }

    public JRadioButton getRdbtnDefuncionImssBienestar() {
        return rdbtnDefuncionImssBienestar;
    }

    public JRadioButton getRdbtnDefuncionIssste() {
        return rdbtnDefuncionIssste;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioCertificadoDefuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioCertificadoDefuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioCertificadoDefuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioCertificadoDefuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaFormularioCertificadoDefuncion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarFormulario;
    private javax.swing.JButton btnRegresarVista10;
    private javax.swing.JButton btnRegresarVista11;
    private javax.swing.JButton btnRegresarVista12;
    private javax.swing.JButton btnRegresarVista13;
    private javax.swing.JButton btnRegresarVista14;
    private javax.swing.JButton btnRegresarVista15;
    private javax.swing.JButton btnRegresarVista16;
    private javax.swing.JButton btnRegresarVista17;
    private javax.swing.JButton btnRegresarVista18;
    private javax.swing.JButton btnRegresarVista2;
    private javax.swing.JButton btnRegresarVista3;
    private javax.swing.JButton btnRegresarVista4;
    private javax.swing.JButton btnRegresarVista5;
    private javax.swing.JButton btnRegresarVista6;
    private javax.swing.JButton btnRegresarVista7;
    private javax.swing.JButton btnRegresarVista8;
    private javax.swing.JButton btnRegresarVista9;
    private javax.swing.JButton btnSiguienteVista1;
    private javax.swing.JButton btnSiguienteVista10;
    private javax.swing.JButton btnSiguienteVista11;
    private javax.swing.JButton btnSiguienteVista12;
    private javax.swing.JButton btnSiguienteVista13;
    private javax.swing.JButton btnSiguienteVista14;
    private javax.swing.JButton btnSiguienteVista15;
    private javax.swing.JButton btnSiguienteVista16;
    private javax.swing.JButton btnSiguienteVista17;
    private javax.swing.JButton btnSiguienteVista2;
    private javax.swing.JButton btnSiguienteVista3;
    private javax.swing.JButton btnSiguienteVista4;
    private javax.swing.JButton btnSiguienteVista5;
    private javax.swing.JButton btnSiguienteVista6;
    private javax.swing.JButton btnSiguienteVista7;
    private javax.swing.JButton btnSiguienteVista8;
    private javax.swing.JButton btnSiguienteVista9;
    private javax.swing.ButtonGroup buttonGroupAccidentalViolenta;
    private javax.swing.ButtonGroup buttonGroupAfiliacionServiciosSalud;
    private javax.swing.ButtonGroup buttonGroupAfromexicano;
    private javax.swing.ButtonGroup buttonGroupAtencionMedicaDuranteEnfermedad;
    private javax.swing.ButtonGroup buttonGroupCausasQueComplicacion;
    private javax.swing.ButtonGroup buttonGroupComplicacionesPropias;
    private javax.swing.ButtonGroup buttonGroupConsiderabaIndigena;
    private javax.swing.ButtonGroup buttonGroupDefuncionAccidental;
    private javax.swing.ButtonGroup buttonGroupDelCertificante;
    private javax.swing.ButtonGroup buttonGroupDonadorOrganos;
    private javax.swing.ButtonGroup buttonGroupEscolaridad;
    private javax.swing.ButtonGroup buttonGroupEscolaridadSeleccionada;
    private javax.swing.ButtonGroup buttonGroupHablabaLenguaIndigena;
    private javax.swing.ButtonGroup buttonGroupHallazgosEnCertificacion;
    private javax.swing.ButtonGroup buttonGroupInvestigacion;
    private javax.swing.ButtonGroup buttonGroupLugarOcurrioLesion;
    private javax.swing.ButtonGroup buttonGroupMuerteDurante;
    private javax.swing.ButtonGroup buttonGroupMuerteEncefalica;
    private javax.swing.ButtonGroup buttonGroupNacionalidad;
    private javax.swing.ButtonGroup buttonGroupPracticoNecropsia;
    private javax.swing.ButtonGroup buttonGroupRealizoCirugia;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.ButtonGroup buttonGroupSitioDefuncion;
    private javax.swing.ButtonGroup buttonGroupSituacionConyugal;
    private javax.swing.ButtonGroup buttonGroupTipoDefuncion;
    private javax.swing.ButtonGroup buttonGroupTrabajaba;
    private javax.swing.JComboBox<String> jComboBoxTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelVista1;
    private javax.swing.JPanel jPanelVista10;
    private javax.swing.JPanel jPanelVista11;
    private javax.swing.JPanel jPanelVista12;
    private javax.swing.JPanel jPanelVista13;
    private javax.swing.JPanel jPanelVista14;
    private javax.swing.JPanel jPanelVista15;
    private javax.swing.JPanel jPanelVista16;
    private javax.swing.JPanel jPanelVista17;
    private javax.swing.JPanel jPanelVista18;
    private javax.swing.JPanel jPanelVista2;
    private javax.swing.JPanel jPanelVista3;
    private javax.swing.JPanel jPanelVista4;
    private javax.swing.JPanel jPanelVista5;
    private javax.swing.JPanel jPanelVista6;
    private javax.swing.JPanel jPanelVista7;
    private javax.swing.JPanel jPanelVista8;
    private javax.swing.JPanel jPanelVista9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator83;
    private javax.swing.JRadioButton rdbtnAreaComercialoServicio;
    private javax.swing.JRadioButton rdbtnAreaDeportiva;
    private javax.swing.JRadioButton rdbtnAreaIndustrial;
    private javax.swing.JRadioButton rdbtnAutoridadCivil;
    private javax.swing.JRadioButton rdbtnCalleoCarretera;
    private javax.swing.JRadioButton rdbtnCasado;
    private javax.swing.JRadioButton rdbtnDefuncionHogar;
    private javax.swing.JRadioButton rdbtnDefuncionImss;
    private javax.swing.JRadioButton rdbtnDefuncionImssBienestar;
    private javax.swing.JRadioButton rdbtnDefuncionIssste;
    private javax.swing.JRadioButton rdbtnDefuncionOtraUnidadMedica;
    private javax.swing.JRadioButton rdbtnDefuncionOtroLugar;
    private javax.swing.JRadioButton rdbtnDefuncionPemex;
    private javax.swing.JRadioButton rdbtnDefuncionSeIgnora;
    private javax.swing.JRadioButton rdbtnDefuncionSecretariaSalud;
    private javax.swing.JRadioButton rdbtnDefuncionSedena;
    private javax.swing.JRadioButton rdbtnDefuncionSemar;
    private javax.swing.JRadioButton rdbtnDefuncionUnidadMedicaPrivada;
    private javax.swing.JRadioButton rdbtnDefuncionViaPublica;
    private javax.swing.JRadioButton rdbtnDivorciado;
    private javax.swing.JRadioButton rdbtnEscolaridadBachilleratoPreparatoria;
    private javax.swing.JRadioButton rdbtnEscolaridadCompleta;
    private javax.swing.JRadioButton rdbtnEscolaridadIncompleta;
    private javax.swing.JRadioButton rdbtnEscolaridadNinguna;
    private javax.swing.JRadioButton rdbtnEscolaridadPosgrado;
    private javax.swing.JRadioButton rdbtnEscolaridadPreescolar;
    private javax.swing.JRadioButton rdbtnEscolaridadPrimaria;
    private javax.swing.JRadioButton rdbtnEscolaridadProfesional;
    private javax.swing.JRadioButton rdbtnEscolaridadSeIgnora;
    private javax.swing.JRadioButton rdbtnEscolaridadSecundaria;
    private javax.swing.JRadioButton rdbtnEscuelauOficinaPublica;
    private javax.swing.JRadioButton rdbtnGranja;
    private javax.swing.JRadioButton rdbtnHombre;
    private javax.swing.JRadioButton rdbtnInvestigacionPendiente;
    private javax.swing.JRadioButton rdbtnMedicoLegista;
    private javax.swing.JRadioButton rdbtnMedicoTratante;
    private javax.swing.JRadioButton rdbtnMuerteDespuesPartoAborto;
    private javax.swing.JRadioButton rdbtnMuerteDuranteEmbarazo;
    private javax.swing.JRadioButton rdbtnMuerteDuranteParto;
    private javax.swing.JRadioButton rdbtnMuerteDurantePuerperio;
    private javax.swing.JRadioButton rdbtnMujer;
    private javax.swing.JRadioButton rdbtnNacionalidadMex;
    private javax.swing.JRadioButton rdbtnNoAfromexicano;
    private javax.swing.JRadioButton rdbtnNoAtencionMedica;
    private javax.swing.JRadioButton rdbtnNoComplicaciones;
    private javax.swing.JRadioButton rdbtnNoComplicacionesPropias;
    private javax.swing.JRadioButton rdbtnNoDefuncionAccidentalViolenta;
    private javax.swing.JRadioButton rdbtnNoDonadorOrganos;
    private javax.swing.JRadioButton rdbtnNoEstuvoEmbarazadaPreviamente;
    private javax.swing.JRadioButton rdbtnNoIndigena;
    private javax.swing.JRadioButton rdbtnNoLenguaIndigena;
    private javax.swing.JRadioButton rdbtnNoMuerteEncefalica;
    private javax.swing.JRadioButton rdbtnNoOcurrioDesempeñoTrabajo;
    private javax.swing.JRadioButton rdbtnNoPracticoNecropsia;
    private javax.swing.JRadioButton rdbtnNoPuedeDeterminarse;
    private javax.swing.JRadioButton rdbtnNoRealizoCirugia;
    private javax.swing.JRadioButton rdbtnNoTrabajaba;
    private javax.swing.JRadioButton rdbtnNoUtilizaronHallazgos;
    private javax.swing.JRadioButton rdbtnOcupacionHabitualSeIgnora;
    private javax.swing.JRadioButton rdbtnOtraNacionalidad;
    private javax.swing.JRadioButton rdbtnOtro;
    private javax.swing.JRadioButton rdbtnOtroLugar;
    private javax.swing.JRadioButton rdbtnOtroMedico;
    private javax.swing.JRadioButton rdbtnPersonaAutorizada;
    private javax.swing.JRadioButton rdbtnPersonaDesconocida;
    private javax.swing.JRadioButton rdbtnSeIgnoraAfromexicano;
    private javax.swing.JRadioButton rdbtnSeIgnoraAtencionMedica;
    private javax.swing.JRadioButton rdbtnSeIgnoraDefuncionAccidentalViolenta;
    private javax.swing.JRadioButton rdbtnSeIgnoraEdad;
    private javax.swing.JRadioButton rdbtnSeIgnoraIndigena;
    private javax.swing.JRadioButton rdbtnSeIgnoraLenguaIndigena;
    private javax.swing.JRadioButton rdbtnSeIgnoraLugar;
    private javax.swing.JRadioButton rdbtnSeIgnoraNacionalidad;
    private javax.swing.JRadioButton rdbtnSeIgnoraOcurrioDesempeñoTrabajo;
    private javax.swing.JRadioButton rdbtnSeIgnoraPracticoNecropsia;
    private javax.swing.JRadioButton rdbtnSeIgnoraRealizoCirugia;
    private javax.swing.JRadioButton rdbtnSeIgnoraSexo;
    private javax.swing.JRadioButton rdbtnSeIgnoraSituacionConyugal;
    private javax.swing.JRadioButton rdbtnSeIgnoraTrabajaba;
    private javax.swing.JRadioButton rdbtnSeparado;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludIMSS;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludIMSSBIENESTAR;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludISSFAM;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludISSSTE;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludNinguna;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludOtra;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludPEMEX;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludSEDENA;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludSEMAR;
    private javax.swing.JRadioButton rdbtnServiciosDeSaludSeIgnora;
    private javax.swing.JRadioButton rdbtnSiAfromexicano;
    private javax.swing.JRadioButton rdbtnSiAtencionMedica;
    private javax.swing.JRadioButton rdbtnSiComplicaciones;
    private javax.swing.JRadioButton rdbtnSiComplicacionesPropias;
    private javax.swing.JRadioButton rdbtnSiDefuncionAccidentalViolenta;
    private javax.swing.JRadioButton rdbtnSiDonadorOrganos;
    private javax.swing.JRadioButton rdbtnSiIndigena;
    private javax.swing.JRadioButton rdbtnSiLenguaIndigena;
    private javax.swing.JRadioButton rdbtnSiMuerteEncefalica;
    private javax.swing.JRadioButton rdbtnSiOcurrioDesempeñoTrabajo;
    private javax.swing.JRadioButton rdbtnSiPracticoNecropsia;
    private javax.swing.JRadioButton rdbtnSiRealizoCirugia;
    private javax.swing.JRadioButton rdbtnSiTrabajaba;
    private javax.swing.JRadioButton rdbtnSiUtilizaronHallazgos;
    private javax.swing.JRadioButton rdbtnSoltero;
    private javax.swing.JRadioButton rdbtnTipoDefuncionAccidente;
    private javax.swing.JRadioButton rdbtnTipoDefuncionAgresion;
    private javax.swing.JRadioButton rdbtnTipoDefuncionEnfermedad;
    private javax.swing.JRadioButton rdbtnTipoDefuncionIntencionalmente;
    private javax.swing.JRadioButton rdbtnTipoDefuncionIntervencionLegal;
    private javax.swing.JRadioButton rdbtnTipoDefuncionSeIgnora;
    private javax.swing.JRadioButton rdbtnUnionLibre;
    private javax.swing.JRadioButton rdbtnViudo;
    private javax.swing.JRadioButton rdbtnViviendaColectiva;
    private javax.swing.JRadioButton rdbtnViviendaParticular;
    private javax.swing.JTabbedPane tabbedPaneCertificadoDefuncion;
    private javax.swing.JTextField txtApellidoMCertificante;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoMaternoInf;
    private javax.swing.JTextField txtApellidoPCertificante;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtApellidoPaternoInf;
    private javax.swing.JTextField txtAñoDefuncion;
    private javax.swing.JTextField txtAñoNacimiento;
    private javax.swing.JTextField txtAñoRealizoCirugia;
    private javax.swing.JTextField txtAñoRegistro;
    private javax.swing.JTextField txtCausaBasicaDefuncion;
    private javax.swing.JTextField txtCausaDefuncionA;
    private javax.swing.JTextField txtCausaDefuncionB;
    private javax.swing.JTextField txtCausaDefuncionC;
    private javax.swing.JTextField txtCausaDefuncionD;
    private javax.swing.JTextField txtCodigoAdicional;
    private javax.swing.JTextField txtCodigoCieA;
    private javax.swing.JTextField txtCodigoCieB;
    private javax.swing.JTextField txtCodigoCieC;
    private javax.swing.JTextField txtCodigoCieD;
    private javax.swing.JTextField txtCodigoCieIntervaloTiempo;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtCodigoPostalCertificante;
    private javax.swing.JTextField txtCodigoPostalDefuncion;
    private javax.swing.JTextField txtCodigoPostalLesion;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtDefuncionClaveUnicaEstablecimientos;
    private javax.swing.JTextField txtDefuncionNombreUnidadMedica;
    private javax.swing.JTextArea txtDescripcionSituacion;
    private javax.swing.JTextField txtDiaDefuncion;
    private javax.swing.JTextField txtDiaNacimiento;
    private javax.swing.JTextField txtDiaRealizoCirugia;
    private javax.swing.JTextField txtDiaRegistro;
    private javax.swing.JTextField txtEdadTiempo;
    private javax.swing.JTextField txtEntidadFederativaCertificante;
    private javax.swing.JTextField txtEntidadFederativaDefuncion;
    private javax.swing.JTextField txtEntidadFederativaLesion;
    private javax.swing.JTextField txtEntidadFederativaPais;
    private javax.swing.JTextField txtEntidadFederativaRegistro;
    private javax.swing.JTextField txtEntidadNacimiento;
    private javax.swing.JTextField txtEspecifiqueLenguaIndigena;
    private javax.swing.JTextField txtEspecifiqueNacionalidad;
    private javax.swing.JTextField txtEspecifiqueOtraAutoridad1;
    private javax.swing.JTextField txtFechaCertificacionAño;
    private javax.swing.JTextField txtFechaCertificacionDia;
    private javax.swing.JTextField txtFechaCertificacionMes;
    private javax.swing.JTextField txtFirmaCertificante;
    private javax.swing.JTextField txtFirmaInformante;
    private javax.swing.JTextField txtFolioCertificadoNacimiento;
    private javax.swing.JTextField txtHorasDefuncion;
    private javax.swing.JTextField txtIntervaloEnfermedadDefuncionA;
    private javax.swing.JTextField txtIntervaloEnfermedadDefuncionB;
    private javax.swing.JTextField txtIntervaloEnfermedadDefuncionC;
    private javax.swing.JTextField txtIntervaloEnfermedadDefuncionD;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtLocalidadCertificante;
    private javax.swing.JTextField txtLocalidadDefuncion;
    private javax.swing.JTextField txtLocalidadLesion;
    private javax.swing.JTextField txtLocalidadRegistro;
    private javax.swing.JTextField txtMesDefuncion;
    private javax.swing.JTextField txtMesNacimiento;
    private javax.swing.JTextField txtMesRealizoCirugia;
    private javax.swing.JTextField txtMesRegistro;
    private javax.swing.JTextField txtMinutosDefuncion;
    private javax.swing.JTextField txtMotivoCirugia;
    private javax.swing.JTextField txtMunicipioAlcaldia;
    private javax.swing.JTextField txtMunicipioAlcaldiaCertificante;
    private javax.swing.JTextField txtMunicipioAlcaldiaLesion;
    private javax.swing.JTextField txtMunicipioDefuncion;
    private javax.swing.JTextField txtMunicipioRegistro;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreAsentamientoHumano;
    private javax.swing.JTextField txtNombreAsentamientoHumanoCertificante;
    private javax.swing.JTextField txtNombreAsentamientoHumanoDefuncion;
    private javax.swing.JTextField txtNombreAsentamientoHumanoLesion;
    private javax.swing.JTextField txtNombreCertificante;
    private javax.swing.JTextField txtNombreInf;
    private javax.swing.JTextField txtNombreVialidad;
    private javax.swing.JTextField txtNombreVialidadCertificante;
    private javax.swing.JTextField txtNombreVialidadDefuncion;
    private javax.swing.JTextField txtNombreVialidadLesion;
    private javax.swing.JTextField txtNumActaFiscalia;
    private javax.swing.JTextField txtNumCedProfesional;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumExtCertificante;
    private javax.swing.JTextField txtNumExtDefuncion;
    private javax.swing.JTextField txtNumExtLesion;
    private javax.swing.JTextField txtNumFiscalia;
    private javax.swing.JTextField txtNumInt;
    private javax.swing.JTextField txtNumIntCertificante;
    private javax.swing.JTextField txtNumIntDefuncion;
    private javax.swing.JTextField txtNumIntLesion;
    private javax.swing.JTextField txtNumLibroFiscalia;
    private javax.swing.JTextField txtNumeroActa;
    private javax.swing.JTextField txtNumeroSeguridadSocial;
    private javax.swing.JTextField txtOcupacionHabitual;
    private javax.swing.JTextField txtOtrasCondiciones;
    private javax.swing.JTextField txtParentescoFamiliar;
    private javax.swing.JTextField txtPesoAlNacer;
    private javax.swing.JTextField txtRelacionAgresorFallecido;
    private javax.swing.JTextField txtSemanasGestacion;
    private javax.swing.JTextField txtServiciosDeSaludEspecifique;
    private javax.swing.JTextField txtTelefonoCertificante;
    private javax.swing.JTextField txtTipoAsentamientoHumano;
    private javax.swing.JTextField txtTipoAsentamientoHumanoCertificante;
    private javax.swing.JTextField txtTipoAsentamientoHumanoDefuncion;
    private javax.swing.JTextField txtTipoAsentamientoHumanoLesion;
    private javax.swing.JTextField txtTipoVialidad;
    private javax.swing.JTextField txtTipoVialidadCertificante;
    private javax.swing.JTextField txtTipoVialidadDefuncion;
    private javax.swing.JTextField txtTipoVialidadLesion;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JRadioButton getRdbtnPersonaDesconocida() {
        return rdbtnPersonaDesconocida;
    }

    public javax.swing.JTextField getTxtApellidoMaterno() {
        return txtApellidoMaterno;
    }

    public javax.swing.JTextField getTxtApellidoPaterno() {
        return txtApellidoPaterno;
    }

    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }

    public javax.swing.JTextField getTxtAñoNacimiento() {
        return txtAñoNacimiento;
    }

    public javax.swing.JTextField getTxtDiaNacimiento() {
        return txtDiaNacimiento;
    }

    public javax.swing.JTextField getTxtMesNacimiento() {
        return txtMesNacimiento;
    }

    public javax.swing.JRadioButton getRdbtnHombre() {
        return rdbtnHombre;
    }

    public javax.swing.JRadioButton getRdbtnMujer() {
        return rdbtnMujer;
    }

    public javax.swing.JRadioButton getRdbtnSeIgnoraSexo() {
        return rdbtnSeIgnoraSexo;
    }
}
