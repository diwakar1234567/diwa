import java.io.*;

class Result {
    /*
     * Complete the 'newPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String newPassword(String a, String b) {
        var password = new StringBuilder();
        int lenA = a.length(), lenB = b.length();
        int i = 0, j = 0;

        // Use Java 21 enhanced loop feature (var for type inference)
        while (i < lenA || j < lenB) {
            if (i < lenA) password.append(a.charAt(i++));
            if (j < lenB) password.append(b.charAt(j++));
        }

        return password.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        try (var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             var bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            var a = bufferedReader.readLine();
            var b = bufferedReader.readLine();

            var result = Result.newPassword(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }
    }
}
