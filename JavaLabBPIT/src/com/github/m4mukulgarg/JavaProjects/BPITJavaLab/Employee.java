package com.github.m4mukulgarg.JavaProjects.BPITJavaLab;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

//Class Employee contains multiple definitions for the method setVal
public class Employee {
    int eId;
    String name;

    public void setVal(int eId){
        this.eId = eId;
    }

    public void setVal(String name){
        this.name = name;
    }

    public void setVal(int eId, String name){
        this.eId = eId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "eId=" + eId +
                ", name='" + name + '\'';
    }
}

