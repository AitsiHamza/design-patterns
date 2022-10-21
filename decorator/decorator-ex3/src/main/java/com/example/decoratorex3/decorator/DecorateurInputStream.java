package com.example.decoratorex3.decorator;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public abstract class DecorateurInputStream extends InputStream {
    protected InputStream inputStream;

    public DecorateurInputStream(InputStream inputStream) {
        super();
        this.inputStream = inputStream;
    }

}
