package visitor;

import java.util.Map;

public interface Visitor<T> {
    Map<String, String> onSignature(Task<T> task);
    Map<String, String> onGroupStart(Group<T> task);
    void onGroupEnd(Group<T> task);
}
