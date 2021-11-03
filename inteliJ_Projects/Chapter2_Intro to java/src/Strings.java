public class Strings {

    public static void printString(String str){
        System.out.println(str);
    }
    public static void main(String[] args){
        //string declarations
        String message1 = "Invalid Data Entry.";
        String message2 = "";
        String message3 = null;

        //joining strings
        String firstName = "John";
        String lastName = "Doe";
        String name = firstName + " " + lastName;

        printString(name);

        //join string name and number
        double price = 14.95;
        String priceString = "Price: " + price;
        printString(priceString);

        //append one string with another using + operator
        firstName = "Bob";
        lastName = "Smith";
        name = firstName + " ";
        printString(name);
        name = name + lastName;
        printString(name);

        //append one string with another using += operator
        name = firstName + " ";
        printString(name);
        name += lastName;//this is it
        printString(name);


    }
}
