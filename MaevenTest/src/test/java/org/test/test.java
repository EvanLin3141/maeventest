package org.test;

import org.example.ColourTable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourTableTest {
    private ColourTable palette;

    @BeforeEach
    void setUp() {
        palette = new ColourTable();
    }

    @Test
    void testConstructor(){
        assertNotNull(palette, "ColourTable created");
    }

    @Test
    void testConstructorInstanceVariables() {
        assertNotNull(palette.numberOfColours(), "There exist colours");
    }


    @Test
    void testInvalidColourPaletteSize() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(), "Invalid size should throw an exception");
    }


}