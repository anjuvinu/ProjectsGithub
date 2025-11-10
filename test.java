public class test {
 int[] arr = new int[5];
 public static void main(String[] args) {
    System.out.println("Hello World");
    try{
        int a = 5/5;
        String removeWhiteSpaces(String input) {
 StringBuilder output = new StringBuilder();
 
 char[] charArray = input.toCharArray();
 
 for (char c : charArray) {
  if (!Character.isWhitespace(c))
   output.append(c);
 }
    return output.toString();
    } catch(Exception e){
        System.out.println(e);
    }finally{
        System.out.println("Finally block executed");
    }

 }
}
