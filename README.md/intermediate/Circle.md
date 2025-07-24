Question:

Design a Java class called Circle to represent a geometric circle. 
Your class should support the following features:

1) Two constructors:
One default constructor (no parameters) that sets the radius to null.
One constructor that accepts a radius as a parameter.

2) Use the Double wrapper class for the radius to allow null values
   (instead of double).

3) Include a method calculateArea() that:
Returns the area of the circle using the formula π * radius².
If the radius is null, print "Radius not set" and return 0.0.

4) Include a method displayInfo() that:
Displays the radius (or "Not provided" if null).
Displays the area using calculateArea().

5) In the main() method:
Create two Circle objects: one using the no-argument constructor,
and one with a radius of 5.0.
Call displayInfo() on both.
