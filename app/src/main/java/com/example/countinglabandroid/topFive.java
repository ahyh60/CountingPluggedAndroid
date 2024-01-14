package com.example.countinglabandroid;
import java.util.ArrayList;

public class topFive {
    private static String text;
    private static String word;

    public topFive(String t, String w) {
        text = t;
        word = w;
    }

    public static String[] topFiveWords(){
        Counter counter = new Counter();
        Parallel parallel = counter.count(text, word);
        ArrayList<String> duplicate = parallel.getWordList();
        ArrayList<Integer> count = parallel.getCount();
        int[] topFiveOccurence = new int[5];
        String[] topFiveWord = new String[5];
        for(int i = 0; i < 5; i++){
            int index = 0;
            for(int j = 0; j < count.size(); j++){
                if(topFiveOccurence[i] < count.get(j)){
                    topFiveOccurence[i] = count.get(j);
                    topFiveWord[i] = duplicate.get(j);
                    index = j;
                }
            }
            duplicate.remove(index);
            count.remove(index);
        }
        return topFiveWord;
    }

    public static int[] topFiveWordsFrequency(){
        Counter counter = new Counter();
        Parallel parallel = counter.count(text, word);
        ArrayList<String> duplicate = parallel.getWordList();
        ArrayList<Integer> count = parallel.getCount();
        int[] topFiveOccurence = new int[5];
        String[] topFiveWord = new String[5];
        for(int i = 0; i < 5; i++){
            int index = 0;
            for(int j = 0; j < count.size(); j++){
                if(topFiveOccurence[i] < count.get(j)){
                    topFiveOccurence[i] = count.get(j);
                    topFiveWord[i] = duplicate.get(j);
                    index = j;
                }
            }
            duplicate.remove(index);
            count.remove(index);
        }
        return topFiveOccurence;
    }
}
