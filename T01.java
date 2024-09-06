// 12S24010 - Artha Liebe Siregar
// 12S24054 - Rahel Juri Elisabet Silaban

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatbukuelektronik;
        int tahunTerbit, stok;
        double hargaPembelian, minimummargin;
        double rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbukuelektronik = input.nextLine();
        hargaPembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargaPembelian + "|" + minimummargin + "|" + stok + "|" + rating);
    }
}

