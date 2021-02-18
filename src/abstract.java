// abstract class vehicle
abstract class vehicle
{
    // method getNoOfwheels has to be abstract too
    public abstract int getNoOfwheels();
}

// child method contains a body Bus
class Bus extends vehicle{
    public int getNoOfwheels(){
        return 6;
    }
}

// child method contains a body Auto
class Auto extends vehicle{
    public int getNoOfwheels(){
        return 3;
    }
}

// class Test to create two new objects bus and auto to print getNoOfwheels
class Test {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println(b.getNoOfwheels());
        Auto a = new Auto();
        System.out.println(a.getNoOfwheels());
    }
}



