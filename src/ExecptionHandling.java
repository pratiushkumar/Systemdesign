import java.nio.BufferOverflowException;

class Base {
    String way;
    void Process (String way) {
             throw new IllegalArgumentException() ;
    }

}

class child extends Base {

    String way;
    @Override
    void Process (String way ) {
        throw new BufferOverflowException();
    }
}



public class ExecptionHandling {
    public static void main (String[] args )
    {
        child ch =new child();
        //ch.Process();
    }}
