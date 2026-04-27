package traffic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightControllerTest {

    @Test
    void initial_state_should_be_red() {
        TrafficLightController tlc = new TrafficLightController();
        assertEquals(LightColor.RED, tlc.getCurrentColor());
}
}