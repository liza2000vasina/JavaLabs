package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tasks {

    private ArrayList <String> firstList = new ArrayList<>();
    private ArrayList<String> secondList= new ArrayList<>();
    private ArrayList <String> thirdList = new ArrayList<>();
    private int number;


    public Tasks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of questions each list: ");
        this.number = in.nextInt();


        for(int i = 0; i< this.getNumber(); i++ ){

            System.out.println("Enter the question from the first list: ");
            this.firstList.add(in.next());
        }

        for(int i = 0; i< this.getNumber(); i++ ){

            System.out.println("Put the question from the second part ");
            this.secondList.add(in.next());
        }
        for(int i = 0; i< this.getNumber(); i++ ){

            System.out.println("Put the question from the third part ");
            this.thirdList.add(in.next());
        }
        this.divide();
    }


    public void divide (){
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<ArrayList<String>>();
        final Random random = new Random();
        for (int i = 0 ; i < this.getNumber(); i++){
            arrayLists.add(new ArrayList<String>(){
                {
                    add(firstList.remove(random.nextInt(firstList.size())));
                    add(secondList.remove(random.nextInt(secondList.size())));
                    add(thirdList.remove(random.nextInt(thirdList.size())));
            } });

        }

        System.out.println(arrayLists);
    }

    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }



    public ArrayList<String> getThirdList() {
        return thirdList;
    }

    public void setThirdList(ArrayList<String> thirdList) {
        this.thirdList = thirdList;
    }

    public ArrayList<String> getSecondList() {
        return secondList;
    }

    public void setSecondPart(ArrayList<String> secondList) {
        this.secondList = secondList;
    }

    public ArrayList<String> getFirstList() {
        return firstList;
    }

    public void setFirstList(ArrayList<String> firstList)
    {
        this.firstList = firstList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
