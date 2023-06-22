**TIME CALCULATOR** <br />

Write a program that asks the user to enter a number of seconds.
* There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60, the program should display the number of minutes in that many seconds.
* There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600, the program should display the number of hours in that many seconds.
* There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400, the program should display the number of days in that many seconds. <br />

The output should look like this (it is a good idea to echo back the input):

*You entered 500,000 seconds, which is 5 days, 18 hours, 53 minutes, and 20 seconds. (5 days 18:53:20 hours)*

If the result is 0 days, then don't display the days,
if the hours are 0, and the days are 0, then don't display the hours,
if the minutes are 0, the hours are 0, and the days are 0, then only display the seconds.
Also, if the result is 3 hours, 2 minutes, and 5 seconds, for example, don't display 3:2:5, instead display 3:02:05 (for the input 10,925 seconds).

Make sure you use constants in your program to represent the seconds in one minute, hour, and day.