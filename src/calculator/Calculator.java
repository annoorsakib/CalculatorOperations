
package calculator;

public class Calculator implements BasicCalculatorInterface {
    public Calculator()
    {
        
    }
    public float sum(float x,float y)
    {
        return x+y;
    }
    public float sub(float x,float y)
    {
        return x-y;
    }
    public float mul(float x,float y)
    {
        return x*y;
    }
    public float div(float x,float y)
    {
        if(y!=0.0f)
        {
            return x/y;
        }
        else
        {
            System.out.println("can not be divided by "+y);
            return 0;
        }
    }
    
}
