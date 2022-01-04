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


create database regional_data;
use regional_data;
create table data(arr1 float, arr2 float, arr3 float, arr4 float, region varchar(20), country varchar(20));
insert into data values(1.0,2.0,3.0,4.0,'asia','india');
insert into data values(5.0,6.0,7.0,8.0,'europe','france');
insert into data values(9.0,10.0,11.0,12.0,'asia','india');
insert into data values(13.0,14.0,15.0,16.0,'europe','germany');
select * from data;
select sum(arr1+arr2+arr3+arr4),region, country from data group by region,country;
select round(arr1*arr2+arr3/arr4,4) as res from data;
select round(arr1*arr2+arr3/arr4,4) as result from data group by region, country;
