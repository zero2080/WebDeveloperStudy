package study.code.class02.chapter04;

public class Arr02 {
    public static void main(String[] args) {
        //2차원 배열
        int[][] numArr = new int[3][3];
        int[][] numArr2 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        //3차원 배열
        int[][][] numArr3 = {{{1,2},{3,4}},{{5,6},{7,8}}};

        //4차원 배열
        int[][][][] numArr4 = {{{{0,1},{2,3}},{{4,5},{6,7}}},{{{8,9},{10,11}},{{12,13},{14,15}}}};

        //5차원 배열
        int[][][][][] numArr5 = {{{{{1,2},{3,4}},{{5,6},{7,8}}},{{{9,10},{11,12}},{{13,14},{15,16}}}},{{{{17,18},{19,20}},{{21,22},{23,24}}},{{{25,26},{27,28}},{{29,30},{31,32}}}}};

        System.out.println("==================== numArr ====================");
        for(int i = 0; i<numArr.length;i++){
            for(int j = 0; j<numArr[i].length;j++){
                System.out.println(String.format("numArr[%d][%d] = %d",i,j,numArr[i][j]));
            }
        }
        
        System.out.println("==================== numArr2 ====================");
        for(int i = 0; i<numArr2.length;i++){
            for(int j = 0; j<numArr2[i].length;j++){
                System.out.println(String.format("numArr2[%d][%d] = %d",i,j,numArr2[i][j]));
            }
        }

        System.out.println("==================== numArr3 ====================");
        for(int i = 0; i<numArr3.length;i++){
            for(int j = 0; j<numArr3[i].length;j++){
                for(int k = 0; k<numArr3[i][j].length;k++){
                    System.out.println(String.format("numArr3[%d][%d][%d] = %d",i,j,k,numArr3[i][j][k]));
                }
            }
        }

        System.out.println("==================== numArr4 ====================");
        for(int i = 0; i<numArr4.length;i++){
            for(int j = 0; j<numArr4[i].length;j++){
                for(int k = 0; k<numArr4[i][j].length;k++){
                    for(int p = 0; p<numArr4[i][j][k].length;p++){
                        System.out.println(String.format("numArr4[%d][%d][%d][%d] = %d",i,j,k,p,numArr4[i][j][k][p]));
                    }
                }
            }
        }

        System.out.println("==================== numArr5 ====================");
        for(int i = 0; i<numArr5.length;i++){
            for(int j = 0; j<numArr5[i].length;j++){
                for(int k = 0; k<numArr5[i][j].length;k++){
                    for(int p = 0; p<numArr5[i][j][k].length;p++){
                        for(int q = 0; q<numArr5[i][j][k][p].length;q++){
                            System.out.println(String.format("numArr5[%d][%d][%d][%d][%d] = %d",i,j,k,p,q,numArr5[i][j][k][p][q]));
                        }
                    }
                }
            }
        }
    }
}
