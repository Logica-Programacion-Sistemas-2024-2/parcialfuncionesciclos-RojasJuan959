
package parcial1g2;


public class App {
    
    public static void main(String[] args) {
        
        // Logica de solución

    }

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    public static int calcularTotalImpuestos(String decada, int avaluo) {
        try {
            int totalPago = 0;
            double tasaRodamiento = 0;
            double tasaSeguro = 0;
    
            switch (decada) {
                case "70":
                    tasaRodamiento = 0.0376;
                    tasaSeguro = 0.00876;
                    break;
                case "80":
                    tasaRodamiento = 0.0398;
                    tasaSeguro = 0.00854;
                    break;
                case "90":
                    tasaRodamiento = 0.0409;
                    tasaSeguro = 0.00816;
                    break;
                case "00":
                    tasaRodamiento = 0.0434;
                    tasaSeguro = 0.00798;
                    break;
                case "10":
                    tasaRodamiento = 0.0493;
                    tasaSeguro = 0.00712;
                    break;
                case "20":
                    tasaRodamiento = 0.0568;
                    tasaSeguro = 0.00699;
                    break;
                default:  // Para cualquier otra década no listada
                    tasaRodamiento = 0.06;
                    tasaSeguro = 0.009;
                    break;
            }
    
            // Calcular el impuesto de rodamiento
            int impuestoRodamiento = (int) (avaluo * tasaRodamiento);
    
            // Calcular el seguro
            int seguro = (int) (avaluo * tasaSeguro);
    
            // Calcular el total a pagar
            totalPago = impuestoRodamiento + seguro;
    
            return totalPago;
    
        } catch (Exception e) {
            // Si hay un error, devolver 0
            return 0;
        }
    }
    //------------------------------------------------------------------

}
