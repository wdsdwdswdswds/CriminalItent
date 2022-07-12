package com.example.criminalitent.entity;

import java.util.List;

public class CrimeList {
    private static List<Crime> crimeLab;

    public CrimeList() {
        if (crimeLab.size() < 1) {
            for (int i = 0; i < 100; i++) {
                Crime crime = new Crime();
                crime.setSolved(i % 2 == 0);
                crime.setTitle("#" + i);
                crimeLab.add(crime);
            }
        }
    }

    public List<Crime> getCrimeLab() {
        return crimeLab;
    }

}
