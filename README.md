# IdeaProjects
with mysql connectivity
Write a Java (or C/C++) program which does following:

1. Takes an expression to be evaluated and 6 input arrays. Returns sum of evaluated expression 
    based on grouping.

    void evalExpr(string expr, double [] arr1, double [] arr2, double [] arr3, double [] arr4, string [] region, string [] country)

    - expr string is of the form : "a1*a2 + a3/a4" (any combination of variables a1, a2, a3, a4. Operators are +, -, *, /)
    - Arrays arr1, ..., arr4 each contain doubles
    - Array region contains names of continents
    - Array country contains names of countries
    - All arrays have same number of elements (10 million or more)

    expr needs to be applied to elements of arrays (arr1, arr2, arr3, arr4). Then result needs 
    to be grouped (summed up) based on region and country.

    Example: If the expression is "a1 + a2 + a3 + a4" and the 6 arrays are:

    arr1           arr2            arr3            arr4         region        country

    1.0            2.0              3.0             4.0          asia            india
    
    5.0            6.0              7.0             8.0          europe       france
    
    9.0           10.0            11.0            12.0         asia           india
    
    13.0         14.0             15.0           16.0        europe       germany
    
    17.0          18.0            19.0           20.0        europe       france

    Output of the program would be

    asia       india        52.0
    
    europe  france      100.0
    
    europe  germany   58.0

    - You can assume that each input array can be read from a separate file. Expression 
      will be passed as an argument to the program. You can print output on screen.

2. Suppose you were given an 8-core machine. How will you make your program
    faster by distributing work across 8 cores? (Hint: Use threads to divide work.)



Please send working programs for '1' and '2'. On an 8-core machine, how much faster 
is your multi-threaded program compared to single-threaded program? Run and compare 
runtimes for input sizes of 1 million, 5 million and 10 million. 

NOTE: You can create input files with random-values. OR repeat the provided example 
            many times to create inputs of required size (millions of rows).

Keep in mind good programming practices and readability of your programs.

-------------------------------------------------------------------------------------------------------------------

For solution of Question 1: go to  IdeaProjects/Demo Project/src/ and see Home.java

I am taking the input from a text file Inputs.txt (Locaiton: IdeaProjects/Demo Project/src/Inputs.txt)

please include the mysql-connector-java-8.0.27.jar file in your project before running it.(loaction: IdeaProjects/Demo Project/src/mysql-connector-java-8.0.27.jar)

and below are the MySql queries for setting up the database

--------------------------------------------MySQL Queries-----------------------------------------------------------------

create database regional_data;

use regional_data;

create table data(arr1 double, arr2 double, arr3 double, arr4 double, region varchar(20), country varchar(20),res double);

select * from data;

---------------------------------------------------------------------------------------------------------------------------
Java will benefit from multiple cores, if the OS distribute threads over the available processors. 
We can get the number of cores through Runtime.getRuntime().availableProcessors(), we will get 8 for 8 core machine.
But using a higher number of threads than the number of cores present in a machine can simply be a waste of resources.

A JVM runs in a single process and threads in a JVM share the heap belonging to that process.
Java will utilize the underlying OS threads to do the actual job of executing the code on different CPUs, if running on a multi-CPU machine. 
When each Java thread is started, it creates an associated OS thread and the OS is responsible for scheduling, etc.. 
The JVM certain does some management and tracking of the thread and Java language constructs like volatile, synchronized, notify(), wait(), etc. all affect the run status of the OS thread.

Threads get their performance improvements from a couple of reasons. Obviously straight concurrency often makes the program run faster. 
Being able to do multiple CPU tasks at the same time can (though not always) improve the throughput of the application. 
You are also able to isolate IO operations to a single thread meaning that other threads can be running while a thread is waiting on IO (read/write to disk/network, etc.).
But in terms of memory, threads get a lot of their performance improvements because of local per-CPU cached memory.
