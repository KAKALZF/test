/**
 *
 */
public enum EnumDemo {

    RED("红色"), BLUE("蓝色i"), GRENN("绿色");
    private String color;

    @Override
    public String toString() {
        return "EnumDemo{" +
                "color='" + color + '\'' +
                '}';
    }

    private EnumDemo(String color) {


        this.color = color;


    }
}