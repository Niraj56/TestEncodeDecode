//TestEncedeDecode. java
public class TestEncodeDecode
{
private static java.util.Scanner scan;

//starting point of the program execution
public static void main(String[] args)
{
scan = new java.util.Scanner (System. in);
// Reads plain text
System. out.println("---Substitution Cipher---");
System.out.print("Enter plain text to encode: ");
String plainText = scan.nextLine();
// Reads shift value from user
System.out.print ("Enter shift value: ");
int shift = Integer.parseInt(scan.nextLine());
// displays encoded message to the console
System.out.print("\nPlain Text: " + plainText);
// Create SubstitutionCipher object
SubstitutionCipher subCipher = new SubstitutionCipher (shift) ;
String encodedText = subCipher.encode (plainText) ;
String decodedText = subCipher. decode (encodedText) ;
// displays encoded message to the console
System.out.print("\nEncoded text: " + encodedText) ;
System.out.print ("\nDecodedMessage text: " + decodedText) ;
                  System.out.println();
// Reads plain text
System. out.println("---Shuffle Cipher---");
System.out.print ("Enter plain text to encode: ");
plainText = scan.nextLine();
//Reads shift value
System.out.print ("Enter shuffle value : ");
shift = Integer. parseInt(scan.nextLine());
System. out.println(plainText) ;
//create an object for ShuffleCipher
ShuffleCipher shuffleCipher= new ShuffleCipher (shift) ;
//Calls encode method to get encoded text
encodedText = shuffleCipher.encode (plainText) ;
decodedText = shuffleCipher.decode (encodedText) ;
//displays encoded message to the conscle
System. out.print("\nEncoded text: " + encodedText) ;
System. out.print("\nDecoded text: " + decodedText) ;
}//end of main method
}//end of the class
//MessageDecoder. java

