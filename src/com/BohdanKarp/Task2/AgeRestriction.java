package com.BohdanKarp.Task2;

public enum AgeRestriction {
    None((byte) 0),
    Teenager((byte) 14),
    Adult((byte) 18);
    private byte age;
    AgeRestriction (byte age){
        this.age=age;
    }
}
