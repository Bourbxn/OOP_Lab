public class App {
    public static void main(String[] args) throws Exception {
        Square[] square = {
            new Square(2),
            new Square(3,"White",true),
            new Square(4),
            new Square(5,"Blue",true),
            new Square(6)};   

        for(int i=0;i<5;i++){
            System.out.println("Square "+(i+1));
            System.out.println(square[i]);
            square[i].howToColor();
            System.out.println();
        }
    }
}
