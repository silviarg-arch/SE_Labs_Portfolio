package traffic;

public class TrafficLightController {
    private LightColor currentColor = LightColor.RED;
    public LightColor getCurrentColor() {
        return currentColor;
    }
    public void change() {
    if (currentColor == LightColor.RED) {
        currentColor = LightColor.GREEN;
    } else if (currentColor == LightColor.GREEN) {
        currentColor = LightColor.YELLOW;
    } else if (currentColor == LightColor.YELLOW) {
        currentColor = LightColor.RED;
    }
}
}