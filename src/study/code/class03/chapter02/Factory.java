package study.code.class03.chapter02;

public class Factory {
    public static void main(String[] args) {
        BMW c1 = new BMW();
        BMW c2 = new BMW("i530");
        BMW c3 = new BMW("Z4","turbo");
        BMW c4 = new BMW("Z4","turbo2","red");

        System.out.println("================== c1 ==================");
        System.out.println(BMW.amblam);
        System.out.println(c1.name);
        System.out.println(c1.engine);
        System.out.println(c1.color);
        System.out.println(c1.tire);
        System.out.println(c1.door);
        
        System.out.println("================== c2 ==================");
        System.out.println(c2.name);
        System.out.println(c2.engine);
        System.out.println(c2.color);
        
        System.out.println("================== c3 ==================");
        System.out.println(c3.name);
        System.out.println(c3.engine);
        System.out.println(c3.color);
        
        System.out.println("================== c4 ==================");
        System.out.println(c4.name);
        System.out.println(c4.engine);
        System.out.println(c4.color);
    }
}

class Car{
    int tire = 4;
    int door = 4;
}

class BMW extends Car{
    static String amblam = "BMW";
    String name;
    String engine;
    String color="똥색";

    int tire = 2;
    int door = 2;

    public BMW(){
        name="싼거";
        engine="구린거";
        color="똥색";
    }

    public BMW(String name){
        this.name = name;
        engine="괜찮은거";
        color="똥색";
    }
    public BMW(String name, String engine){
        this.name = name;
        this.engine = engine;
    }
    public BMW(String name, String engine, String color){
        this.name=name;
        this.engine= engine;
        this.color=color;
    }

}
