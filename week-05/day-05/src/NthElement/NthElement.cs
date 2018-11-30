using System;

namespace FulvipesFoundationExamRetake
{
    public class NthElement
    {
        public static void Main(string[] args)
        {
            int[] numbers = new int[] {2, 4, 10, 34, 3, 16, 3, 21};
            int n = 2;

            double result = GetAverageForNthElements(numbers, n);
            Console.WriteLine("The average for every {0} element is {1}", n, result);
        }

    }
}