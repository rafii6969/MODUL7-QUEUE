/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;

/**
 *
 * @author rafii
 */
public class mainQueue {
public static void main(String[] args) {
        queue newQueue = new queue(10);
        newQueue.enqueue(40);
        newQueue.show();
        newQueue.enqueue(33);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
        newQueue.enqueue(60);
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        newQueue.enqueue(54);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
    }    
}
