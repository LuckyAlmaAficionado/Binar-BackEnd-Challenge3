package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WritterTxtAndCSVTest {

    public static final String save = "C:/Users/USER/Documents/CSV/testing/test.txt";
    List<String> dummy = List.of("testing", "ini", "tulisan", "keluar", "apa", "Engga");
    WritterTxtAndCSV wtc = new WritterTxtAndCSV();

    @Test
    void writterTxtAndCsv() {
        assertTrue(wtc.writterTxtAndCsv(save, dummy));
    }

    @Test
    void testWritterTxtAndCsvFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            wtc.writterTxtAndCsv(save, dummy);
        });
    }

}