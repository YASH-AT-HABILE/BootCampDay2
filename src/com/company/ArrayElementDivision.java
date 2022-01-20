package com.company;

import java.util.Scanner;

public class ArrayElementDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter length of the array.: ");
        byte arrLen = sc.nextByte();

        short [] myArr = new short[arrLen];

        try{
            byte arrElementsCounter = 0;
            String choice = "y";
            while(choice.equals("y") && arrElementsCounter < arrLen){
                if(arrElementsCounter == arrLen - 2){
                    System.out.println("Array is full. Can not insert more values. Sorry...");
                    break;
                }
                System.out.println("Please enter the index number at which you want to insert an element.: ");
                byte index = sc.nextByte();
                if(index < 0){
                    System.out.println("Invalid index. Insertion stopped. ");
                    break;
                }
                else{
                    myArr[index] = 0;
                    System.out.println("Please enter an integer.: ");
                    short element = sc.nextShort();
                    myArr[index] = element;
                }
                System.out.println("Do you want to enter another element?[y/n].: ");
                choice = sc.next();
                if(choice.equals("n")){
                    System.out.println("Thank you...");
                    break;
                }
                arrElementsCounter ++;
            }

            try{
                for(byte i = 0; i < arrLen; i++){
                    System.out.println("Please enter the divisor.: ");
                    short divisor = sc.nextShort();
                    short ans = (short) (myArr[i] / divisor);
                    System.out.println(myArr[i] + "/" + divisor + " = " + ans);
                }
            }
            catch (ArithmeticException e){
                System.out.println("Divide by zero exception.");
            }

        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Array index is out of bound. ");
        }

        finally {
            System.out.println("This block will be executed for sure.");
            System.out.println("So if you have any important code to execute then write that here.");
        }
    }
}
