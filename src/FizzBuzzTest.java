import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kamel on 2/8/2017.
 */
public class FizzBuzzTest {

//    @Test
//    public void fizzBuzz() throws Exception {
//      fail("You will rise after u fail :(");
//    }

    @Test
    public void fizzBuzzTest1()
    {
        assertEquals("1",Main.fizzBuzz(1));

    }

    @Test
    public void fizzBuzzTest2()
    {
        assertEquals("2",Main.fizzBuzz(2));

    }

    @Test
    public void fizzBuzzTest3()
    {
        assertEquals("Fizz",Main.fizzBuzz(3));

    }

    @Test
    public void fizzBuzzTest4()
    {
        assertEquals("4",Main.fizzBuzz(4));

    }
    @Test
    public void fizzBuzzTest6()
    {
        assertEquals("Fizz",Main.fizzBuzz(6));

    }
    @Test
    public void fizzBuzzTest5()
    {
        assertEquals("Buzz",Main.fizzBuzz(5));

    }
    @Test
    public void fizzBuzzTest9()
    {
        assertEquals("Fizz",Main.fizzBuzz(9));

    }

    @Test
    public void fizzBuzzTest15()
    {
        assertEquals("FizzBuzz",Main.fizzBuzz(15));

    }
    @Test
    public void fizzBuzzTest60()
    {
        assertEquals("FizzBuzz",Main.fizzBuzz(60));

    }
}