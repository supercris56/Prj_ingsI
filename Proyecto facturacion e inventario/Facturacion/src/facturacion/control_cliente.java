
package facturacion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    
    
    
/**
 *
 * @author CB-JS
 */

/**
 *
 * @version 1.0
 */
public class control_cliente extends Persona {
 
    /**
     *
     */
    private Sentencias_sql sql; 

    /**
     *
     * @param documento documento cliente
     * @param tipo tipo cliente
     * @param nombres nombre cliente
     * @param apellidos aplellidos cliente
     * @param direccion direccion cliente
     * @param ciudad ciudad cliente
     * @param telefono telefono cliente
     */
    public control_cliente(String documento, String tipo, String nombres, String apellidos, String direccion, String ciudad,String telefono) {
        super(documento, tipo, nombres, apellidos, direccion, ciudad,telefono);
        sql = new Sentencias_sql();
    }   
    
    /**
     *
     * @return ingresar
     */
    public boolean ingresar_cliente()
    {               
        
            String datos[] = {documento,tipo,nombres,apellidos,direccion,ciudad,telefono};           
            return sql.insertar(datos, "insert into Cliente(Documento, cod_tipo_documento, Nombres, Apellidos, Direccion, cod_ciudad,Telefono) values(?,?,?,?,?,?,?)");
                      
                
    }
    
    /**
     *
     * @return datos
     */
    public Object[][] consulta_clientes(){
        String[] columnas={"Documento","Descripcion","Nombres","Apellidos","Direccion","Nombre_ciudad","Telefono"};
        Object[][] datos = sql.GetTabla(columnas, "cliente", "select Documento,Descripcion,Nombres,Apellidos,Direccion,Nombre_ciudad,Telefono from cliente,ciudad,tipo_de_documento where id_tipo_documento=cod_tipo_documento and Codigo_ciudad=cod_ciudad;");
        return datos;
    }
     
    
    
}