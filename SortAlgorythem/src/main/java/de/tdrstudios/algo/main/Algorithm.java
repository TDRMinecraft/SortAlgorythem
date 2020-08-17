package de.tdrstudios.algo.main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Algorithm {

    public static int End;
    private static int momory;


    public static void main(String[] args) throws InterruptedException {
        setNumbers.SetNumbers();
        System.out.println(" Die Zahlen sind: " + " " + Numbers.getNumbers());
        End = 8;



        while(End != 1) {
            AlgorithmTask(Numbers.getNumber1(), Numbers.getNumber2(), Numbers.getNumber3(), Numbers.getNumber4(), Numbers.getNumber5(), Numbers.getNumber6(), Numbers.getNumber7() , Numbers.getNumber8());
            Thread.sleep(100);

        }




    }

    public static void AlgorithmTask(int z1, int z2, int z3, int z4, int z5, int z6, int z7, int z8) {
        System.out.println( End + "----------------------------------------");

        if(z1 > z2) {
            momory = z1;
            z1 = z2;
            z2 = momory;
        }

        if(z2 > z3) {
            momory = z2;
            z2 = z3;
            z3 = momory;
        }

        if(z3 > z4) {
            momory = z3;
            z3 = z4;
            z4 = momory;
        }

        if(z4 > z5) {
            momory = z4;
            z4 = z5;
            z5 = momory;
        }

        if(z5 > z6) {
            momory = z5;
            z5 = z6;
            z6 = momory;
        }

        if(z6 > z7) {
            momory = z6;
            z6 = z7;
            z7 = momory;
        }
        if(z7 > z8) {
            momory = z7;
            z7 = z8;
            z8 = momory;
        }

        Numbers.setNumber1(z1);
        Numbers.setNumber2(z2);
        Numbers.setNumber3(z3);
        Numbers.setNumber4(z4);
        Numbers.setNumber5(z5);
        Numbers.setNumber6(z6);
        Numbers.setNumber7(z7);
        Numbers.setNumber8(z8);

        System.out.println(" Die Zahlen sind: " + " " + Numbers.getNumbers());
        End = End - 1;

        if(End == 1) {

            System.out.println("-----------------------------------------");
            System.out.println(" Sortierung Erfolgreich!");
        }

    }
}
