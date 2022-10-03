import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String jawaban;
        int jawaban2;
        MyArray arr = new MyArray();
        boolean cekKondisi = true, cekKondisi2 = true;
        do {
            System.out.println("Ingin memasukkan nilai maksimal array ? (y/t)");
            jawaban = input.nextLine();
            if (jawaban.equalsIgnoreCase("y")) {
                System.out.println("masukkan nilai maksimum :");
                jawaban2 = input.nextInt();
                arr = new MyArray(jawaban2);
                cekKondisi = false;
            } else if (jawaban.equalsIgnoreCase("t")) {
                arr = new MyArray();
                arr.display();
                cekKondisi = false;
            } else {
                System.out.println("masukkan input yang benar");

            }
        } while (cekKondisi);
        do {
            menu();
            jawaban = input.nextLine();
            switch (jawaban) {
                case "1":
                    System.out.println("masukkan nilai maksimal yang ingin dimasukkan ke setiap array");
                    jawaban2 = input.nextInt();
                    arr.rand(jawaban2);
                    arr.display();
                    break;

                case "2":
                    System.out.println("nilai size dari array : " + arr.getSize());

                    break;

                case "3":
                    System.out.println("masukkan nilai yang ingin dimasukkan ke array paling depan");
                    jawaban2 = input.nextInt();
                    arr.insertiInFront(jawaban2);
                    arr.display();

                    break;

                case "4":

                    System.out.println("masukkan nilai yang ingin dimasukkan");
                    jawaban2 = input.nextInt();
                    System.out.println("masukkan posisi");
                    int jawaban3 = input.nextInt();
                    arr.setElement(jawaban3, jawaban2);

                    arr.display();
                    break;

                case "5":
                    System.out.println("masukkan index yang ingin diketahui nilainya = ");
                    jawaban2 = input.nextInt();
                    if (arr.getData(jawaban2) == 0) {
                        System.out.println("maaf posisi yg anda masukkan kurang pas");
                    } else {
                        System.out.println("data index [" + jawaban2 + "] = " + arr.getData(jawaban2));
                    }

                    break;

                case "6":
                    MyArray s = arr.copy();
                    s.display();
                    break;
                case "7":
                    System.out.println("sebelum di geser");
                    arr.display();
                    arr.shiftRight();
                    System.out.println("setelah di geser");
                    arr.display();

                    break;
                case "8":

                    System.out.println("sebelum di geser");
                    arr.display();
                    arr.shiftLeft();
                    System.out.println("setelah di geser");
                    arr.display();
                    break;
                case "9":
                    System.out.println("sebelum di balik");
                    arr.display();
                    arr.reverse();
                    System.out.println("setelah di balik");
                    arr.display();

                    break;
                case "10":
                    System.out.println("sebelum di acak");
                    arr.display();
                    arr.shuffle();
                    System.out.println("setelah di acak");
                    arr.display();
                    break;
                case "11":
                    System.out.println("angka terbesar dalam array = " + arr.maximum());
                    break;
                case "12":
                    System.out.println("angka terkecil dalam array = " + arr.minimum());
                    break;

                case "13":
                    arr.display();
                    System.out.println("sum = " + arr.sum());
                    break;
                case "14":
                    arr.display();
                    System.out.println("mean = " + arr.mean());
                    break;
                case "15":
                    arr.display();
                    System.out.println("nilai terbesar dalam array berada di index : " + arr.maximumPositon());
                    break;
                case "16":
                    arr.display();
                    System.out.println("nilai terkecil dalam array berada di index : " + arr.minimumPositon());
                    break;
                default:
                    System.out.println("silahkan masukkan angka yang benar");
                    break;
            }
            cekKondisi2 = true;
            System.out.println("apakah anda ingin melakukan operasi lain ?");
            do {
                jawaban = input.nextLine();
                if (jawaban.equalsIgnoreCase("y")) {
                    cekKondisi = true;
                    cekKondisi2 = false;

                } else if (jawaban.equalsIgnoreCase("t")) {
                    cekKondisi = false;
                    cekKondisi2 = false;
                }
            } while (cekKondisi2);
        } while (cekKondisi);

    }

    public static void menu() {
        int no = 1;
        System.out.println("silahkan pilih daftar menu : ");
        System.out.println(no++ + ".rand ");
        System.out.println(no++ + ".getSize");
        System.out.println(no++ + ".insert");
        System.out.println(no++ + ".setElement");
        System.out.println(no++ + ".getElement");
        System.out.println(no++ + ".copy");
        System.out.println(no++ + ".shiftRight");
        System.out.println(no++ + ".shiftLeft");
        System.out.println(no++ + ".reverse");
        System.out.println(no++ + ".shuffle");
        System.out.println(no++ + ".maximum");
        System.out.println(no++ + ".minimum");
        System.out.println(no++ + ".sum");
        System.out.println(no++ + ".mean");
        System.out.println(no++ + ".maxPosition");
        System.out.println(no++ + ".minPosition");

    }

}
