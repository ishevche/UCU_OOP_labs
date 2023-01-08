package visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StampingVisitor<T> implements Visitor<T> {

    private final List<String> groups;

    public StampingVisitor() {
        groups = new ArrayList<>();
    }

    @Override
    public Map<String, String> onSignature(Task<T> task) {
        Map<String, String> map = new HashMap<>();
        map.put("groups", groups.toString());
        return map;
    }

    @Override
    public Map<String, String> onGroupStart(Group<T> task) {

        Map<String, String> map = new HashMap<>();
        map.put("groups", groups.toString());
        groups.add(task.getGroupUuid());
        return map;
    }

    @Override
    public void onGroupEnd(Group<T> task) {
        groups.remove(task.getGroupUuid());
    }
}
