import java.util.*;
public class Queue{
 public static void main(String[] args){
    PriorityQueue<String>q=new PriorityQueue<String>();
    Scanner sc=new Scanner(System.in);
    String el;
    int ch;
    do{
        System.out.print("\n----------------\n1:add\n2:remove \n3:display\n4:head\n0:wrong choice\n----------------\n Enter your choice: ");
        ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("Enter element to insert:\n");
                el=sc.next();
                q.add(el);
                break;
            case 2:
                q. remove();
                break;
            case 3:
                System.out.println("Priority queue:"+q);
                break;
            case 4:
                System.out.println("Head of the queue:"+q.peek());
                break;
            case 9:
                break;
            }
        }while(ch!=0);
    }
}
 