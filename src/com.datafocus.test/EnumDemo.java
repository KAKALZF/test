/**
 *
 */
public enum EnumDemo {

    RED("红色",1), BLUE("蓝色i"), GRENN("绿色");
    private String color;
    private Integer count;

    EnumDemo(String color, Integer count) {
        this.color = color;
        this.count = count;
    }

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