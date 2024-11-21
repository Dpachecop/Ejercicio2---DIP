public class MainArchivos {
    public static void main(String[] args) {

        Almacenamiento AlmacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorArchivos = new GestorArchivos(AlmacenamientoNube);
        gestorArchivos.GuardarContenido("Foto familia", "imagen");
        gestorArchivos.RecuperarArchivos("Foto playa", "23/11/19", "Imagen" );



        Almacenamiento AlmacenamientoLocal = new AlmacenamientoLocal();
        gestorArchivos = new GestorArchivos(AlmacenamientoLocal);
        gestorArchivos.GuardarContenido("Curriculum", "PDF");
        gestorArchivos.RecuperarArchivos("Renuncia trabajo", "23/11/19", "WORD" );

    }

}
