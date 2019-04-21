package at.fhj.msd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class StringStackTest {
    public Stack s;

    @Before
    public void setup() throws Exception {
        s = new StringStack(5); // keep size of 5 !!
    }

    /**
     * tests if stack is empty after initialization
     * <p>
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(s.isEmpty());
    }

    /**
     * tests if stack is empty after pushing
     * <p>
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception {
    }

    /**
     * tests push and pop function
     * <p>
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     *
     * @throws Exception
     */
    @Test
    public void testPushPop() throws Exception {
    }

    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    /**
     * tests if an Exception gets thrown when initializing a stack with a capacity lower or equal 0
     */
    @Test
    public void testCapacity() throws Exception {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("size <= 0");
        s = new StringStack(0);
    }

    /**
     * tests if an Exception gets thrown when the stack overflows
     */
    @Test
    public void testStackOverflow() throws Exception {
        exceptionRule.expect(IllegalStateException.class);
        for(int i = 1; i < 7; i++ ){
            s.push("Push item number " + i);
        }
    }


}
