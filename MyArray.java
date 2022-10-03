import java.util.Random;

/**
 * MyArray class
 * author : bintang
 */
class MyArray {
    Random r = new Random();
    int[] data;
    int maxSize, size;

    public MyArray() {
        this.maxSize = 5;
        data = new int[maxSize];
        this.size = 0;

    }

    public MyArray(int maxSize) {
        this.maxSize = maxSize;
        data = new int[maxSize];
        this.size = 0;
    }

    public void rand(int n) {
        for (int j = 0; j < this.maxSize; j++) {
            data[j] = r.nextInt(n - 1);
            this.size++;
        }

    }

    public void display() {
        int no = 0;
        for (int i : data) {
            System.out.println("array [" + no + "] = " + i);
            no++;
        }
        System.out.println("-------------");
    }

    public int getSize() {
        return this.size;
    }

    public void insertiInFront(int awal) {
        // array baru sementara
        int[] sem = new int[this.maxSize - 1];
        // array lama dipindah ke baru
        for (int i = 0; i < sem.length; i++) {
            sem[i] = data[i];
        }

        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                // memasukkan angka yang di input user ke array data index 0 / ke awal array
                data[i] = awal;
            } else {
                // memasukkan angka dari variabel sementara ke variabel yg lama
                // namun dengan array utama yg index nya di kurangi 1
                data[i] = sem[i - 1];
            }
        }

    }

    public void setElement(int posisi, int element) {
        if (posisi < 0 & posisi > maxSize) {
            System.out.println("maaf array anda tidak ditemukan");
        } else {
            data[posisi] = element;
        }
    }

    public int getData(int posisi) {
        int element = 0;
        if (posisi < 0 || posisi >= maxSize) {

        } else {
            element = data[posisi];
        }
        return element;
    }

    // menggeser semua data pada array ke arah kanan
    public void shiftRight() {
        // variabel sementara untuk menampung array
        int[] sem = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            // data array lama di simpan di array baru dengan catatan index
            // dari data lama dikurangi satu supaya bisa bergeser ke kiri
            // kecuali data baru index 0 mengambil data lama index terakhir
            if (i == 0) {
                sem[i] = data[maxSize - 1];
            } else {
                sem[i] = data[i - 1];

            }
        }
        // data sementara yang sudah bergeser ke kanan di masukkan ke data lama
        for (int i = 0; i < data.length; i++) {
            data[i] = sem[i];
        }

    }

    // menggeser semua data pada array ke arah kiri
    public void shiftLeft() {
        // data array lama di simpan di array baru dengan catatan index
        // dari data lama ditambah satu supaya bisa bergeser ke kanan
        int[] sem = new int[maxSize];
        // kecuali data baru index akir mengambil data lama index 0
        for (int i = 0; i < maxSize; i++) {
            if (i == maxSize - 1) {
                sem[i] = data[0];
            } else {
                sem[i] = data[i + 1];

            }
        }
        // data sementara yang sudah bergeser ke kiri di masukkan ke data lama
        for (int i = 0; i < data.length; i++) {
            data[i] = sem[i];
        }

    }

    // membalik array
    public void reverse() {
        int[] sem = new int[this.maxSize];
        // copy array lama ke array baru
        for (int i = 0; i < this.maxSize; i++) {
            sem[i] = data[i];
        }
        // dikembalikan dengan konidisi index terbalik
        int no = maxSize - 1;
        for (int i = 0; i < maxSize; i++) {
            data[i] = sem[no];
            no--;
        }

    }

    // mengacak isi array
    public void shuffle() {
        for (int i = 0; i < maxSize; i++) {
            // mengacak index ke berapa yang ingin di timpa dengan index i dan sebaliknya
            int randomIndextoswep = r.nextInt(data.length);
            int sem = data[randomIndextoswep];
            data[randomIndextoswep] = data[i];
            data[i] = sem;
        }
    }

    public int maximum() {
        int highest = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > highest) {
                highest = data[i];
            }
        }
        return highest;
    }

    public int maximumPositon() {
        int highest = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > highest) {
                highest = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (highest == data[i]) {
                highest = i;
            }
        }
        return highest;
    }

    public int minimumPositon() {
        int smallest = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < smallest) {
                smallest = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (smallest == data[i]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public int minimum() {
        int smallest = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < smallest) {
                smallest = data[i];
            }
        }
        return smallest;
    }

    public int sum() {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum;
    }

    public double mean() {
        double sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum / maxSize;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public MyArray copy() {
        MyArray s = new MyArray();
        s.setData(this.data);
        return s;

    }
}