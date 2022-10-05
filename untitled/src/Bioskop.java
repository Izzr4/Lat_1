//credits : @izrarya
package com.company;

import java.util.Scanner;

public class Bioskop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int org = input.nextInt();
        int hari = input.nextInt();
        int jam = input.nextInt();
        double hgawal = 20000, harga = 0;
        float diskon = 0.05f;

        if ((org < 1 || org > 100) || (hari< 1 || hari >7) || (jam < 0 || jam > 24))
        {
            System.out.println("Inputan tidak valid");
            System.exit(0);
        }
        if (hari < 6)
        {
            if (jam >= 0 && jam<=11)
            {
                hgawal += 0;
            }else
            {
                hgawal += 10000;
            }
        }
        else if (hari >= 6) {
            if (jam >= 0 && jam <= 11)
            {
                hgawal += 15000;
            }
            else
            {
                hgawal += 20000;
            }
        }

        if (org > 2)
        {
            harga = (int) (hgawal-(hgawal*diskon));
            System.out.println("Total : Rp "+(harga*org));
        }else
        {
            System.out.println("Total : Rp "+(hgawal*org));
        }

    }
}
