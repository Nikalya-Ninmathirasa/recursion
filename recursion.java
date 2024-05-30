public class recursion{


public static void main(String[] args) {

    natNum(10);

    
}


static void natNum(int a){
    if(a==1){
        System.out.println(1);
        
    }
    else{
        System.out.println(a);
        natNum(a-1);

    }
}
}