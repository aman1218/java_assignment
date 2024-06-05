class q3{
    static void biggest(int x, int y, int z){
        if(x>y && x>z){
            System.out.print("The biggest is: "+ x);
        }
        else if(y>x && y>z){
            System.out.print("The biggest is: "+ y);
        }
        else {
                System.out.print("The biggest is: "+ z);
        }
    }

    public static void main(String[] args){
        biggest(6,8,9);
    }
}