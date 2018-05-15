package step22.ex4;

import java.io.FileInputStream;

public class ObjectInputStream extends FileInputStream {
    
    public ObjectInputStream(String filename) throws Exception {
        super(filename);
    }
    
    public void readUTF(String str) throws Exception {
        byte[] buf = new byte[100];
        int size = this.read();
        this.read(buf, 0, size);
        new String(buf, 0, size, "UTF-8");
    }

    public int readInt(int value) throws Exception{
        value = this.read() << 24;
        value += this.read() << 16;
        value += this.read() << 8;
        value += this.read();
        return value;
    }
    public void readLong(long value) throws Exception{
        value = ((long)(this.read() << 54));
        value += ((long)(this.read() << 48));
        value += ((long)(this.read() << 40));
        value += ((long)(this.read() << 32));
        value += ((long)(this.read() << 24));
        value += ((long)(this.read() << 16));
        value += ((long)(this.read() << 8));
        value += ((long)(this.read()));

    }

    public boolean readBoolean(boolean value) throws Exception{
        if(this.read() == 1)
            return true;
        else
            return false;
    }
}
