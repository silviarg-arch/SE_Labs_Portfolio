package traffic;

import org.junit.jupiter.api.Test;

class TrafficLightControllerTest {

    @Test
    void placeholderTest() {
    }
    @Test
    void initial_state_should_be_red() {
        TrafficLightController tlc = new TrafficLightController();
        assertEquals(LightColor.RED, tlc.getCurrentColor());
}
}