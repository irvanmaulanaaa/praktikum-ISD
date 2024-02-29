import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenArrayList<ATK> atk = new GenArrayList<>();
        GenArrayList<Bag> bag = new GenArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Inputan Data ke: " + (i+1));
            System.out.print("Masukan Kode Barang : ");
            String kodeBrg = input.next();
            System.out.print("Masukan Nama Barang : ");
            String namaBrg = input.next();
            System.out.print("Masukan Jenis Barang : ");
            String jenisBrg = input.next();
            System.out.print("Masukan Stok Barang : ");
            int stokBrg = input.nextInt();
            System.out.println();

            atk.addData(new ATK(namaBrg, kodeBrg, jenisBrg, stokBrg));
        }

        atk.displaySort();

        for (int i = 0; i < 3; i++) {
            System.out.println("Inputan Data ke: " + (i+1));
            System.out.print("Masukan Kode Barang : ");
            String kodeBrg = input.next();
            System.out.print("Masukan Nama Barang : ");
            String namaBrg = input.next();
            System.out.print("Masukan Jenis Barang : ");
            String jenisBrg = input.next();
            System.out.print("Masukan Stok Barang : ");
            int stokBrg = input.nextInt();
            System.out.println();

            Bag testing = new Bag(namaBrg, kodeBrg, jenisBrg, stokBrg);

            bag.addData(testing);
        }
        
        bag.addData(new Bag("pena", "1579", "Alat Tulis", 10));
        Bag bagDelete = (new Bag("pena", "1579", "Alat Tulis", 10));

        bag.displaySort();

        bag.removeData(bagDelete);
        bag.display();;
    }
}
