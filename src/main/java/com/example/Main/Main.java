package com.example.Main;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int people=input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas=input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices=input.nextInt();
        int total=slices*pizzas;
        System.out.println(people + " people with " + pizzas + " pizzas (" + total + " slices)");
        if(total/people==1) {
            System.out.println("Each person gets " + total/people + " piece of pizza."); }
        else {
            System.out.println("Each person gets " + total/people + " pieces of pizza."); }
        System.out.println("There are " + ( total % people ) + " leftover pieces.");


    }
}