package com.example.miconductor;

import android.app.Application;

import io.socket.client.IO;
import io.socket.client.Socket;

public class App extends Application {
    private static Socket mSocket;
    @Override
    public void onCreate() {
        super.onCreate();
//Se crea un socket que apunta a la ruta que se muestra
        try {
            mSocket = IO.socket("http://colectivo.eu-4.evennode.com/");
        }
        catch (Exception e){
        }
    }

    public static String id;
    public static String getidcliente(){
        return id;
    }
    public static void setidcliente(String myid){
        id = myid;
    }

    public static Socket getSocket() {
        return mSocket;
    }
}
