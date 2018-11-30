'use strict';

//1. Write the selectWordsByFrequency method to find the needed words
//2. Write the saveSelectedWords method to save the selected words

let selectedWords: string[] = selectWordsByFrequency('input.txt', 2);
saveSelectedWords('output.txt', selectedWords);
