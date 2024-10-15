package mostusedinterview;

public class StringForInterview {
    public static void main(String[] args) {
        String bookName = "Java devloper";

        //String.valueof > primitive to String
        String alterNativeBook = new String(String.valueOf(5));
        String alterNativeBook1 = new String(String.valueOf('A'));

        //long of text
        int sizeOfMessage = bookName.length(); // Tc : 0(1)
        System.out.println(sizeOfMessage);//13

        //Convert to char array
        char[] bookNameChars = bookName.toCharArray(); // Tc : 0(n)
        System.out.println(bookNameChars);

        //lowercase,Uppercasse
        String exLowerCase = "Le Serafilm";
        String exUpperCase = "Le Serafilm2";
        System.out.println(exLowerCase.toLowerCase());// Tc : 0(1)
        System.out.println(exUpperCase.toUpperCase());// Tc : 0(1)

        //Access on specified index of string
        char resultAccessChar = bookName.charAt(0); ; // Tc : 0(n)
        System.out.println(resultAccessChar);

        //Substring
        System.out.println(bookName.substring(3)); // Tc : 0(n)
        System.out.println(bookName.substring(6,8)); // Tc : 0(n)

        //Replace
        String newName = bookName.replace("Java","nodejs");
        System.out.println(newName);

        /*String exampleData = "efsdfe51w4e51fs5d4385e1sdf5";
        char[] newEXdata = exampleData.toCharArray();
        for (var c : newEXdata){
            System.out.println(c);
            System.out.println(Character.isLetter(c));
            System.out.println(Character.isDigit(c));
            System.out.println(Character.isUpperCase(c));
            System.out.println(Character.isLetterOrDigit(c));
        }*/

        //String - Immutable
        //IF you want make mutable,use StrungBilder and create String
        StringBuilder sb = new StringBuilder();
        sb.append("789456asb");
        sb.append(" ");
        sb.append("987654321qwe");
        System.out.println(sb.toString());


    }
}
