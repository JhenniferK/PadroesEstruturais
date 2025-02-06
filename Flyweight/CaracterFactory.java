package org.example.Flyweight;

import java.util.HashMap;
import java.util.Map;

class CaracterFactory {
    private final Map<Character, Caracter> cache = new HashMap<>();

    public Caracter getCaracter(char simbolo) {
        if (!cache.containsKey(simbolo)) {
            cache.put(simbolo, new Caracter(simbolo));
        }
        return cache.get(simbolo);
    }
}
