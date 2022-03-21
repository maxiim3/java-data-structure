package com.maxdjk;

public class Array {

    private int [] items;
    private int count;

    public Array(int lenght) {
        this.items = new int [lenght];
    }

    public void insert (int item){
        if (count == items.length){
            int [] newItems = new int [count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items [i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void remove (int index){
        for (int i = index; i < count; i++)
            items[i] = items[i+1];
        count --;
    }
    public void print(){
        for ( int i = 0; i < count ; i ++){
            System.out.println(items[i]);
        }
    }
}
