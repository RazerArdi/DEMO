package MODUL4.MODUL4_LAT2;

import java.util.HashMap;
import java.util.Map;

public class ANALISTEKS {
    private String text;
    private int HITUNGKARAKTER;
    private int HITUNGKATA;
    private Map<String, Integer> wordOccurrences;

    public ANALISTEKS() {
        this.HITUNGKARAKTER = 0;
        this.HITUNGKATA = 0;
        this.wordOccurrences = new HashMap<>();
    }

    public void SetInput(String text) {
        this.text = text;
    }

    public void ANALISTEKS() {
        if (text == null || text.isEmpty()) {
            System.out.println("Teks kosong. Mohon masukkan teks terlebih dahulu.");
            return;
        }

        HITUNGKARAKTER = text.length();

        String[] words = text.split("\\s+");
        HITUNGKATA = words.length;

        wordOccurrences.clear();
        for (String word : words) {
            wordOccurrences.put(word.toLowerCase(), wordOccurrences.getOrDefault(word.toLowerCase(), 0) + 1);
        }
    }

    public int getHITUNGKARAKTER() {
        return HITUNGKARAKTER;
    }

    public int getHITUNGKATA() {
        return HITUNGKATA;
    }

    public Map<String, Integer> getWordOccurrences() {
        return wordOccurrences;
    }
}
