

import java.io.*;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner LnInput = new Scanner(System.in);
        File file = new File( "testON");

        Scanner scanner = new Scanner(file);
        scanner.close();
//        System.out.println(LnInput.nextLine());

//        System.out.println(Calc.ExpressiontoRPN(LnInput.nextLine()));

//        System.out.println(Calc.RPNtoAnswer(Calc.ExpressiontoRPN(LnInput.nextLine())));

//        int c = Calc.RPNtoAnswer(Calc.ExpressiontoRPN(LnInput.nextLine()));
//        String text = Integer.toString(c);
//        PrintWriter out = new PrintWriter("testFile.txt");
//        out.println(text);
//        out.close();Scane
        /*
        String Answer = String.valueOf(Calc.RPNtoAnswer(Calc.ExpressiontoRPN(LnInput.nextLine())));
        System.out.println(Answer);


        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println(Answer);

        pw.close();
        */


//        try(FileWriter writer = new FileWriter("testFile",false)){
//            String text = ("ffzseg");
//            writer.write(text);

//            writer.flush();
//            writer.close();
//     }
//            catch(IOException ex){
//            System.out.println(ex.getMessage());
        }
    }







       /*System.out.println(Calc.ExpressiontoRPN("(222+2)*2"));
       System.out.println(Calc.RPNtoAnswer(Calc.ExpressiontoRPN("(222+2)*2")));
        */
