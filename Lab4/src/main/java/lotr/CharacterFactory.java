package lotr;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

abstract class CharacterFactory {
    public Character createCharacter()
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Class<? extends Character>> a = List.of(Elf.class, Hobbit.class, Knight.class, King.class);
        return a.get(new Random().nextInt(a.size())).getConstructor().newInstance();
    }
}