package com.company;

import java.util.Scanner;

class VotingException extends Exception{
    public String toString(){
        return super.toString() + "Invalid age. Age should be between 18 to 120.";
    }

    public String getMessage(){
        return super.getMessage() + "Invalid age. Age should be between 18 to 120.";
    }
}

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Please enter your age.: ");
            byte age = sc.nextByte();
            if(age < 18 || age > 120){
                throw new VotingException();
            }
            else{
                System.out.println("You are eligible for voting. ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
