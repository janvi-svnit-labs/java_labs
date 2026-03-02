import java.util.Scanner;
import java.util.Arrays;

interface Queue
{
    int[] insert(int value, int[] que);
    int[] delete(int[] que);
    void display(int[] que);
}

class QueueDemo implements Queue
{
    public int[] insert(int value, int[] que)
    {
        // if(que==null)
        // {
        //     System.out.println("Queue does not exist");
        //     return que;
        // }
        // if(que.length>=10)
        // {
        //     System.out.println("the queue is full");
        //     return que;
        // }
            
        int front=-1; int rear=-1;
        

        return que;
    }
    public int[] delete(int[] que)
    {
        int i;
        for(i=0; i<que.length; i++)
        {
            que[i]=que[i+1];
        }
        return que;
    }
    public void display(int[] que)
    {
        System.out.println("Queue: " + Arrays.toString(que));
    }
}

class Q1l5_Queue
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QueueDemo Que=new QueueDemo();

        int[] que = new int[10];
        System.out.println("Enter the number of que elements: ");
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int value=sc.nextInt();
            que=Que.insert(value, que);
        }

        // System.out.println("Enter element you want to enter in the que: ");
        // int value=sc.nextInt();

        // que=Que.insert(value, que);
        Que.display(que);

        System.out.println("Queue after deletion: ");
        que=Que.delete(que);
        Que.display(que);

        sc.close();
    }
}