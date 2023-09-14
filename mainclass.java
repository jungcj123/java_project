package ppt3_1;


public class mainclass {

	public static void main(String[] args) {
		 circle circle = new circle(5.0);
	        triangle triangle = new triangle(4.0, 6.0);
	        square square = new square(3.0, 7.0);

	        System.out.println("원의 넓이: " + circle.calculatearea());
	        
	        System.out.println("삼각형의 넓이: " + triangle.calculatearea());
	        
			System.out.println("사각형의 넓이: " + square.calculatearea());
	    }


	}


