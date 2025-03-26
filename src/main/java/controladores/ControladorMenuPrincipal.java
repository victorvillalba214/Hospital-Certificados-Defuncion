package controladores;

import vistas.MenuPrincipal;

public class ControladorMenuPrincipal {

    public static MenuPrincipal menuPrincipal = new MenuPrincipal();

    public static void mostrar() {
        menuPrincipal.setVisible(true);
    }
    
    public static void logout(){
        menuPrincipal.dispose();
        ControladorSistema.iniciarLogin();
    }
}
