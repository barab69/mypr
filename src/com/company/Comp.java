package com.company;

import java.util.Scanner;

public class Comp {
    private String mproc;
    private int gr;
    private int op;
    private int space;

    public String getMproc() {
        return mproc;
    }

    public void setMproc(String mproc) {
        this.mproc = mproc;
    }

    public int getGr() {
        return gr;
    }

    public void setGr(int gr) {
        this.gr = gr;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public Comp(String mproc) {
        this.mproc = mproc;
    }

    public Comp(String mproc, int op, int space) {
        this.mproc = mproc;
        this.op = op;
        this.space = space;
    }

    public Comp(){

    }
    public void Vivod(){
        System.out.println(mproc+" - mpcroc "+op+"- op");
    }

    public void Rabota(Scanner r){
        System.out.print("Write a gr  - ");
        gr = r.nextInt();
        op+=gr;
        System.out.println("Я работаю");
    }

}
