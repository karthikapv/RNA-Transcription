import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RNATranscriptionTest {

    @Test
    public void testEmptyRNASequence() {
        RNATranscription rna = new RNATranscription();
        Assertions.assertEquals("",rna.transcribe(""));
    }
    @Test
    public void testRNATranscriptionOfCytosineIsGuanine() {
        RNATranscription rna = new RNATranscription();
        Assertions.assertEquals("C",rna.transcribe("G"));
    }
    @Test
    public void testRNATranscriptionOfGuanineIsCytosine() {
        RNATranscription rna = new RNATranscription();
        Assertions.assertEquals("C",rna.transcribe("G"));
    }
    @Test
    public void testRNATranscriptionOfThymineIsAdenine() {
        RNATranscription rna = new RNATranscription();
        Assertions.assertEquals("A",rna.transcribe("T"));
    }

    @Test
    public void testRNATranscriptionOfAdenineIsUracil() {
        RNATranscription rna = new RNATranscription();
        Assertions.assertEquals("U",rna.transcribe("A"));
    }
    @Test
    public void testRNATranscription() {
        RNATranscription rna = new RNATranscription();
        Assertions.assertEquals("UGCACCAGAAUU",rna.transcribe("ACGTGGTCTTAA"));
    }

}

