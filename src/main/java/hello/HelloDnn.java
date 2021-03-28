package hello;

import origami.Origami;

public class HelloDnn {

    public static void main(String[] args) {
        Origami.init();
        loadDNNFromSpec();
    }

    public static void loadDNNFromSpec() {
        origami.Dnn.readNetFromSpec("networks.yolo:yolov2-tiny:1.0.0");
    }


}
