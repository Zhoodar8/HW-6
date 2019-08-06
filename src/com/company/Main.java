package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

          Boss bs = new Boss(150);
          bs.setName("Madara");
          bs.setHealth(1000);
          bs.setHit(100);
          bs.setLevel(7);


          Warriror wr = new Warriror(150);
          wr.setName("Kakashi");
          wr.setHealth(300);
          wr.setHit(50);
          wr.setLevel(2);

          Magic mg = new Magic(100);
          mg.setName("Tobi");
          mg.setHealth(250);
          mg.setHit(50);
          mg.setLevel(3);
          String[] mgc = {"Fire", "Water", "Air" };
        System.out.println(Arrays.toString(mgc));

          Mental mn = new Mental(150);
          mn.setName("Ino");
          mn.setHealth(300);
          mn.setHit(50);
          mn.setLevel(4);




    }
}
