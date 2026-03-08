import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8 - Use HashMap for Character Patterns and Render via Function
 * @author Razeen
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }

    // Build pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        map.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        });

        map.put('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        return map;
    }

    // Render banner function
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }
}