package cn.godfery.text;

public class NineNineTable {

    public static void main(String[] args) {
        for(Integer multiplierA=1; multiplierA<=9; multiplierA++) {
            for(Integer multiplierB=1; multiplierB<=multiplierA; multiplierB++) {
                System.out.printf(("%d*%d=%-3d"),multiplierB, multiplierA, multiplierA*multiplierB);
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(Integer multiplierA=9; multiplierA>=1; multiplierA--) {
            for(Integer multiplierB=1; multiplierB<=multiplierA; multiplierB++) {
                System.out.printf(("%d*%d=%-3d"),multiplierB, multiplierA, multiplierA*multiplierB);
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(Integer multiplierA=9; multiplierA>=1; multiplierA--) {
            for(Integer multiplierB=9; multiplierB>=1; multiplierB--) {
                if(multiplierB<=multiplierA) {
                    System.out.printf(("%d*%d=%-3d"),multiplierB, multiplierA, multiplierA*multiplierB);  
                }else {
                    System.out.printf("%7s"," ");
                }
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(Integer multiplierA=1; multiplierA<=9; multiplierA++) {
            for(Integer multiplierB=9; multiplierB>=1; multiplierB--) {
                if(multiplierB<=multiplierA) {
                    System.out.printf(("%d*%d=%-3d"),multiplierB, multiplierA, multiplierA*multiplierB);  
                }else {
                    System.out.printf("%7s"," ");
                }
            }
            System.out.println();
        }
    }

}
