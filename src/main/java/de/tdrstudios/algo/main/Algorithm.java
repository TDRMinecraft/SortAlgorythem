package de.tdrstudios.algo.main;



public class Algorithm {

    public static int End;
    private static int momory;


    public static void main(String[] args) throws InterruptedException {
        setNumbers.SetNumbers();
        System.out.println(" Die Zahlen sind: " + " " + Numbers.getNumbers());
        End = 8;



        while(End != 1) {
            AlgorithmTask(Numbers.number1, Numbers.number2, Numbers.number3, Numbers.number4, Numbers.number5, Numbers.number6, Numbers.number7 , Numbers.number8);
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

        Numbers.number1  = z1;
        Numbers.number2 = z2;
        Numbers.number3 = z3;
        Numbers.number4 = z4;
        Numbers.number5 = z5;
        Numbers.number6 = z6;
        Numbers.number7 = z7;
        Numbers.number8 = z8;

        System.out.println(" Die Zahlen sind: " + " " + Numbers.getNumbers());
        End = End - 1;

        if(End == 1) {

            System.out.println("-----------------------------------------");
            System.out.println(" Sortierung Erfolgreich!");
        }

    }
}
