package com.studybilibili.extend;

public class ExtendExercise {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        NotePad notePad = new NotePad("amd", 13, 233, "red");
        pc.printInfo();
        notePad.getInfo();

    }
}

