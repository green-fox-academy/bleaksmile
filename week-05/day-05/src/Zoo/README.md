# Zoo Exercise

## Description

In this exercise you have to model a Zoo with animals and workers and create some interactions between them. 

Create the neccesary classes and methods based on the information below.


### `Animal`s

__Properties:__
- a `name`, 
- an `age`,
- a `gender`, 
- `fedTimes` meaning the number of times the animal got food

We should be able to create animals two ways:
- providing `name`, `age`, `gender` 
- or only providing `name`, when `age` and `gender` will get default values `0` and `unknown` respectively

__Methods:__
- `eat()` - which only increases `fedTimes`
- `isHungry()` - which returns whether the animal is currently hungry. It should be an abstract method and implementation should depend on the type of the animal
- `toString()` - which returns information about him/her in the format: "`name` is a `age` years old `gender` animal and was fed `fedTimes` times"

We have three different kind of animals:
- `Lion`s, who are __always__ hungry
- `Monkey`s , who are __randomly__ hungry
- `Elephant`s, who are hungry in __every second occasion__ when a `Worker` checks on them

### `Worker`s

__Properties:__
- a `name`, 
- an `animalsToLookAfter` list of containing the animals that they are looking after (we should be able to change this field later on)

We should be able to create workers two ways:
- providing `name`, `animalsToLookAfter`
- or only providing `name`, when the `animalsToLookAfter` list should be an empty list

__Method:__
- `doDailyRoutine()` - which should iterate through the worker's `animalsToLookAfter` list and feed them if it is neccesary. First, he/she should call the specific animal's `isHungry()` method and if it returns true, then call the animal's `eat()` method.
