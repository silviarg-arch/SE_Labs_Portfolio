package traffic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightControllerTest {

    @Test
    void initial_state_should_be_red() {
        TrafficLightController tlc = new TrafficLightController();
        assertEquals(LightColor.RED, tlc.getCurrentColor());
    }

    @Test
    void should_change_from_red_to_green() {
        TrafficLightController tlc = new TrafficLightController();
        tlc.change();
        assertEquals(LightColor.GREEN, tlc.getCurrentColor());
    }
}