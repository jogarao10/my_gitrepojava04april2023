package com.durgasoft.factory;

import com.durgasoft.beans.Welcome;

public class WelcomeFactory {
    public Welcome getWelcomeInstance(){
        System.out.println("get welcome instance() creating new bean object ");
        return new Welcome();
    }
}
