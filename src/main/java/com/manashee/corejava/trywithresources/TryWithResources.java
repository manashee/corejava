package com.manashee.corejava.trywithresources;

import java.io.*;

public class TryWithResources {

    private static final int BUFFER_SIZE = 1024;

    public static void copy (String src, String dst) throws IOException {
        try (
                InputStream in = new FileInputStream ( src );
                OutputStream out = new FileOutputStream(dst)
        )
        {
            int n ;
            byte [] buf = new byte[BUFFER_SIZE];
            while ( ( n = in.read(buf) ) > 0 ) {
                out.write(buf,0,n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        TryWithResources t = new TryWithResources();
        TryWithResources.copy("/tmp/ash","/tmp/b");
    }

}
