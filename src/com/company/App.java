package com.company;

public class App {
    public static void main(String[] args){
        Camera GoPro = new Camera();
        System.out.println(GoPro);

        Camera Canon = new Camera("Canon", 12, 64, "Red");
        System.out.println(Canon);

        Camera Nikon = new Camera("Nikon", 12, 32, "Green", 100,
                "China", 10, 2.4, "Digital Y6YY", 20,
                30, 0);
        System.out.println(Nikon);

        Camera.printStaticWeight();
        Canon.printWeight();
    }
}