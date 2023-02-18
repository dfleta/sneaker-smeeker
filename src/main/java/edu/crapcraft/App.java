package edu.crapcraft;

import edu.crapcraft.raffle.Entry;
import edu.crapcraft.raffle.GUI;
import edu.crapcraft.raffle.Raffle;
import edu.crapcraft.raffle.Sizes;
import edu.crapcraft.raffle.Sneaker;

/**
 * Cuando una tienda de zapatillas recibe
 * una remesa de sneakers de coleccion
 * organiza una rifa entre los usuarios
 * registrados para sortear el derecho
 * a comprar la zapatilla.
 * 
 * La participante introduce sus datos
 * personales para el envío del paquete
 * y autoriza un cargo en su sistema de pago
 * preferido para que, si resulta agraciada,
 * la tienda ejecute el cobro pendiente por
 * el precio de la zapatilla.
 * 
 * Si la participante no resulta elegida,
 * la tienda solicita la anulación del cobro
 * y el sistema de pago elimina el cargo
 * en la cuenta cliente.
 * 
 * Sólo se permite una participación por 
 * persona, por lo que la tienda se 
 * encarga de implementar
 * una serie de medidas para evitar las
 * dobles entradas (gente que participa
 * dos veces con la misma cuenta) 
 * y bots de personas que disponen
 * de más de una cuenta en el sistema.
 * 
 * Implementa las historias de usuario 
 * de las GUI proporcionadas, pero en ASCII.
 * 
 * La lógica tras cada historia de usuario 
 * está descrita en el `main` de la clase
 * principal `App.java`.
 * 
 * Si tienes dudas, puedes interactuar con
 * la webapp XXXXXXXXXXX
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * Crea la rifa y printa sus datos.
         * 
         * La funcion draw()
         * printa las propiedades
         * de la zapatilla:
         * - Estilo
         * - Nombre
         * - Precio
         * - Tallas disponibles
         * 
         * Las tallas se seleccionan por rango
         * de menor a mayor de entre las siguientes:
         * 6.5 US / 39 EU, 7.0 US / 40 EU, 7.5 US / 40 1/2 EU, 
         * 8.0 US / 41 EU, 8.5 US / 42 EU,
         * 9.0 US / 42 1/2 EU, 9.5 US / 43 EU
         */

        Raffle craft = new Sneaker("Nike Craft General Purpose", "Brown", 109.99);
        // indica el rango de tallas
        craft.sizesRun(Sizes.CUARENTA, Sizes.CUARENTAYDOS);
        GUI.drawSneaker(craft);

        /**
         * El usuario Squanchy introduce sus datos
         * para obtener una participacion.
         * - Nombre
         * - Correo electronico
         * - Talla
         * - Direccion de envio
         * - Metodo de pago
         * - Total
         */

        Entry entry = new Entry("squanchy@closet.in");
        entry.setUserName("Squanchy");
        entry.setSize(Sizes.CUARENTA);
        entry.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        entry.setTotal(craft.price());
        entry.payment("Paypal");

        // añade a la clase GUI el componente para representar la entrada
        GUI.drawEntry(entry);

        /**
         * Conecta con el sistema de pagos para
         * autorizar el pago.
         * 
         * El sistema de pagos autoriza el cargo
         * y lo deja pendiente de cobro
         * hasta que el usuario gana la rifa. 
         */
    }
}
