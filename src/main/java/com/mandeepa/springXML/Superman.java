package com.mandeepa.springXML;

public class Superman implements Hero{

    private final String powerLevel;
    private final int experience;

    public Superman(String powerLevel, int experience){
        this.powerLevel = powerLevel;
        this.experience = experience;
    }

    @Override
    public void action(){
        System.out.println("Superman with power level " + powerLevel + " and " + experience + " years of experience is flying!");
    }

}
