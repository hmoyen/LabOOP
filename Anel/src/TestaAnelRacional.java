import static org.junit.Assert.assertEquals;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestaAnelRacional {


    private static final AnelRacional Z = new AnelRacional();

    @Test
    @DisplayName("Testa soma")
    public void testaSoma() {

        // // ArrayList<Integer> op1 = new ArrayList<Integer>();
        // // ArrayList<Integer> op2 = new ArrayList<Integer>();
        // // ArrayList<Integer> res = new ArrayList<Integer>();

        // // op1.add(2); op1.add(3); op1.add(1);
        // // op2.add(3); op2.add(2); op2.add(-1);
        // // res.add(5); res.add(5); res.add(0);

        // for (int i = 0; i < op1.size(); i++) {
        //     assertEquals("testa soma inteira", res.get(i), Z.soma(op1.get(i), op2.get(i)), i, i);
        // }

        Racional q = new Racional(2, 3);
        Racional s = new Racional(4, 3);
        Racional t = Z.soma(q,s);

        assertEquals(q+"+"+s, 2, t.num/t.den);

        // AnelInteiro Z = new AnelInteiro();
        // int x = 2; int y = 3; int z = 4;
        // int r = Z.produto(Z.soma(x,y), null)
        
        // AnelRacional Q = new AnelRacional();
        // Racional q = new Racional(2, 3);
        // Racional s = new Racional(4, 3);
        // Racional t = Q.soma(q,s);


        
    
    }
}
