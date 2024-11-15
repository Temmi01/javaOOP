package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class СompareText {

    @Test
    void testOutputMatchesExpected() throws IOException {
        String expectedFilePath = "texttests/ThirtyDays/stdout.gr";
        BufferedReader expectedOutput = Files.newBufferedReader(Paths.get(expectedFilePath));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            TexttestFixture.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }

        BufferedReader actualOutput = new BufferedReader(new StringReader(outputStream.toString()));

        int days = 2;
        int linesToCompare = 1 + 12*days;
        for (int i = 0; i < linesToCompare; i++) {
            String expectedLine = expectedOutput.readLine();
            String actualLine = actualOutput.readLine();
            assertEquals(expectedLine, actualLine, "Mismatch in line " + (i + 1));
        }
    }
}
