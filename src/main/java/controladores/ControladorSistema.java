package controladores;


public class ControladorSistema {

    // Método para iniciar el proceso de generación del certificado de defunción
    public static void iniciarGenerarCertificadoDefuncion() {
        ControladorFormularioCertificadoDefuncion.mostrar();
    }

    // Método para iniciar el proceso de inicio de sesión
    public static void iniciarLogin() {
        ControladorLogin.mostrar();
    }
    
    public static void iniciarMenuPrincipal(){
        ControladorMenuPrincipal.mostrar();
    }
}
