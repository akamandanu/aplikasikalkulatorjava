import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        showMenu();

    }

    public static void showMenu(){

        Scanner scanner = new Scanner(System.in);
        int menu =0;

        while (menu != 5){

            System.out.println("Aplikasi Kalkulator");

            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Pembagian");
            System.out.println("4. Perkalian");
            System.out.println("5. Keluar");

            System.out.print("Pilihan Kamu : ");
            menu = scanner.nextInt();

            switch (menu){

                case 1:
                    viewPertambahan();
                    break;

                case 2:
                    viewPengurangan();
                    break;

                case 3:
                    viewPembagian();
                    break;

                case 4:
                    viewPerkalian();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Anda memasukan pilihan no yang salah, silahkan coba kembali");
                    break;

            }

        }
    }

    public static void viewPertambahan(){

        int firstNumber, secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Pertambahan");
        System.out.println("----------------------");


        System.out.print("Masukan Angka Pertama : ");
        firstNumber = scanner.nextInt();

        System.out.print("Masukan Angka kedua : ");
        secondNumber = scanner.nextInt();

        countPertambahan(firstNumber, secondNumber);

        int menu = 0;

        while (menu != 3){
            System.out.println("Menu");
            System.out.println("1. Hitung Kembali");
            System.out.println("2. Menu awal");
            System.out.println("3. Keluar");

            System.out.print("Pilih Menu : ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    viewPertambahan();
                    break;

                case 2:
                    showMenu();
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Anda memasukan pilihan no yang salah, silahkan coba kembali");
                    break;
            }
        }


    }

    public static void countPertambahan(int firstNumber, int secondNumber){

        int results = firstNumber + secondNumber;
        System.out.println("Hasilnya adalah = " + results);

    }

    public static void viewPengurangan(){

        int  firstnumber, secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Pengurangan");

        System.out.print("Masukan Angka Pertama : ");
        firstnumber = scanner.nextInt();

        System.out.print("Masukan Angka Kedua : ");
        secondNumber = scanner.nextInt();

        countPengurangan(firstnumber, secondNumber);

        int menu = 0;

        System.out.println("Pilih Menu : ");
        menu = scanner.nextInt();

        while (menu != 3){

            System.out.println("menu");
            System.out.println("1. Kembali menghitung");
            System.out.println("2. Kembali ke menu awal");
            System.out.println("3. Keluar");

            System.out.print("Pilih Menu : ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    viewPengurangan();
                    break;

                case 2:
                    showMenu();
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Anda memasukan pilihan no yang salah, silahkan coba kembali");
                    break;
            }

        }


    }

    public static void countPengurangan(int firstNumber, int secondNumber){

        int result = firstNumber - secondNumber;
        System.out.println("Hasilnya adalah = " + result ) ;

    }

    public static void viewPembagian(){

        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Pembagian");

        System.out.print("Masukan Angka Pertama : ");
        firstNumber = scanner.nextInt();

        System.out.print("Masukan angka Kedua : ");
        secondNumber = scanner.nextInt();

        countPembagian(firstNumber, secondNumber);

        int menu = 0;


        while (menu != 3){

            System.out.println("menu");
            System.out.println("1. Kembali Menghitung");
            System.out.println("2. Kembali Ke Menu Awal");
            System.out.println("3. Keluar");

            System.out.print("Pilih Menu : ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    viewPembagian();
                    break;
                case 2:
                    showMenu();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Anda memasukan pilihan no yang salah, silahkan coba kembali");
            }
        }

    }

    public static void countPembagian(int firstNumber, int secondNumber){

        int result = firstNumber / secondNumber;
        System.out.println("Hasilnya adalah = " + result);

    }

    public static void viewPerkalian(){

        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kalkulator Perkalian");

        System.out.print("Masukan Angka Pertama");
        firstNumber = scanner.nextInt();

        System.out.println("Masukan Angka Kedua");
        secondNumber = scanner.nextInt();

        countPerkalian(firstNumber, secondNumber);

        int menu = 0;

        while (menu !=3){

            System.out.println("Menu");
            System.out.println("1. Kembali Menghitung");
            System.out.println("2. Kembali ke menu Utama");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu : ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    viewPembagian();
                    break;
                case 2:
                    showMenu();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Anda memasukan pilihan no yang salah, silahkan coba kembali");
            }

        }

    }

    public static void countPerkalian(int firstNumber, int secondNumber){

        int result = firstNumber * secondNumber;
        System.out.println("Hasilnya adalah : " + result);

    }

}