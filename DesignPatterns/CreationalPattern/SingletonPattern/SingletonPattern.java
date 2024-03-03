package SingletonPattern;
public class SingletonPattern{
private static SingletonPattern singletonPattern=null;
private SingletonPattern(){

}
/*creating  a public method to restrict the 
instance of the 
class to a single object*/
/*Singleton pattern enforces one and only one object of a
 * singleton class
 * Has the singleton object gloabally accessible.
 */
/*to provide global access to a class that 
is restrcited to one instance.
this is achieved by private constructor with a public method that
 instantiates the class, if it is not already instantiated

 Ex:settings of user,
*/
public static SingletonPattern getInstance(){
    if(singletonPattern==null){
        singletonPattern=new SingletonPattern();
    }
    return singletonPattern;
}
//lazy creation 
//multiple threads running it may cause some issues

}