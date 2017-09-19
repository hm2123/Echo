import javax.swing.*;
import java.util.Scanner;


public class Echo {

    public static void main(String [] args_) {

            byte thisbyte;
            short thisshort;
            int thisint;
            long thislong;
            float thisfloat;
            double thisdouble;
            String thischar;
            boolean thisboolean;


                Scanner keyboard2 = new Scanner(System.in);
                System.out.println("Enter a value(byte).");
                thisbyte = keyboard2.nextByte();

                System.out.println("Enter value(short).");
                thisshort = keyboard2.nextShort();

                System.out.println("Enter value(int).");
                thisint = keyboard2.nextInt();

                System.out.println("Enter value(long).");
                thislong = keyboard2.nextLong();

                System.out.println("Enter value(float).");
                thisfloat = keyboard2.nextFloat();

                System.out.println("Enter value(double).");
                thisdouble = keyboard2.nextDouble();

                System.out.println("Enter value(char).");
                thischar = keyboard2.next();

                System.out.println("Enter value(boolean).");
                thisboolean = keyboard2.nextBoolean();


                JOptionPane.showMessageDialog(null, "The byte you entered is \"" + thisbyte + "\"." +
                                                                            "\n" + "The short you entered is \"" + thisshort + "\"." +
                                                                            "\n" + "The int you entered is \"" + thisint + "\"." +
                                                                            "\n" + "The long you entered is \"" + thislong + "\"." +
                                                                            "\n" + "The flaot you entered is \"" + thisfloat + "\"." +
                                                                            "\n" + "The double you entered is \"" + thisdouble + "\"." +
                                                                            "\n" + "The char you entered is \"" + thischar + "\"." +
                                                                            "\n" + "The boolean you entered is \"" + thisboolean + "\".");













    }



}
