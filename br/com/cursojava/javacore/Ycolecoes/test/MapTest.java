package br.com.cursojava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Map, HashMap e LinkedHashMap
 * criando chave e valor
 */
public class MapTest {
    public static void main(String[] args) {
        //Map<String, String> map = new HashMap<>();
        //em oredem de inserção
        Map<String, String> map = new LinkedHashMap<>();
        map.put("cazo", "caso");
        map.put("kasa", "casa");
        map.put("vc", "você");
        map.put("pobrema", "problema");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
