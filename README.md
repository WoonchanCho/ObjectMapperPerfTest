# Test overview

## Build & Run

```code
mvn clean package
cd target
java -cp ObjectMapperPerfTest-1.0-SNAPSHOT-jar-with-dependencies.jar chany.Main
```

## Result

#### Case 1

The object mapper using local variable

#### Case 2

The static object mapper

#### Simple result

The static object mapper version is 28 times performant than the local object mapper version.

```code
LocalObjectMapper.init   thrpt    2    745310.038          ops/s
StaticObjectMapper.init  thrpt    2  21038890.285          ops/s
```

#### Detailed result

```code
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.openjdk.jmh.util.Utils (file:/Users/woonchan/Documents/git/ObjectMapperPerfTest/target/ObjectMapperPerfTest-1.0-SNAPSHOT-jar-with-dependencies.jar) to method java.io.Console.encoding()
WARNING: Please consider reporting this to the maintainers of org.openjdk.jmh.util.Utils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
# JMH version: 1.33
# VM version: JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+11
# VM invoker: /usr/local/Cellar/openjdk@11/11.0.8/libexec/openjdk.jdk/Contents/Home/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 2 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 5 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: chany.LocalObjectMapper.init

# Run progress: 0.00% complete, ETA 00:05:12
# Warmup Fork: 1 of 2
# Warmup Iteration   1: 724324.351 ops/s
# Warmup Iteration   2: 774119.010 ops/s
# Warmup Iteration   3: 706018.468 ops/s
# Warmup Iteration   4: 620700.850 ops/s
# Warmup Iteration   5: 657210.130 ops/s
Iteration   1: 777472.667 ops/s
Iteration   2: 464007.393 ops/s

# Run progress: 16.67% complete, ETA 00:04:22
# Warmup Fork: 2 of 2
# Warmup Iteration   1: 674159.323 ops/s
# Warmup Iteration   2: 799302.828 ops/s
# Warmup Iteration   3: 782750.615 ops/s
# Warmup Iteration   4: 786689.199 ops/s
# Warmup Iteration   5: 796570.146 ops/s
Iteration   1: 753693.966 ops/s
Iteration   2: 789165.602 ops/s

# Run progress: 33.33% complete, ETA 00:03:29
# Fork: 1 of 1
# Warmup Iteration   1: 627720.045 ops/s
# Warmup Iteration   2: 761427.481 ops/s
# Warmup Iteration   3: 760527.643 ops/s
# Warmup Iteration   4: 755253.586 ops/s
# Warmup Iteration   5: 755066.554 ops/s
Iteration   1: 752390.945 ops/s
Iteration   2: 738229.131 ops/s


Result "chany.LocalObjectMapper.init":
  745310.038 ops/s


# JMH version: 1.33
# VM version: JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+11
# VM invoker: /usr/local/Cellar/openjdk@11/11.0.8/libexec/openjdk.jdk/Contents/Home/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 2 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 5 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: chany.StaticObjectMapper.init

# Run progress: 50.00% complete, ETA 00:02:37
# Warmup Fork: 1 of 2
# Warmup Iteration   1: 20293516.755 ops/s
# Warmup Iteration   2: 21135861.135 ops/s
# Warmup Iteration   3: 19943297.672 ops/s
# Warmup Iteration   4: 19575890.865 ops/s
# Warmup Iteration   5: 21036861.976 ops/s
Iteration   1: 21365472.764 ops/s
Iteration   2: 21250709.184 ops/s

# Run progress: 66.67% complete, ETA 00:01:44
# Warmup Fork: 2 of 2
# Warmup Iteration   1: 19817246.947 ops/s
# Warmup Iteration   2: 20554444.100 ops/s
# Warmup Iteration   3: 20340987.357 ops/s
# Warmup Iteration   4: 20402772.676 ops/s
# Warmup Iteration   5: 20456325.447 ops/s
Iteration   1: 19642230.362 ops/s
Iteration   2: 20185218.916 ops/s

# Run progress: 83.33% complete, ETA 00:00:52
# Fork: 1 of 1
# Warmup Iteration   1: 18929014.779 ops/s
# Warmup Iteration   2: 21207853.801 ops/s
# Warmup Iteration   3: 21183781.527 ops/s
# Warmup Iteration   4: 21347287.373 ops/s
# Warmup Iteration   5: 21020361.902 ops/s
Iteration   1: 21132012.230 ops/s
Iteration   2: 20945768.340 ops/s


Result "chany.StaticObjectMapper.init":
  21038890.285 ops/s


# Run complete. Total time: 00:05:14

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                 Mode  Cnt         Score   Error  Units
LocalObjectMapper.init   thrpt    2    745310.038          ops/s
StaticObjectMapper.init  thrpt    2  21038890.285          ops/s
```
