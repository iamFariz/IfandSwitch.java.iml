import java.util.Scanner;

class IfAndSwitch {
    public static void main(String[] args) {
        //deklrasi Judul/ Title dalam bentuk String
        final String Title1 = "Perhitungan Grade NIlai Mahasiswa";
        final String Title2 = "---------------------------------";
        final String Title3 = " Penalaian";

        Scanner myInput = new Scanner(System.in);//deklarasi myInput Sebagai variabel input dari user
        System.out.println(Title1);
        System.out.println(Title2);

        System.out.println("Masukan NIM : ");
        String myNIM = myInput.nextLine(); //memasukan input NIM ke variable 'myNIM'
        System.out.println("Masukan Nama : "); //memasukan input Nama ke variabel 'myName'
        String myName = myInput.nextLine();
        System.out.println("Masukan Kelas : ");
        String myClass = myInput.nextLine(); //memasukan input Kelas ke variable 'myClass'

        System.out.println("\n" + Title3); //cetak Title3
        System.out.println(Title2); //cetak title2

        double nilai;
        String textLulus;

        double[] myScore = new double[4]; //deklarasi variable 'myScore' sebagai ARRAY bertipe DOUBLE

        System.out.println("Nilai Algoritma = ");
        nilai = myInput.nextDouble(); //memasukan input Nilai Algoritma kevariable 'nilai'
        myScore[0]= nilai; //memasukan isi dari variable 'nilai' ke ARRAY 'myscore' alamat ke 0

        System.out.println("Nilai Sistem Basis Data = ");
        nilai =  myInput.nextDouble();
        myScore[1]= nilai; //m

        System.out.println("Nilai Aljabar Liniar = ");
        nilai = myInput.nextDouble();
        myScore[2]= nilai;

        System.out.println("Nilai Math Diskrit = ");
        nilai = myInput.nextDouble();
        myScore[3]= nilai;

        System.out.println("\n Hasil Grade Penilaian");
        System.out.println(Title2);

        if (myScore[0] > 70) {//mengecek apakah isi dari ARRAY 'myscore' Alamat index ke 1 0 lebih besar dari 70
            textLulus = "Lulus"; //jika lebih besar dari 70 maka 'Lulus'
        }else{
            textLulus = "Gagal"; //jika tidak lebih dari 70 maka 'gagal'
        }
        System.out.println("Nilai Algoritma Anda = " + myScore[0] + " " + textLulus);

        if (myScore[1] > 70 ) {//mengecek apakah isi dari ARRAY 'myScore' alamat index ke 1 lebih besar dari 70
            textLulus = "Lulus";
        }else {
            textLulus = "Gagal";
        }
        System.out.println("Nilai Sistem Basis Data Anda = " + myScore[1] + " " + textLulus);

        if (myScore[2] > 70) { //mengecek apakah isi dari ARRAY 'myScore' alamat index ke 2 lebih besar dari 70
            textLulus = "Lulus";
        }else {
            textLulus = "Gagal";
        }
        System.out.println("Nilai Aljabar Linier Anda = " + myScore[2] + " " + textLulus);

        if (myScore[3] > 70) {//mengecek apakah isi dari array 'myscore' index ke 3 lebih besar dari 70
            textLulus = "Lulus";
        }else {
            textLulus = "Gagal";
        }
        System.out.println("Nilai Math Diskrit Anda = " + myScore[3]+ " " + textLulus);

    }

}
