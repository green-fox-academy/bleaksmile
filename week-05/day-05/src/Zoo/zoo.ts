'use strict';
import Animal from './Animal';
import Worker from './Worker';
// add here any additional import


/*********************************************************
 *  Do not modify the code below except for test purposes *
 *********************************************************/
let animals: Animal[] = [
  new Elephant('Dumbo', 15, 'male'),
  new Elephant('Leopold'),
  new Lion('Simba', 3, 'male'),
  new Lion('Elsa', 8, 'female'),
  new Monkey('Uk'),
  new Monkey('Muk'),
  new Monkey('Ukmuk'),
];

let kate: Worker = new Worker('Kate');
let mandy: Worker = new Worker('Mandy');

let workers: Worker[] = [kate, mandy];

kate.setAnimalsToLookAfter(animals.slice(0, 3));
kate.setAnimalsToLookAfter(animals.slice(3, animals.length));

for (let i: number = 0; i < 10; i++) {
  workers.forEach((worker: Worker) => worker.doDailyRoutine());
}

animals.forEach((animal: Animal) => console.log(animal.toString()));
