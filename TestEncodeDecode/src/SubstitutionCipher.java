public class SubstitutionCipher implements MessageEncoder,MessageDecoder
{
// Value to shift the characters
private int shift;
// one-argument constructor
public SubstitutionCipher (int shiftBy)
{
shift = shiftBy;
}
public String encode (String plainText)
{
String encodedMsg = "";
for (int i = 0; i < plainText.length(); i++) {
char ch = plainText.charAt (i);
encodedMsg += shift(ch, shift);
}
return encodedMsg;
}
private char shift(char ch, int shiftValue)
{
char shiftedChar = ch;
//if the char is in lower case
if (ch >= 'a' && ch <= 'z')
shiftedChar = (char) ('a' + (ch - 'a' + shiftValue) % 26);
// upper case char
else if (ch >= 'A' && ch <= 'Z')
shiftedChar = (char) ('A' + (ch - 'A' + shiftValue) % 26);
//returns the shifted character
return shiftedChar;
}
public String decode(String cipherText)
{
String decodeMsg = "";
for (int i= 0; i <cipherText.length(); i++)
{
char ch = cipherText.charAt (i);
/*negative shift for revoke character te its
original character */
decodeMsg += shift(ch, -shift);
}
//returns the decoded message
return decodeMsg;
}
} // end of class SubstitutionCipher
