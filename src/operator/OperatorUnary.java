package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                     // i tadinya 0 ditambahkan  1 sehingga i = 1
        System.out.println(i);  // betulkan i nilainya 1
        i++;                     // KARENA I TDINYA SUDAH BERNILAI 1 MAKA SEKARANG DITAMBAH KANN 1 LAGI MENJADI 2
        System.out.println(i);   // tuh bener kan nilainya 2
        i=i+1;                  // bisa di lihat i++ sama dengan i =i+1
        System.out.println(i); // i tado 2 sekarang menjadi 3
        // berlaku juga untuk penambahan angka lain dan opertaor aritmatika lain
        i+=3; // artinya i = i+3
        System.out.println(i);

        i+=3; // artinya i = i+3
        System.out.println(i);

        i*=3; // artinya i = i*3
        System.out.println(i);

        i*=3; // artinya i = i*3
        System.out.println(i);


    }
}
