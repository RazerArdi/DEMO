package MODUL4.MODUL4_LAT2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BayuArdiyansyah
 */
public class ANALISTEKS {
    private String text;
    private int HITUNGKARAKTER;
    private int HITUNGKATA;
    private Map<String, Integer> KATAs;

    public ANALISTEKS() {
        this.HITUNGKARAKTER = 0;
        this.HITUNGKATA = 0;
        this.KATAs = new HashMap<>();
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

        String[] KATA = text.split("\\s+");
        HITUNGKATA = KATA.length;

        KATAs.clear();
        for (String word : KATA) {
            KATAs.put(word.toLowerCase(), KATAs.getOrDefault(word.toLowerCase(), 0) + 1);
        }
    }

    public int getHITUNGKARAKTER() {
        return HITUNGKARAKTER;
    }

    public int getHITUNGKATA() {
        return HITUNGKATA;
    }

    public Map<String, Integer> getKATAs() {
        return KATAs;
    }
}
