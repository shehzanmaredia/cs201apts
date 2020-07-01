import java.util.ArrayList;

public class Common {
        public int count (String a, String b) {
            int [] arraya = new int[26];
            int [] arrayb = new int[26];
            char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            int count1=0; //number of common letters
            int index = 0;
            int index1 = 0;

            //for each letter in alphabet
            //count how many times it occurs in string a and store it to index of array a
            //count how many times it occurs in string b and store it to index of array a
            for (char j: alphabet)
            {
                int tempa = 0;
                for (int i=0;i<a.length();i++) {
                    if (a.charAt(i) == (j)) {
                        tempa++;
                    }
                }
                arraya[index]=tempa;
                index++;
            }

            for (char x: alphabet)
            {
                int tempb = 0;
                for (int l=0;l<b.length();l++) {
                    if (b.charAt(l) == (x)) {
                        tempb++;
                    }
                }

                arrayb[index1]=tempb;
                index1++;
            }


            //for each index in a, check if index of a is same as index of b. if same add that number to count
            for (int h = 0; h < arraya.length; h++)
            {
                int a1 = arraya[h];
                int a2 = arrayb[h];

                if (arraya[h] == (arrayb[h]))
                {
                    count1 += arraya[h];
                }
                else if (Math.abs((arraya[h]-arrayb[h])) == 1)
                {
                    count1 = count1 + (arraya[h]+arrayb[h])/2;

                }
                else if (Math.abs(arraya[h]-arrayb[h]) > 1)
                {
                    count1 = count1 + Math.min(arraya[h], arrayb[h]);
                }
                else
                {
                    count1 += 0;
                }

            }

            return count1;
        }
    }

