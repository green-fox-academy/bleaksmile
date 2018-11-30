using System;

namespace FulvipesFoundationExamRetake
{
    public class WordFrequency
    {
        public static void Main(string[] args)
        {
            //1. Write the selectWordsByFrequency method to find the needed words
            List<string> selectedWords = SelectWordsByFrequency("input.txt", 2);
            
            //2. Write the saveSelectedWords method to save the selected words
            SaveSelectedWords("output.txt", selectedWords);
        }

    }
}