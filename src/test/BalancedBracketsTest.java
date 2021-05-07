package test;


import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {


    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));

    }

    @Test
    public void onlyUnbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


}
