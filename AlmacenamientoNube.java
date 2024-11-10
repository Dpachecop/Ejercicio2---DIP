public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void RecuperarArchivos(String nombre, String fechaEliminacion, String tipoArchivo) {
        System.out.println("Su archivo " + nombre + " en formato " +" Eliminado el dia: " + fechaEliminacion + " Fue recuperado con exito en su almanecamiento de su nube");
    }

    @Override
    public void GuardarContenido(String nombre, String tipoArchivo) {
       System.out.println("Su archivo " + nombre + " en formato " + tipoArchivo + " fue guardado con exito en el almacenamiento de su nube.");
    
}}
