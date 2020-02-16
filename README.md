# TestEncodeDecode
(a) This program is created in java with an interface interface MessageEncoder that has a single abstract: method named
Encode(plainText), where plainText is the message to be encoded. ‘The
the method will return the encoded message'. This program has different classes:

(b) class SubstitutionCypher that implements the interface
MessageEncoder, as described at (a). The constructor should have one parameter
called shift. Define the method Encode() so that each letter is shifted by a
number of places in the alphabet as indicated by the value in the shift. For example, if
the shift is 3, a will be replaced by d, b will be replaced by e, c will be replaced by f.
and so on.

(c) Finally, a class ShuffleCypher that implements the interface
MessageEncoder as described at (b). ‘The constructor should have one parameter
called n. Define Encode() so that the message is shuffled n times. To perform one
shuffle, split the message in half, and then take characters from cach half alternately,
For example, if the message is abcdefghi, the halves are abcde and fghi. The
shuffled message is afbgchdie.
