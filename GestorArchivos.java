public class GestorArchivos {

    Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {

        this.almacenamiento = almacenamiento;

    }

    public void GuardarContenido(String nombre, String tipoArchivo) {

        almacenamiento.GuardarContenido(nombre, tipoArchivo);

    }

    public void RecuperarContenido(String nombre, String fecha, String tipoArchivo) {

        almacenamiento.RecuperarArchivos(nombre, fecha, tipoArchivo);

    }
}
