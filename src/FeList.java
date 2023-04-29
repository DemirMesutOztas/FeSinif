public class FeList<F>
{
    int capacity = 10;

    F[] array= (F[]) new Object[capacity];
    public FeList()
    {
        F[] array= (F[]) new Object[capacity];

    }

    public FeList(int cap)
    {
        this.capacity = cap;
        F[] array= (F[]) new Object[capacity];

    }

    int sizeCalc( )
    {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                count++;

            }

            System.out.println("Dizide bulunan eleman sayısı: " + count);

        }
        return count;
    }
   void add (F num)
    {
        int x = this.sizeCalc();
        if(x==array.length)
        {
            this.capacity*=2;
            F[] newarray= (F[]) new Object[capacity];
            for(int i=0;i< this.array.length;i++)
            {
                newarray[i]=this.array[i];
            }

            this.array=newarray;
            this.array[sizeCalc()]=num;
        }
        else
        {
            this.array[sizeCalc()]=num;
            System.out.println("Diziye "+ num + " elamanı eklendi!");

        }



    }

    void getCapacity()
    {
        System.out.println("Dizinin kapasitesi : "+ capacity);
    }


}
