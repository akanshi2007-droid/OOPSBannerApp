import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerUC8
 * 
 * UC8: Store Character Patterns using HashMap
 * Demonstrates use of Java Collections Framework
 */
public class OOPSBannerUC8 {

    /**
     * Utility method to build and return character pattern map
     *
     * @return Map containing character and its 7-line banner pattern
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                "  *****    ",
                " **     ** ",
                "**       **",
                "**       **",
                "**       **",
                " **     ** ",
                "  *****    "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                "   ****** ",
                " **     **",
                " **     **",
                " ******* ",
                " **       ",
                " **       ",
                " **       "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                "  *****  ",
                " **     ** ",
                " **       ",
                "  *****  ",
                "       ** ",
                " **     ** ",
                "  *****  "
        });

        return patternMap;
    }

    /**
     * Utility method to print banner for given word
     *
     * @param word       Word to display
     * @param patternMap Map storing character patterns
     */
    public static void printBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

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

        Map<Character, String[]> patterns = buildCharacterPatterns();

        printBanner("OOPS", patterns);
    }
}