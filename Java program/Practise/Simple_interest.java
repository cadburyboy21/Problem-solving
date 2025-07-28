package Practise;

class Simple_interest{
    public static void main(String[] args) {
        int P=100000; //amount
        int T=1; //no of years
        int R=2; //rate of interest

        int SI=((P*T*R)/100);
        System.out.println("Simple Interest is: "+SI);
    }
}