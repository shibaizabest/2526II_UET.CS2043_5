public class Main{
   public static void main(String[] args) {
        // Create something to hack
//       Transaction tran1 = new Transaction("1", "100" , "10h");
       Transaction[] his = {new Transaction("1", "100" , "10h"), new Transaction("1", "200" , "11h"),new Transaction("1", "300" , "12h")};
//       System.out.println(his[0]);
       Account myAccount = new Account("Thinhthinh", 100.0, his);

       Transaction[] hacker = myAccount.getHistory();
       hacker[0] = new Transaction("1", "300", "99h");

       System.out.println(myAccount);
    }
}