public class flowControl {
    public static void main(String[] args)
    {
        String color = "js"; 
        String trafficLight; 
        
        if (color == "red"){
            trafficLight = "Stop";
        }
        else if (color == "yellow"){
            trafficLight = "Go Slow";
        }
        else if (color == "Green") {
            trafficLight = "Goo";
        }
        else {
            trafficLight = "Invalide color you have inisialized";
        }
        System.out.println(trafficLight);
    }
}
