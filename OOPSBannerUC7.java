/**
 * OOPSBannerUC7
 * 
 * UC7: Store Character Pattern in a Class using Inner Static Class.
 * Demonstrates Encapsulation, Modularity, Abstraction and Reusability.
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class to encapsulate character and its banner pattern.
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * 
         * @param character The character to store
         * @param pattern   The 7-line banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method to return character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method to return character pattern
         * 
         * @return String array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a given character
     * 
     * @param patterns Array of CharacterPatternMap objects
     * @param ch       Character to search
     * @return Corresponding pattern if found, else null
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    /**
     * Utility method to print banner for given word
     * 
     * @param word     Word to display
     * @param patterns Array of CharacterPatternMap objects
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(patterns, ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }
            System.out.println(line);
        }
    }

    /**
     * Main Method – Program Entry Point
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
                "  *****    ",
                " **     ** ",
                "**       **",
                "**       **",
                "**       **",
                " **     ** ",
                "  *****    "
        };

        // Pattern for P
        String[] P = {
                " ******  ",
                " **     **",
                " **     **",
                " ******   ",
                " **       ",
                " **       ",
                " **       "
        };

        // Pattern for S
        String[] S = {
                "   *****  ",
                " **     **",
                " **       ",
                "  *****   ",
                "        **",
                " **     **",
                "  *****   "
        };

        // Array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        // Display Banner
        printBanner("OOPS", patterns);
    }
}