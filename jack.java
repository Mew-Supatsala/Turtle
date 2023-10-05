public class jack implements Runnable {
    private int positionX, positionY, round;
    private String penColor;
    public jack(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        this.round = round;
    }
    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        // bob.width(5);
        // bob.speed(2);
        // for(int i=0;i<this.round;i++)
        // {
        //     bob.forward(i/50.);
        //     bob.left(5);
        // }
        bob.bgcolor("darkgray");
        // bob.penColor("purple");
        bob.width(10);
        bob.speed(5);
       

        int radius = 100;
        double angle = 360;
        double length =2 * Math.PI * radius * (angle / 300);
        int steps = 100;
        double stepSize = length / steps;



        for(int i = 0; i < steps; i++){
           
            bob.forward(stepSize);
            bob.right(angle / steps);
            
        
        }
        bob.setDirection(90);  
        bob.forward(180);
        bob.up();

        bob.backward(90);
        bob.down();

        bob.setDirection(90); 
        bob.right(90);
        bob.forward(90);
         

        // bob.backward(90);
        // bob.down();

        // bob.setDirection(90); 
        // bob.left(90);
        // bob.forward(90);
        // bob.backward(90);
       
        // bob.setDirection(90);
        // bob.backward(90);
     
        // bob.up();
        // bob.left(145);
        // bob.forward(2 * radius);
        // bob.down();
   
        // bob.setDirection(190);
        // bob.forward(180);
        
        // // bob.setDirection(45);
        // // bob.forward(90);

        // // bob.backward(90);
        // // bob.setDirection(330);
        // // bob.forward(90);
         
    }
}
