package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ATest {
    private A a;

    @Before
    public void setUp() throws Exception {
        a = new A();

    }
    public class Atest {
        @Test
        public void testx(){
            string esperado ="a{}";
            string obtenido = a,toString(),toLowerCase();
            assertEquals( esperado, obtenido);
        }
    }