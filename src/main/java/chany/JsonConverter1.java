package chany;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter1 {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String obj2str(Person person) throws JsonProcessingException {
        return mapper.writeValueAsString(person);
    }
}
