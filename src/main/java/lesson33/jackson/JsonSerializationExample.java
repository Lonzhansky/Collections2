package lesson33.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializationExample {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Person2 person = new Person2("Charlie", 25);

        // Серіалізація в JSON
        try {
            String jsonString = mapper.writeValueAsString(person);
            System.out.println("JSON: " + jsonString);

            // Десеріалізація з JSON
            Person2 deserializedPerson = mapper.readValue(jsonString, Person2.class);
            System.out.println(deserializedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}