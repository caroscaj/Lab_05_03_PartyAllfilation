public class Main {
    public static void main(String[] args) {
        {
            String menuChoice = "";
            String menu = "D - Democrat R - Republican I - Independent O - Other";
            menuChoice = "O";

            if (menuChoice.equalsIgnoreCase("D"))
            {
                System.out.println("You get a Democratic Donkey");
            }
            else if (menuChoice.equalsIgnoreCase("R"))
            {
                System.out.println("You get a Republican Elephant");
            }
            if (menuChoice.equalsIgnoreCase("I"))
            {
                System.out.println("You get a Person");
            }
            else if (menuChoice.equalsIgnoreCase("O"))
            {
                System.out.println("Other");
            }

        }
    }
}