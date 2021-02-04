println("Hello there Scala fans!")
//worksheet is mostly for experimenting
//think of it like a sandbox

//so data have data types
//scala
val a = 5+6
println(a)
print("Hello")
print("hmmm")
println(math.pow(2, 8)) //this explains why 32 bit systems are not sufficient
val b = 10
println(a+b)
var myVar = 50
myVar = myVar + 30
println(myVar)
val result = a + b //so we name our variables starting with lowercase letters
val bigResult = myVar + math.pow(2, 16)//if our variable has 2 or more names we use camelCaseReallyLong
//double is really a double sized floating point number
println(result.getClass, bigResult.getClass)
val myName = "Ieva"
println(myName, myName.getClass)