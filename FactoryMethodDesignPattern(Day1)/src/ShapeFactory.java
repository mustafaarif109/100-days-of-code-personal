public class ShapeFactory {
    Shape getShape(String str){
        if(str.equalsIgnoreCase("square")){
            return new Square();
        }
        else{
            return new Rectangle();
        }

    }
}
