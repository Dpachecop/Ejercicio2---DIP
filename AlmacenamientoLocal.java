public class AlmacenamientoLocal  implements Almacenamiento{

    @Override
    public void RecuperarArchivos(String nombre, String fechaEliminacion, String tipoArchivo) {
        System.out.println("Su archivo " + nombre + " en formato " + tipoArchivo + " Eliminado el dia: " + fechaEliminacion + " Fue recuperado con exito de su almacenamiento local");
    }

    @Override
    public void GuardarContenido(String nombre, String tipoArchivo) {
       System.out.println("Su archivo " + nombre + " en formato " + tipoArchivo + " fue guardado con exito en su almacenamiento local");
    
}}
