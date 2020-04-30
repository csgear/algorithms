package com.vkeonline.enthuware.z815;



interface Account{
    public default String getId(){
        return "0000";
    }
}

interface PremiumAccount extends Account{
    String getId() ;
}



public class AssessmentTwo {
}
