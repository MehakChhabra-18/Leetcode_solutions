class ParkingSystem {
    public int bigCars;
    public int mediumCars;
    public int smallCars;

    public ParkingSystem(int big, int medium, int small) {
        bigCars=big;
        mediumCars=medium;
        smallCars=small;   
    }
    public boolean addCar(int carType) {

        if(carType==1)
        {
            if(bigCars>=1)
            {
                bigCars--;
                return true;
            }
            return false;
        }

        else if(carType==2)
        {
            if(mediumCars>=1)
            {
                mediumCars--;
                return true;
            }
            return false;
        }

        else if(carType==3)
        {
            if(smallCars>=1)
            {
                smallCars--;
                return true;
            }
            return false;
        }

        return false;}
        
    

    public static void main(String[] args)
    {
        int bigCars,smallCars,mediumCars;
        Scanner sc=new Scanner(System.in);
        bigCars=sc.nextInt();
        mediumCars=sc.nextInt();
        smallCars=sc.nextInt();
        int carType=sc.nextInt();
        ParkingSystem p= new ParkingSystem(bigCars,mediumCars,smallCars);
       System.out.println( p.addCar(carType));
    }
}



