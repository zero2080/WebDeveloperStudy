package study.code.class03.chapter02.person;

public class Human {
    String name;
    int age;
    int height;
    int weight;
    
    public Human(String name, int age, int weight, int height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }
    
    public String info(){
        return name+age+height+weight;
    }
    
    public static void main(String[] args) {
        // Human human = new Human();
        Human human = new Human("오범수",36,88,177);
        System.out.println(human.info());
    }
}


