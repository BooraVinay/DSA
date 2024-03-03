package ProxyPaatern;

import java.util.HashMap;

public class Warehouse implements IOrder {
private HashMap<String,Integer> stock;
private String address;
    @Override
    public void fulfillOrder(Object Order) {
       for(Item item:order.itemList){
        this.stock.replace(item.sku,stock.get(item)-1);
       /* process the order for shipment and delivery */
    }
    }
   public int currentInventory(Item item){
    if(stock.containsKey(item.sku))
    return stock.get(item.sku).intValue();
    return 0;
   }
}
