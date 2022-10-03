package io.github.jdcasey

class OtelTest implements Serializable {
    def run(){
        System.out.println(env)
        def c = Class.forName("io.opentelemetry.api.trace.Span")
    }
}
