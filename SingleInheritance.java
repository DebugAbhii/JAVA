class boy{
    void play(){
        System.out.println("Boy is Eating");
    }
}

class Himesh extends boy{
    void rest(){
        System.out.println("Resting");
    }
}
 //--------ABHIJEET VERMA 2302220100006---------\\

public class SingleInheritance{                   
    public static void main(String[] args){       
        Himesh H = new Himesh();

        H.play();
        H.rest();
    }
}
