package com.phantomartist.onix;

public class ONIXException extends RuntimeException {

    /** Serial Version UID */
    private static final long serialVersionUID = 1102579470591831667L;

    public ONIXException(final String msg, final Exception e) {
        super(msg, e);
    }
}
