package org.example.java_professional_renewed.io;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args){
        try (
             DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")))
        ) {
            dataOutputStream.writeShort(1000);
            dataOutputStream.writeInt(1111);
            dataOutputStream.writeLong(10L);
            dataOutputStream.writeUTF("Hello World!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))) {
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readUTF());
            File file = new File("");
            file.list();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
