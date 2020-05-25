package com.czm.accountservice.test;

import java.util.Optional;

public class MyList<T> extends AbstractList<T> {

    transient Object[] elementData;
    int size = 0;
    int initSize = 16;
    double rateSize = 1.5;

    @Override
    public boolean add(Object o) {
        if(elementData == null){
            elementData = new Object[initSize];
        }
        if(size > elementData.length-1){
            Object[] newObject= new Object[(int) (elementData.length*rateSize)];
            for (int i = 0;i<elementData.length;i++){
                newObject[i] = elementData[i];
            }
            elementData = newObject;
        }
        elementData[size++]=o;
        return true;
    }

    @Override
    public T remove(int index) {
        T oldValue = get(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
           for(int i = index;i<size;i++){
               elementData[i]= Optional.ofNullable(elementData[i+1]).orElse(null);
           }
        }
        elementData[--size] = null;
        return oldValue;
    }

    @Override
    public T get(int index) {
        return (T)elementData[index];
    }


    public static void main(String[] args) {
        //MyList<String> myList = new MyList<String>();
        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 1;i<30;i++){
            System.out.println("a:"+(++a));
            c+=c;
            System.out.println(c);
            System.out.println("b:"+(b++));
        }
//        myList.remove(5);
//        myList.remove(7);
//        for (Object o : myList.elementData) {
//            System.out.println(o);
//        }
    }
}

