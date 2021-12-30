package com.company;
import java.util.Scanner;
import java.util.Random;
//โปรแกมนี้จัดทำม่เพื่อสร้างโปรแกมเป่ายิ้งฉุบกับAI
public class Main {
    static void systemNa() {

        int pp = 3;//ประกาศว่า pp = 3
        int px = pp + 1;//ประกาศให้pxเอาppไปบวกอีกหนึ่ง
        Random rand = new Random();//ประกาศrand=random
        int int_random = rand.nextInt(px);//ให้int_randomเป็นตัวแปร

        Scanner ip = new Scanner(System.in);//ประกาศscanner
        System.out.println("enter 1 to sister");
        System.out.println("enter 2 to hammer");
        System.out.println("enter 3 to paper");
        System.out.print("enter here ur choice : ");
        int choice = ip.nextInt();//รับinputจากuser

        if (choice == pp + 1) {//ถ้าตรงตามหัวข้อให้้เข้าเคสนี้ออกเหมือนกัน
            System.out.println("the winner is !!NO ONE!!");
        } else {//ถ้าไม่ตรงตามหัวข้อให้เข้าเคสนี้
            if (choice == 1 && int_random == 3) {//ถ้าตรงตามหัวข้อให้เข้าเคสนี้ถ้าuserออกกรรไกรบอทออกกระดาษ
                System.out.println("the winner is !!USERRRR!!");
            } else if (choice == 2 && int_random == 1) {//ถ้าตรงตามหัวข้อให้เข้าเคสนี้ถ้าuserออกกระดาษบอทออกค้อน
                System.out.println("the winner is !!USERRRR!!");
            } else if (choice == 3 && int_random == 2) {//ถ้าตรงตามหัวข้อให้เข้าเคสนี้ถ้าuserออกค้อนบอทออกกรรไกร
                System.out.println("the winner is !!USERRRR!!");
            } else {//ถ้าตรงตามหัวข้อให้เข้าเคสนี้
                System.out.println("the winner is !!Bottttt!!");
            }

        }
    }
        public static void main (String[]args){
            Scanner kj = new Scanner(System.in);//ประกาศScanner(input)
            System.out.print("if u want to start progam input 1 pls : ");
            int pls = kj.nextInt();//รับinputจากuser
            if (pls == 1) {//ถ้าตรงตามหัวข้อให้้เข้าเคสนี้
                systemNa();//เข้าหัวข้อsystemNa
            } else {//ถ้าไม่ตรงตามหัวข้อให้เข้าเคสนี้
                System.out.println("bye see u");
            }

        }


}
