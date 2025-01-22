public class Prog08_StringMethods {
    public static void main(String[] args) {
        String name = "Satej";
        System.out.println("Name : " + name);
        System.out.println("Length : " + name.length());
        System.out.println("To LowerCase : " + name.toLowerCase());
        System.out.println("To UpperCase : " + name.toUpperCase());

        String nonTrimmedString = "    My name is Satej    ";
        System.out.println("Non-Trimmed String : " + nonTrimmedString);
        System.out.println("Trimmed String : " + nonTrimmedString.trim());

        System.out.println("Substring : " + name.substring(2));
        System.out.println("Substring : " + name.substring(2,4));   // beginIndex is included; endIndex is excluded
        System.out.println("Substring : " + name.substring(2,5));

        System.out.println("Replace : " + name.replace('e','a'));
        System.out.println("Replace : " + name.replace("tej", "abc"));

        System.out.println("StartsWith : " + name.startsWith("Sa"));
        System.out.println("StartsWith : " + name.startsWith("sa"));

        System.out.println("EndsWith : " + name.endsWith("ej"));
        System.out.println("EndsWith : " + name.endsWith("Sa"));

        System.out.println("Char At : " + name.charAt(1));

        System.out.println("Index Of : " + name.indexOf("e"));  // Returns the first occurrence of input string
        System.out.println("Index Of : " + name.indexOf("g"));
        System.out.println("Index Of : " + "Harryrry".indexOf("rry"));
        System.out.println("Index Of : " + "Harryrry".indexOf("rry",3));

        System.out.println("Last Index Of : " + name.lastIndexOf("e"));
        System.out.println("Last Index Of : " + "Harryrry".lastIndexOf("r"));
        System.out.println("Last Index Of : " + "Harryrry".lastIndexOf("rry",4));

        System.out.println("Equals : " + name.equals("Satej"));
        System.out.println("Equals : " + name.equals("satej"));
        System.out.println("EqualsIgnoreCase : " + name.equalsIgnoreCase("satej"));

    }
}
