
/**
 * Anna B 
 * Lab 822
 */
public class SimpleCalc
{
    public SimpleCalc (){
    }
    public double add(int n1,int n2){
        return n1+n2;
    }
    public double subtract(int n1,int n2){
        return n1-n2;
    }
    public double multiply(int n1,int n2){
        return n1*n2;
    } 
    public double divide(int n1,int n2){
        if (n2 != 0){
            return n1/n2;
        }
            else
            return Double.MAX_VALUE;
    }
    public double modulodivide(int n1,int n2){
        return n1%n2;
    }
}
