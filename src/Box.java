public class Box {
    private Double height;
    private Double width ;
    private Double length ;

    public Box(Double height, Double width, Double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double area()
    {
       return length*width;
    }
    public double volume()
    {
        return area()*height;
    }


    public void print() {
        System.out.println( "Box{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", Area= " + area() +
                ",Volume= " + volume() +
                '}');
    }
}

