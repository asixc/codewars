package dev.jotxee;

public class TowerBuilder {
    static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            int spaces = nFloors - i - 1;
            int stars = i * 2 + 1;
            tower[i] = " ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces);
        }

        return tower;
    }

    static String[] TowerBuilderSolution1(int n) {
        String t[] = new String[n], e;

        for (int i = 0; i < n; i++)
            t[i] = (e = " ".repeat(n-i-1)) + "*".repeat(i+i+1) + e;

        return t;
    }

    static String[] towerBuilderSolution2(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++)
            tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
        return tower;
    }
}