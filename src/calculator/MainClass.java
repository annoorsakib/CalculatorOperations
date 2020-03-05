
package calculator;


public class MainClass {

    
    public static void main(String[] args) {
        // TODO code application logic here
        BasicCalculatorInterface c1=new Calculator();
        System.out.println("sum :"+c1.sum(2.9f, 4.3f));
        System.out.println("sub: "+c1.sub(3.3f, 2.1f));
        System.out.println("Mul :"+c1.mul(5.5f, 5.0f));
        System.out.println("Div: "+c1.div(6.0f, 2.0f));
        
        ScifiCalculatorInterface c2=new ScientificCalculator();
        System.out.println("X^x: "+c2.XtoY(2, 4));
        System.out.println("Square root: "+c2.sqauareRoot(9));
        System.out.println("factorial: "+c2.factorial(5));
        
    }
    
}
