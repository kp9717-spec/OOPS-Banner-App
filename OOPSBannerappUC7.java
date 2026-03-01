import java.util.HashMap;
import java.util.Map;

public class OOPSBannerappUC7 {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create Map to store characters
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        // Add O
        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        }));

        // Add P
        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        }));

        // Add S
        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ******* ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " ******* "
        }));

        String word = "OOPS";
        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize StringBuilders
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner dynamically
        for (char ch : word.toCharArray()) {
            String[] letterPattern = patternMap.get(ch).getPattern();

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(letterPattern[i]);
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }
}