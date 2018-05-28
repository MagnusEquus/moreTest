package com.example.fedor.moretest;

public class Results {
    String variable;
    int[] measurements;
    int[] errors;
    int mTarget;
    int eTarget;

    public Results(String variable, int[] measurements, int[] errors, int mTarget, int eTarget) {
        this.variable = variable;
        this.measurements = measurements;
        this.errors = errors;
        this.mTarget = mTarget;
        this.eTarget = eTarget;
    }
}
