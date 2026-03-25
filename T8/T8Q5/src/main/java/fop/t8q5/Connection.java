
package fop.t8q5;

public class Connection {
    private static int connCounter=0;
    Connection(){
        connCounter++;
        System.out.println("Done Establish New Connection");
    }
    
    void Disconnect(){
        connCounter--;
        System.out.println("Done Remove Connection");
    }
    
    public static void DisplayConnection(){
        System.out.println("Total Active Connection: "+connCounter);
    }
}
