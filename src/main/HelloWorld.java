package com.esempio;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorld {

    @Test
    public void testSaluta() {
        String risultato = HelloWorld.saluta();
        assertEquals("Ciao da Maven!", risultato);
    }
}
