package com.manashee.corejava.trywithresources;

import java.io.*;

public class TryWithoutResources {

    private static final int BUFFER_SIZE = 1024;

    public static void copy (String src, String dst) throws IOException {
        InputStream in = new FileInputStream ( src );
        try {
            OutputStream out = new FileOutputStream(dst);
            int n ;
            byte [] buf = new byte[BUFFER_SIZE];
            try {
                while ( ( n = in.read(buf) ) > 0 ) {
                    out.write(buf,0,n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }

    public static void main(String[] args) throws IOException {
        TryWithoutResources t = new TryWithoutResources();
        TryWithoutResources.copy("/tmp/ash","/tmp/b");
    }

}
