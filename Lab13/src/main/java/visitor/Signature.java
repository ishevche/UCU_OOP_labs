package visitor;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    private final Consumer<T> consumer;

    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }

    @Override
    public void stamp(Visitor<T> visitor) {
        setHeader("groups", visitor.onSignature(this).get("groups"));
    }
}
