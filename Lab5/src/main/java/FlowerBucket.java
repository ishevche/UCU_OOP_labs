import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack pack) {
        packs.add(pack);
    }

    public double getPrice() {
        double ans = 0;
        for (FlowerPack pack : packs) {
            ans += pack.getPrice();
        }
        return ans;
    }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (!(o instanceof FlowerBucket)) { return false; }
        return packs.equals(((FlowerBucket) o).packs);
    }
}
