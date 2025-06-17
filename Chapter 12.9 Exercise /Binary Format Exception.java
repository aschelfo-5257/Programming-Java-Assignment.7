String binaryString = "101100"; // Invalid binary (Only 0 and 1 allowed)
try {
  int num = Integer.parseInt(binary, 2); // Throws NumberFormatException
  System.out.println("Num: " + num);
} catch (NumberFormatException e) {
  System.out.println("Invalid Binary Format: " e.getMessage());
}
// Tips: Use try-catch above blocks to handle the exception to prevent crashes program.
public static boolean isValidBinary(String input) {
  for (char c : input.toCharArray()) {
    if (c != '0' && c != '1') {
      return false;
    }
  }
  return true;
}
class BinaryFormatException extends Exception {
  public BinaryFormatException(String message) {
    super(message);
  }
}
public class BinaryParser {
  public int parseBinary(String binaryString) throws BinaryFormatException {
  }
}
