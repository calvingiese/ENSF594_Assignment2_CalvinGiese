# ENSF594_Assignment2_CalvinGiese

A command line interface program that prompts the user for array specifications, a sorting algorithm to apply and an output file location for 
the sorted array to be printed to.

## Problem Satement

Write a program that interacts with the user from the command line and creates an array based on the users inputs. Have the user decide between
four sorting algorithms (bubble, insertion, merge and quick) and sort the array using this method. Print the resulting array to a text file and
have the program measure sorting execution time.

## CLI Specifications

The user should be prompted to enter the order that the array should be built in (elements are in ascending, descending or random order) and the 
size (number of elements) of the array. The user should also specify which sorting algorithm to use, which will sort the newly built array and have
the sorted array printed to a text file, the file location will also be determined by the user.

## Design Specifications

The program should be able to measure how long each sorting method takes to exectute and report the results. This information will be used to 
compare performance of each algorithm with different initial array conditions.
