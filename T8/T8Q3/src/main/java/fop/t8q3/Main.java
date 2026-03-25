package fop.t8q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Coordinate c = new Coordinate(2,3);
        System.out.println("Max X = "+c.getXMax());
        System.out.println("Max Y = "+c.getYMax());
        c.setCoordinatePlot(0, 0);
        c.displayPlot();
        c.displayCoordinateLocation();
        
        //reset the size
        c.changeCoordinateMax(10, 10);
        System.out.println("Max X = "+c.getXMax());
        System.out.println("Max Y = "+c.getYMax());
        c.setCoordinatePlot(8, 9);
        c.displayPlot();
        c.displayCoordinateLocation();
        
        //user input version
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max X:");
        int maxX = sc.nextInt();
        System.out.println("Enter max Y:");
        int maxY = sc.nextInt();
        c.changeCoordinateMax(maxX, maxY);
        System.out.println("Max X = "+c.getXMax());
        System.out.println("Max Y = "+c.getYMax());
        System.out.println("Enter Coordinate Index(X)");
        int coorX = sc.nextInt();
        System.out.println("Enter Coordinate Index(Y)");
        int coorY = sc.nextInt();
        c.setCoordinatePlot(coorX, coorY);
        System.out.println("Enter Coordinate Index(X)");
        coorX = sc.nextInt();
        System.out.println("Enter Coordinate Index(Y)");
        coorY = sc.nextInt();
        c.setCoordinatePlot(coorX, coorY);
        c.displayPlot();
        c.displayCoordinateLocation();
    }
}
