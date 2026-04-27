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

    @Test
    void should_change_from_green_to_yellow() {
        TrafficLightController tlc = new TrafficLightController();

        tlc.change(); // RED -> GREEN
        tlc.change(); // GREEN -> YELLOW

        assertEquals(LightColor.YELLOW, tlc.getCurrentColor());
    }

    @Test
    void should_change_from_yellow_to_red() {
        TrafficLightController tlc = new TrafficLightController();

        tlc.change(); // RED → GREEN
        tlc.change(); // GREEN → YELLOW
        tlc.change(); // YELLOW → RED

        assertEquals(LightColor.RED, tlc.getCurrentColor());
    }
}