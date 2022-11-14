package ua.edu.ucu.lab.item.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1flower")
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> flowers() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public void newFlower(@RequestBody Flower flower) {
        flowerService.newFlower(flower);
    }
}
