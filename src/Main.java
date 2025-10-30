import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the Circle's radius :");
        double radius = sc.nextInt();
        Circle c = new Circle(radius);
        System.out.println("please enter the Rectangle's 1-height, 2-width");
        double height = sc.nextInt();
        double width = sc.nextInt();
        Rectangle r = new Rectangle(width,height);
        System.out.println("please enter Triangle's 1-height 2-base");
        double triHeight = sc.nextInt();
        double base = sc.nextInt();
        Triangle t = new Triangle(triHeight,base);
        while (true){
            try {
                System.out.println("1 to enter circle");
                System.out.println("2 ro enter rectangle");
                System.out.println("3 to enter triangle");
                System.out.println("4 to Exit");
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
                                System.out.println("the current width= "+r.getWidth()+" height= "+r.getHeight());
                                System.out.println("enter the new width");
                                r.setWidth(sc.nextDouble());
                                System.out.println("enter the new height");
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
                                System.out.println("the current Base= "+t.getBase()+" height= "+t.getHeight());
                                System.out.println("enter the new base");
                                r.setWidth(sc.nextDouble());
                                System.out.println("enter the new height");
                                r.setHeight(sc.nextDouble());
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