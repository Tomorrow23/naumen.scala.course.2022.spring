import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Input command: ");
        Scanner s = new Scanner(System.in);
        var command = s.nextLine().split(" ");
        selectCommandScenario(command);

    }
    public static void selectCommandScenario(String[] command) {
        switch(command[1]){
            case ("prepare"):
                prepare(command[1]);
                break;
            case ("encode"):
                encode();
                break;;
            case ("translate"):
                translate();
                break;;
            case ("decode"):
                decode();
                break;;
            default:
                System.out.print("Command not found");

        }
    }

    public static void decode(){
        var map = mutableMapOf<String, Byte>()

    }

}
