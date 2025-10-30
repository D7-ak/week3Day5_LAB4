import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the Circle's radius :");
        System.out.print("radius: ");
        double radius = sc.nextInt();
        Circle c = new Circle(radius);
        /**********************************************************************/
        System.out.println("please enter the Rectangle's 1-height, 2-width");
        System.out.print("height: ");
        double height = sc.nextInt();
        System.out.print("width: ");
        double width = sc.nextInt();
        Rectangle r = new Rectangle(width,height);
        /*******************************************************************/
        System.out.println("please enter Triangle's 1-height 2-base");
        System.out.print("height: ");
        double triHeight = sc.nextInt();
        System.out.print("base: ");
        double base = sc.nextInt();
        Triangle t = new Triangle(triHeight,base);
        /******************************************************************/
        while (true){
            try {
                System.out.println("1-to enter circle");
                System.out.println("2-to enter rectangle");
                System.out.println("3-to enter triangle");
                System.out.println("4-to Exit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("1 to print the information of the circle");
                        System.out.println("2 to edit the radius");
                        int cirChoice = sc.nextInt();
                        switch (cirChoice){
                            case 1:
                                System.out.println(c);
                                break;
                            case 2:
                                System.out.println("the current radius= "+c.getRadius());
                                System.out.println("enter the new radius");
                                c.setRadius(sc.nextDouble());
                                break;
                            default:
                                System.out.println("invalid!");
                        }
                        break;
                    case 2:
                        System.out.println("1 to print the information of the Rectangle");
                        System.out.println("2 to edit the width, height");
                        int recChoice = sc.nextInt();
                        switch (recChoice){
                            case 1:
                                System.out.println(r);
                                break;
                            case 2:
                                System.out.println("the current height= "+r.getHeight()+" width= "+r.getWidth());
                                System.out.println("enter the new height");
                                r.setWidth(sc.nextDouble());
                                System.out.println("enter the new width");
                                r.setHeight(sc.nextDouble());
                                break;
                            default:
                                System.out.println("invalid!");
                        }
                        break;
                    case 3:
                        System.out.println("1 to print the information of the Triangle");
                        System.out.println("2 to edit the height, base");
                        int triChoice = sc.nextInt();
                        switch (triChoice){
                            case 1:
                                System.out.println(t);
                                break;
                            case 2:
                                System.out.println("the current height= "+t.getHeight()+" base= "+t.getBase());
                                System.out.println("enter the new height");
                                t.setHeight(sc.nextDouble());
                                System.out.println("enter the new base");
                                t.setBase(sc.nextDouble());
                                break;
                            default:
                                System.out.println("invalid!");
                        }
                        break;
                    case 4:
                        System.out.println("thank you for using, bye");
                        System.exit(0);
                    default:
                        System.out.println("invalid!! chose from 1-4");
                }
            }catch (InputMismatchException e){
                System.out.println("invalid! please enter a number");
            }
            sc.nextLine();
        }
    }
}