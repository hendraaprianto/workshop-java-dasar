

import java.util.Scanner;

class Biodata {
    String nama;
    String hobi;
    int umur;

    Biodata (String nama, String hobi, int umur);
        this.nama=nama;
        this.hobi=hobi;
        this.umur=umur;
    }

    public static int test(){
    return 100;
    ;

    public static void coba(int a){
        if (a == 7){
            System.out.println("oke");
        }
        }

    void menyapa(){
        System.out.println("Hallo Saya" + nama);
    }
}

public class Main {
    public static void calc(int a, int b, String op);
//
//        if (op.equals("+")) {
//            System.out.print(a + b);
//        } else if (op.equals("-")) {
//            System.out.print(a - b);
//        } else if (op.equals("x")) {
//            System.out.print(a * b);
//        } else if (op.equals(":")) {
//            System.out.print(a / b);
//        } else if (op.equals("%")) {
//            System.out.print(a % b);
//        } else {
//            System.out.print("Input tidak valid");
//        }
//    }

    public static void main(String[] args) {
        Biodata datasaya = new Biodata(nama:"hendra", hobi:"makan, umur: 17");
        datasaya.menyapa();
        System.out.println(datasaya.hobi);
        System.out.println(datasaya.umur);
    }
}
        ;

//        String nama = "Hendra";
//        System.out.println(nama);
//        System.out.println("Nama Saya : " + nama);
//
//        int a = 24;
//        int b = 16;
//
//        int kurang = a - b;
//        int kali = a * b;
//        int bagi = a / b;
//
//
//        System.out.println(a + b);
//        System.out.println(a % b);
//        System.out.println(kurang);
//        System.out.println(kali);
//        System.out.println(bagi);


        //operator logika atau, dan , bukan
//        System.out.println(true ||true);
//        System.out.println(true ||false);
//        System.out.println(false ||true);
//        System.out.println(false ||false);
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        System.out.println(!false);
//        System.out.println(!true);
//        System.out.println(true && !(true||false);

//        boolean makan = true;
//        boolean minum = false;
//
//        boolean aturan =makan || minum;
//        System.out.println(makan && minum);
//        System.out.println(aturan);

//        int a = 30;
//        int b = 31;
//
//        System.out.println(a <= b);
//
//        int saldo = 2000;int tarik = 1900;if(tarik > 1000 && tarik <= saldo){                    System.out.println("Saldo berhasil ditarik, tapi kena pajak");} else if(tarik <= saldo){    System.out.println("Saldo Anda berhasil ditarik");} else {    System.out.println("Saldo Anda Kurang");
//
//        int cek = 1;
//        while (cek <=10){
//            System.out.println("looping");
//
//            cek = cek + 1;
//        }
//        for (int i=1;i <=10; i++){
//            System.out.println("Looping " + i);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan nama Anda: ");
//        String nama = scanner.nextLine().toLowerCase();
//
//        System.out.println("Halo, " + nama + "!");
//        if(nama.equals("hendra")){
//            System.out.println ("Apa Kabar !");
//        }else {
//            System.out.println("Kenalan Yuk !");
//        }
//        scanner.close();


        /*
         *Buatkan kalkulator yang bisa menerima input
         * int a
         * int b
         * char operator
         *
         */
//
////todo Auto-generated method sub
//        firstNum = 0;
//        secondNum b = 0;
//
//        Scanner.scan = new Scanner(System.in);
//        System.out.println("Masukkan a: ");
//        firstNum = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Masukkan b: ");
//        secondNum = Integer.parseInt(scanner.nextLine());
//
//        int operator;
//        double answer = 0;
//
//        System.out.println("Which Operator: ");
//        System.out.println("1. + ");
//        System.out.println("2. - ");
//        System.out.println("3. * ");
//        System.out.println("4. % ");
//
//        operator = (scanner.nextLine());
//
//        switch (operator) {
//            case 1:
//                answer = firstNum + secondNum;
//            case 2:
//                answer = firstNum - secondNum;
//            case 3:
//                answer = firstNum * secondNum;
//            case 4:
//                answer = firstNum % secondNum;
//                break;
//        }
//        System.out.println("Answer is :" + answer);
//
//
//        Scanner scanner = new Scanner(System.in);
//        boolean kondisi = true;
//        String op;
//        while (kondisi) {
//            System.out.print("Masukkan a: ");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan b:");
//            int b = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan operator: ");
//            op = scanner.nextLine();
//
//            calc(a, b, op);
//
//            System.out.print("\nLanjut?");
//            String tanya = scanner.nextLine();
//            if (tanya.equals("ya")) {
//                kondisi = true;
//            } else {
//                kondisi = false;
//            }
//        }
//        scanner.close();
    }
}