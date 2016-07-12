/* E/13/397
* D.L Wickramanayake
* Lab 04*/

import java.util.ArrayList;

public class Ball {

    /* here we must contain the data we use in the whole class  */
    private double x;
    private double y;
    private double speed;
    private double angleOfSpeed;

    //array list is made static so that through out the class only this array ist is used
    static ArrayList<Ball> ballList = new ArrayList<Ball>();

    //this is the constructor of the we define 4 characteristics of the object
    public Ball(double x, double y, double speed, double angleOfSpeed) {
    //value get from the main method is equal to the values of the object
        this.x = x;  //here this. is not necessary simply i can say x = x
        this.y = y;
        this.speed = speed;
        this.angleOfSpeed = angleOfSpeed;
        ballList.add(this); //ball is added to the array list every time
        //every time a ball is created that ball will point to the array list
    }

    //this method is defined to update the location according to the time
    public void updateLocation(double time){
        x = x + speed*Math.cos(angleOfSpeed)*time;
        y = y + speed*Math.sin(angleOfSpeed)*time;

    }

    //using the location update method here the ball is set in location according to the time
    public static void updateTime(double time) {
        for(Ball count : ballList){
            count.updateLocation(time);
        }
    }

    public void showAll() {
        //this should not be static
        //here the location of the balls in the array list is displayed accordingly
        System.out.println("------Information about the locations of Balls in use------");
        for(Ball count : ballList){
            System.out.print("x coordinate - "+count.x+ " ** ");
            System.out.print("y coordinate - "+count.y);
            System.out.print("\n");

        }

    }

    //this method is used to know whether location of 2 balls are same
    public Boolean willCollide(Ball myBall) {

        //if the ball belong to the method is equal to the location of ball input by method then collision happen
        if(this.x ==myBall.x && this.y == myBall.y)
            return true; //if collision happen then return true

        return false; //if not return false
    }

//this is the main method used to test the class
    public static void main(String [] args) {

	/*
	Ball b1 = new Ball(0.0, 1.0, 10.0, 45.0);
	Ball.updateTime(10.0);

	Ball b2 = new Ball(10.0, 20.0, 2.0, 30.0);
	if(b1.willCollide(b2))
	    System.out.println("B1 and B2 will collide");
	*/
System.out.println("------------------Test 01---------------------------------");
        //Test 1 - B1 & B2 will collide
        Ball b1 = new Ball(0.0, 0.0, 2.0, 0.0);
        Ball b2 = new Ball(10.0, 0.0, 1.0, 0.0);
        Ball b3 = new Ball(20.0, 0.0, 10.0, 0.0);
        Ball.updateTime(10.0);
        if(b2.willCollide(b1))
            System.out.println("B1 and B2 will collide");
        if(b3.willCollide(b1))
            System.out.println("B1 and B3 will collide");
        if(b3.willCollide(b2))
            System.out.println("B2 and B3 will collide");

        b1.showAll(); //irrespective of the ball choose this will print every ball in the array list

System.out.println("------------------End Test---------------------------------");


/*System.out.println("------------------Test 02---------------------------------");

	//Test 2, will collide
	Ball b21 = new Ball(0.0, 0.0, 10.0, 0.0);
	Ball.updateTime(10.0);

	Ball b22 = new Ball(100, 0.0, 2.0, 30.0);
	if(b21.willCollide(b22))
	    System.out.println("B21 and B22 will collide");

    b21.showAll();   //irrespective of the ball choose this will print every ball in the array list

System.out.println("------------------End Test---------------------------------");*/

/*System.out.println("------------------Test 03---------------------------------");

	//Test3, will collide
	Ball b31 = new Ball(0.0, 1.0, 5.0, 0.0);
	Ball.updateTime(10.0);
	Ball b32 = new Ball(75.0, 1.0, 2.5, 0.0);
	Ball.updateTime(10.0);
	if(b31.willCollide(b32))
	    System.out.println("B31 and B32 will collide");

    b31.showAll();  //irrespective of the ball choose this will print every ball in the array list

//System.out.println("------------------End Test---------------------------------");*/


    }
}
