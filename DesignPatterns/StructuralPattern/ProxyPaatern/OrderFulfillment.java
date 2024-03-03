package ProxyPaatern;

import java.util.List;

public class OrderFulfillment implements IOrder {
    
    private List<Warehouse> warehouses;

    /* Constructors and other attributes would go here */

    public void fulfillOrder(Object order){
        /* For each item
         * in a custom order, check each warehouse
         * to see if it is n stock.
         * If it is then create a new order for that ware house
         * Else check the next ware house.
         * 
         * send the all the Orders to the warehouse(s) after you finish
         * iteraitng over all the items in the orginal Order. 
         * 
         * 
         */
        for(Item item:order.itemList){
           for(Warehouse:warehouses) {

           }
        }
        return;
    }
}
