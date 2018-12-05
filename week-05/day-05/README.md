# Rueppellii Foundation Normal

## Getting Started

- Fork this repository under your own account
- Clone the forked repository to your computer
- Create a `.gitignore` file so generated files won't be committed
- Commit your progress frequently and with descriptive commit messages
- All your answers and solutions should go in this repository

## Keep in mind

- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead
- **Don't push your work** to GitHub until your mentor announces that the time is up

## Exercises

### Exercise 1
- Write a method which takes two matrices as parameters and returns a new matrix.
- The method should compare each element in the input matrices and fill the
returned matrix with the greater values.
- You only have to deal with square matrices. A square matrix is a matrix with the
same number of rows and columns.
- Write 2 different test cases for the method.

#### Example 1
Input 1
```
[
  [2, 1],
  [0, 1]
]
```

Input 2
```
[
  [0, 3],
  [-1, 1]
]
```

Output
```
[
  [2, 3],
  [0, 1]
]
```

#### Example 2
Input 1
```
[
  [-1, 1, 0],
  [0, 1, 0],
  [0, 1, 0]
]
```

Input 2
```
[
  [0, 0, 0],
  [0, 1, 0],
  [0, 0, 0]
]
```

Output
```
[
  [0, 1, 0],
  [0, 1, 0],
  [0, 1, 0]
]
```

### Exercise 2
Write a method which can read and parse a file containing information about
weather in various cities. The method must return the name of the city which
had the most rainy days.

#### Example
[Example file can be found here.](cities.csv)

Output
```
Gyor
```

### Exercise 3
Write a program which can store books in a bookshelf.

There are two types of books.
- Hardcover book
  - It should have the following fields: title, author, release year, page
    number and weight.
  - The weight must be calculated from the number of pages (every page weighs
    10 grams) plus the weight of the cover which is 100 grams.
  - It must have a method that returns a string which contains the following
    information about the book: author, title and year.
- Paperback book
  - It should have the following fields: title, author, release year, page
    number and weight.
  - The weight must be calculated from the number of pages (every page weighs
    10 grams) plus the weight of the cover which is 20 grams.
  - It must have a method that returns a string which contains the following
    information about the book: author, title and year.

You must be able to add books to the bookshelf and must have methods to answer
the following problems.
- Who is the author of the lightest book?
- Which author wrote the most pages?

## Questions

### What does the `private` keyword mean?
 *Private keyword is an access modifier which can applied for methods and variables as well. When a method or variable is private 
 it means, that only the class that contains it has access to it, so the private methods & variables are not accessible outside of the class they are declared. 
 In case of private variable we can create getter and setter, thus we are able to get or modify its value from outside.
 type your answer here (please explain with your own words)*

### What does the `static` keyword mean? How can you access a `static` method?
 * Static keyword can be used for methods and variables as well. It belongs to the class, so you can access the static method via the Class itself so that you don't need to instantiate the Class (no need to create object to access the static method)
 The most common static method is the main() method. This keyword is mainly used for memory management.
 type your answer here (please explain with your own words)*
