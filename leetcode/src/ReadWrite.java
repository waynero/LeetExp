public class ReadWrite {


    private static int data;
    private static boolean writer;
    private static int readercom;

    public int read() throws InterruptedException {
        if(writer){
            this.wait();
        }
        readercom++;
        int ret = data;
        readercom--;
        return ret;
    }

    public void write(int input) throws InterruptedException {
        if(readercom > 0 || writer){
            this.wait();
        }
        writer = true;
        data = input;
        writer = false;
    }

    public static void main(String[] args){
        ReadWrite impl = new ReadWrite();

    }
}
