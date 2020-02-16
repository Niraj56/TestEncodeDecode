//ShuffleCipher. java

public class ShuffleCipher implements MessageEncoder,MessageDecoder
{
// Number of iterations to shuffle
private int n;
// one argument constructor takes the shuffle value
public ShuffleCipher (int n)
{
this.n = n;
}
public String encode (String plainText)
{
String encodedText = plainText;
for (int i = 0; i < n; i++)
encodedText = shuffle (encodedText) ;
return encodedText;
}
private String shuffle(String text)
{
int mid;
if (text .length() % 2 == 0)
mid = text.length() / 2;
else
mid = (text.length() + 1) / 2;
// first half of given string
String first = text.substring(0, mid);
// second half
String second = text.substring (mid);
String shuffled = "";
/* for loop to create a message of shuffled
string for one time */
for(int i = 0, j = 0; i < first.length(); i++, j++)
{
shuffled += first.charAt (i);
if (j < second.length())
shuffled += second.charAt (i);
}
return shuffled;
}

public String decode(String cipherText)
{
String decodedText = cipherText;
String tempString="";
//for shuffling n times to get the original plain text
for(int shuffle=0; shuffle<n;shuffle++)
{
/*for loop to get the even number of
characters from encoded message */
	for (int i = 0; i < decodedText.length(); i++)

	{
	if (i%2==0)
	tempString+=decodedText.charAt (i);

	}

	/*for loop to get the odd number of characters

	from encoded message */

	for (int i = 0; i < decodedText.length(); i++)
	{
	if (i%2==1)
	tempString+=decodedText.charAt (i);
	}
	/*reset the tempstring as decoded
	messsage as it is the string
	on which next shuffle continues for n
	times */
	decodedText=tempString;
	//set the tempstring to empty
	tempString="";

	}

	//returns decoded string message

	return decodedText;

	}//end of the decode method
	} // end of ShuffleCipher
	
