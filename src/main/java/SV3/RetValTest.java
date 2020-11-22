package SV3;

public class RetValTest {

    private static class SentenceEmptyException extends Exception {}
    private static class NoCamEmailFoundException extends Exception {}

    public static String extractCamEmail(String sentence) throws SentenceEmptyException, NoCamEmailFoundException {
        if (sentence == null || sentence.length() == 0) {
            // Error - sentence empty
            throw new SentenceEmptyException();
        }

        String tokens[] = sentence.split(" "); // split into tokens

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].endsWith("@cam.ac.uk")) {
                return tokens[i];
            }
        }

        throw new NoCamEmailFoundException();
    }

    public static void main(String[] args) {
        try {
            String email = RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
            System.out.println("Success: " + email);

        } catch (SentenceEmptyException e) {
            System.out.println("Supplied string empty");

        } catch (NoCamEmailFoundException e) {
            System.out.println("No @cam address in supplied string");
        }
    }
}