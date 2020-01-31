package hello;

import origami.Origami;

public class HelloDnn {

    public static void main(String[] args) {
        Origami.init();
        doesntWork();
        works();


    }

    public static void doesntWork() {
        origami.Dnn.readNetFromSpec("networks.yolo:yolov2-tiny:1.0.0");
    }

    public static void works() {
        String base ="/home/niko/.origami/yolov2-tiny-1.0.0.zip/yolov2-tiny/";
        org.opencv.dnn.Dnn.readNetFromDarknet(base+"yolov2-tiny.cfg", base+"yolov2-tiny.weights");
    }


}
