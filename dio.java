import java.io.*;

class demo {

    public static void main(String[] args) throws IOException {

        // Create a FileInputStream object to read the data from a file
        FileInputStream fis = new FileInputStream(args[0]);

        // Create a DataInputStream object to read the data from the FileInputStream object
        DataInputStream dis = new DataInputStream(fis);

        // Read the data from the DataInputStream object
        int i = dis.readInt();
        float f = dis.readFloat();
        String s = dis.readUTF();

        // Close the DataInputStream object
        dis.close();

        // Print the data that was read
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("s = " + s);
    }
}