/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
    protected int repetitions;
    protected int recovery;
    private int intDistance;
    
    public SprintEntry (String n, int d, int m, int y, int h, int min, int s, float dist, int reps, int rec) {
    super(n, d, m, y, h, min, s, (int) dist);
    this.repetitions = reps;
    this.recovery = rec;
    this.intDistance = (int) dist;
  } //constructor

    public int getRepetitions() {
        return repetitions;
    }

    public int getRecovery() {
        return recovery;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setRecovery(int recovery) {
        this.recovery = recovery;
    }
    
    public String getEntry () {
     String result = getName()+" sprinted " + getRepetitions() + "x" + getDistance() + "m in "
               +getHour()+":"+getMin()+":"+ getSec() + " with " + getRecovery() + " minutes recovery on "
               +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
     return result;
    } //getEntry
    
} //Step 6