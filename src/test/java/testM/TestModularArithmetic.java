package testM;

import com.example.optimistics.ModularArithmetic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestModularArithmetic {

    @Test
    public void testCheckCongruenceTrue(){
        boolean output = ModularArithmetic.checkCongruence(50,100, 2);
        assertEquals(true, output);
    }

    @Test
    public void testCheckCongruenceNegative(){
        boolean output = ModularArithmetic.checkCongruence(50,5,-5);
        assertEquals(false, output);
    }
}
