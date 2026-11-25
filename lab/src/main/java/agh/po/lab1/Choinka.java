package agh.po.lab1;

public class Choinka {
    public static void main(String[] args) {
        String choinka = "*";
        int wysokoscChoinki = Integer.parseInt(args[0]);

        for (int i=1; i <= 11; i+=2) {
            System.out.println(" ".repeat((11-i)/2) + choinka.repeat(i));
        }

        System.out.println();

        for (int i = 0; i < wysokoscChoinki; i++) {
            System.out.println(" ".repeat(wysokoscChoinki-1-i) + choinka.repeat(2*i+1));
        }
    }
}