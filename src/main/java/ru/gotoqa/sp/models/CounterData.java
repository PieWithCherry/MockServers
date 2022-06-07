package ru.gotoqa.sp.models;

import ru.gotoqa.sp.SpApplication;

public class CounterData {


    public void setArray(int i) {
        int j;

        SpApplication.array[0] = i;

    }

    public int returnNumber() {
        return SpApplication.array[0];
    }
}
