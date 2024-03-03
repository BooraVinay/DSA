package FacadePattern;

import java.math.BigDecimal;

public interface IAccount{
    /*Step one design am interface
     * 2.implemnt the interfaces
     * 3.create the facade class and wrap all the classes
     * that implement the interfaces.
     * the key design principles are Encapsulation,information hiding and 
     * seperation of concerns
     * 4. the client uses this Facade class which 
     */
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(BigDecimal amount);
    public int getAccountNumber();
}