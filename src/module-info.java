/**
 * 
 */
/**
 * 
 */
module hexagonal {
	requires org.slf4j;
	
	// Permite que SLF4J acceda a tus paquetes para mostrar nombres de clase
    opens com.hexagonal.dominio to org.slf4j;
    opens com.hexagonal.adaptador to org.slf4j;
    
    // Si en el futuro otro módulo necesita usar tus clases
    exports com.hexagonal.dominio;
}