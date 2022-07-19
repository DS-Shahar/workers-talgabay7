
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestExample {

   @Test
   public void testNode()
   {
     Node<Integer> b = new Node<Integer(7);
     Node<Integer> a = new Node<Integer(18, b);

     int v = a.getValue();
     assertEquals(v, 18);
     
     assertEquals(a.getNext(), b);          
   }
}
