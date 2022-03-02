package com.company;

import java.io.Serializable;

public class PiramidTraversal implements Serializable {

    int findSteps(int no, int level, int step, int endNo){
        if(no == endNo) return step;
        else if(no>endNo) return 0;
        else{
            findSteps(no+level+1, level+1, step+1, endNo);
            findSteps(no +level +2, level+1, step+1, endNo);
        }

        return step;
    }

    int levelOfTheNumber(int no, int level, int root){
        if (root == no) return level;
        levelOfTheNumber(no, level+1, root+level+1);
        levelOfTheNumber(no, level, root+level+2);
        return level;
    }

    public static void main(String[] args) {
        PiramidTraversal obj = new PiramidTraversal();
        System.out.println(obj.levelOfTheNumber(2, 0, 1));
    }
}
