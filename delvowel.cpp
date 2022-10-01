#include <iostream>

#include <string>

using namespace std;

int main()

{

    string word;

    cout << "Enter a word: ";

    getline(cin, word);

    for (int i = 0; i < word.length(); i++)

    {

        if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' ||

            word[i] == 'o' || word[i] == 'u')

        {

            word.erase(i, 1);

            i--;

        }

    }

    cout << "After removing all vowels, the word is: " << word;

    return 0;

} 
