package com.solutions.common;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWorldOutput() {
        // Capture the output of the HelloWorld main method
        String expectedOutput = "Hello, World!";
        String actualOutput = captureOutput(() -> HelloWorld.main(new String[0]));

        assertEquals(expectedOutput, actualOutput.trim());
    }

    private String captureOutput(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        runnable.run();
        return outputStream.toString();
    }
}