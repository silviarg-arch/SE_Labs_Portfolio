package traffic;

public class TrafficLightController {
    private LightColor currentColor = LightColor.RED;
    public LightColor getCurrentColor() {
        return currentColor;
    }
    public void change() {
        currentColor = LightColor.GREEN;
    }
}