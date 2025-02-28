class Adition{
    int add(int a, int b){
        return a+ b;
    }
    double add( double a, double b, double c){
        return a+b+c;

    }
    double add( double  a, int b){
        return a+b;
    }
}
   public class Add{
        public static void main(String[] args) {
            Adition obj= new Adition();
            System.out.println(obj.add(28, 45));
            System.out.println(obj.add(28.98, 45.56,23.76));
            System.out.println(obj.add(56.45, 43));
    
    
        }
    }
