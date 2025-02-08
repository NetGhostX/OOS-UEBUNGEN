class Point{
    int x;
    int y;

    //default constructor
    public Point(){
        this.x=0;
        this.y=0;
    }

    //constructor with parameter
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //copy constructor
    public Point(Point x){
        this.x = x.x;
        this.y = x.y;
    }

    //retrieving the points location
    public Point getLocation(){
        return new Point(x,y);
    }

    //making copy of the points
    public void setLocation(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    //updating the values of x and y from another object
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    //moving the points
    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    //Getter
    public void getCoordinates(){
        System.out.println("x = "+x );
        System.out.println("y = "+y);
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {return "Move" + super.toString();}

    public static void main(String[] args) {

        //testing default constructor
        Point p1 = new Point();
        System.out.println("Default constructor with no value passed");
        p1.getLocation();
        System.out.println();

        //Testing constructor with parameters
        Point p2 = new Point(5,2);
        System.out.println("Default constructor with value passed");
        p2.getCoordinates();

        //Using copy constructor
        System.out.println();
        Point p3 = new Point(p2);
        System.out.println("Using copy constructor");
        p3.getCoordinates();

        //using setLocation to set the new location.
        System.out.println("Using setLocation:");
        p1.setLocation(4,1);
        p1.getCoordinates();

        System.out.println("Moving");
        p1.move(2,3);
        p1.getCoordinates();
    }
}

