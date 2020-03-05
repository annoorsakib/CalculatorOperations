
package calculator;

public class ScientificCalculator implements ScifiCalculatorInterface {
    public ScientificCalculator(){}
   
    public float XtoY(float x,float y)
    {
         return (float) Math.pow(x, y);
    }
    public float sqauareRoot(float x)
    {
        return (float) Math.sqrt(x);
    }
    public float factorial(float x)
    {
        if(x==0 || x==1)
        {
            return 1;
        }
        else
        {
            float result=x;
            while(x > 1)
            {
                  x--;
                  result =x*result;
            }
            return result;
        }
    }
}
    
   

