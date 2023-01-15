package performance_task;

import java.util.Scanner;

public class Performance_Task {

public static void main(String[] args) {



		

System.out.println("Welcome to the Tshirt Launcher! first lets calculate the trajectory of the shirts ");
System.out.println();
Scanner inKey = new Scanner (System.in);
System.out.println("Enter launch velocity (m/s) >>> ");
double velocity = inKey.nextDouble();
System.out.println("Enter launch angle (degrees) >>> ");
double angle = inKey.nextDouble();
double xpos = 0;
double ypos = 1;
int time = 0;
boolean ground = true;
System.out.println();
System.out.println("Projectile's path: \n");
while (ground) {
xpos = Math.cos(Math.toRadians(angle)) * time * velocity;
ypos = Math.sin(Math.toRadians(angle)) * time * velocity - 0.5 * 9.8 * Math.pow(time, 2);
if (ypos<0) {
ground = false;
ypos = 0;


				}

System.out.println("Time: " + time + "s\n");
System.out.println("x-position: " + xpos + "m\n");
System.out.println("y-position: " + ypos + "m\n");


			time++;


		}


	}

}

