package fop.t8q5;
public class Main {

    public static void main(String[] args) {
        Connection c1 = new Connection();
        Connection c2 = new Connection();
        
        Connection.DisplayConnection();
        
        c2.Disconnect();
        Connection.DisplayConnection();
    }
}
