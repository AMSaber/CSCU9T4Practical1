/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class CycleEntry extends Entry {
    protected String terrain;
    protected String tempo;
    
    public CycleEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String tem) {
    super(n, d, m, y, h, min, s, dist);
    this.terrain = ter;
    this.tempo = tem;
  } //constructor

    public String getTerrain() {
        return terrain;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
    public String getEntry () {
        String result = getName()+" cycled " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+" on " + getTerrain() +
             " at "+ getTempo() +" tempo"+ "\n";
    return result;
    }
    
} //Step 6
