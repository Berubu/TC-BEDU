package com.reto1;

import java.util.concurrent.Callable;

public class SistemaComunicaciones implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(300);
        return "📡 Comunicaciones: enlace con estación terrestre establecido.";
    }
}
