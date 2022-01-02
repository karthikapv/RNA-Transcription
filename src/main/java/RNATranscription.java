import java.util.*;

public class RNATranscription {
    public static void main(String[] args){
        RNATranscription rna = new RNATranscription();
        System.out.print(rna.transcribe("ACGTGGTCTTAA"));
    }
    public String transcribe(String dnaStrand) {
        HashMap<Character, String> dNAtoRNA = new HashMap<Character, String>();
        dNAtoRNA.put('A', "U");
        dNAtoRNA.put('C', "G");
        dNAtoRNA.put('T', "A");
        dNAtoRNA.put('G', "C");

        StringBuffer sb = new StringBuffer();
        String transcribed = " ";
        for (int i = 0; i < dnaStrand.length(); i++) {
            char dna = dnaStrand.charAt(i);
            transcribed = dNAtoRNA.get(dna);
            sb.append(transcribed);
        }
        return sb.toString();
    }

}
