package study.code.class03.chapter03;

public class Overloading {
    public static void main(String[] args) {
        Over over = new Over();
        over.print();
        over.print("string param1");
        over.print("string param2",5);
        over.print("string param3",5,false);
        over.print("string param4",5,true);
    }
}

class Over{
    public void print(){
        System.out.println("overloading");
    }
    public void print(String content){
        System.out.println(content);
    }

    public void print(String content, int round){
        for(int i = 0; i<round;i++){
            System.out.println(content);
        }
    }

    public void print(String content, int round, boolean boo){
        if(boo){
            for(int i = 0; i<round;i++){
                System.out.println(content);
            }
        }
    }
}