package com.phantomartist.onix;

import org.editeur.ns.onix._3_0.reference.ONIXMessage;

public class ONIXMessageHolder {

    private ONIXMessage message;
    
    public ONIXMessageHolder(final ONIXMessage msg) {
        this.message = msg;
    }
    
    public ONIXMessage getMessage() {
        return message;
    }
}
