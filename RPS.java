import java.util.Scanner;

class RPS {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int win = 0;int loss = 0;int draw = 0;
        String yes = "y";
        String you = " ";
        String me = " ";
        String outcome = " ";
        
        System.out.println("Rock, Paper, Scissors");
        System.out.println("-------------------------");
       
        while(yes.equals("y")){
        System.out.println("Choose your choice");
        System.out.println("[1]:Rock, [2]:Paper, [3]:Scissor");
        
        int a = sc.nextInt();
              
        int b = (int)(Math.random()*3+1);
               
        if(a == b) {
            System.out.println("we tie");
            draw++;
        }
        if(a == 1 && b == 2){
            System.out.println("You choose Rock, i choose Paper, I win");
            loss++;
        }
        if(a == 1 && b == 3){
            System.out.println("You choose Rock, i choose Scissor, You win");
            win++;
        }
        if(a == 2 && b == 1){
            System.out.println("You choose Paper, i choose Rock, You win");
            win++;
        }
        if(a == 2 && b == 3){
            System.out.println("You choose Paper, i choose Scissor, I win");
            loss++;
        }
        if(a == 3 && b == 1){
            System.out.println("You choose Scissor, i choose Rock, I win");
            loss++;
        }
        if(a == 3 && b == 2){
            System.out.println("You choose Scissor, i choose Paper, You win");
            win++;
        }
                  
        
        System.out.println("Again [y]/[n]");
        yes = sc.next();
        
    }
        
    System.out.println("End of Game: Wins: " +win+ " Loss: "+loss+" Draw: " +draw);
    }
}
