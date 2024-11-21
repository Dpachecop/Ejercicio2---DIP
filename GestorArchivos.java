public class GestorArchivos implements Almacenamiento {

    Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {

        this.almacenamiento = almacenamiento;

    }

    

    @Override
    public void RecuperarArchivos(String nombre, String fechaEliminacion, String tipoArchivo) {
         almacenamiento.RecuperarArchivos(nombre, fechaEliminacion, tipoArchivo);
    }



    @Override
    public void GuardarContenido(String nombre, String tipoArchivo) {
        almacenamiento.GuardarContenido(nombre, tipoArchivo);
    }
}
