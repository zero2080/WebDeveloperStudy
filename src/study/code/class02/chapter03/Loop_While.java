package study.code.class02.chapter03;

public class Loop_While {
    public static void main(String[] args) {
        int i = 1;

        //2단만 출력
        while(i<10){
            //if문과 형태가 같으나 괄호안의 내용이 참(true)일 경우 반복된다.
            System.out.println("2 X "+ i + " = " +i*2 );
            i++;
        }

        i=1;

        //2~ 9단 까지 출력
        while(i<10){
            int j = 2;
            while(j<10){
                System.out.println(j + " X "+ i + " = " +i*j);
                j++;
            }
            i++;
        }

        System.out.println("======================응용======================");

        //2~ 9단 까지 출력(응용)
        i=1;
        while(i<10){
            int j = 2;
            System.out.print("| ");

            while(j<10){
                System.out.print(" " + j + " X "+ i + " = " +i*j + "\t| ");
                j++;
            }
            System.out.println("\t");
            i++;
        }

        //2~ 9단 까지 출력(응용)
        i=0;
        while(i<10){
            int j = 1;
            System.out.print("| ");
            
            while(j<9){
                j++;
                if(i==0){
                    System.out.print("\t" + j+" 단\t|");
                    continue;
                }
                System.out.print(" " + j + " X "+ i + " = " +i*j + "\t| ");
            }
            System.out.println("\t");
            i++;
        }
    }
}