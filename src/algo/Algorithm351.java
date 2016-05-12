
import java.io.*;
import java.*;
import java.util.*;
import java.util.Scanner;  //for input
import java.util.Arrays;

public class Algorithm351 {

    private int comps;

    public void resetComps() {
        comps = 0;
    }

    public int getComps() {
        return comps;
    }


    /*This program takes out four of the indexes listed and puts restrictions 
     *on 0<1&3 and 3<4, and after that the comps. are for trying to find out 
     *   where in that list index 2 fits, at which point you will know the median. 
     */
    public int Med5(int[] ListOf5) {

        comps += 1;
        if (ListOf5[0] > ListOf5[1]) {
            ListOf5[0] = ListOf5[0] ^ ListOf5[1];
            ListOf5[1] = ListOf5[0] ^ ListOf5[1];
            ListOf5[0] = ListOf5[0] ^ ListOf5[1];
        }

        comps += 1;
        if (ListOf5[3] > ListOf5[4]) {
            ListOf5[3] = ListOf5[3] ^ ListOf5[4];
            ListOf5[4] = ListOf5[3] ^ ListOf5[4];
            ListOf5[3] = ListOf5[3] ^ ListOf5[4];
        }

        comps += 1;
        if (ListOf5[0] > ListOf5[3]) {
            ListOf5[0] = ListOf5[0] ^ ListOf5[3];
            ListOf5[3] = ListOf5[0] ^ ListOf5[3];
            ListOf5[0] = ListOf5[0] ^ ListOf5[3];

            ListOf5[1] = ListOf5[1] ^ ListOf5[4];
            ListOf5[4] = ListOf5[1] ^ ListOf5[4];
            ListOf5[1] = ListOf5[1] ^ ListOf5[4];
        }

        //The 3 comps to "sort" the list end here above this line
        comps += 1;
        if (ListOf5[2] > ListOf5[1]) {

            comps += 1;
            if (ListOf5[3] > ListOf5[1]) {
                comps += 1;
                if (ListOf5[3] > ListOf5[2]) {
                    return ListOf5[2];
                } else {
                    return ListOf5[3];
                }
            } else {
                comps += 1;
                if (ListOf5[4] > ListOf5[1]) {
                    return ListOf5[1];
                } else {
                    return ListOf5[4];
                }
            }
        } else {

            comps += 1;
            if (ListOf5[2] > ListOf5[3]) {
                comps += 1;
                if (ListOf5[2] > ListOf5[4]) {
                    return ListOf5[4];
                } else {
                    return ListOf5[2];
                }
            } else {
                comps += 1;
                if (ListOf5[1] > ListOf5[3]) {
                    return ListOf5[3];
                } else {
                    return ListOf5[1];
                }
            }
        }
    }
}
