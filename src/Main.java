public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String fizzBuzz(int input)
    {
       String output = "";
       if (input %3==0)
           output+="Fizz";
       if(input%5==0)
           output+="Buzz";

       if (output.equals(""))
           output=Integer.toString(input);

       return output;

    }

}
