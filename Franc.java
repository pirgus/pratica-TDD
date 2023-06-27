import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class Franc extends Money {  
   Franc(int amount, String currency) {      
      super(amount, currency);
    }	
    				
    Money times(int multiplier)  {      
       return Money.franc(amount * multiplier);					
    }   			
}

public void testFrancMultiplication() {
   Franc five = new Franc(5);
   assertEquals(new Franc(10), five.times(2));
   assertEquals(new Franc(15), five.times(3));
}
