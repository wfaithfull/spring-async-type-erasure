# spring-async-type-erasure
This is a demonstration of the problem I describe [here](https://stackoverflow.com/questions/32980668/spring-4-not-automatically-qualifying-generic-types-on-autowire).

There is a solution! When using @EnableAsync with generic bean qualification, you need to enable CGLib proxying.
This means that the type information is retained when the class is transformed into an Async proxy in the back end.

## Solution

`@EnableAsync(proxyTargetClass=true)`
