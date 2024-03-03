package ProxyPaatern;
/* step 1: Design the subject interface
 * step 2: create a real subject class which implwmnts this interface
 * step 3:create a proxy class.
 */
public interface IOrder<Order> {
    public void fulfillOrder(Order Order);
}
