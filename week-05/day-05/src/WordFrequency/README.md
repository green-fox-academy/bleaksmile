# Word Frequency Exercise

## File read

Write a method that can parse an input text file and is able to select all of the words that appear in a certain amount of times in the source file. 
This method should take 2 parameters: 
- input file name
- frequency (which is a positive integer greater than 0)

Your solution should be able to handle the case if the input file name does not exists.

__Example:__
For input file `input.txt` and frequency: 2, 
the method should select the words: apple, pear, pirate

## File write

Write an other method that can create a new file and write the selected words into it.
This method should take 2 parameters:
- output file name
- array of words

Your solution should be able to create the new file or if it already exists it should rewrite its content.

__Example:__
For output file `output.txt` and words: [apple, pear, pirate]
after the method runs, a new `output.txt` file should be created containing the words. 
_It does not matter how the method writes the words, they can be separated by new line, space or a comma...etc_