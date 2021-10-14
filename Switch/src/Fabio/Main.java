package Fabio;

public class Main {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        }else if(value == 2) {
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("number is between 6 to 10");
        }


        char charValue = 'G';

        switch (charValue){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D':
                System.out.println("Value is D");
                break;
            case 'E': case 'F': case 'G':
                System.out.println("Value is E or F or G");
                break;
            default:
                System.out.println("A,B,C,D and E was not found");
        }
    }
}