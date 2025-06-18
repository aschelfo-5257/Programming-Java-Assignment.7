class BinaryFormatException extends Exception {
  public BinaryFormatException(String message) {
    super(message);
  }
}
public class BinaryParser {
  public int parseBinary(String binaryString) throws BinaryFormatException {
    for (char c : binaryString.toCharArray()) {
      // Invalid binary (Only 0 and 1 allowed)
      if (c != '0' && c != '1') {
        throw new BinaryFormatException("Invalid character in binary string: " + c);
      }
    }
    return Integer.parseInt(binaryString, 2);
  }
  public static void main(String[] args) {
    BinaryParser parser = new BinaryParser();
    String binaryString = "101100"; // binary input: 
// Tips: Use try-catch blocks to handle exceptions to prevent crashes program
    try {
      int num = parser.parseBinary(binaryString);
      System.out.println("Num: " + num);
    } catch (BinaryFormatException e) {
      System.out.println("Invalid Binary Format: " + e.getMessage());
    }
  }
}
