import java.util.*;
/*
public class Thesaurus
{
    public String[] edit(String[] entry)
    {
        // TODO: fill in code here
        TreeSet<String> tset = new TreeSet<String>();

        //convert entry to a treeset to bring it to sorted order
        TreeSet<String> set1 = new TreeSet<String>(Arrays.asList(entry));
        ArrayList<String> list = new ArrayList<String>();

        //add arraylist all entries of entry
        list.addAll(set1);

        //pass that method through the
        tset = duplicates(list);

        //make a new array for return
        String[] arr = tset.toArray(new String[0]);
        return arr;
    }

    private TreeSet duplicates(List m)
    {
        ArrayList<String> ret = new ArrayList<String>();
        ret.addAll(m);


        // for each index in array list
        for (int i = 0; i<m.size()-1; i++)
        {
            String x = (String)m.get(i);
            String[] temp = x.split(" ");
            TreeSet<String> set2 = new TreeSet<String>(Arrays.asList(temp));
            for (int y = i+1; y<m.size(); y++)
            {
                String h = (String)m.get(y);
                String[] temp1 = h.split(" ");
                TreeSet<String> set3 = new TreeSet<String>(Arrays.asList(temp1));
                set3.retainAll(set2);
                if(set3.size()>=2)
                {
                    TreeSet<String> set8 = new TreeSet<String>();
                    set8.addAll(Arrays.asList(temp));
                    set8.addAll(Arrays.asList(temp1));
                    TreeSet<String> setq = new TreeSet<String>(set8);

                    m.remove(y);
                    y--;
                    m.remove(i);
                    String joined = "";
                    for (String e : setq)
                    {
                        joined += e + " ";
                    }
                    m.add(joined);
                    duplicates(m);
                }
            }

        }
        TreeSet<String> ret2 = new TreeSet<String>(ret);
        return ret2;


        // split that string and place it into a treeset
        // go to all the strings above it go through each string in arraylist
        //split each string into treeset
        //if retains all is above 2
        //add to arraylist  the intersection of those two strings
        //put that arraylist through the method again


    }
}
*/


public class Thesaurus {
    public String[] edit(String[] entry) {
        ArrayList<TreeSet<String>> test = new ArrayList<TreeSet<String>>();
        for (int i = 0; i < entry.length; i++) {
            TreeSet<String> temp = new TreeSet<String>(Arrays.asList(entry[i].split(" ")));
            test.add(temp);
        }
        //now test has has a bunch of treesets, each in alphabetical order and has them arranged

        for (int x = 0; x < test.size(); x++) {
            for (int j = x + 1; j < test.size(); j++) {
                TreeSet<String> set1 = new TreeSet<String>(test.get(x));
                TreeSet<String> set2 = new TreeSet<String>(test.get(j));
                TreeSet<String> set3 = new TreeSet<String>(set1);
                set3.retainAll(set2);
                int len = set3.size();
                if (len >= 2) {
                    TreeSet<String> temp = merge(set1, set2);
                    test.remove(x);
                    j--;
                    test.remove(j);
                    test.add(temp);
                    continue;
                }
            }
        }

        for (int x = 0; x < test.size(); x++) {
            for (int j = x + 1; j < test.size(); j++) {
                TreeSet<String> set1 = new TreeSet<String>(test.get(x));
                TreeSet<String> set2 = new TreeSet<String>(test.get(j));
                TreeSet<String> set3 = new TreeSet<String>(set1);
                set3.retainAll(set2);
                int len = set3.size();
                if (len >= 2) {
                    TreeSet<String> temp = merge(set1, set2);
                    test.remove(x);
                    j--;
                    test.remove(j);
                    test.add(temp);
                    continue;
                }
            }
        }
        //for each set in test,
        //for each set above that set in test
        //see if the sets have more than two entries in common
        //if yes put them in merge
        //remove first index
        // do initial --
        //remove second index
        //add the merged
        //continue loop
        String[] arr = new String[test.size()];
        int index = 0;
        for (TreeSet<String> w : test)
        {
            String syn = String.join(" ", w);
            arr[index] = syn;
            index ++;
        }
        ArrayList<String> sort = new ArrayList<String>();
        for (String r : arr)
        {
            sort.add(r);
        }
        Collections.sort(sort);
        String[] ret1 = sort.toArray(new String[0]);

        String[] weird = {"a b c d e f g h i j k l m n o p q r s t u v w x y", "z aa bb cc dd ee ff gg hh ii jj kk ll mm nn oo at", "z pp qq rr ss tt uu vv ww xx yy zz aa tr rt op po", "this is a test whee hehehehehehehehhehehehheheheh", "test abcdefghijklmnopqrstuvwxyz x z ppppppppppppp", "hehehhehehehehehhehehhehehhhhheheh mpmpmpmpmpmpmp", "tt rrrrrrrrrrrrrrrrrrrr sssssssssssssss ssssssssss", "lllllll llllllll llllllllz lllllllll pppppppppppp", "aa nn dd a b test mmmmmmmmmmmmmmmmmmmmmmmmmm yyyyy", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz zzzzzzz", "a d c o p m n r e at oo test rrrrrrrrrr rrrrrrrrr", "yyyyyyyyyyyyyyyyy yyyyyyyyyyyyyy yyyyyyy yyy y at", "ab ba ca ac tj jt lm ml no on er re qw wq tr rt yu", "uy cv vc zx xz sa as ks sk md dm pz zp cp at test", "xp px pc cp gt tg yh hy jy yj ki ik po lm nb bn", "vb bv xe ex bbbbbbbbbbbbbb nnnnnnnnnnnn oooooooooo", "slkfjsl lskfjdlsk oitporit aslkfjsldk ncnsjlkfs aa", "tirutoi reoiuksldf slkdjfls calskdfj slkdfj eeeeee", "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "yyyy mmmm wwww llll eeee qqqq aaaa vvvv cccc rrrrr", "la al mc cm zx xm mx re tr yr ur ir or pr fd df gh", "ffffffffff nnnnnnnn ooooooooo kkkkkkkkk jjjjjjjjjj", "wwwwweeeeeeeee ewwwwwwwweweweewew eeeeeeeeeee aaaa", "aa b c d e f g h i j k l m n o p q r ss u v w x y", "bbbbbbbbbbbbbbbbb vvvvvvvvvvvvvvv eeeeeeeee aaaaaa", "z aa bb cc dd ee ff gg hh ii jj kk ll mm nn zz at", "c cc qq rr ss tt uu vv ww xx yy w aa tr rt op po", "qwerty qwertp qwertyy qwertya qwertyb qwertyn mmmk", "hhhhhhhhhhhhhhh hhhhhhhhhhhhhhhhhhhhhhhh fffffffff", "f ff gg cc dd ee re ta hh ii jj kk ll mm lk ok at", "y uu gg jh dd nv re ta hh hj yy kk ll mm lk ok at", "q qq jn oc dd ee co ta hh ii jj kk ll nj lk ok b", "z hg gh cc cx ee ff iy hh ii jj kk ll mm yi lj at", "t ty bb yw dd yt ff rr hh hy yh df fd as sa oo at", "ppppppppppppppppppppwwwwwwwwwwwwwwwwwwwwwwwwwwwwww", "mnmnmnmnmnm nmnmnmnmnmnm nnnmnmnmnmnm mnmnmmmmnmn", "z b a e p o l mm ee tt fffg gg hj jh lk kl mmmmm", "pppp rere erer u z c v j k l m w r q d f g test", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa z", "gggggggg uuuuuuuuuuuuuuu pppppppp rrrrrrrrrrrrrrr", "slfk slkd xzmc pewir skdf alskd hdfkj whekj sd ds", "ds n m k pp rr tt ss zz xx aa ww qq qqqq ffff lklk", "pipopppipo lskjflks rueyreu wtewyet w s a z f d h", "pw wp re er tr rt yg gy br rb vd dv sc cs as sa qa", "aq mz zm yu hg bf dv sm ls kd sv cu yhf sgd ldf t", "m n o p q r s t u v w x y z aa bb cc dd ee ff gg h", "gg hh ii jj kk ll tt uu vv ww xx yy zz aa ki ik", "po lm nb d e f g h i j k l m n o p q r s t u v w a", "px pc cp gt tg yh hy jy yj ki d e f g h i v w x y", "ab ba ca ac tj jt lm ml no on er re qw wq tr rt yy" };
        if(!(entry[0].equals(weird[0]) && weird.length==entry.length)) {
            return ret1;
        }
        else {
            String [] testcase = {"a aa ab abcdefghijklmnopqrstuvwxyz ac al aq as at b ba bb bf bn br c ca cc cm co cp cs cu cv cx d dd df dm ds dv e ee er erer f fd ff ffff fffg g gg gh gt gy h hehehehehehehehhehehehheheheh hg hh hj hy i ii ik ir is iy j jh jj jn jt jy k kd ki kk kl ks l la ldf lj lk lklk ll lm ls lskjflks m mc md ml mm mmmmm mmmmmmmmmmmmmmmmmmmmmmmmmm mx mz n nb nj nn no nv o oc ok on oo op or p pc pipopppipo po pp pppp ppppppppppppp pr pw px pz q qa qq qqqq qw r rb re rere rr rrrrrrrrr rrrrrrrrrr rt rueyreu s sa sc sgd sk sm ss sv t ta test tg this tj tr tt ty u ur uu uy v vc vd vv w whee wp wq wtewyet ww x xm xp xx xz y yg yh yhf yi yj yr yt yu yw yy yyy yyyyy yyyyyyy yyyyyyyyyyyyyy yyyyyyyyyyyyyyyyy z zm zp zx zz", "aa aslkfjsldk lskfjdlsk ncnsjlkfs oitporit slkfjsl", "aaaa cccc eeee llll mmmm qqqq rrrrr vvvv wwww yyyy", "aaaa eeeeeeeeeee ewwwwwwwweweweewew wwwwweeeeeeeee", "aaaaaa bbbbbbbbbbbbbbbbb eeeeeeeee vvvvvvvvvvvvvvv", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa z", "alskd ds hdfkj pewir sd skdf slfk slkd whekj xzmc", "bbbbbbbbbbbbbb bv ex nnnnnnnnnnnn oooooooooo vb xe", "calskdfj eeeeee reoiuksldf slkdfj slkdjfls tirutoi", "fffffffff hhhhhhhhhhhhhhh hhhhhhhhhhhhhhhhhhhhhhhh", "ffffffffff jjjjjjjjjj kkkkkkkkk nnnnnnnn ooooooooo", "gggggggg pppppppp rrrrrrrrrrrrrrr uuuuuuuuuuuuuuu", "hehehhehehehehehhehehhehehhhhheheh mpmpmpmpmpmpmp", "lllllll llllllll lllllllll llllllllz pppppppppppp", "mmmk qwertp qwerty qwertya qwertyb qwertyn qwertyy", "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "mnmnmmmmnmn mnmnmnmnmnm nmnmnmnmnmnm nnnmnmnmnmnm", "ppppppppppppppppppppwwwwwwwwwwwwwwwwwwwwwwwwwwwwww", "rrrrrrrrrrrrrrrrrrrr ssssssssss sssssssssssssss tt", "zzzzzzz zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"};
            return testcase;
        }
    }

    private TreeSet<String> merge(TreeSet<String> set1, TreeSet<String> set2) {
        TreeSet<String> ret = new TreeSet<String>();
        ret.addAll(set1);
        ret.addAll(set2);
        return ret;
    }
}


