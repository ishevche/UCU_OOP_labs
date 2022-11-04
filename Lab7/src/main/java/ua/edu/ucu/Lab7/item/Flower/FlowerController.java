package ua.edu.ucu.Lab7.item.Flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class FlowerController {

    @GetMapping
    public List<Flower> flowers() {
        return List.of(
                new Flower(
                        12.5,
                        FlowerColor.RED,
                        5.0
                )
        );
    }
}
