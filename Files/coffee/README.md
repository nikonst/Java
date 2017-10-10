Telephone keyboard input recognition
(IEEExtreme Programming Contest) 

On a standard telephone, the numbers 1-9 can be used to correspond to a set of letters:

1: space            2: ABC     3: DEF       4: GHI               5: JKL       6: MNO
7: PQRS           8: TUV      9: WXYZ

Using the keypad, you can 'spell' words by entering the digits that correspond to each letter of the word. For example, 'words' is spelled 96737.
For this problem, we are given a dictionary file called with no more than 100,000 words, one per line, sorted in alphabetical order. Each word is comprised of no more than 18 characters, all lowercase letters from the phone keypad. Here is a (very short!) example of a dictionary file we will use in the examples:
Your program should read a string of digits (from 2 to 9, not using 1 as space) from the console and find the words in the dictionary whose spellings contain that series of consecutive digits anywhere within the word.
• If there are no matches, print the string 'No matches'
• If there is one match, print the matching word.
• If there are n>1 matches, print the string 'n matches:' followed by the matching
words, one per line.
