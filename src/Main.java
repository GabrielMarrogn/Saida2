public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
            if(i == 1 || i == 7){
                for(int k = 0;k < 39; k++){
                    System.out.print("-");
                }
            }else if(i == 3 || i ==5 ){
                for(int k = 1;k <= 39; k++){
                    if(k == 1 || k == 39){
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }
                }
            }else if(i == 2){
                for(int k = 1;k <= 33; k++){
                    if(k == 1 || k == 33){
                        System.out.print("|");
                    }else if(k == 10){
                        System.out.print("Roberto");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }else if(i == 4){
                for(int k = 1;k <= 36; k++){
                    if(k == 1 || k == 36){
                        System.out.print("|");
                    }else if(k == 10){
                        System.out.print("5786");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }else if(i == 6){
                for(int k = 1;k <= 34; k++){
                    if(k == 1 || k == 34){
                        System.out.print("|");
                    }else if(k == 10){
                        System.out.print("UNIFEI");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
