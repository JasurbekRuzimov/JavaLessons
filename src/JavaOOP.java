public class JavaOOP {
    public static void main(String[] args) {
       Run Player1= new Run();
       Player1.Name="Leo Messi ";
       Player1.Position="Attacking Midfielder";
       Player1.Nationality="Argentina";
        System.out.println(Player1.Name);
        System.out.println(Player1.Position);
        System.out.println(Player1.Nationality);
         Player1.run();

        System.out.println("=========");

        Run Player2= new Run();
       Player2.Name="Cristiano Ronaldo";
       Player2.Position="Attacker";
       Player2.Nationality="Portugal";
        System.out.println(Player2.Name);
        System.out.println(Player2.Position);
        System.out.println(Player2.Nationality);
        Player2.run();
    }
}
