import java.util.ArrayList;

public class Hosuing implements IStructure{
private ArrayList<IStructure> structures;
private String address;
    public Hosuing(String address){
        this.structures=new ArrayList<IStructure>();
this.address=address;
    }
    @Override
    public void enter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enter'");
    }

    @Override
    public void exit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exit'");
    }

    @Override
    public void location() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'location'");
    }

    @Override
    public String getName() {
        return this.address;
    }
    
}
