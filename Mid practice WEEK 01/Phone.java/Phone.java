publci class Phone{
    public String brand;
    public String model;
    public double price;

    //null constructor 
    public Phone(){
        this.brand;
        this.model;
        this.price;

    }
    // parameterized constructor
    public Phone ( String brand ; String model ; double price){
        this.brand=brand;//p1
        this.model=model; //p2
        this.price=price;
    }
    // copy constructor
    public Phone(Phone p){
        this.brand=p.brand;
        this.model=p.model;
        this.price=p.price;
    }


}