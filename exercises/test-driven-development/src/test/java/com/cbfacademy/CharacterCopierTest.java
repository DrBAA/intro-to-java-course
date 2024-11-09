package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class CharacterCopierTest {

    // Test with manual spies
    @Test
    public void testCopyWithSpies() {
        TestSource source = new TestSource("hello\nworld");
        TestDestination destination = new TestDestination();
        CharacterCopier copier = new CharacterCopier(source, destination);

        copier.copy();
        assertEquals("hello", destination.getWrittenData());
    }

    static class TestSource implements Source {
        private final String data;
        private int position = 0;

        TestSource(String data) {
            this.data = data;
        }

        @Override
        public char read() {
            if (position < data.length()) {
                return data.charAt(position++);
            }
            return '\n'; // default to newline when the data is exhausted
        }
    }

    static class TestDestination implements Destination {
        private final StringBuilder writtenData = new StringBuilder();

        @Override
        public void write(char c) {
            writtenData.append(c);
        }

        public String getWrittenData() {
            return writtenData.toString();
        }
    }

    // Test with Mockito mocks
    @Test
    public void testCopyWithMocks() {
        // Create mocks for Source and Destination
        Source source = mock(Source.class);
        Destination destination = mock(Destination.class);

        // Define behavior of the source mock
        when(source.read()).thenReturn('h', 'e', 'l', 'l', 'o', '\n');

        CharacterCopier copier = new CharacterCopier(source, destination);
        copier.copy();

        // Verify that the destination's write method was called with the correct characters
        verify(destination).write('h');
        verify(destination).write('e');
        verify(destination, times(2)).write('l');
        verify(destination).write('o');
        verify(destination, never()).write('\n');
    }
}

