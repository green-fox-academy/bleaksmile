# Nth Element Exercise


## Algorithm

Write a method that takes two parameters:
- an array of positive integer numbers, called `numbers`
- a positive integer number, called `n`

The method should calculate the average of every `n`th element of the array and return it.

__Example:__
For number array [2, 4, 10, 34, 3, 16, 3, 21]

- if n =  3, result = 13 _(for elements 10, 16)_
- if n = 2, result = 18.75 _(for elements 4, 34, 16, 21)_
- if n = 10, result = 0 _(no valid element)_

## Testing

Write two tests for your method:
- case 1: n is less than the size of the number array size
- case 2: n is greater than the size of the number array size