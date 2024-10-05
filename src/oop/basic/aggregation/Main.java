package oop.basic.aggregation;

public class Main {
    public static void main(String[] args){
        Racket racket = new Racket("aa",3.5);
        TenisPlayer player = new TenisPlayer("nut",racket);
        System.out.println(player.getName()+" has a "+racket);
    }
}
