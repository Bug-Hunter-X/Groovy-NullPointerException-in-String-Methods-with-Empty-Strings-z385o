```groovy
def myMethod(String arg) {
  if (arg == null || arg.isEmpty()) {
    return ""
  } else {
    return arg.toUpperCase()
  }
}

println myMethod(null)
println myMethod("")
println myMethod("hello")
```