package com.karthick.Student_idCard;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Name;
        int Age;
        String bloodGroup;

        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter the Student Name : ");
        Name = Scan.nextLine();
        System.out.println("Enter the Student Age : ");
        Age = Scan.nextInt();
        System.out.println("Enter the Student Blood Group : ");
        bloodGroup = Scan.next();

        System.out.println("------------------------");
        System.out.println("Name :"+Name+"\n"+"Age :"+Age+"\n"+"Blood Group :"+bloodGroup);
        System.out.println("------------------------");

        if(Age>=20){
            System.out.println("      Your Group Is RED ");
        }else if(Age>=15 && Age<20){
            System.out.println("      Your Group Is BLUE ");
        }else if(Age>=10 && Age<15){
            System.out.println("      Your Group Is YELLOW ");
        }
        System.out.println("------------------------");
        // RED >= 20
        //BLUE >=15 <20
        //YELLOW >=10 <15

    }
}
