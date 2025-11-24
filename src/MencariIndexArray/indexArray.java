/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MencariIndexArray;

/**
 *
 * @author Lab Studio
 */

import java.util.Scanner;

public class indexArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah element Array: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        System.out.println("Input " + n + " angka (dipisah dengan enter):");
        for (int i = 0; i < n; i++) {
            angka[i] = input.nextInt();
        }

        System.out.print("Input angka yang akan dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (angka[i] == cari) {
                System.out.println("Angka ditemukan pada index ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Angka tidak ditemukan");
        }
        input.close();
    }
} 