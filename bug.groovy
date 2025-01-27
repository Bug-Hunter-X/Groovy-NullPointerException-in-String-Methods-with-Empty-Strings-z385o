```groovy
def myMethod(String arg) {
  if (arg == null) {
    return "null"
  } else {
    return arg.toUpperCase()
  }
}

println myMethod(null)
println myMethod("")
println myMethod("hello")
```