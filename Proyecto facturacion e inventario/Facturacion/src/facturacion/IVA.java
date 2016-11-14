
package facturacion;

/**
 *
 * @author CB-JS
 */

/**
 *
 * @version 1.0
 */
public class IVA {
    
    private Double precio;
    
    
    public IVA(Double precio) {
        this.precio = precio;
       
    }
   
    public  Double calcular_iva()
    { 
        double iva;               
        iva = precio*16/100;
        return iva;
        
    }
    }

