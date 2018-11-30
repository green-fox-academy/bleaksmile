'use strict';

const sampleArray: number[] = [2, 4, 10, 34, 3, 16, 3, 21];
const number: number = 2;

/**
 * Write your getAverageForNthElements method here.
 */

let result: number = getAverageForNthElements(sampleArray, number);
console.log(`The average for every ${number} element is ${result}`);

/********************************
 * Do not modify the code below *
 ********************************/
export default getAverageForNthElements;