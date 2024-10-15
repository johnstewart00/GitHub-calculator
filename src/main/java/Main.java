public class Main {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Invalid input. Please provide a valid command.");
      return;
    }

    Calculator calculator = new Calculator();
    String command = args[0];

    try {
      switch (command) {
        case "add":
          if (args.length == 3) {
            int addResult = calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(addResult);
          } else {
            System.out.println("Invalid number of arguments for add.");
          }
          break;
        case "subtract":
          if (args.length == 3) {
            int subtractResult = calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(subtractResult);
          } else {
            System.out.println("Invalid number of arguments for subtract.");
          }
          break;
        case "multiply":
          if (args.length == 3) {
            int multiplyResult = calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(multiplyResult);
          } else {
            System.out.println("Invalid number of arguments for multiply.");
          }
          break;
        case "divide":
          if (args.length == 3) {
            int divideResult = calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(divideResult);
          } else {
            System.out.println("Invalid number of arguments for divide.");
          }
          break;
        case "fibonacci":
          if (args.length == 2) {
            int fibonacciResult = calculator.fibonacciNumberFinder(Integer.parseInt(args[1]));
            System.out.println(fibonacciResult);
          } else {
            System.out.println("Invalid number of arguments for fibonacci.");
          }
          break;
        case "binary":
          if (args.length == 2) {
            String binaryResult = calculator.intToBinaryNumber(Integer.parseInt(args[1]));
            System.out.println(binaryResult);
          } else {
            System.out.println("Invalid number of arguments for binary.");
          }
          break;
        default:
          System.out.println("Invalid command.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid number format: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}
