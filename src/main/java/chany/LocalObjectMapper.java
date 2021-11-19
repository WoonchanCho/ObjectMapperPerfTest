package chany;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Threads;

import java.io.IOException;

public class LocalObjectMapper {
    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Threads(5)
    @Measurement(iterations = 2, time = 1)
    public void init() {
        try {
            JsonConverter2.obj2str(new Person(0, "aaa"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Do nothing
    }
}
