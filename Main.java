public class Main {
    public static void main(String[] args) {

        Almacenamiento AlmacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorArchivos = new GestorArchivos(AlmacenamientoNube);
        gestorArchivos.GuardarContenido("Foto familia", "imagen");
        gestorArchivos.RecuperarContenido("Foto playa", "23/11/19", "Imagen" );



        Almacenamiento AlmacenamientoLocal = new AlmacenamientoLocal();
        gestorArchivos = new GestorArchivos(AlmacenamientoLocal);
        gestorArchivos.GuardarContenido("Curriculum", "PDF");
        gestorArchivos.RecuperarContenido("Renuncia trabajo", "23/11/19", "WORD" );

    }

}
