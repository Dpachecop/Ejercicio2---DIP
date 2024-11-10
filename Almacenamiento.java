public interface Almacenamiento {
 
     void RecuperarArchivos(String nombre, String fechaEliminacion , String tipoArchivo ) ;
     void GuardarContenido(String nombre, String tipoArchivo);

    
}