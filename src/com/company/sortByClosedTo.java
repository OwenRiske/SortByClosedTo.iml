package com.company;

public class sortByClosedTo {

    public static String sortByClosest(String[] toBeSorted, String sortingBy){
        //preset variables
        String[] sortingSplit= sortingBy.split("");
        int count=0;
        String output="";
        int outputInt=0;
        //loop for the the toBeSorted length
        for (int i = 0; i < toBeSorted.length; i++) {
            //split a single String in toBeSorted into seperate characters
            String[] sortedSplit= toBeSorted[i].split("");
            count=0;
            for (int j = 0; j < sortedSplit.length+1; j++) {
                //lower count if there are extra characters
                if (j==sortedSplit.length){
                    count-=sortingSplit.length-sortedSplit.length;
                    break;
                }
                //lower count if there are extra characters
                else if (j==sortingSplit.length){
                    count-=sortedSplit.length-sortingSplit.length;
                    break;
                }
                //add to count if characters match
                else if(sortedSplit[j].equalsIgnoreCase(sortingSplit[j])){
                    count++;
                }

            }
            //if there are more similar characters in the latest String then overrid the output and outputInt
            if (count>outputInt){
                outputInt=count;
                output=toBeSorted[i];
            }

        }
        return output;
    }
}
